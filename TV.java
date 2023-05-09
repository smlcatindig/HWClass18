package class18;

public class TV {
    private int size; // private members of the superclass are not accessible

    protected String make; // can be accessed in another package if extended to the parent class
    String model;

}
class SamsungTV extends TV {

    }

    class TVTester {
        public static void main(String[] args) {
            SamsungTV samsungTV = new SamsungTV();

        }
    }

