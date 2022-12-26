package prob9;

enum MyConstants {
    TEST;
    MyConstants() {
        System.out.println("hey");
    }
}

public class prob9 {
    public static void main(String[] args) {
        MyConstants m = MyConstants.TEST;
        MyConstants m2 = MyConstants.TEST;
    }
}
