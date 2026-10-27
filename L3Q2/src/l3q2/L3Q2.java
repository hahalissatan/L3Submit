/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q2;
import java.util.Random;
public class L3Q2 {
    
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(6);
        
        switch(num){
            case 0:
                System.out.println("0 is zero.");
                break;
            case 1:
                System.out.println("1 is one.");
                break;
            case 2:
                System.out.println("2 is two.");
                break;
            case 3:
                System.out.println("3 is three.");
                break;
            case 4:
                System.out.println("4 is four.");
                break;
            case 5:
                System.out.println("5 is five.");
                break;           
        }
        
    }
    
}
