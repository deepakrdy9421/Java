package nrcm;
interface Airconditioners{
	void type();
}
class Demo{
	public void ac() {
		System.out.println("ac types are: cool,tablefan,ceilingfan");
	}
}
class Demo20 extends Demo implements Airconditioners{
	public void phns() {
		System.out.println("phns Brands are:Iphn,samsung,vivo");
	}
	public void type() {
		System.out.println("TV types are:Samsung,LG,UV");
	}
}
class Demo21{
	public void models() {
		System.out.println("models are:Samsung,lenovo,Hp");
	}
}
class Demo22 extends Demo21{
	public void chairs() {
		System.out.println("Chairs types are:tubchair,hangingchair");
	}
}
public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		Demo20 d2=new Demo20();
		Demo21 d3=new Demo21();
		Demo22 d4=new Demo22();
		d1.ac();
		d2.phns();
		d2.type();
		d2.type();
		d3.models();
		d4.models();
		d4.chairs();

	}
}	


