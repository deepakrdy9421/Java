package nrcm;

interface restaurent{
	void restaurents();
}
interface near{
	void Near();
}
class fav{
	void dish() {
		System.out.println("My favourite is Pizza ");
	}
}
class place extends fav implements restaurent,near{
	public void places() {
		System.out.println("delite , polam, ulvacharu");
	}
	public void restaurents() {
		System.out.println("restaurents in Hyderabad : ");
	}
	public void Near() {
		System.out.println("Near by kompally are : ");
	}
}

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fav f1=new fav();
		place p1=new place();
		p1.restaurents();
		p1.Near();
		p1.places();
		f1.dish();

	}

}
