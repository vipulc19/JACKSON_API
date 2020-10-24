import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Employee e = new Employee();
        e.setEMPNO(201);
        e.setName("Ram");
        e.setSalary(2000);
        e.setAge(22);

        //Conversions:
        String jsonEmployee = JSON_Util.convertJavatoJason(e);
        Employee emp = JSON_Util.convertJSONtoObject(jsonEmployee, Employee.class);
        System.out.println(jsonEmployee);
        System.out.println();
        System.out.println(emp.getEMPNO() + "\t" + emp.getName() + "\t" + emp.getSalary() + "\t" + emp.getAge());

        System.out.println(JSON_Util.readJSONTree(jsonEmployee));
    }
}
