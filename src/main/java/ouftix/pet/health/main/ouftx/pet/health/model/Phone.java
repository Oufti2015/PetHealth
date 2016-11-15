package ouftix.pet.health.main.ouftx.pet.health.model;

import lombok.Builder;

/**
 * Created by zt974 on 15-Nov-16.
 */
@Builder
public class Phone {
    private PhoneType phoneType;
    private boolean personal;
    private String countryCode;
    private String phoneNumber;

    @Override
    public String toString() {
        return phoneType + " " + (personal ? "PERSO" : "PRO") + " : " + "+" + countryCode + " " + phoneNumber;
    }

    public enum PhoneType {
        MOBILE, FIX
    }
}
