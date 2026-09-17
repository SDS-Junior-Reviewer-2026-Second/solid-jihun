package greeter;

public class Greeter {
    GreeterFormality greeterFormality = new NormalGreeterFormality();


    public String greet() {
        return greeterFormality.greet();
    }

    public void setFormality(String formality) {
        this.greeterFormality = GreeterFormalityFactory.create(formality);
    }
}