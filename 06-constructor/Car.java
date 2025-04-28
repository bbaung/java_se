public class Car{

    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    Car(String x){
        this.model = x;
    }

    Car(int x){
        this.year = x;
    }

    Car(){
        this.model = "unknown";
        this.year = 1;
    }

    void showInfo(){
        System.out.println("model : " + model);
        System.out.println("year : " + year);

    }
}