import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);

            System.out.println("Imię");
            String firstName = scanner.nextLine();
            System.out.println("Nazwisko");
            String lastName = scanner.nextLine();
            System.out.println("Wiek");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Pesel");
            int pesel = scanner.nextInt();
            scanner.nextLine();

            try{
                Person pers1 = new Person(firstName, lastName, age, pesel);
            }
            catch (NameUndefinedException ex){
                System.out.println(ex.getMessage());
                while(firstName.length() <= 2 || firstName == "" || lastName.length() <= 2 || lastName =="");{
                    System.out.println("Podaj dane jeszcze raz");
                    firstName = scanner.nextLine();
                    lastName = scanner.nextLine();
                }
            }
            catch (IncorrectAgeException ex){
                System.out.println(ex.getMessage());
            }
            while (age <1){
                System.out.println("Podaj wiek jeszcze raz");
                age = scanner.nextInt();
            }
            System.out.println("Thank you");

            System.out.println("Dane osoby to: " + firstName + " " + lastName + " " + age + " " + pesel);

    }
}
