
class CarProcessor {
    Car[] carArray;
    
    CarProcessor(Car[] carArray) {
        this.carArray = carArray;	
    
    }
    
    CarProcessor() {
    	carArray = null;
    	
    }
    
    void sortBrand(Car[] cars, String make) {

        for (Car c : cars) {

            if (c.carMake.equals(make)) {
                printCar(c);
            }
        }
    }
    
    void sortBrand(String make) {
    	
        if (carArray == null) {
            System.out.println("The array is empty.");
            return;
        } else {
        	
            for (Car c : carArray) {

                if (c.carMake.equals(make)) {
                    printCar(c);
                }
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
    
    void oldestCar(String make, int age) {
        if (carArray == null) {
            System.out.println("The array is empty.");
            return;
        } else {
            
        	for (Car c : carArray) {

                if ((c.carMake.equals(make)) & ((2019 - c.yearOfIssue) < age)) {
                    printCar(c);
                }
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
    
    void mostExpensive(int age, int cost) {
    	if (carArray == null) {
            System.out.println("The array is empty.");
            return;
        } else {
            for (Car c : carArray) {

                if ((c.carCost > cost) & (c.yearOfIssue == age)) {
                    printCar(c);
                }
            } 
        }
    }
    
    void printCar(Car car) {
        System.out.println(car.carId + " " + car.carMake + " " + car.carModel + " " + car.yearOfIssue
                + " " + car.carColor + " " + car.carCost + " "+ car.registrationNumber);
    }
}
