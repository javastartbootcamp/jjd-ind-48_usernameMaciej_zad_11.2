package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Jasd", "Kowalski", 25, "1234567890");
//            person.setFirstName("Ja");
            person.setLastName("gaghj");
            person.setAge(-10);
            System.out.println(person);
        } catch (IncorrectAgeException | NameUndefinedException e) {
            System.err.println(e.getMessage());
        }
    }
}
