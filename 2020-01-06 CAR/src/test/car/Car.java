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
		System.out.println("�� �ڵ��� �̸��� " + name + "�Դϴ�.");
		System.out.println("�� �ڵ��� ������ " + owner + "�Դϴ�.");
		System.out.println("�� �ڵ��� �ִ� �⸧���� " + max_oil_level + "���� �Դϴ�.");
		System.out.println("�� �ڵ��� ���� �⸧���� " + oil_level_gauge + "���� �Դϴ�.");
		System.out.println("�� �ڵ��� �ְ� �ӵ��� " + maxSpeed + "Km/h �Դϴ�.");
		System.out.println("�� �ڵ��� ����� " + fuel_efficiency + "Km/h �Դϴ�.");
		System.out.println("�� �ڵ��� ������� ����Ÿ��� " + mileage + "Km �Դϴ�.");
		System.out.println("------------------------------------------------------------");
	}
	
	void move(int speed, int minute)
	{
		if(speed > maxSpeed)
		{
			System.out.println("�ְ�ӵ��� " + maxSpeed + "Km/h �� ���� �� �����ϴ�.");
			return;
		}
		float maxDistance = oil_level_gauge * fuel_efficiency;	//�ִ�Ÿ� = ����⸧�� * ����
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