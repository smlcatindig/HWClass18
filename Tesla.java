package class18;

public class Tesla extends Vehicle {

}
class BMW extends Vehicle {
    void offerPackage(){
        System.out.println("Only BMW offers the M package");
    }
}
class Audi extends Vehicle {

}
class VehicleTester{
    public static void main(String[] args) {
        Tesla tesla=new Tesla();
        tesla.carGo();
    }
}
