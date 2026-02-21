class Deposit{
    long Principal;
    int Time;
    double Rate;
    double Total_amt;
    Deposit(){
        Principal = 0;
        Time = 0;
        Rate = 0;
    }
    Deposit(long p, int t, double r){
        Principal = p;
        Time = t;
        Rate = r;
    }
    Deposit(long p, int t){
        Principal = p;
        Time = t;
        Rate = 5.0;
    }
    Deposit(long p, double r){
        Principal = p;
        Time = 1;
        Rate = r;
    }
    void display(){
        System.out.println("Principal: "+Principal);
        System.out.println("Time: "+Time);
        System.out.println("Rate: "+Rate);
    }
    double cal_amt(){
        return Principal+((Principal*Rate*Time)/100);
    }
}
public class Q4 {
    public static void main(String[] args){
        
    }
}
