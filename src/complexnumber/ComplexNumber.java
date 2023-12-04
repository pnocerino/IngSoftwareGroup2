/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;

import javafx.beans.value.ObservableValue;

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
    
    public ComplexNumber(String number) {
        this.realPart = 0; this.imPart = 0;
        this.number = number;
        toComplexNumber();
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
    
}
