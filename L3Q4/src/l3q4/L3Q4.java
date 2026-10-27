/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;
import java.util.Random;
public class L3Q4 {

    public static void main(String[] args) {
        Random random = new Random();
        
        int dice1 = random.nextInt(1,7);
        int dice2 = random.nextInt(1,7);
        int dice3 = random.nextInt(1,7);
        int dice4 = random.nextInt(1,7);
        // int p1 = (int)(Math.random() * 11 + 2); (it means, 2 to 2+11-1 -> 2 to 12)
        // Above one is the score of two dices been spin
        
        System.out.println("Player 1 Round 1: " + dice1);
        System.out.println("Player 1 Round 2: " + dice2);
        System.out.println("Player 2 Round 1: " + dice3);
        System.out.println("Player 2 Round 2: " + dice4);
        
        int score1 = dice1+dice2;
        int score2 = dice3+dice4;
        System.out.println("Total score for Player 1: " + score1);
        System.out.println("Total score for Player 2: " + score2);
        
        if(score1>score2) System.out.println("Player 1 wins!!!");
        else if (score2>score1) System.out.println("Player 2 wins!!!");
        else System.out.println("Both player ties!!!");
        
        System.out.printf("Player %d wins%n", (score1 > score2)? 1:2);
        
    }
    
}
