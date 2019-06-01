/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto.escrito;

import java.util.Scanner;


public class MontoEscrito {
    
public static void numero1 (int n)
{
    if (n==1)
    {System.out.print("uno");}
    if (n==2)
    {System.out.print("dos");}
    if (n==3)
    {System.out.print("tres");}
    if (n==4)
    {System.out.print("cuatro");}
    if (n==5)
    {System.out.print("cinco");}
    if (n==6)
    {System.out.print("seis");}
    if (n==7)
    {System.out.print("siete");}
    if (n==8)
    {System.out.print("ocho");}
    if (n==9)
    {System.out.print("nueve");}
    if (n==10)
    {System.out.print("diez");}
    if (n==11)
    {System.out.print("once");}
    if (n==12)
    {System.out.print("doce");}
    if (n==13)
    {System.out.print("trece");}
    if (n==14)
    {System.out.print("catorce");}
    if (n==15)
    {System.out.print("quince");}
    if (n==16)
    {System.out.print("dieciseis");}
    if (n==17)
    {System.out.print("diecisiete");}
    if (n==18)
    {System.out.print("dieciocho");}
    if (n==19)
    {System.out.print("diecinueve");}
    if (n==20)
    {System.out.print("veinte");}
}

public static void numero2 (int n)
{
    if (n<21)
    {numero1 (n);    }
    else if (n==30)
    {System.out.print("treinta");}
    if (n==40)
    {System.out.print("cuarenta");}
    if (n==50)
    {System.out.print("cincuenta");}
    if (n==60)
    {System.out.print("sesenta");}
    if (n==70)
    {System.out.print("setenta");}
    if (n==80)
    {System.out.print("ochenta");}
    if (n==90)
    {System.out.print("noventa");}
    if (n>20 && n<30)
    {   n=n%10;
        System.out.print("veinte y ");
        numero1(n);}
    if (n>30 && n<40)
    {   n=n%10;
        System.out.print("treinta y ");
        numero1(n);}
    if (n>40 && n<50)
    {   n=n%10;
        System.out.print("cuarenta y ");
        numero1(n);}
    if (n>50 && n<60)
    {   n=n%10;
        System.out.print("cincuenta y ");
        numero1(n);}
    if (n>60 && n<70)
    {   n=n%10;
        System.out.print("sesenta y ");
        numero1(n);}
    if (n>70 && n<80)
    {   n=n%10;
        System.out.print("setenta y ");
        numero1(n);}
    if (n>80 && n<90)
    {   n=n%10;
        System.out.print("ochenta y ");
        numero1(n);}
    if (n>90 && n<100)
    {   n=n%10;
        System.out.print("noventa y ");
        numero1(n);}
}

public static void numero3 (int n)
{
    if (n<100)
    numero2 (n);
    else if (n==100)
    {System.out.print("cien");}
    if (n>100 && n<200)
    {   n=n%100;
        System.out.print("ciento ");
        numero2(n);}
    if (n>=200 && n<300)
    {   n=n%100;
        System.out.print("doscientos ");
        numero2(n);}
    if (n>=300 && n<400)
    {   n=n%100;
        System.out.print("trescientos ");
        numero2(n);}
    if (n>=400 && n<500)
    {   n=n%100;
        System.out.print("cuatrocientos ");
        numero2(n);}
    if (n>=500 && n<600)
    {   n=n%100;
        System.out.print("quinientos ");
        numero2(n);}
    if (n>=600 && n<700)
    {   n=n%100;
        System.out.print("seiscientos ");
        numero2(n);}
    if (n>=700 && n<800)
    {   n=n%100;
        System.out.print("setecientos ");
        numero2(n);}
    if (n>=800 && n<900)
    {   n=n%100;
        System.out.print("ochocientos ");
        numero2(n);}
    if (n>=900 && n<1000)
    {   n=n%100;
        System.out.print("novecientos ");
        numero2(n);}
}

public static void numero4 (int n)
{
    if (n<1000)
    {numero3 (n);}
    else if (n>=1000 && n<2000)
    {   System.out.print("mil ");
        numero3(n%1000);}
    if (n>=2000 && n<1000000)
    {   numero3 (n/1000);
        System.out.print(" mil ");
        numero3(n%1000);}
    if (n>=1000000 && n<2000000)
    {   System.out.print("un millon ");
        numero4(n%1000000);}
    if (n>=2000000 && n<100000000)
    {   numero4 (n/1000000);
        System.out.print(" millones ");
        numero4(n%1000000);}
}

    public static void main(String[] args) {
        Scanner tecla = new Scanner (System.in);
        int entero = 0;
        int decimal = 0;
        System.out.println("Autor:Juan José León");
        System.out.println("Digite un numero:");
        //int n =tecla.nextInt();
        float n = tecla.nextFloat();
        entero = (int) n;
        decimal = (int) (100*(n - entero));
        //System.out.println(" el decimal es : "+ decimal);
        //almacenar en una cadena la parte entera -> string evaluar el monto escrito (int entero)
        //almacenar es una cadena la parte decimal -> string evaluar monto escrito (int decimal)
        
        if (entero>0 && entero<100000000)
        {
            numero4 (entero);
        }
        else {System.out.print("El numero "+ entero + decimal);
        System.out.println(" es demaciado grande");}
                            
        if (decimal > 0)
            {
                
                System.out.print(" con ");
                numero2 (decimal);
                System.out.print(" decimas");
            }

        
        /*acomulador =decimal;
        
        if (entero<100000000)   
        {
            numero4 (entero);
            for (acomulador=0;acomulador>100; )
            {
                acomulador = decimal/10;
            }
            if (acomulador < 100)
            {
                System.out.print(" con ");
                numero4 (acomulador);
                System.out.print(" decimas");
            }
            
        }
        else {System.out.print("El numero "+ entero + decimal);
        System.out.println(" es demaciado grande");}*/
        
        
        /*if (entero<100000000)
        {numero4 (entero);        
        if (decimal>0 && decimal <100)
        {
        System.out.print(" con ");
        numero4 (decimal);
        System.out.print(" decimas");}
        }        
        else {System.out.print("El numero "+ entero + decimal);
        System.out.println(" es demaciado grande");}*/
        }}
    

