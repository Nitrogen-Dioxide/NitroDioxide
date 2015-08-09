package net;

public class BirthReference {
	private String name;
	private MonthDay birthday;
	
	public BirthReference(String thename, MonthDay thebirthday){
		name = thename;
		birthday = thebirthday;
	}
	
	public String toString(){
		return String.format("My name is %s and my birthday is %s.", name, birthday);
	}

}
