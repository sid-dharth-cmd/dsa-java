interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Duck implements Flyable, Swimmable{
    String name;
    Duck(String name){
        this.name = name;
    }
    public void fly(){
        System.out.println(name+" can't fly.");
    }
    public void swim(){
        System.out.println(name+" can swim.");
    }
    void displayDetails(){
        System.out.println("Name: "+name);
        fly();
        swim();
    }
}
class Q8{
    public static void main(String[] args){
        Duck Dobj = new Duck("Sundari");
        Dobj.displayDetails();
    }
}