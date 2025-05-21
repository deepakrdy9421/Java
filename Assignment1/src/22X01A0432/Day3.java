package nrcm;
interface shpngmall{
	void hyd();
}
class stores{
	public void  best() {
		System.out.println("klm");
			}
}
class demo11 extends stores implements shpngmall{
	public void near() {
		System.out.println("southindia");
	}
	public void hyd() {
		System.out.println("shpngmall in hyd: ");
	}
}
class types extends demo11{
	public void ambience() {
		System.out.println("kisan");
	}
	
}

public class Day3{

	public static void main(String[] args) {
		demo11 d1=new demo11();
		types t1=new types();
		d1.hyd();
		t1.ambience();
		d1.near();
		d1.best();

	}
}
