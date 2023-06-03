package assignment04;

import java.util.Scanner;

public class CarSimulator {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		Car car = null;
		System.out.println("Car's year: ");
		car.year=input.nextInt();
		
		System.out.println("Car's maker: ");
		car.make=input.next();
		
		System.out.println("Car's speed: ");
		car.speed=input.nextDouble();
		
		System.out.println("My car is a "+ car.getYear()+" "+ car.getMake()+"and my car's speed is "+car.getSpeed());
	}

}
