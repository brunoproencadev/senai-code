package prjbarbie.classes;

public class BarbieTeacher extends Barbie{
	public String subject;
	
	@Override
	public void work() {
		System.out.println(name + " está ensinando " + subject);
	}
	

}
