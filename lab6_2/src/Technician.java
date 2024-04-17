public class Technician extends Employee{
    Technician(String name,Manager manager){
        this.name=name;
        this.manager=manager;
    }
    Technician(String name){
        this.name=name;
        this.manager=null;
    }


    public String Work() {
        return "do technician";
    }
}
