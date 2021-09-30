package challenges;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourthChallenge {

    /*
    Write a function:
    class Solution { public int solution(int[] A); }
    that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
    Given A = [1, 2, 3], the function should return 4.
    Given A = [−1, −3], the function should return 1.
    Assume that:
    N is an integer within the range [1..100,000];
    each element of array A is an integer within the range [−1,000,000..1,000,000].
    */


    @Test
    public void fourthChallengeTest(){
        Integer[] arrayNumbers = {1, 3, 6, 4, 1, 2};
        solution(arrayNumbers);
    }

    public static void solution(Integer[] numbers) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(numbers));
        Collections.sort(myList);
        List<Integer> newList = new ArrayList<>();
        myList.forEach(n -> {
            if(!newList.contains(n)) {
                newList.add(n);
            }
        });
        for(int i=1; i<=newList.size(); i++) {
            if(!newList.contains(i)) {
                newList.add(i);
                System.out.println(i);
            }
        }
        Collections.sort(newList);
        System.out.println(newList);
    }
}
