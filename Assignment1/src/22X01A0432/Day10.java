package nrcm;

interface Railway{
	void add();
}
interface Airlines{
	void sub();
}
interface Busstands{
	void mul();
}
interface Metro extends Railway,Airlines,Busstands{
	void met();
}
class Highway implements Metro{
	public void add() {
		System.out.println("Godavari Express");
	}
	public void sub() {
		System.out.println("Vistara");
	}
	public void mul() {
		System.out.println("Hyderabad");
	}
	public void met() {
		System.out.println("Hyderabad metro station");
	}
	public void modu() {
		System.out.println("Nationl Highway");
	}
}

public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Highway h1=new Highway();
		h1.add();
		h1.met();
		h1.modu();
		h1.sub();

	}

}
