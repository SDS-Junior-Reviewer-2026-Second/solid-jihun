package greeter;

public class NormalGreeterFormality implements GreeterFormality {

    @Override
    public String greet() {
        return "Hello.";
    }
}
