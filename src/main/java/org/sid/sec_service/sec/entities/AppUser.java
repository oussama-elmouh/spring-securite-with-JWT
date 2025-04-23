package org.sid.sec_service.sec.entities;

import jakarta.persistence.*;
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
    public Collection<AppRole>appRoles=new ArrayList<>();
}
