package test.car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("¸ð´×", "±Ã¿¹", 40, 20, 15, 170);
		Car car2 = new Car();
		
//		car1.name = "¸ð´×";
//		car1.owner = "±Ã¿¹";
//		car1.fuel_efficiency = 15;
//		car1.max_oil_level = 40;
//		car1.oil_level_gauge = 20;
//		car1.maxSpeed = 170;
		car1.carInfo();
		car1.move(50, 35);
		car1.carInfo();
		
		car2.name = "´Ï·Î ÇÏÀÌºê¸®µå";
		car2.owner = "µÎÇÑ";
		car2.fuel_efficiency = 19;
		car2.max_oil_level = 50;
		car2.oil_level_gauge = 30;
		car2.maxSpeed = 180;
		car2.carInfo();
		car2.move(80, 30);
		car2.carInfo();
		
		Car car3 = car1;
		car1 = car2;
		car2 = car3;
		System.out.println("car1 info---------");
		car1.carInfo();
		System.out.println("car2 info---------");
		car2.carInfo();
		System.out.println("car3 info---------");
		car3.carInfo();
	}
	
}
