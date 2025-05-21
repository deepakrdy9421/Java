package nrcm;
interface proname{
	void name();
} 
interface proprice{
	void price();
}
interface promodel extends proname,proprice{
	void model();
}
public class Day1 implements promodel{
	public void display() {
		System.out.println("All details:");
	}
	public void name() {
		System.out.println("Name: Iphn");
	}
	public void price() {
		System.out.println("price: 100000");
	}
    public void model() {
    	System.out.println("Model: 16pro");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1 d1=new Day1();
		d1.display();
		d1.name();
		d1.price();
		d1.model();

	}
}

