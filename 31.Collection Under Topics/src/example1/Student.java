package example1;

public class Student {
	
	private Integer rollNo;
	private String name;
	private float marks;
	
	public Student(Integer rollNo,String name,float marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String getname() 
	{
		return name;
	}
	public float getmarks() 
	{
		return marks;
	}
	public String toString() 
	{
		return rollNo+""+name+""+marks;
	}
}
