package nrcm;

interface company{
	void employees();
}
interface HR{
	void manager();
}
interface Work extends company,HR{
	void work();
}
class  interviewers{
	void interviewers() {
		System.out.println("interviewers are: deepak,arun,rajeshwar");
	}
}
class location extends interviewers implements Work{
	public void qualities() {
		System.out.println("Qualities are :good,better,best");
	}
	public void employees() {
		System.out.println("Employees are:mandhira,anvitha,akhila");
	}
	public void manager() {
		System.out.println("Managers are:ravi,vinay,Rayudu");
	}
	public void work() {
		System.out.println("works are :typing,data analyst");
	}
	
}

public class Day6{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		location l1=new location();
		interviewers t1=new interviewers();
		l1.employees();
		l1.manager();
		l1.qualities();
		l1.interviewers();
		t1.interviewers();
		
	}

}


