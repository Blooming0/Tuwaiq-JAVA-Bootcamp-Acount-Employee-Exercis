public class Employee {
    private String id ;
    private String name;
    private int salary;
    Employee(String id, String name, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        System.out.println("✅ New Employee Created:");
        System.out.println("🆔 ID: " + id + " | 👨 Name: " + name + " | 💰 Salary: " + salary);
    }
    public String getID(){
        System.out.println("🆔 Getting Employee ID: " + id);
        return id;
    }
    public String getName (){
        System.out.println("👨 Getting Employee Name: " + name);
        return name ;
    }
    public int getSalary(){
        System.out.println("💰 Getting Current Salary: " + salary);
        return salary;
    }
    public int getAnnualSalary(){
        int annual = salary*12;
        System.out.println("📅 Calculating Annual Salary: " + salary + " x 12 = " + annual);
        return annual;
    }
    public int raisedSalary(int percent){
        int raised = (int)(salary * (1 + (double) percent / 100));
        System.out.println("📈 Raising Salary by " + percent + "%");
        System.out.println("💰 Old Salary: " + salary);
        System.out.println("💵 New Salary: " + raised);
        return raised;
    }
    @Override
    public String toString() {
        return "========================\n" +
                "👨 Employee Info:\n" +
                "🆔 ID      : " + id + "\n" +
                "📛 Name    : " + name + "\n" +
                "💰 Salary  : " + salary + "\n" +
                "========================";
    }

}
