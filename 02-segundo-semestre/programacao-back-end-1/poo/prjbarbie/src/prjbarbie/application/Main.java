package prjbarbie.application;

import prjbarbie.classes.Barbie;
import prjbarbie.classes.BarbieTeacher;

public class Main {
	public static void main(String[] args) {
		Barbie barbie = new Barbie();
		
		barbie.name = "Leila Barbie";
		barbie.age = 67;
		barbie.profession = "Vet";
		
		barbie.work();
		
		BarbieTeacher barbieTeacher = new BarbieTeacher();
		barbieTeacher.name = "Prof Andressa Barbie";
		barbieTeacher.age = 28;
		barbieTeacher.profession = "Professora";
		barbieTeacher.subject = "Mathematics";
		
		barbieTeacher.work();
		barbieTeacher.work();
		
	}
}