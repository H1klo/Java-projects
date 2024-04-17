public class Secretary extends Employee{
    Secretary(String name,Manager manager){
        this.name=name;
        this.manager=manager;
    }
    Secretary(String name){
        this.name=name;
        this.manager=null;
    }
}
