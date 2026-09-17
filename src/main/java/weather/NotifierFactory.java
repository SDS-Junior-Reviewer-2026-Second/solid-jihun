package weather;

public class NotifierFactory {

    public Notifier createNotifier(String condition){
        if (condition == "rainy") {
            return new Phone();
        }
        if (condition == "sunny") {
            return new Email();
        }
        throw new IllegalArgumentException("지원하지 않는 날씨 조건입니다: " + condition);
    }
}
