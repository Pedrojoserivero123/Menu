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
public class Operador {
    public int numero1 = 0;
    public int numero2 = 0;
    public int Total = 0;
    
    
    public   Operador (int num1,int num2){
        this.numero1 = num1;
        this.numero2 = num2;
    }
    
    // Este metodo realiza la suma
    public int suma (){
       return this.numero1+this.numero2;
    // Este metodo realiza la resta   
    }
    public int resta (){
       return this.numero1-this.numero2;
    }
    // Este metodo realiza la divicion
    public int divi (){
       return this.numero1/this.numero2;
    // Este metodo realiza la multiplicacion    
    }
    public int multi (){
       return this.numero1*this.numero2;
    }
    
}
