public class IncorrectAgeException extends  Exception {
    public IncorrectAgeException() {
        super();
        System.out.println("Wiek nie może być mniejszy niż wartość 1.");
    }
}
