package nrcm;
interface apple{
	void color();
}
interface taste extends apple{
	void taste();
}
class Scene1 implements taste{
	public void price() {
		System.out.println("100 Kg");
	}
	public void color() {
		System.out.println("Red");
	}
	public void taste() {
		System.out.println("sweet");
	}
}
class Scene2 implements taste{
	public void benefits() {
		System.out.println("Healthy");
	}
	public void color() {
		System.out.println("red");
	}
	public void taste() {
		System.out.println("sweet");
	}
}
public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scene1 s1=new Scene1();
        Scene2 s2=new Scene2();
        s1.color();
        s1.taste();
        s1.price();
        s2.benefits();
        s2.color();
        s2.taste();
	}

}
