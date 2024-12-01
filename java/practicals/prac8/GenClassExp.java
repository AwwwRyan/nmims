class genClass<T, U> {
    private T first;
    private U second;

    public genClass(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void print() {
        System.out.println("String value: " + first);
        System.out.println("Integer value: " + second);
    }
}

public class GenClassExp {
    public static void main(String[] args) {
        genClass<String, Integer> obj1 = new genClass<>("AwwwRyan", 123);
        obj1.print();
    }
}
