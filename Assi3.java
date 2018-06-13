import java.util.Scanner;
class A
{
	void fun(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first and Second String resp");
		int s1 = Integer.parseInt(input.next());
		int s2 = Integer.parseInt(input.next());
		
			if(s1>s2)
			System.out.println("maximun is " +s1);
		else
			System.out.println("maximun is " +s2);
	}
	
}
public class Assi3{
	
	public static void main(String[] args) {
		A obj = new A();
		obj.fun();
	}
}