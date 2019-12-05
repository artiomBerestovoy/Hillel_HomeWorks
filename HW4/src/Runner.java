
public class Runner {
	CarProcessor carProc = new CarProcessor();
	Car[] cars = {
        new Car(1, " Mercedes-Benz ", "GLE 300 ", 2016, " Gray ", 42_200, " BC9518HK"),
        new Car(2, " Nissan ", "Qashqai ", 2017, " White ", 18_500, " BH2173IX"),
        new Car(3, " Mercedes-Benz ", "GLE 300 ", 2015, " Black ", 35_950, " AM2926CX"),
        new Car(4, " Toyota ", "Camry ", 2015, " Black ", 17_500, " AI8080KA"),
        new Car(5, " BMW ", "528 ", 2015, " Beige ", 20_200, " AI6550IB"),
        new Car(6, " Audi ", "Q7 ", 2017, " White ", 45_700, " AI2195IA"),
        new Car(7, " Audi ", "Q7 ", 2016, " Orange ", 40_500, " AA8645XI"),
        new Car(8, " Skoda ", "Octavia A7 ", 2015, " Brown ", 13_350, " AM5322CT "),
        new Car(9, " Honda ", "Accord ", 2015, " White ", 12_500, " BX4074CT "),
        new Car(10, " Nissan ", "Qashqai ", 2015, " Black ", 12_000, " AI4145HE "),
    };
    
   public static void main(String[] args) {
	   Runner launcher = new Runner();
	   launcher.run();
   }
   
   public void run() {
       
   	System.out.println("Mercedes-Benz cars:");
   	carProc.sortBrand(cars, " Mercedes-Benz ");
   	System.out.println("\n The oldest Nissan:");
   	carProc.oldestCar(cars, " Nissan ", 3);
   	System.out.println("\n The most expensive car of the year:");
   	carProc.mostExpensive(cars);
	}

}
