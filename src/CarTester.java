public class CarTester {

    public static void main(String[] args) {


        Sedan sedan = new Sedan();
        Truck truck = new Truck();

        System.out.println(sedan.calculateSalePrice("Red", 25, 200000));
        System.out.println(sedan.calculateSalePrice("Burgundy", 19, 200000));

        System.out.println(truck.calculateSalePrice(2500,120000,"green"));
        System.out.println(truck.calculateSalePrice(1900,120000,"green"));



    }
}
