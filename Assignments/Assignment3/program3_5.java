package Assignments.Assign3;
import java.util.Scanner;

//////////////////////////////
//
//  Class Name    : CheckVowel
//  Function Name : Check
//  Description   : Check if a character is a vowel
//  Input         : Character
//  Output        : Boolean
//  Author        : Prathamesh Vitthal Gaikwad
//  Date          : 20/10/2026
//
//////////////////////////////

class CheckVowel{
    public boolean Check(char cVal){
        if(cVal == 'A' || cVal == 'E' || cVal == 'I' || cVal == 'O' || cVal == 'U' || cVal == 'a' || cVal == 'e' || cVal == 'i' || cVal == 'o' || cVal == 'u'){
            return true;
        }
        else{
            return false;
        }
    }
}

public class program3_5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        char cValue = '\0';
        boolean bRet = false;

        System.out.println("Enter a character : ");
        cValue = scanner.next().charAt(0);

        CheckVowel chk = new CheckVowel();
        bRet = chk.Check(cValue);

        if(bRet == true){
            System.out.println("It is a vowel");
        }
        else{
            System.out.println("It is not a vowel");
        }

        scanner.close();
    }
}


