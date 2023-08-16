/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author LABSIS
 */
public class Calculadora {
    public Calculadora(){
        
    }
    public double suma(double num1,double num2){
        double s=0;
        s=num1+num2;
        return s;
    }
    public double resta(double num1,double num2){
        double r=0;
        r=num1-num2;
        return r;
    }
    public double multiplicar(double num1,double num2){
        double m=0;
        m=num1*num2;
        return m;
    }
    public String dividir(double num1,double num2){
        if(num2==0){
            return "Error denominador 0";
        }
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
