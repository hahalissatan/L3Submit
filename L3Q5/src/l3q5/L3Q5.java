/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q5;
import java.util.Scanner;
public class L3Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cramer's Rule Calculator");
        System.out.println("ax + by = e, ex + dy = f");
        
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        System.out.print("Enter the value of d: ");
        double d = input.nextDouble();
        System.out.print("Enter the value of e: ");
        double e = input.nextDouble();
        System.out.print("Enter the value of f: ");
        double f = input.nextDouble();
       
        if((a*d)-(b*c) == 0) System.out.println("The equation has no solution");
        else{
            double x = ((e*d)-(b*f))/((a*d)-(b*c));
            double y = ((a*f)-(e*c))/((a*d)-(b*c));
            
            System.out.println("x = "+x);
            System.out.println("y = "+y);
            
        }
    }
    
}
