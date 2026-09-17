package house;

public class Studio extends Apartment {
    public Studio() {
        this.numberOfBedrooms = 0;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }

    @Override
    // 스튜디오의 침실 개수는 늘어나지 않습니다.
    void setNumberOfBedrooms(int numBr) {}

}