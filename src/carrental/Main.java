package carrental;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  CarRentalSystem rentalSystem = new CarRentalSystem();

	        Car car1 = new Car("C001", "Toyota", "Camry", 6000.0); // Different base price per day for each car
	        Car car2 = new Car("C002", "Honda", "Accord", 7000.00);
	        Car car3 = new Car("C003", "Mahindra", "Thar", 8000.00);
	        rentalSystem.addCar(car1);
	        rentalSystem.addCar(car2);
	        rentalSystem.addCar(car3);

	        rentalSystem.menu();
	}

}
