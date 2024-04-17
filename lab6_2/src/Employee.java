public class Employee {
    String name;

    Manager manager;

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager.name;
    }
}
