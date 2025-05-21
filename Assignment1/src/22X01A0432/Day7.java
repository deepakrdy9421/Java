package nrcm;

interface friends{
	void friendship();
}
 class Forever implements friends{
	void add() {
		System.out.println("bestfriends,closefriends,childhoodfriends");
	}
	void friends() {
		System.out.println("Friends in clg are:");
	}
	public void frnds() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void friendship() {
		// TODO Auto-generated method stub
		
	}
	
}
interface enemies{
	void channels();
}
class Enemy implements enemies{
	public void sub() {
		System.out.println("enemies are: ");
	}
	public void mul() {
		System.out.println("Raju,ravi,ramesh");
	}
	@Override
	public void channels() {
		// TODO Auto-generated method stub
		
	}	
}
interface family{
	void div();
}
class Relative implements family{
	public void fam() {
		System.out.println("families are:");
	}
	public void rel() {
		System.out.println("mother,father,sister");
	}
	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}
}


public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forever f1=new Forever();
		Enemy e1=new Enemy();
		Relative r1=new Relative();
		f1.friends();
		f1.add();
		e1.sub();
		e1.channels();
		r1.fam();
		

	}

}

