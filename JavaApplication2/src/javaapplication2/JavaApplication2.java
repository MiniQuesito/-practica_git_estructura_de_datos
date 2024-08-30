/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author 303
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola Mundoooooo, Soyyyy el 작은 치즈");
        
        int num1 = 1;
        int num2 = 2;
        
        int result = num1+num2;
        
        System.out.print("La suma de: "+ num1 + " y " + num2 + "El Resultado es: " + result); 

        /**
        * Este programa captura datos de entrada del usuario y  efectua dos operaciones aritmeticas
        *Una suma
        *Multiplicación4
        */    


        //Sumar

        //Se imprime un texto para que el usuario ingrese los datos
        System.out.println("Ingrese el primer numero:  ");
        //Se crea una variable para almacenar el primer numero
        int sumando1 = 4;

        //Se crea una variable para almacenar el segundo numero
        System.out.println("Ingrese el segundo numero:  ");
        //Se crea una variable para almacenar el segundo numero
        int sumando2 = 9;

        //Multiplicar
        int mult1 = 3;
        int multi= 3;

        Scanner scanner = new Scanner(System.in);


        String entradateclado = scanner.nextLine(); 

        System.out.println("El texto que ingreso es: " + entradateclado);


        int numero1;

        numero1 = Integer.parseInt(entradateclado);

        int numero2;

        numero2 = Integer.parseInt(entradateclado);


        //Se crea una variable para almacenar el resultado de la suma
        int resultado = numero1 + numero2; 
        //Se imprime un texto para que el usuario ingre
        System.out.println("El resultado de los numero ingresados es: " + resultado );
    }
    
}
