package greeter;

public class FormalGreeterFormality implements GreeterFormality {
    @Override
    public String greet() {
        return "Good evening, sir.";
    }

}
