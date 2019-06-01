/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto.escrito;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MontoEscrito1 {
    
public static String numero1 (int n)
{
    if (n==1)
    {return "uno";}
    if (n==2)
    {return "dos";}
    if (n==3)
    {return "tres";}
    if (n==4)
    {return "cuatro";}
    if (n==5)
    {return "cinco";}
    if (n==6)
    {return "seis";}
    if (n==7)
    {return "siete";}
    if (n==8)
    {return "ocho";}
    if (n==9)
    {return "nueve";}
    if (n==10)
    {return "diez";}
    if (n==11)
    {return "once";}
    if (n==12)
    {return "doce";}
    if (n==13)
    {return "trece";}
    if (n==14)
    {return "catorce";}
    if (n==15)
    {return "quince";}
    if (n==16)
    {return "dieciseis";}
    if (n==17)
    {return "diecisiete";}
    if (n==18)
    {return "dieciocho";}
    if (n==19)
    {return "diecinueve";}
    if (n==20)
    {return "veinte";}
    //System.out.println(numero1 (n));
    return "";
    
}

public static String numero2 (int n)
{
    if (n<21)
    {return numero1 (n);    }
    else if (n==30)
    {return "treinta";}
    if (n==40)
    {return "cuarenta";}
    if (n==50)
    {return "cincuenta";}
    if (n==60)
    {return "sesenta";}
    if (n==70)
    {return "setenta";}
    if (n==80)
    {return "ochenta";}
    if (n==90)
    {return "noventa";}
    if (n>20 && n<30)
    {   n=n%10;
        return "veinte y " + numero1 (n);}
    if (n>30 && n<40)
    {   n=n%10;
        return "treinta y " + numero1(n);}
    if (n>40 && n<50)
    {   n=n%10;
        return "cuarenta y " + numero1(n);}
    if (n>50 && n<60)
    {   n=n%10;
        return "cincuenta y " + numero1(n);}
    if (n>60 && n<70)
    {   n=n%10;
        return "sesenta y " + numero1(n);}
    if (n>70 && n<80)
    {   n=n%10;
        return "setenta y " + numero1(n);}
    if (n>80 && n<90)
    {   n=n%10;
        return "ochenta y " + numero1(n);}
    if (n>90 && n<100)
    {   n=n%10;
        return "noventa y " + numero1(n);}
    //System.out.println(numero2 (n));
    return "";
}

public static String numero3 (int n)
{
    if (n<100)
    {return numero2 (n);}
    else if (n==100)
    {return "cien";}
    if (n>100 && n<200)
    {   n=n%100;
        return "ciento " + numero2(n);}
    if (n>=200 && n<300)
    {   n=n%100;
        return "doscientos " + numero2(n);}
    if (n>=300 && n<400)
    {   n=n%100;
        return "trescientos " + numero2(n);}
    if (n>=400 && n<500)
    {   n=n%100;
        return "cuatrocientos " + numero2(n);}
    if (n>=500 && n<600)
    {   n=n%100;
        return "quinientos " + numero2(n);}
    if (n>=600 && n<700)
    {   n=n%100;
        return "seiscientos " + numero2(n);}
    if (n>=700 && n<800)
    {   n=n%100;
        return "setecientos " + numero2(n);}
    if (n>=800 && n<900)
    {   n=n%100;
        return "ochocientos " + numero2(n);}
    if (n>=900 && n<1000)
    {   n=n%100;
        return "novecientos " + numero2(n);}
    //System.out.println(numero3 (n));
    return "";
}

public static String numero4 (int n)
{
    if (n<1000)
    {return numero3 (n);}
    else if (n>=1000 && n<2000)
    {   return "mil " + numero3(n%1000);}
    if (n>=2000 && n<1000000)
    {   //numero3 (n/1000);
        return numero3 (n/1000) + " mil " + numero3(n%1000);}
    if (n>=1000000 && n<2000000)
    {   return "un millon " + numero4(n%1000000);}
    if (n>=2000000 && n<100000000)
    {   //numero4 (n/1000000);
        return numero4(n/1000000) + " millones " + numero4(n%1000000);}
    return "";
}

    public static void main(String[] args) {
        Scanner tecla = new Scanner (System.in);
        int entero = 0;
        int decimal = 0;
        System.out.println("Autor:Juan José León");
        System.out.println("Digite un numero entero :");
        //int n =tecla.nextInt();
        float n = tecla.nextFloat();
        entero = (int) n;
        decimal = (int) (100*(n - entero));
        System.out.println("Digite un numero decimal :");
        int d = tecla.nextInt ();
        d = d/100;
        System.out.println("Digite las unidades de medida:");
        String m = tecla.next();
        
        //System.out.println(" el decimal es : "+ decimal);
        //almacenar en una cadena la parte entera -> string evaluar el monto escrito (int entero)
        //almacenar es una cadena la parte decimal -> string evaluar monto escrito (int decimal)
        
        if (entero>0 && entero<100000000)
        {
            System.out.print(numero4 (entero));
            if (d==0)
            {
                System.out.print(" ");
                System.out.print(m);
            }
            
            
        }
        else {System.out.print("El numero "+ entero + decimal);
        System.out.println(" es demaciado grande");}
        
        if (d > 0)
            {
                //System.out.print(numero4 (entero));
                System.out.print(" punto ");
                System.out.print(numero2 (d));
                System.out.print(" ");
                System.out.print(m);
            }                    
        /*if (decimal > 0)
            {
                //System.out.print(numero4 (entero));
                System.out.print(" con ");
                System.out.print(numero2 (decimal));
                System.out.print(" centesimas");
            }*/

        }}