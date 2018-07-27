
public class Person {
    private String firstName;
    private String lastName;
    private int pesel;
    private int age;

    public Person(){
    }

    public Person(String firstName, String lastName, int age, int pesel) throws NameUndefinedException, IncorrectAgeException {
        {
            if (firstName.length() <= 2 || firstName =="") {
                throw new NameUndefinedException();
            }
            if (lastName.length() <= 2 || lastName ==""){
                throw new NameUndefinedException();
            }
            this.firstName = firstName;
            this.lastName = lastName;
        }
        if (age < 1) {
            throw new IncorrectAgeException();
        }
        this.age = age;
        this.pesel = pesel;


    }

    public String toString(){
        return firstName + " " + lastName + " " + age + " " + pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
