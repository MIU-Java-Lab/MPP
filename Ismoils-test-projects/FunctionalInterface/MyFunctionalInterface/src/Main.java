@FunctionalInterface
interface MyInterface {
    int add(int x, int y);
}

@FunctionalInterface
interface RandomGenerator {
    int produce();

    public static int test() {
        return 2;
    }
}

public class Main {
    public static void main(String[] args) {
        MyInterface inter = (x, y) -> x + y;
        System.out.println(inter.add(1, 2));

        RandomGenerator rand = () -> (int) Math.round(Math.random() * 10);
        System.out.println(rand.produce());
    }
}