public record EmployeeRecord(int id, String firstName, String lastName) {
    private static int empCount = 0;
    public EmployeeRecord{
        if(id>100 || firstName.length()<2){
            throw new IllegalArgumentException();
        }
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
    public static String getEmployeeToken(){
        empCount += 1;
        return String.valueOf(empCount);
    }
}
