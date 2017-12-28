package builderPattern;

/**
 * @author 212607214
 * @Date 12/19/2017
 */
public class Address {
    private String street;
    private String city;
    private String zip;

    private Address(AddressBuilder addressBuilder){
        this.street = addressBuilder.street;
        this.city = addressBuilder.city;
        this.zip = addressBuilder.zip;
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

    public static class AddressBuilder{
        private String street;
        private String city;
        private String zip;

        public AddressBuilder setStreet(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder setZip(String zip) {
            this.zip = zip;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
}
