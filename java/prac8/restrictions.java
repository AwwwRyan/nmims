class BoundedGenericClass<T extends Number> {
    private T value;

    public BoundedGenericClass(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println("Value: " + value);
    }

    public double doubleValue() {
        return value.doubleValue();
    }
}

// Main class
public class restrictions {
    public static void main(String[] args) {
        BoundedGenericClass<Integer> intObject = new BoundedGenericClass<>(10);
        intObject.print();
        System.out.println("Double value: " + intObject.doubleValue());

        BoundedGenericClass<Double> doubleObject = new BoundedGenericClass<>(5.5);
        doubleObject.print();
        System.out.println("Double value: " + doubleObject.doubleValue());
    }
}
