
class CarProcessor {

    void sortBrand(Car[] cars, String make) {

        for (Car c : cars) {

            if (c.carMake.equals(make)) {
                printCar(c);
            }
        }
    }

    void oldestCar(Car[] cars, String make, int age) {

        for (Car c : cars) {

            if ((c.carMake.equals(make)) & ((2019 - c.yearOfIssue) < age)) {
                printCar(c);
            }
        }
    }

    void mostExpensive(Car[] cars, int age, int cost) {
        
        for (Car c : cars) {

            if ((c.carCost > cost) & (c.yearOfIssue == age)) {
                printCar(c);
            }
        }

       
    }
    
    void printCar(Car car) {
        System.out.println(car.carId + " " + car.carMake + " " + car.carModel + " " + car.yearOfIssue
                + " " + car.carColor + " " + car.carCost + " "+ car.registrationNumber);
    }
}
