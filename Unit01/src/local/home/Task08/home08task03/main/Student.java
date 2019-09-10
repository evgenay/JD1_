package local.home08task03.main;

public class Student {
	private String name;
	private int group;
	private int[] marks;
	
	public Student(String name, int group, int[] marks) {
		this.name = name;
		this.group = group;
		this.marks = marks;
	}
		
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGroup() {
		return group;
	}


	public void setGroup(int group) {
		this.group = group;
	}


	public int[] getMarks() {
		return marks;
	}


	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	

}
