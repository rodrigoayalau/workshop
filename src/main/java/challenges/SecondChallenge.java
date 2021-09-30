package challenges;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondChallenge {

    @Test
    public void secondChallengeTest() {
        //inatorInator("Shrink");
        //inatorInator("EvilClone");

        inatorInatorWithCollection("Shrink");
    }

    @Test
    public void secondChallenge2Test(){
        inatorInatorWithCollection("EvilClone");
    }

    public static void inatorInatorWithCollection(String word) {
        String[] arrayWord = word.split("");

        List<String> vowels = new ArrayList<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");

        List<String> wordAsList = Arrays.asList(arrayWord);

        String lastchar = wordAsList.get(wordAsList.size()-1);


        if(lastchar.equals("a") || lastchar.equals("e") || lastchar.equals("i") || lastchar.equals("o") || lastchar.equals("u")) {
            System.out.println(word + "-iterator" + " " +  word.length() + "000");
        } else {
            System.out.println(word + "iterator" + " " +  word.length() + "000");
        }
    }

    public static void inatorInator(String word) {

        System.out.println("----------------------------");

        if(word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u")) {
            System.out.println(word + "-iterator" + " " +  word.length() + "000");
        }else {
            System.out.println(word + "iterator" + " " + word.length() + "000");
        }

        System.out.println("----------------------------");
    }


    public static <T> void print(Object e) {
        System.out.println(e);
    }
}

