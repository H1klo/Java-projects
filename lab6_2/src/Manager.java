import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    List<Employee> employees= new ArrayList<>();
    Manager(String name,Manager manager){
        this.name=name;
        this.manager=manager;

    }
    Manager(String name){
        this.name=name;
        this.manager=null;
    }
    public void AddEmployee(Employee employee){
        employees.add(employee);
    }


    public String Work() {
        return "do manager";
    }

    @Override
    public String toString() {
        String temp="";
        for (Employee e:employees){
            temp = temp.concat('\n'+"Name: "+e.getName()+'\n'+"Manager: "+e.getManager());
        }
        return "Manager{" +
                "name='" + name + '\'' +
                ", employees=" + temp+
                '}';
    }
}
