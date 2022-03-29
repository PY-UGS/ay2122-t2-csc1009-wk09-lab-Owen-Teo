
import org.junit.Test;
import org.junit.Before;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.Assert.*;


public class testRandomCharacter {

    randomCharacter random;

    @Before
    public void setup(){
         random = new randomCharacter();
    }

    @Test
     public void lowerCaseTest(){
        assertTrue(Character.isLowerCase(random.getRandomLowerCaseLetter()));
    }

    @Test
    public void upperCaseTest() {
        assertTrue(Character.isUpperCase(random.getRandomUpperCaseLetter()));
    }

    @Test
    public void digitCharacterTest() {
        assertTrue(Character.isDigit(random.getRandomDigitCharacter()));
    }



    @RepeatedTest(15)
    void TestPrimeNumber(){
        int n = randomCharacter.getRandomDigitCharacter();
        boolean testcase = false;
        System.out.print(n);
        if(n == 0 || n == 1)
        {
            System.out.print(" is not a prime");
            assertTrue(false);
        }

        for(int i = 2; i <= (n/2); i++)
        {
            if(n%i==0)
            {
                testcase = true;
                System.out.print(" is not a prime");
                break;
            }
        }
        if(!testcase)
        {
            System.out.print(" is a prime");
        }
        assertFalse(testcase);
    }



}











