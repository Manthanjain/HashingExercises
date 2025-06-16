import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<>();
        set.add(new Employee(1, "Manthan"));
        set.add(new Employee(1, "Manthan"));
        System.out.println(set.size());

        Records records = new Records(2,3);
        System.out.println(records.x());
        System.out.println(records.y());

        EmployeeRecord employeeRecord = new EmployeeRecord(1,"Manthan","Jain");
        EmployeeRecord employeeRecords = new EmployeeRecord(1,"Manthan","Jain");
        HashSet<EmployeeRecord> recordSet = new HashSet<>();
        recordSet.add(employeeRecord);
        recordSet.add(employeeRecords);
        System.out.println(recordSet);
    }
}