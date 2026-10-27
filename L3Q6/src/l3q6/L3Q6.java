/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;
import java.util.Scanner;
public class L3Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = input.nextDouble();
        
        System.out.println("Enter a coordinate point (x,y)");
        System.out.print("x: ");
        double x = input.nextDouble();
        System.out.print("y: ");
        double y = input.nextDouble();
        
        double DistanceSq = x*x + y*y;
        double RadiusSq = radius * radius;
        
        if(DistanceSq < RadiusSq) System.out.println("The point is in the circle");
        else if (DistanceSq > RadiusSq) System.out.println("The point is out of the circle");
        else System.out.println("The point is on the circle");
    }
    
}
