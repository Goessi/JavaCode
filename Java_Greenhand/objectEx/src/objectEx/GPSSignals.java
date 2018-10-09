package objectEx;

import java.util.Scanner;

public class GPSSignals {
	public static int calCount(String haha)
	{
		int count = haha.charAt(1)^haha.charAt(2);
		for(int i=3;i<haha.length();i++)
		{
			char w = haha.charAt(i);
			if(w == '*')
			{
				break;
			}
			else
			{
				count = count^w;
			}
		}
		return count;
	}
	
	public static boolean findGPRMC(String haha)
	{
		boolean yOn = false;
		if(haha.substring(0, 6).equals("$GPRMC"))
		{
			yOn = true;
		}
		return yOn;
	}
	
	public static boolean findState(String haha)
	{
		boolean yOn = false;
		int m = haha.indexOf(',');
		m = haha.indexOf(',',m+1);
		char a = haha.charAt(m+1);
		if(a == 'A')
		{
			yOn = true;
		}
		return yOn;	
		
	}

	public static void main(String[] args) {    	
    	Scanner in = new Scanner(System.in);
    	String haha = in.nextLine();
    	String t = "";
    	String h ="";
    	String mi = "";
    	String s = "";
    	int hour = 0;
    	int minute = 0;
    	int second = 0;
    	while(!(haha.equals("END")))
    	{
    		if(findGPRMC(haha))
    		{
    			int m = calCount(haha);
    			int n = Integer.parseInt(haha.substring(haha.indexOf('*')+1),16);
    			if(m==n&&findState(haha))
    			{
    				int a = haha.indexOf(',');
    		    	int b = haha.indexOf('.');
    		    	
    		    	t = haha.substring(a+1, b);
    		    	h = t.substring(0,2);
    		    	mi = t.substring(2,4);
    		    	s = t.substring(4);  
    		    	hour = Integer.parseInt(h)+8;
    		    	minute = Integer.parseInt(mi);
    		    	second = Integer.parseInt(s);  				    				        		
    			}     	
        	
    		}
    		haha = in.nextLine();
    	}
    	
    	if(hour>24)
    	{
    		hour = hour-24;
    	}
    	if(hour!=0||minute!=00||second!=0)
    	{
    		if(hour<10)
    		{
    			System.out.print("0"+hour+":");
    		}
    		else
    		{
    			System.out.print(hour+":");
    		}
    	
    		if(minute<10)
    		{
    			System.out.print("0"+minute+":");
    		}
    		else
    		{
    			System.out.print(minute+":");
    		}
    	
    		if(second<10)
    		{
    			System.out.print("0"+second);
    		}
    		else
    		{
    			System.out.print(second);
    		}
    	}
    	
    	

		
	}

}
