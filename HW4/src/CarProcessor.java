
class CarProcessor {

	void sortBrand(Car[] cars, String make) {

		for (Car c : cars) {

			if (c.carMake.equals(make)) {

				System.out.println(c.carId + c.carMake + c.carModel + c.yearOfIssue + c.carColor + c.carCost
						+ c.registrationNumber);
			}
		}
	}

	void oldestCar(Car[] cars, String make, int age) {

		for (Car c : cars) {

			if ((c.carMake.equals(make)) & ((2019 - c.yearOfIssue) < age)) {

				System.out.println(c.carId + c.carMake + c.carModel + c.yearOfIssue + c.carColor + c.carCost
						+ c.registrationNumber);
			}
		}
	}

	void mostExpensive(Car[] cars) {
		Car pricy = cars[0];

		for (Car c : cars) {

			if (c.carCost > pricy.carCost) {
				pricy = c;
			}
		}

		System.out.println(pricy.carId + pricy.carMake + pricy.carModel + pricy.yearOfIssue + pricy.carColor
				+ pricy.carCost + pricy.registrationNumber);
	}
}
