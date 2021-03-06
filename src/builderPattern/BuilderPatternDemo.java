package builderPattern;

/**
 * @author 212607214
 * @Date 6/11/2018
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
         /*Using builder to get the object in a single line of code and
        * without any inconsistent state or arguments management issues
        */
        Address address = new Address.AddressBuilder().setStreet("Bharathy").setCity("Jaffna").setZip("4000").build();
//        Address address = new Address.AddressBuilder().build();

        Employee employee = new Employee.EmployeeBuilder(01, "Mani").setProfession("SE").setAddress(address).build();
        System.out.println("\n*********" + "\n" + "Details: " + employee.getEmployeeId() + "_" + employee.getName() + " is " + employee.getProfession() +
                "\n" + employee.getStreet() + "\n" + employee.getCity() + "\n" + employee.getZip() + "\n" + "**************" + "\n");


        /**********************************************************************************************************/

    }
}
