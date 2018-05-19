public class Cars {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M5", 2007, 2.6); //marka, model, rocznik, pojemność silnika
        Car car2 = car1;

        System.out.println("Samochód 1:");
        System.out.printf("Marka: %s, Model: %s, rocznik: %d, pojemność: %.1f", car1.brand, car1.model,car1.year, car1.capacity);
        System.out.println("");

        car1.brand = "Opel";
        car1.model = "Vectra";
        car1.year= 2004;
        car1.capacity = 1.8;

        System.out.println("Samochód 2:");
        System.out.printf("Marka: %s, Model: %s, rocznik: %d, pojemność: %.1f", car2.brand, car2.model,car2.year, car2.capacity);
    }
}
