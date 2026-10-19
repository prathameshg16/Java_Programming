package Assignments.Assign3;
import java.util.Scanner;

//////////////////////////////
//
//  Function Name : DisplayFactors
//  Description   : Displays all factors of given number
//  Input         : Integer
//  Output        : -
//  Author        : Prathamesh Vitthal Gaikwad
//  Date          : 20/10/2026
//
//////////////////////////////

public class program3_2 {
    public static void DisplayFactors(int iNo){
        int i = 0;

        if(iNo <= 0){
            iNo = -iNo;
        }

        for(i = 1; i <= iNo/2; i++){
            if((iNo % i) == 0){
                System.out.print(i+"\t");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter a number : ");
        iValue = scanner.nextInt();

        DisplayFactors(iValue);

        scanner.close();
    }
}
