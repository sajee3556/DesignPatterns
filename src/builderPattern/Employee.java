package builderPattern;

/**
 * @author 212607214
 * @Date 12/19/2017
 */
public class Employee {
    private int employeeId;
    private String name;
    private String profession;
    private String street;
    private String city;
    private String zip;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    private Employee(EmployeeBuilder employeeBuilder ){
            this.employeeId = employeeBuilder.employeeId;
            this.name = employeeBuilder.name;
            this.profession = employeeBuilder.profession;
            this.street = employeeBuilder.address.getStreet();
            this.city = employeeBuilder.address.getCity();
            this.zip = employeeBuilder.address.getZip();
    }

    public static class EmployeeBuilder{
        private int employeeId;
        private String name;
        private String profession;
        private Address address;

        public EmployeeBuilder(int employeeId, String name){
            this.name = name;
            this.employeeId = employeeId;
        }

        public EmployeeBuilder setAddress(Address address){
            this.address = address;
            return this;
        }

        public EmployeeBuilder setProfession(String profession) {
            this.profession = profession;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
