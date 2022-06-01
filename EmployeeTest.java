public class EmployeeTest {
    public static  void main(String args []) {
        Employee emp[] = new Employee[3];

         emp[0] = new Employee(" wasil ",12000);
         emp[1] = new Employee ( " Arif ",20000);
         emp[2] = new Employee ( " Adil ",30000);

           for ( Employee e : emp) {
               e.setid();
               System.out.println(" name = " + e.getName() + e.getid() + " , salary = " + e.getsalary());

           }
         int n =  Employee.getNextid();
           System.out.println(" Next available id = " +n);

    }
}
