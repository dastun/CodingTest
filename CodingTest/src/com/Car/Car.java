package com.Car;



public class Car {
	
		
		int year_model;
		String make;
		static int speed;
		
		public Car()
		{
		year_model=1965;
		speed=0;
		make="Bat Mobile";
		}

		
		public Car(int year_model, String make, int speed) {
			super();
			this.year_model = year_model;
			this.make = make;
			Car.speed = speed;
		}


		public int getYear_model() {
			return year_model;
		}


		public void setYear_model(int year_model) {
			this.year_model = year_model;
		}


		public String getMake() {
			return make;
		}


		public void setMake1(String make) {
			this.make = make;
		}


		public int getSpeed() {
			return speed;
		}


		public void setSpeed(int speed) {
			Car.speed = speed;
		}

		public void accelerate()
		{
			speed +=5;
		}

		public void brake()
		{
			speed -=5;
		}

		public static void main(String[] args) {

			Car car = new Car(1965,"Bat Mobile", speed);
			car.accelerate();
			car.accelerate();
			car.accelerate();
			car.accelerate();
			car.accelerate();
			System.out.println(car.getSpeed());
			car.brake();
			car.brake();
			car.brake();
			car.brake();
			car.brake();
			System.out.println(car.getSpeed());
		}
		
		
}
