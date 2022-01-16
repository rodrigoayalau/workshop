package challenges;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class FirstChallenge {
    int theNumber;
    Integer[] myArray = { 0,1,2,3,4,5,6,7,8,9 };
    Object[] myArrayEmpty = {};

    @BeforeMethod
    public void initialiazer() {
        theNumber = 5;
    }

    /*
     * A test with two methods with asserts evaulation. isEmpty() evaluates if the
     * given array is empty or not. existHight() evaluates each element in the array
     * with theNumber.
     *
     */
    @Test(enabled = true)
    public void existsHigher() {
        assertFalse(isEmpty(myArray), "The array is empty.");
        assertTrue(existsHigher(myArray, theNumber), "The number in series is not larger.");
    }

    /**
     *
     * @param numbersArray
     * @return false if is not empty
     */
    public static boolean isEmpty(Object[] numbersArray) {
        boolean isEmpty;
        List<Object> theList = Arrays.asList(numbersArray);

        if (theList.isEmpty()) {
            System.out.println("The List is Empty.");
            isEmpty = true;
        } else {
            isEmpty = false;
        }

        return isEmpty;
    }

    /**
     * @param numbersArray
     * @param theNumber
     * @return true if is higher theNumber
     */
    public static boolean existsHigher(Object[] numbersArray, int theNumber) {
        boolean isLarger = false;
        List<Object> theList = Arrays.asList(numbersArray);

        System.out.println("The numbers in this array are: ");

        for (Object n : theList) {
            System.out.print(n + ", ");
            if ((Integer) n >= theNumber) {
                System.out.println("Is larger.");
                isLarger = true;
            } else {
                System.out.println("Is not.");
                isLarger = false;
            }

        }

        return isLarger;
    }
}
