package challenges;

/*
* Create a function that takes a string and returns true or false,
* depending on whether the characters are in order or not.
Examples
isInOrder("abc") ➞ true
isInOrder("edabit") ➞ false
isInOrder("123") ➞ true
isInOrder("xyzz") ➞ true
Notes
You don't have to handle empty strings.
*/

import java.util.*;

public class FifthChallenge {
    public static void main(String[] args) {
        isInOrder("sdfwd");
    }

    public static void isInOrder(String params){
        String[] arrayWord = params.split("");
        List<String> list = new ArrayList<String>(Arrays.asList(arrayWord));

        List<String> newList = new ArrayList<>();

        if(params.equals("")){
            System.out.println("is empty");
        } else {
            list.forEach(w -> {
               newList.add(w);
               System.out.println(w);
            });
        }

        Collections.sort(newList);

        if(list.equals(newList)){
            System.out.println("ordered");
        } else {
            System.out.println("is not ordered");
        }

    }
}
