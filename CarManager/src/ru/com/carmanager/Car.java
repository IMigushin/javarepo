package ru.com.carmanager;

public class Car {
	/*
	 * ������� �������� ����� � ������� � Java Class 1. ����; 2. ������������; 3.
	 * ������-������ (������� �� ���� �����������); 4. ��������� ������ (����.
	 * "toString", "equals").
	 */

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	private int distance;

	// �������� ������������.
	// Source\Generate Construcotr using Fields...
	public Car(String name, int yearOfProduction, int price, int weight, Color color) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color;
	}

	// �������� ������-������� �������.
	// ������-�����, ����������� ��������� "������".
	public void addDistance(int additionalDistance) {
		distance += additionalDistance;
	} 

	// ������-�����, ����������� �������� ������ �� ����� ����.
	// Soruce\Generate Getters and Setters
	public int getDistance() {
		return distance;
	}

	// ��������� ��������� ������� �������� ������� � ������� � ������� ������ �
	// �������.
	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + "]";
	}

	// ��������� �������� ������� 1/2...
	// Source\Generate hashcode() and equals()...
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + weight;
		result = prime * result + yearOfProduction;
		return result;
	}

	// ...��������� �������� ������� 2/2
	// Source\Generate hashcode() and equals()...
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color != other.color)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (weight != other.weight)
			return false;
		if (yearOfProduction != other.yearOfProduction)
			return false;
		return true;
	}

}
