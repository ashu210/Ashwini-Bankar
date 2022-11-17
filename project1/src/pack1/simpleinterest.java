package pack1;

public class simpleinterest 
{
	
	public static int interest(int p,int r,int t) 
	{
		int si;
		si=(p*r*t)/100;
		return(si);
	}
     public static void main(String[]args)
	{

	int rest=interest(5000,15,1);
	

		System.out.println("simple interest:"+rest);

}
}