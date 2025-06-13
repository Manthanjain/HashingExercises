import java.util.Objects;

public class Employee {
    public int id;
    public String name;
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj==null || obj.getClass() != this.getClass()){
            return false;
        }
        Employee emp = (Employee)(obj);
        return this.id == emp.id;
    }
}
