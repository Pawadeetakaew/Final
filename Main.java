public class Employee {
    private String name;
    private String position;
    private String empID;
    private String[] projects;

    public Employee(String name, String position, String empID, String[] projects) {
        this.Name = name;
        this.Position = position;
        this.EmpID = empID;
        this.projects = projects;
    }

    public void displayInfo() {
        System.out.println("Name: " + Name);
        System.out.println("Position: " + position);
        System.out.println("EmpID: " + EmpID);
        System.out.println("Projects:");

        for (String project : projects) {
            System.out.println("    " + project);
        }
    }
    class Main
    public static void main(String[] args) {
        String[] tomProjects = {
            "Web A: Developing a web application",
            "Mobile app A: Developing a mobile app"
        };
        
        String[] timProjects = {
            "Web A: Developing a web application"
        };

        Employee tom = new Employee("Tom", "UX/UI", "0001", tomProjects);
        Employee tim = new Employee("Tim", "FontEnd", "0002", timProjects);

        tom.displayInfo();
        System.out.println();
        tim.displayInfo();
    }
}
