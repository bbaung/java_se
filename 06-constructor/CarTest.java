public class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car("Honda",2020);
        car1.showInfo();

        Car car2 = new Car(2020);
        car2.showInfo();

        Car car3 = new Car();
        car3.showInfo();
    }
}