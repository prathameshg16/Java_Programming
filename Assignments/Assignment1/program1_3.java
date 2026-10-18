import java.util.Scanner;

//////////////////////////////
//
//  Function Name : Display
//  Description   : Display numbers in reverse order
//  Input         : Integer
//  Output        : -
//  Author        : Prathamesh Vitthal Gaikwad
//  Date          : 19/10/2026
//
//////////////////////////////

public class program1_3 {
    public static void Display(int iNo){
        int iCnt = 0;
        iCnt = iNo;

        while(iCnt > 0){
            System.out.println(iCnt);
            iCnt--;
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int iNo = 0;
        System.out.println("Enter the frequency to run the loop : ");
        iNo = scanner.nextInt();

        Display(iNo);

        scanner.close();
    }
}
