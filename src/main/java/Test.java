public class Test
{
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.setEMPNO(201);
		e.setName("Ram");
		e.setSalary(2000);


		//Conversions:
		String jsonEmployee=JSON_Util.convertJavatoJason(e);
		Employee emp=JSON_Util.convertJsontoJava(jsonEmployee,Employee.class);
		System.out.println(jsonEmployee);
		System.out.println();
		System.out.println(emp.getEMPNO()+"\t"+emp.getName()+"\t"+emp.getSalary());


	}
}
