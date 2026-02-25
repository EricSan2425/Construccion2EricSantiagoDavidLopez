package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
public class User extends Person {
    private String username;
    private String password;
    private Role role;

    
}
