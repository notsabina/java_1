package club;

public class TooManyPeopleException extends Exception{
    public TooManyPeopleException() {
        super("Too many people!");
    }
}
