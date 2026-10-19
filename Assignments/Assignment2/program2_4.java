package Assignments.Assign2;
import java.util.Scanner;

//////////////////////////////
//
//  Function Name : Display
//  Description   : Display first number in second number of times
//  Input         : Integer,Integer
//  Output        : -
//  Author        : Prathamesh Vitthal Gaikwad
//  Date          : 19/10/2026
//
//////////////////////////////

public class program2_4 {
    public static void Display(int iNo, int iFreq){
        if(iFreq < 0){
            iFreq = -iFreq;
        }

        int iCnt = 0;
        for(iCnt = 1; iCnt <= iFreq; iCnt++){
            System.out.print(iNo+"\t");
        }
        
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int iValue = 0;
        int iFreq = 0;

        System.out.println("Enter a number : ");
        iValue = scanner.nextInt();

        System.out.println("Enter the frequency to run the loop : ");
        iFreq = scanner.nextInt();

        Display(iValue, iFreq);

        scanner.close();
    }
}

