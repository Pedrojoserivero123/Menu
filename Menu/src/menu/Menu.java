/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author estudiante
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operador instancia1 = new Operador(5,2);
        System.out.println("la suma es " + instancia1.suma());
        System.out.println("la resta es " + instancia1.resta());
        System.out.println("la divicion es " + instancia1.divi());
        System.out.println("la multiplicacion es " + instancia1.multi());
        
        // TODO code application logic here
    }
    
}
