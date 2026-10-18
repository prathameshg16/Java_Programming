import java.util.Scanner;

//////////////////////////////
//
//  Function Name : Display
//  Description   : Display "Marvellous" five times
//  Input         : Integer
//  Output        : -
//  Author        : Prathamesh Vitthal Gaikwad
//  Date          : 19/10/2026
//
//////////////////////////////

public class program1_2 {
    public static void Display(int iNo){
        int iCnt = 0;
        
        for(iCnt = 1; iCnt <= iNo; iCnt++){
            System.out.println(iCnt+". Marvellous");
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
