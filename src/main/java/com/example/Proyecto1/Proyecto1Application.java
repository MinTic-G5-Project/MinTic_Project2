package com.example.Proyecto1;


public class Proyecto1Application {

	public static void main(String[] args) {
		Finca finca1= new Finca("El palomo", "3213178899");
		Finca finca2= new Finca("El palomo", "3213178899");

		Sensor sensor1= new Sensor(15,finca1);
		Sensor sensor2= new Sensor(30,finca2);
		Sensor sensor3= new Sensor(45,finca2);

		MovimientoSensor mov1= new MovimientoSensor(sensor1, 20);

		System.out.println(sensor1.getFinca().getNombre());
		System.out.println(sensor1.getPresicion());

	}

}
