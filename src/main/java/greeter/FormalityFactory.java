package greeter;

import java.text.Normalizer;

public final class FormalityFactory {
    public static Formality create(String type) {
        return switch (type) {
            case "formal" -> new FormalFormality();
            case "casual" -> new CasualFormality();
            case "intimate" -> new IntimateFormality();
            default -> new NormalFormality();
        };
    }

}
