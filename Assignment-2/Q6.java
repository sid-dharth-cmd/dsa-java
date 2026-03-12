class Vehicle{
    String model;
    int year;
    Vehicle(String model, int year){
        this.model = model;
        this.year = year;
    }
}
class Car extends Vehicle{
    int carId;
    double price;
    Car(String model, int year, int carId, double price){
        super(model, year);
        this.carId = carId;
        this.price = price;
    }
    void carDisplay(){
        System.out.println("model: "+model+" year: "+year+" carId: "+carId+" price: "+price);
    }
}
public class Q6 {
    public static void main(String[] args){
        Car Cobj = new Car("Honda City", 2022, 101, 1200000);
        Cobj.carDisplay();
    }
}
