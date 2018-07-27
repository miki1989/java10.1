import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException{
        boolean flag = true;
        while(flag) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);
            Person pers1 = new Person();
            System.out.println("Imię");
            pers1.setFirstName(scanner.nextLine());
            if(pers1.getFirstName().length() <= 2 || pers1.getFirstName() =="") {
                throw new NameUndefinedException();
            }
            System.out.println("Nazwisko");
            pers1.setLastName(scanner.nextLine());
            if(pers1.getLastName().length() <= 2 || pers1.getLastName() =="") {
                throw new NameUndefinedException();
            }
            System.out.println("Wiek");
            pers1.setAge(scanner.nextInt());
            if (pers1.getAge() < 1) {
                throw new IncorrectAgeException();
            }
            scanner.nextLine();
            System.out.println("Pesel");
            pers1.setPesel(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Thank you");

            System.out.println(pers1.toString());
            flag = false;
        }
    }
}
