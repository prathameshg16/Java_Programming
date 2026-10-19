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

public class program2_2 {
    public static void Display(int iNo){
        if(iNo < 0){
            iNo = -iNo;
        }

        while(iNo > 0){
            System.out.print(" * ");
            iNo--;
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
