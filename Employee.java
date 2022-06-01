 class Employee {
     private String name;
     private double salary;
     private int id;
     static int nextid;

     public Employee(String n, double s) {
         name = n;
         salary = s;
     }

     public String getName() {
         return name;

     }

     public double getsalary() {
         return salary;

     }

     public int getid() {
         return id;
     }

     public static int getNextid() {
         return nextid;

     }



           public void setid(){
               id = nextid;
               nextid++;

           }
}
