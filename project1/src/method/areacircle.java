package method;

public class areacircle {
	private static char[] res;
	public static double area(double pi,int r)
	{
		double area;
		 area = pi*r*r;
		System.out.println("area of circle");
		return(area);
	}
	public static void main(String[] args) 
	{
		double res =area(3.14,4);
		
		System.out.println(res);
		
		
	}
		
	}


