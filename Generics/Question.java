class Box<T extends Number> {

    T value;

    Box(T value) {
        this.value = value;
    }

    void display() {
        System.out.println(value);
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> b = new Box<>(100);
        b.display();
    }
}