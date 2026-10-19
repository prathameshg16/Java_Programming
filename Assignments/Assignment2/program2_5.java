package Assignments.Assign2;
import java.util.Scanner;

//////////////////////////////
//
//  Class Name    : CheckOddEven
//  Function Name : Check
//  Description   : Check if a number is even or odd
//  Input         : Integer
//  Output        : Boolean
//  Author        : Prathamesh Vitthal Gaikwad
//  Date          : 19/10/2026
//
//////////////////////////////

class CheckOddEven{
    public boolean Check(int iNo){
        return ((iNo % 2) == 0);
    }
}

public class program2_5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter a number : ");
        iValue = scanner.nextInt();

        CheckOddEven chk = new CheckOddEven();
        bRet = chk.Check(iValue);

        if(bRet == true){
            System.out.println(iValue + " is even");
        }
        else{
            System.out.println(iValue + " is odd");
        }

        scanner.close();
    }
}

