/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementazione1;

/**
 *
 * @author sherr
 */
public class ComplexNumber {
    
    private double realPart; private double imPart;
    private String number;
   
    public void toComplexNumber() {
        String[] splitted = number.split("((?=[+-]))");
        for(String s : splitted) {
            if(s != null) {
                if(s.equals("i") || s.equals("+i")) this.imPart = this.imPart + 1;
                else if(s.equals("-i")) this.imPart = this.imPart - 1;
                else if(s.endsWith("i") || s.startsWith("i")) this.imPart = this.imPart + Double.parseDouble(s.replace("i", ""));
                else this.realPart = this.realPart + Double.parseDouble(s);
            }
        }
    }

    public ComplexNumber(double realPart, double imPart) {
        this.realPart = realPart;
        this.imPart = imPart;
    }
    
    
    
    public ComplexNumber(String number) {
        this.realPart = 0; this.imPart = 0;
        this.number = number;
        toComplexNumber();
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
        div.realPart = num.realPart / den.realPart;
        div.imPart = num.imPart / den.realPart;
        return div;
    }
    
    
    
    public ComplexNumber signChange() {
        ComplexNumber n = new ComplexNumber(this.getNumber());
        n.imPart = -(n.imPart); n.realPart = -(n.realPart);
        return n;
    }
    
    
    public ComplexNumber[] squareRoot(){
        
        ComplexNumber radici[] = new ComplexNumber[2];
        
        double modulo = Math.sqrt(Math.pow(realPart, 2) + Math.pow(imPart, 2));
        double angolo = Math.atan2(imPart, realPart);
        
        radici[0] = new ComplexNumber("0");
        radici[1] = new ComplexNumber("0");
        
        radici[0].realPart = Math.sqrt(modulo) * Math.cos(angolo/2);
        radici[0].imPart = Math.sqrt(modulo) * Math.sin(angolo/2);
        radici[1].realPart =-(Math.sqrt(modulo) * Math.cos(angolo/2));
        radici[1].imPart = -(Math.sqrt(modulo) * Math.sin(angolo/2));
         
        return radici;
    }
    
    public double getRealPart() {
        return realPart;
    }

    public double getImPart() {
        return imPart;
    }
    
    
    public String getNumber() {
        if(realPart == 0 && imPart == 0) return "0";
        else if(realPart == 0 && imPart == 1) return "i";
        else if(realPart == 0 && imPart == -1) return "-i";
        else if(imPart == 0) return Double.toString(realPart);
        else if(realPart == 0) return Double.toString(imPart) + "i";
        else if(imPart > 0) return Double.toString(realPart) + "+" + Double.toString(imPart) + "i";
        else if(imPart == 1) return Double.toString(realPart) + "+i";
        else if(imPart == -1) return Double.toString(realPart) + "-i";
        return Double.toString(realPart) + Double.toString(imPart);
    }

    @Override
    public String toString() {
        return  realPart + imPart + "i";
    }
    
    
    
}

   
    

