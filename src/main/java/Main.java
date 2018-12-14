import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int anzahl = random.nextInt(15);
        Person[] people = new Person[anzahl];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person("Hansi", "Schuster");
        }

        System.out.println(Person.getInstanceCounter());
    }
}