package Assignments.Assign2;
import java.util.Scanner;

//////////////////////////////
//
//  Function Name : Display
//  Description   : Accept a number and display that many "*"
//  Input         : Integer
//  Output        : -
//  Author        : Prathamesh Vitthal Gaikwad
//  Date          : 19/10/2026
//
//////////////////////////////

public class program2_1 {
    public static void Display(int iNo){
        int iCnt = 0;

        if(iNo < 0){
            iNo = -iNo;
        }

        iCnt = 1;
        while(iCnt <= iNo){
            System.out.print(" * ");
            iCnt++;
        }
        
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter a number : ");
        iValue = scanner.nextInt();

        Display(iValue);

        scanner.close();
    }
}
