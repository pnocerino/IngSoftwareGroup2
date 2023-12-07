/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementazione1;

/**
 *
 * @author utente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack stack = new Stack(24);
        Variables vars = new Variables();
        
        
        String prova1="3+4i";
        String prova2="5+2i";
        String prova3="+";
        
        Command c1 = new Command(prova1);
        Command c2 = new Command(prova2);
        Command c3 = new Command(prova3);
        
        c1.executeCommand(stack, vars);
        c2.executeCommand(stack, vars);
        c3.executeCommand(stack, vars);
    
        System.out.println(stack.getStack());
    
    }
    
}
