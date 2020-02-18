
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Programa para convertir unidades  * 
 * @author Jeimmy Naranjo   
 * @version 1
 */
public class PrincipalConversor  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // Datos de entrada: 
        
        // Datos de entrada
        char Unidad;
        double numero;
        
    
        // Datos de salida
      
        double Conversion;
     
        
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.print("Ingrese la unidad que va a convertir:\n(P = Pie, C = Centimetro, L = Legua, Y = Yarda)\n");
        Unidad = teclado.next().charAt(0); //Leer el primer caracter
        System.out.print("Ingrese el valor a convertir:\n");
        numero = teclado.nextDouble();
        
        int valorU = (int)Unidad;
        
        if(valorU == 80)
        {
            double PulgadaP = 0.0833;
            Conversion = numero / PulgadaP;
            
            System.out.print("La conversion de " + numero + " Pies son: " + Conversion + " Pulgadas");
        }
       
        if(valorU == 67)
        {
            double PulgadaCm = 2.54;
            Conversion = numero / PulgadaCm;
            
            System.out.print("La conversion de " + numero + " Centimetros son: " + Conversion + " Pulgadas");
        }
        
         if(valorU == 76)
        {
            double PulgadaL = 190080.02;
            Conversion = numero * PulgadaL;
            
            System.out.print("La conversion de " + numero + " Leguas son: " + Conversion + " Pulgadas");
        }
        
         if(valorU == 89)
        {
            double PulgadaY = 36;
            Conversion = numero * PulgadaY;
            
            System.out.print("La conversion de " + numero + " Yardas son: " + Conversion + " Pulgadas");
        }
 
    }
            
  } 