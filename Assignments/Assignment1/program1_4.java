import java.util.Scanner;

//////////////////////////////
//
//  Class Name    : CheckDivisibility
//  Function Name : Check
//  Description   : Check if a number is divisible by 5
//  Input         : Integer
//  Output        : Boolean
//  Author        : Prathamesh Vitthal Gaikwad
//  Date          : 19/10/2026
//
//////////////////////////////

class CheckDivisibility{
    public boolean Check(int iNo){
        if((iNo % 5) == 0){
            return true;
        }
        else{
            return false;
        }
    }
}

public class program1_4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter a number : ");
        iValue = scanner.nextInt();

        CheckDivisibility CDcheck = new CheckDivisibility();
        bRet = CDcheck.Check(iValue);

        if(bRet == true){
            System.out.println(iValue + " is divisible by 5");
        }
        else{
            System.out.println(iValue + " is not divisible by 5");
        }

        scanner.close();
    }
}
