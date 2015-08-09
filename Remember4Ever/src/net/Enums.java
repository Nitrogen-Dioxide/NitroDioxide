package net;

public enum Enums {
	lisa("crazy", "23"),
	miranda("normal", "59"),
	anna("grandpa", "75"),
	robot("not human", "232"),
	homer("stupid", "45");
	
	private final String desc;
	private final String age;
	
	Enums(String desc, String age){
		this.desc = desc;
		this.age = age;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getAge(){
		return age;
	}
}
