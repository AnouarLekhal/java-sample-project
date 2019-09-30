package lambda;

/*

* An interface that contains exactly one abstract method is known as a functional interface.
* A functional interface can extend another interface only when it does not have any abstract method.
* The functional interface can have several default methods.
 * */
@FunctionalInterface
public interface PersonFactory <P extends Person> {

    // abstract method
    P create(String firstName, Integer age);

    default String displayPersonDetails(Person person) {
      return person.getFirstName() + " is " + person.getAge() + " years old" ;
    }
}
