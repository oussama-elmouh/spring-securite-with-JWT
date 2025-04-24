package org.sid.sec_service.sec.entities;

import javax.persistence.*;
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
    private String password;
    //un utilisateur peut avoir plusieur role et un role concerne plusieur utilisateur
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<AppRole>appRoles=new ArrayList<>();
    public Collection<AppRole> getAppRoles() {
        return appRoles;
    }
  /*  public AppUser(Long id, String username, String password, Collection<AppRole> appRoles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.appRoles = appRoles;
    }*/

}
