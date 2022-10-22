public class Car {
    double carPrice;String color;
    public double calculateSalePrice(String color, double carPrice) {
        this.color=color;
        this.carPrice=carPrice;
    return carPrice;} }
class Truck extends Car {
    double weight; double truckPrice;
    public double calculateSalePrice(double weight , double truckPrice, String color){
        this.color=color;
        this.truckPrice=truckPrice;
        this.weight=weight;
        if(weight>2000) {carPrice=(truckPrice*0.90);}
        else{carPrice=(truckPrice*0.80);}
        return carPrice;}}
   class Sedan extends Car {
    double length;
    double sedanPrice;
    public double calculateSalePrice(String color, double length , double sedanPrice){
    this.sedanPrice=sedanPrice;
    this.length=length;
        if(length>20) {carPrice=(sedanPrice*0.95);}
        else{carPrice=(sedanPrice*0.90);}
        return carPrice;} }
