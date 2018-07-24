import java.util.Locale;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int pesel;
    private int age;

    public Person(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Imię");
        firstName = scanner.nextLine();
        while(firstName.length() <= 2 || firstName == null)
            try{
            throw new NameUndefinedException();
            }
            catch (NameUndefinedException ex){
                System.out.println("Za krótkie imię");
                System.out.println("Imię");
                firstName = scanner.nextLine();
            }
            System.out.println("Nazwisko");
            lastName = scanner.nextLine();
            while(lastName.length() <= 2 || lastName == null)
            try{
                throw new NameUndefinedException();
            }
            catch (NameUndefinedException ex){
                System.out.println("Za krótkie nazwisko");
                System.out.println("Nazwisko");
                lastName = scanner.nextLine();
            }
            System.out.println("Wiek");
            age = scanner.nextInt();
            //scanner.nextLine();
            while(age <= 1)
                try{
                    throw new IncorrectAgeException();
                }
                catch (IncorrectAgeException ex){
                System.out.println("Zbyt niski wiek");
                System.out.println("Podaj wiek jeszcze raz");
                age = scanner.nextInt();
                scanner.nextLine();
            }
            System.out.println("Podaj pesel");
            pesel = scanner.nextInt();
            scanner.nextLine();
    }

    public String toString(){
        return firstName + " " + lastName + " " + age + " " + pesel;
    }

    public Person(String firstName, String lastName, int pesel, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
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
