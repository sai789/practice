package car;

public class TestMain {
    public static void main(String[] args) {
        Car toyotaCorolla = new Car("Toyota Corolla", 13, 30);
        System.out.println("Distance driven: " + toyotaCorolla.drive() + "Meters");


        Car ford = new Car("Ford F-150", 30, 20);
        System.out.println("Distance driven: " + ford.drive() + "Meters");

        Car toyotaPrius = new Car("Toyota Prius", 9, 45);
        System.out.println("Distance driven: " + toyotaPrius.drive() + "Meters");

    }
}
