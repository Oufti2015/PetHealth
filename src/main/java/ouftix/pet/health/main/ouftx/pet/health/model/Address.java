package ouftix.pet.health.main.ouftx.pet.health.model;

import lombok.Builder;
import lombok.ToString;

/**
 * Created by zt974 on 15-Nov-16.
 */
@ToString
@Builder
public class Address {
    private AddressType addressType;
    private String street;
    private String number;
    private String postalCode;
    private String city;
    private String country;

    public enum AddressType {
        PROFESSIONAL, PERSONAL
    }
}
