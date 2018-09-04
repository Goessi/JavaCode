// time: 2018-09-04
// timer shows time change
// one tick one second
// hh:mm:ss,24h


import java.util.Scanner;

class Display 
{
	private int value = 0;
	private int limit = 0;
	
	public Display(int limit,int value) {
		this.limit = limit;
		this.value = value;
	}
	
	public void increase() {
		value++;
		if(value==limit) {
			value = 0;
		}
	}
	
	public int getValue() {
		return value;
	}
}

class Clock 
{
	private Display hour;
	private Display minute;
	private Display second;
	
	public Clock(int hour,int minute,int second) {
		this.hour = new Display(24,hour);
		this.minute = new Display(60,minute);
		this.second = new Display(60,second);
	}
	
	public void tick() {
		second.increase();
		if(second.getValue()==0) {
			minute.increase();
			if(minute.getValue()==0) {
				hour.increase();
			}
		}
		
	}
	
	public String toString() {
		int h = hour.getValue();
		int m = minute.getValue();
		int s = second.getValue();
		String haha="";
		return haha.format("%02d:%02d:%02d", h,m,s);
	}
}


public class Main {	
	
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());

		clock.tick();

		System.out.println(clock);

		in.close();

	}

}
