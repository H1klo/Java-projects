public class Main {
    public static void main(String[] args) {
        Manager director = new Manager("Matt LeBlanc");

        Secretary dirsecretary = new Secretary("Jennifer Aniston",director);
        Manager manager = new Manager("Courteney Cox",director);
        director.AddEmployee(dirsecretary);
        director.AddEmployee(manager);
        System.out.println(director);
        System.out.println("----------");
        Secretary secretary = new Secretary("Lisa Kudrow",manager);
        Technician technician = new Technician("Matthew Perry",manager);
        manager.AddEmployee(secretary);
        manager.AddEmployee(technician);
        System.out.println(manager);
    }
}
