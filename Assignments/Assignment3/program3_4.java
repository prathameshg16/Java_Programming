package Assignments.Assign3;
import java.util.Scanner;

//////////////////////////////
//
//  Function Name : DisplayConvert
//  Description   : Accept a character from user and converts it into either uppercase or lowercase
//  Input         : Character
//  Output        : -
//  Author        : Prathamesh Vitthal Gaikwad
//  Date          : 20/10/2026
//
//////////////////////////////

public class program3_4 {
    public static void DisplayConvert(char cVal){
        if(cVal >= 'A' && cVal <= 'Z'){
            System.out.printf("%c\n",cVal + 32);
        }
        else if(cVal >= 'a' && cVal <= 'z'){
            System.out.printf("%c\n",cVal - 32);
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        char cValue = '\0';
        System.out.println("Enter a character : ");
        cValue = scanner.next().charAt(0);

        DisplayConvert(cValue);

        scanner.close();
    }
}


