package pl.javastart.task;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;
    private int counter = 3;

    public Person(String firstName, String lastName, int age, String pesel) {
            if (firstName == null) {
                throw new NameUndefinedException("Imie nie moze byc nullem");
            }
        if (lastName == null) {
            throw new NameUndefinedException("Nazwisko nie moze byc nullem");
        }
            if (age < 1) {
                throw new IncorrectAgeException("Wiek nie moze byc liczba ujemna");
            }
            if (counter > firstName.length()) {
                throw new NameUndefinedException("Imie musi miec wiecej niz 2 znaki");
            }
        if (counter > lastName.length()) {
            throw new NameUndefinedException("Nazwisko musi miec wiecej niz 2 znaki");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new NameUndefinedException("Nie mozna przestawic imienia na wartosc null");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
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
