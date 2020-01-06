package test.car;

public class Car
{
	
	public Car() {
		
	}
	
	public Car(String name, String owner, float max_oil_level, float oil_level_gauge, 
			float fuel_efficiency, float maxSpeed)
	{
		this.name = name;
		this.owner = owner;
		this.max_oil_level = max_oil_level;
		this.fuel_efficiency = fuel_efficiency;
		this.maxSpeed = maxSpeed;
		this.oil_level_gauge = oil_level_gauge;
	}
	
	String name;
	String owner;
	float max_oil_level;
	float mileage;
	float oil_level_gauge;
	float fuel_efficiency;
	float maxSpeed;
	
	void carInfo()
	{
		System.out.println("이 자동차 이름은 " + name + "입니다.");
		System.out.println("이 자동차 주인은 " + owner + "입니다.");
		System.out.println("이 자동차 최대 기름량은 " + max_oil_level + "리터 입니다.");
		System.out.println("이 자동차 현재 기름량은 " + oil_level_gauge + "리터 입니다.");
		System.out.println("이 자동차 최고 속도는 " + maxSpeed + "Km/h 입니다.");
		System.out.println("이 자동차 연비는 " + fuel_efficiency + "Km/h 입니다.");
		System.out.println("이 자동차 현재까지 주행거리는 " + mileage + "Km 입니다.");
		System.out.println("------------------------------------------------------------");
	}
	
	void move(int speed, int minute)
	{
		if(speed > maxSpeed)
		{
			System.out.println("최고속도인 " + maxSpeed + "Km/h 를 넘을 수 없습니다.");
			return;
		}
		float maxDistance = oil_level_gauge * fuel_efficiency;	//최대거리 = 현재기름양 * 연비
		float distance = (minute / (float) 60) * speed;
		if(distance > maxDistance)
		{
			oil_level_gauge = 0;
			mileage = mileage + maxDistance;
		}
		else
		{
			oil_level_gauge = oil_level_gauge - (distance / fuel_efficiency);
			mileage = mileage + distance;
		}
	}
	
	void move(float distance)
	{
		float maxDistance = oil_level_gauge * fuel_efficiency;
		if(distance > maxDistance)
		{
			oil_level_gauge = 0;
			mileage = mileage + maxDistance;
		}
		else
		{
			oil_level_gauge -= distance/fuel_efficiency;
			mileage += distance;
		}
	}
}