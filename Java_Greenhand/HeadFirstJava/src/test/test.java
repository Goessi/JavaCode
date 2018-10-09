package test;

import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		int one = 20456654;
		double two = 100567890.248907;
		String s = String.format("%tc", new Date());
		String t = String.format("%tr", new Date());
		System.out.println(s);
		System.out.println(t);
		
		Date today = new Date();
		String m = String.format("%tA, %tB, %td", today, today,today);
		System.out.println(m);
		
		Date today1 = new Date();
		String n = String.format("%tA, %<tB, %<td", today1); // < 重复利用之前得参数
		System.out.println(n);
		
		Calendar cal = Calendar.getInstance();
		cal.set(2007, 10, 8, 10, 0);
		long day1 = cal.getTimeInMillis();
		day1 += 1000*60*60;
		cal.setTimeInMillis(day1);
		System.out.println("new hour "+cal.get(cal.HOUR_OF_DAY));
		cal.add(cal.DATE, 35);
		System.out.println("add 35 days " + cal.getTime());
		cal.roll(cal.DATE, 35);
		System.out.println("roll 35 days " + cal.getTime()); //only day rolls
		cal.set(cal.DATE, 1);
		System.out.println("set to 1 " + cal.getTime());

	}

}
