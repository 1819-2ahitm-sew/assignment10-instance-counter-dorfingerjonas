public class Person {

    private String firstname;
    private String lastname;
    private static int instanceCounter = 0;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        instanceCounter++;
    }

    //    region Getter & Setter

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    static String getInstanceCounter() {
        return "Von der Klasse 'Person gibt es " + instanceCounter + " Objekte!";
    }

    public void setInstanceCounter(int instanceCounter) {
        Person.instanceCounter = instanceCounter;
    }
    // endregion
}