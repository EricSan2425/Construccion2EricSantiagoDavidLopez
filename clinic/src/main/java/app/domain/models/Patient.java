package app.domain.models;

import java.security.Policy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Patient extends Person {
    private Boolean gender;
    private EmergencyContact emergencyContact;
    private Policy policy;
    
}
