import java.util.Scanner;

//////////////////////////////
//
//  Class Name    : Division
//  Function Name : Divide
//  Description   : Perform division of two numbers
//  Input         : Integer , Integer
//  Output        : Integer
//  Author        : Prathamesh Vitthal Gaikwad
//  Date          : 19/10/2026
//
//////////////////////////////

class Division
{
    public int Divide(int iNo1, int iNo2){
        int iAns = 0;

        if(iNo2 == 0){
            System.out.println("Cannot divide by 0");
            return -1;
        }

        iAns = iNo1 / iNo2;

        return iAns;
    }
}

public class program1_1{
    public static void main(String args[]){
        int iValue1 = 0, iValue2 = 0;
        int iRet = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number :");
        iValue1 = scanner.nextInt();
        
        System.out.println("Enter second number :");
        iValue2 = scanner.nextInt();

        Division divide = new Division();
        iRet = divide.Divide(iValue1, iValue2);

        System.out.println("Division is : "+iRet);

        scanner.close();
    }
}