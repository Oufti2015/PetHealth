package ouftix.pet.health.model;

import lombok.Builder;
import lombok.ToString;

/**
 * Created by zt974 on 15-Nov-16.
 */
@ToString
@Builder
public class Email {
    private EmailType emailType;
    private boolean personal;
    private String address;

    public enum EmailType {
        PROFESSIONAL, PERSONAL
    }
}
