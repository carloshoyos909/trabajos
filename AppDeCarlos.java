//java seet

import java.util.Scanner;

public class AppDeCarlos {

    public static void main(String []args) {

        Scanner teclado = new Scanner(System.in);

       int Operadoruno=10, Operadordos=5;

      double  calcularsuma = Operadoruno + Operadordos,
       calcularresta = Operadoruno - Operadoruno,
       calcularmilti = Operadoruno * Operadordos,
       calculardiv = Operadoruno / Operadordos;

       //calculadora 


        System.out.println("los resultados aritmeticos son: " + " suma: "+ calcularsuma 
        + " resta: " + calcularresta + 
        "multiplicación "+ calcularmilti + 
        "division " + calculardiv );
        

    }

}