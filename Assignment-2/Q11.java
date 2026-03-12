import java.util.Scanner;
class Student{
    int Roll;
    String Name;
    double DSA_Mark;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll of the student: ");
        Roll = sc.nextInt();
        System.out.print("Enter name of the student: ");
        Name = sc.nextLine();
        System.out.print("Enter DSA mark: ");
        DSA_Mark = sc.nextDouble();
        sc.close();
    }
    void showdata(){
        System.out.println("Roll: "+Roll);
        System.out.println("Name: "+Name);
        System.out.println("DSA Mark: "+DSA_Mark);
    }
}
public class Q11{
    public static void main(String[] args){
        
    }
}