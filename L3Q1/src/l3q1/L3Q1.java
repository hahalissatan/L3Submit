/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q1;

import java.util.Scanner;

public class L3Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result;
               
        System.out.print("Enter the operand: ");
        char operator = input.next().charAt(0);
        
        switch(operator){
            case '+' : 
                result = num1+num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1-num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1*num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if(num2 == 0) System.out.println("Cannot divide by zero");
                else {
                    result = num1/num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;
            case '%':
                if(num2==0) System.out.println("Cannot divide by zero");
                else{
                    result = num1%num2;
                    System.out.println(num1 + " % " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
    
}
