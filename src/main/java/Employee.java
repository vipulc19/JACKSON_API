import java.io.Serializable;

public class Employee implements Serializable
{
	private int EMPNO;
	private String name;
	private double salary;


	public int getEMPNO() {
		return EMPNO;
	}

	public void setEMPNO(int EMPNO) {
		this.EMPNO = EMPNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
