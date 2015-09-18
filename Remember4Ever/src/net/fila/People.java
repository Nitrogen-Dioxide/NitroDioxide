package net.fila;

public class People {
	private String name;
	
	public People(String name, int age) {
		this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
