/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;

import exceptions.MathErrorException;
import exceptions.SyntaxErrorException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import static javafx.application.Platform.exit;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

/**
 *
 * @author sherr
 */
public class ComplexNumber {
    
    private double realPart; private double imPart;
    private String number;
    
    public void toComplexNumber() throws SyntaxErrorException {
        number = number.replace(" ", ""); 
        number = number.replace(",", ".");
        String[] splitted = number.split("((?=[+-]))");
        for(String s : splitted) {
            
            if(s != null) {
                try {
                    if(s.equals("i") || s.equals("+i")) this.imPart = this.imPart + 1;
                    else if(s.equals("-i")) this.imPart = this.imPart - 1;
                    else if(s.endsWith("i") || s.startsWith("i")) this.imPart = this.imPart + Double.parseDouble(s.replace("i", ""));
                    else this.realPart = this.realPart + Double.parseDouble(s);
                }
                catch (NumberFormatException ex) {
                    throw new SyntaxErrorException("Si è verificato un errore di sintassi.\n Inserire un numero complesso nella forma algebrica in modo corretto.\nEsempio: a + bi.\n");
                }
            }
           
        }
    }
    
    public ComplexNumber(String number) {
        this.realPart = 0; this.imPart = 0;
        this.number = number;
        try {
            toComplexNumber();
        } catch (SyntaxErrorException ex) {
            Alert dialog = new Alert(AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
            dialog.showAndWait(); exit();
        }
    }
    
    public ComplexNumber sum(ComplexNumber n) {
        ComplexNumber sum = new ComplexNumber("0");
        sum.realPart = this.realPart + n.getRealPart();
        sum.imPart = this.imPart + n.getImPart();
        return sum;
    }
    
    public ComplexNumber sub(ComplexNumber n) {
        ComplexNumber sub = new ComplexNumber("0");
        sub.realPart = this.realPart - n.getRealPart();
        sub.imPart = this.imPart - n.getImPart();
        return sub;
    }
    
    public ComplexNumber multiply(ComplexNumber n) {
        //(a + bi)(c + di) = ac + adi + bci - bd = RE*RE + RE*IMi + IM*REi - IM*IM; 
        ComplexNumber mul = new ComplexNumber("0");
        mul.realPart = (this.realPart * n.realPart) - (this.imPart * n.imPart);
        mul.imPart = (this.realPart * n.imPart) + (this.imPart * n.realPart);
        return mul;
    }
    
    public ComplexNumber divide(ComplexNumber n) {
        //(a + bi) / (c + di) = (a + bi)(c - di) / (c + di)(c - di) = (numRE / den) + (numIM / den);
        //gestire errore divisione per 0;
        ComplexNumber conj = new ComplexNumber(n.getNumber()); conj.imPart = -(conj.imPart);
        ComplexNumber div = new ComplexNumber("0");
        ComplexNumber num = new ComplexNumber(this.multiply(conj).getNumber());
        ComplexNumber den = new ComplexNumber(n.multiply(conj).getNumber());
        try {
            if(den.realPart == 0) throw new MathErrorException("Si è verificato un errore matematico.\nImpossibile dividere per 0.\n");
            div.realPart = num.realPart / den.realPart;
            div.imPart = num.imPart / den.realPart;
        }
        catch (MathErrorException ex) {
            Alert dialog = new Alert(AlertType.ERROR, ex.getMessage(), ButtonType.CLOSE);
            dialog.showAndWait(); exit();
        }
        return div;
    }
    
    public ComplexNumber[] squareRoot(){
        
        ComplexNumber roots[] = new ComplexNumber[2];
        
        double modulus = Math.sqrt(Math.pow(realPart, 2) + Math.pow(imPart, 2));
        double angles = Math.atan2(imPart, realPart);
        
        roots[0] = new ComplexNumber("0");
        roots[1] = new ComplexNumber("0");
        
        roots[0].realPart = Math.sqrt(modulus) * Math.cos(angles / 2);
        roots[0].imPart = Math.sqrt(modulus) * Math.sin(angles / 2);
        roots[1].realPart =-(Math.sqrt(modulus) * Math.cos(angles / 2));
        roots[1].imPart = -(Math.sqrt(modulus) * Math.sin(angles / 2));
         
        return roots;
                
    }
    
    public ComplexNumber signChange() {
        ComplexNumber n = new ComplexNumber(this.getNumber());
        n.imPart = -(n.imPart); n.realPart = -(n.realPart);
        return n;
    }
    

    public double getRealPart() {
        return realPart;
    }

    public double getImPart() {
        return imPart;
    }
    
    
    public String getNumber() {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
        DecimalFormat format = (DecimalFormat)nf; format.setGroupingUsed(false);
        if(realPart == 0 && imPart == 0) return "0";
        else if(realPart == 0 && imPart == 1) return "i";
        else if(realPart == 0 && imPart == -1) return "-i";
        else if(imPart == 0) return format.format(realPart);
        else if(realPart == 0) return format.format(imPart) + "i";
        else if(imPart > 0) return format.format(realPart) + " + " + format.format(imPart) + "i";
        else if(imPart == 1) return format.format(realPart) + " + i";
        else if(imPart == -1) return format.format(realPart) + "- i";
        return format.format(realPart) + " " + format.format(imPart) + " i";
    }
    @Override
    public String toString() {
        if(realPart == 0 && imPart == 0) return "0";
        return "0";
    }
    
}
