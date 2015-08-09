package net;

public class Time {
	private int hour, minute, second;
	private int addH = 0, addM = 0;
	
	public void setime(){
		this.setime(0, 0, 0);
	}
	
	public void setime(int h){
		this.setime(h, 0, 0);
	}
	
	public void setime(int h, int m){
		this.setime(h, m, 0);
	}
	
	public void setime(int h,int m,int s){
		resetAdd();
		setSecond(s);
		setMinute(m);
		setHour(h);
	}
	
	public void setHour(int h){
		for(;h + addH >= 24;){
			h-=24;
		}
		hour = h + addH;
	}
	
	public void setMinute(int m){
		for(; m + addM >= 60; addH++){
			m-=60;
		}
		minute = m + addM;
		
	}
	
	public void setSecond(int s){
		for(; s >= 60; addM++){
			s-=60;
		}
		second = s;
	}
	
	private void resetAdd(){
		addH = 0;
		addM = 0;
	}
	
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toString(){
		return String.format("%d:%02d:%02d %s", ((hour==0||hour==12)?12:hour%12), minute, second, (hour < 12? "AM": "PM"));
	}

}
