import java.util.Scanner;
class COMPLEX{
    double real;
    double imag;
    void setData(double r, double i){
        real = r;
        imag = i;
    }
    void display(){
        System.out.println(real+"+"+imag+"i");
    }
    public COMPLEX add(COMPLEX C1, COMPLEX C2){
        COMPLEX temp = new COMPLEX();
        temp.real = C1.real + C2.real;
        temp.imag = C1.imag + C2.imag;
        return temp;
    }
}
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        COMPLEX C1 = new COMPLEX();
        COMPLEX C2 = new COMPLEX();
        COMPLEX result = new COMPLEX();
        System.out.print("Enter real part of first complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter image part of first complex number: ");
        double imag1 = sc.nextDouble();
        C1.setData(real1, imag1);
        System.out.print("Enter real part of second complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter image part of second complex number: ");
        double imag2 = sc.nextDouble();
        C2.setData(real2, imag2);
        result = result.add(C1, C2);
        result.display();
        sc.close();
    }
}
