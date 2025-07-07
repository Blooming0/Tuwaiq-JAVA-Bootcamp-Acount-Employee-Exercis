public class Main {
    public static void main(String[] args) {
        Acount c1 = new Acount("4201231" , "Hassan",4000);
        Acount c2 = new Acount("4204322" , "Khalid",9500);
        Acount c3 = new Acount("4201231" , "Yazeed",7000);
        Acount c4 = new Acount("4205566", "Salem", 3000);
        Acount c5 = new Acount("4207788", "Fahad", 12000);
        System.out.println(c1.toString()+"\n");

        c1.debit(6000);
        System.out.println("\n");
        System.out.println(c1.toString()+"\n");
        System.out.println(c2.toString()+"\n");
        System.out.println(c3.toString()+"\n");
        c3.transfer(c1,400);
        System.out.println(c3.toString()+"\n");
        System.out.println(c1.toString()+"\n");


        // Test the Employee

        Employee emp = new Employee("E101", "Hassan", 5000);
        Employee emp2 = new Employee("E102", "Sara", 6200);
        Employee emp3 = new Employee("E103", "Khalid", 7200);
        Employee emp4 = new Employee("E104", "Laila", 4800);
        Employee emp5 = new Employee("E105", "Yazeed", 9100);
        emp.getID();
        emp.getName();
        emp.getSalary();
        emp.getAnnualSalary();
        emp.raisedSalary(10);

        // TString method
        System.out.println(emp.toString());
    }
}