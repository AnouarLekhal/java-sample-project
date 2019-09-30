package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.*;

public class LambdaExample {

    public static void main(String[] args) {

        // Lambda expression which provides an implementation of a functional interface
        PersonFactory<Person> personFactory = Person::new;

        // Collection of person
        List<Person> persons = Arrays.asList(
                personFactory.create("Richard", 45),
                personFactory.create("Steven", 30),
                personFactory.create("David", 29),
                personFactory.create("Alex", 25)
        );

        /*
        * ================================================================================================================
        *
        * The following are the basic functional interfaces given by the JVM since version 1.8
        *
        * There is more functional interface in the package java.util.function such as BiFunction, BiCusumer, and others.
        * Also, Java API has many one-method interfaces such as Runnable, Callable, Comparator, ActionListener, and others.
        *
        * ================================================================================================================
        * */

        /*
        * It represents a function that accepts one argument and returns a result.
        * Function interface contains exactly one abstract method apply(T t) and several default methods
        * */
        Function<Person, String> function = (Person person) -> personFactory.displayPersonDetails(person);

        Callable a;
        /*
        * Predicate is one such function accepting a single argument to evaluate to a boolean result.
        * Predicate interface contains exactly one abstract method test(T t)
        * */
        Predicate<Person> predicate = (Person p) -> p.getAge() > 30;

        /*
        * It represents an operation that accepts a single argument and returns no result.
        * Consumer interface contains exactly one abstract method accept(T arg0).
        * */
        Consumer<Person> consumer = p -> p.setAge(p.getAge() + 1);

        /*
        * Represents a supplier of results that accepts no argument and returns no result.
        * Supplier interface contains exactly one abstract method get(T t)
        * */
        Supplier<String> supplier = () -> {
            String str = "";
            for (Person person : persons) {
                str += person.getFirstName() + " is more than 30 ? => " + predicate.test(person) +"\n";
            }
            return str;
        };

        /*
        * =======================
        *       START TEST
        * =======================
        * */

        System.out.println("============");

        // Display person details
        persons.stream().map(x -> function.apply(x)).forEach(System.out::println);

        System.out.println("============");

        // Check and print if persons are more than 30 years old
        System.out.print(supplier.get());

        System.out.println("============");

        // Add 1 years of each person
        for (Person person : persons) {
            consumer.accept(person);
        }
        // Check and print if persons are more than 30 years old again after add 1 year of each person
        System.out.print(supplier.get());

        System.out.println("============");

        // Sort list of persons by age
        Comparator<Person> comparator = Comparator.comparing(Person::getAge);
        Collections.sort(persons, comparator);

        // Display person details after the sort
        persons.stream().map(x -> function.apply(x)).forEach(System.out::println);
    }
}
