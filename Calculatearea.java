import java.util.Scanner;
class Calculatearea
{
	void Area(int b,int h)
	{
	    int A;
	    A=b*h/2;

	    System.out.println("Area of triangle is :"+A);
	}
	void Area(int s)
	{
	    int A;
	    A=s*s;

	    System.out.println("Area of Square is :"+A);
	}
	
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);

	    Calculatearea a=new Calculatearea();

	    int Height,Base,Side;

	    System.out.println("Enter height of Triangle:");
	    Height=sc.nextInt();

	    System.out.println("Enter Base of Reactangle:");
	    Base=sc.nextInt();	

	    a.Area(Height,Base);

	    System.out.println("\nEnter Side of Square:");
	    Side=sc.nextInt();

	    a.Area(Side);

	}
}
 hiii
 