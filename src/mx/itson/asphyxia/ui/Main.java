/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.asphyxia.ui;

import java.util.Scanner;

/**
 *
 * @author shiri
 */
public class Main {
    
   public static void main(String[] args) {
            
            Scanner teclado = new Scanner(System.in);
            
            System.out.println("De el numero que desea convertir a letras");
            int i = teclado.nextInt();
       
            System.out.println(convertirNumeroATexto(i));

    }

    public static String convertirNumeroATexto(int numero) {
        String unidades[] = new String[]{"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};

        String especiales[] = new String[]{"diez","once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve"};

        String decenas[] = new String[]{ "veinte", "treinta", "cuarenta", "cincuenta", "sesenta","setenta", "ochenta", "noventa"};
        
        String veinti = "veinti";
        
        String centenas = "cien";
        
        String numNoValido = "Numero no valido, por favor ingrese un numero valido";

        if (numero < 10) {
            return unidades[numero];
        }
        if (numero < 20) {
            return especiales[numero - 10];
        }
        if(numero>20&&numero<=29){
            int uIndex = (numero%10);
            return veinti + unidades[uIndex];
        }
        if (numero < 100 && numero % 10 == 0) {
            int index = (numero / 10) - 2;
            return decenas[index];
        }
        
        if(numero<100){
            int dIndex = (numero/10)-2;
            int uIndex = (numero%10);
            return decenas[dIndex] + " y " + unidades[uIndex];
        }
        
        if(numero==100){
            return centenas;
        }

        return numNoValido;
    }
    
}
