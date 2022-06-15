package calculator;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SimpleMathematicsTest {

    SimpleMathematics simpleMathematics = new SimpleMathematics();

    @Test
    public void test_addTwoNumbers(){
        int result = simpleMathematics.addTwoNumbers(2, 5);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void test_subtractTwoNumbers(){
        int result = simpleMathematics.subtractTwoNumbers(4, 2);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void test_multiplyTwoNumbers(){
        int result = simpleMathematics.multiplyTwoNumbers(2, 4);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void test_divideTwoNumbers(){
        int result = simpleMathematics.divideTwoNumbers(4, 2);
        Assertions.assertEquals(2, result);
    }

}