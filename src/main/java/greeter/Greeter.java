package greeter;

public class Greeter {
    Formality formality = new NormalFormality();


    public String greet() {
        return formality.greet();
    }

    public void setFormality(String formality) {
        this.formality = FormalityFactory.create(formality);
    }
}