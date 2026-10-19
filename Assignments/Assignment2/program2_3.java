package Assignments.Assign2;
import java.util.Scanner;

//////////////////////////////
//
//  Function Name : Display
//  Description   : Displays "Hello" if the number < 10, else displays "Demo"
//  Input         : Integer
//  Output        : -
//  Author        : Prathamesh Vitthal Gaikwad
//  Date          : 19/10/2026
//
//////////////////////////////

public class program2_3 {
    public static void Display(int iNo){
        if(iNo < 10){
            System.out.println("Hello");
        }
        else{
            System.out.println("Demo");
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

