
import java.util.*;


public class randomCharacter {

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /** Generate a random lowercase letter */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /** Generate a random uppercase letter */
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /** Generate a random digit character */
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    /** Generate a random character */
    public static char getRandomCharacter() {
        return getRandomCharacter('0','Z');
    }

    public static void main(String [] args)
    {
        randomCharacter rc =new randomCharacter();
        System.out.println("Lower Case Letters: ");
        for(int i=0;i<15;i++){
            System.out.print(rc.getRandomLowerCaseLetter() + " ");
        }
        System.out.println("\nUpper Case Letters: ");
        for(int i=0;i<15;i++){
            System.out.print(rc.getRandomUpperCaseLetter() + " ");
        }

        System.out.println("\nDigit Characters: ");
        for(int i=0;i<15;i++){
            System.out.print(rc.getRandomDigitCharacter() + " ");
        }

        System.out.println("\nRandom Characters: ");
        for(int i=0;i<15;i++){
            System.out.print(rc.getRandomCharacter() + " ");
        }


    }
}


