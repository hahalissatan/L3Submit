package l3hw1;

import java.util.Scanner;

public class L3HW1{
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);

        int [][] points = new int[3][2];

        for (int i=0; i<3; i++){
            System.out.print("Enter x and y for point " + (i+1) + ": ");
            points[i][0] = input.nextInt();
            points[i][1] = input.nextInt();
        }

        int x1 = points[0][0];
        int y1 = points[0][1];
        int x2 = points[1][0];
        int y2 = points[1][1];
        int x3 = points[2][0];
        int y3 = points[2][1];

        int result = (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);

        if (result == 0) System.out.println("false");
        else System.out.println("true");
    }
}