package ourpack;
class Car{
	
	private String carId;
	private String brand;
	private String model;
	private double basePricePerDay;
	private boolean isAvailable;
	
	public Car(String carId, String brand, String model, double basePricePerDay) {
		super();
		this.carId = carId;
		this.brand = brand;
		this.model = model;
		this.basePricePerDay = basePricePerDay;
		this.isAvailable = true;
	}

	public String getCarId() {
		return carId;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public double calculatePrize(int rentalDays) {
		return basePricePerDay*rentalDays;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void rent() {
		isAvailable = false;
	}
	
	public void returnCar() {
		isAvailable =true;
	}
}
class Customer{
	
}
class Rental{
	private Car car;
	private Customer customer;
	private int days;
	
	public Rental(Car car, Customer customer, int days) {
		super();
		this.car = car;
		this.customer = customer;
		this.days = days;
	}
	
	
}

class carRentalSystem {		

}
