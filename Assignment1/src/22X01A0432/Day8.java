package nrcm;

interface Chillipowder{
	void Chillies();
}
interface Turmericpowder{
	void turmeric();
}
interface Corianderpowder{
	void coriander();
}
class Spicies implements Chillipowder,Turmericpowder,Corianderpowder{
	public void Spicies(){
		System.out.println("spicies are: Gingergarlic,masala,elachi");
	}
	public void Chillies() {
		System.out.println("Chillies are :red,green");
	}
	public void turmeric() {
		System.out.println("turmeric are in:yellow");
	}
	public void coriander() {
		System.out.println("coriander are in:green");
	}
}
interface Kitchen{
	void kit();
}
 class Vessels extends Spicies implements Kitchen{
	public void items() {
		System.out.println("Item Details are:");
	}
	public void Kitchen() {
		System.out.println("ingredients are:");
	}
	@Override
	public void kit() {
		// TODO Auto-generated method stub
		
	}
}

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vessels v1=new Vessels();
		Spicies s1=new Spicies();
		v1.Kitchen();
		v1.items();
		s1.Chillies();
		s1.turmeric();
		s1.coriander();
		s1.Spicies();

	}
}
	

