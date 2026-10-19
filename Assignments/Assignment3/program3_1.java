package Assignments.Assign3;
import java.util.Scanner;

//////////////////////////////
//
//  Function Name : PrintEven
//  Description   : Accept one number and print that number of even numbers
//  Input         : Integer
//  Output        : -
//  Author        : Prathamesh Vitthal Gaikwad
//  Date          : 20/10/2026
//
//////////////////////////////

public class program3_1 {
    public static void PrintEven(int iNo){
        if(iNo <= 0){
            iNo = -iNo;
        }
        
        int i =0;
        i = 2;
        while(iNo > 0){
            System.out.print(i+"\t");
            i += 2;
            iNo--;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter a number : ");
        iValue = scanner.nextInt();

        PrintEven(iValue);

        scanner.close();
    }
}
