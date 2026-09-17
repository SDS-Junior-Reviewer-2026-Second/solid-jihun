package greeter;

public final class GreeterFormalityFactory {
    public static GreeterFormality create(String type) {
        return switch (type) {
            case "formal" -> new FormalGreeterFormality();
            case "casual" -> new CasualGreeterFormality();
            case "intimate" -> new IntimateGreeterFormality();
            default -> new NormalGreeterFormality();
        };
    }

}
