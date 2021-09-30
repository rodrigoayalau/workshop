package lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EntryPoint {
    public static void main(String[] args) {
        //Supplier
        Supplier<String> supplier = () -> "Hello";
        print(supplier.get());

        //Consumer
        Consumer<String> consumer = (String s) -> {
            print("Consumer Lambda: ");
            print(s);
        };
        consumer.accept("World");


        //Predicate
        List<String> words = new ArrayList<>();
        words.add("Shrink");
        words.add("EvilClone");

        Predicate<String> filterE = (String string) -> string.endsWith("e");
        words.removeIf(filterE);

        Consumer<String> action = string -> print(string + "iterator");
        words.forEach(action);

        User sarah = new User("sarah");
        User james = new User("james");
        User mary = new User("mary");
        User john = new User("john");

        List<User> users = new ArrayList<User>();
        users.add(sarah);
        users.add(james);
        users.add(mary);
        users.add(john);
        List<String> names = new ArrayList<String>();

        Function<User, String> toName = (User user) -> user.getName();
        for (User user : users){
            String name = toName.apply(user);
            names.add(name);
        }
        users.forEach(u -> System.out.println(u));

        Consumer<String> actionN = (String s) -> System.out.println(s);
        names.forEach(actionN);
    }

    public static void print(Object e) {
        System.out.println(e);
    }


    static <T> void printLists(Collection<T> e) {
        for(T element : e) {
            System.out.println(element);
        }
    }
}
