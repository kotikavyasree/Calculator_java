/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

import java.util.Scanner;

/**
 *
 * @author kotik
 */
public class Calculator1 {

    /**
     * @param args the command line arguments
     */
    public static void operations(int operator,double number1,double number2)
    {
       
        if (operator ==1)
        {
            System.out.println("Result:"+(number1+number2));
        }else if(operator ==2)
        {
            System.out.println("Result:"+(number1-number2));
        }else if(operator ==3)
        {
            System.out.println("Result:"+(number1*number2));
        }else if(operator ==4)
        {
            System.out.println("Result:"+(number1/number2));
        }else if (operator ==5)
        {
            System.exit(01);
        }
        else
        {
            System.out.println("Enter a valid operator");
           
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator1 obj = new Calculator1();
        boolean input = false;
        while(!input)
        {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first operand");
        try{
         double num1 = scan.nextDouble();
         System.out.println("Enter the second operand");
         double num2 = scan.nextDouble();
         System.out.println("Choose a number to perform a respective arithmetic operation"+"\n"+"1.Add(+)"+"\n"+"2.Subtract(-)"+"\n"+"3.Multiply(*)"+"\n"+"4.Divide(/)" +"5:Exit");
         int op = scan.nextInt();
         obj.operations(op,num1,num2);
         
        }catch(Exception e)
        {
            System.out.println("Input is not valid");
        }
        }
        


            
        
    
    
}
}