/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q3;
import java.util.Scanner;
public class L3Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the sales volume: ");
        double sales = input.nextDouble();
        double commission;
        
        if (sales > 0 && sales <= 100) commission = sales * 0.05;
        else if (sales <= 500) commission = sales * 0.075;
        else if (sales <= 1000) commission = sales * 0.1;
        else commission = sales * 0.125;
        
        System.out.println("Sales of user: RM " + sales);
        System.out.printf("Commission for user: RM %.2f%n", commission);
        
    }
    
}
