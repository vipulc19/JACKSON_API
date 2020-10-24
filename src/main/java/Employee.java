import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

import java.io.Serializable;

@JsonPropertyOrder(value = {
        "name",
        "empno",
        "salary"})

public class Employee implements Serializable {
    private int empno;
    private String name;
    @JsonIgnore
    private double salary;
    private double age;

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getEMPNO() {
        return empno;
    }

    public void setEMPNO(int EMPNO) {
        this.empno = EMPNO;
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
