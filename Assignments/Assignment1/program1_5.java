import java.util.Scanner;

//////////////////////////////
//
//  Function Name : Accept
//  Description   : Accept a number and display that many "*"
//  Input         : Integer
//  Output        : -
//  Author        : Prathamesh Vitthal Gaikwad
//  Date          : 19/10/2026
//
//////////////////////////////

public class program1_5 {
    public static void Accept(int iNo){
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++){
            System.out.print("* ");
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter a number : ");
        iValue = scanner.nextInt();

        Accept(iValue);

        scanner.close();
    }
}
