package nrcm;

interface choclates{
	void choclates();
}
interface healthy{
	void healthy();
	
}
class Practice10 {
	void types() {
		System.out.println("types are:Dairymilk,Munch,Snickers");
	}
}
class Practice11 extends Practice10 implements choclates,healthy{
	public void tastes() {
		System.out.println("tastes are: sweet,oversweet");
	}
	public void choclates() {
		System.out.println("choclates are:kitkat,fuse,harsheys");
	}
	public void healthy() {
		System.out.println("Healthy things are: protiens,calories");
	}
}
class Practice12 extends Practice11{
	public void expenses() {
		System.out.println("One month expenses are: 1000");
	}
}

public class Day5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice10 p1=new Practice10();
		Practice11 p2=new Practice11();
		Practice12 p3=new Practice12();
		p2.tastes();
		p2.types();
		p2.choclates();
		p2.healthy();
		p1.types();
		p3.expenses();
		p3.tastes();
	}
}

	
