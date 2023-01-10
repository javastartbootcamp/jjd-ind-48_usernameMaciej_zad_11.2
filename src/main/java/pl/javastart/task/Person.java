package pl.javastart.task;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;
    private static final int LIMIT = 3;

    public Person(String firstName, String lastName, int age, String pesel) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (LIMIT > firstName.length()) {
            throw new NameUndefinedException("Imie musi miec wiecej niz 2 znaki");
        }
        if (firstName == null) {
            throw new NameUndefinedException("Nie mozna przestawic imienia na wartosc null");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (LIMIT > lastName.length()) {
            throw new NameUndefinedException("Nazwisko musi miec wiecej niz 2 znaki");
        }
        if (lastName == null) {
            throw new NameUndefinedException("Nie mozna przestawic nazwiska na wartosc null");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IncorrectAgeException("Nie mozna przestawic wieku na liczbe ujemna");
        }
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", wiek: " + age + ", pesel: " + pesel;
    }
}
