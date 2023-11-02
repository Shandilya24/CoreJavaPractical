package example2;

public class Employee {
	private Integer eno;
	private String ename;
	private Float salary;
	
	public Employee() {}
    public Employee(Integer eno, String ename, Float salary)
    {
    	this.eno=eno;
    	this.ename=ename;
    	this.salary=salary;
    }
    public void setEno(Integer eno)
    {
    	this.eno = eno;
    }
    public void setEname(String ename)
    {
    	this.ename = ename;
    }
    public void setSalary(Float salary)
    {
    	this.salary = salary;
    }
    public Integer getEno()
    {
    	return eno;
    }
    public String getEname()
    {
    	return ename;
    }
    public Float getSalary()
    {
    	return salary;
    }
}
