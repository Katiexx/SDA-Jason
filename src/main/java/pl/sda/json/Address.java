package pl.sda.json;

/**
 * Created by RENT on 2017-03-02.
 */
public class Address {
    private String street;
    private String code;
    private String city;

    public String getStreet() {
        return street;
    }

    public String getCode() {
        return code;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
