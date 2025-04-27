package org.sid.sec_service.sec.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    //masquer le password
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    //un utilisateur peut avoir plusieur role et un role concerne plusieur utilisateur
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<AppRole>appRoles=new ArrayList<>();
    public Collection<AppRole> getAppRoles() {
        return appRoles;
    }


}
