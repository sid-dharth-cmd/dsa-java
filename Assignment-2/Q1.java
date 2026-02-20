import java.util.Scanner;
class CAR{
    String model;
    int year;
    void setDetails(String m, int n){
        model = m;
        year = n;
    }
    void displayDetails(){
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
}    
public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CAR C1 = new CAR();
        CAR C2 = new CAR();
        C1.model = "Toyota";
        C1.year = 2020;
        System.out.println("Enter car model: ");
        String model = sc.nextLine();
        System.out.println("Enter car year: ");
        int year = sc.nextInt();
        C2.setDetails(model, year);
        System.out.println("Details of Car 1: ");
        C1.displayDetails();
        System.out.println("Details of Car 2: ");
        C2.displayDetails();
        if (C1.year > C2.year) 
            System.out.println("Car 1 is newer.");
        else if (C2.year > C1.year) 
            System.out.println("Car 2 is newer.");
        else 
            System.out.println("Both cars are of the same year.");
        sc.close();
    }
}
