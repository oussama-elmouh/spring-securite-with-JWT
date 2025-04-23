package org.sid.sec_service.sec.service;

import org.sid.sec_service.sec.entities.AppRole;
import org.sid.sec_service.sec.entities.AppUser;

import java.util.List;

public interface AccountService {
    //permet de ajouter un utilisateur
    AppUser addNewUser (AppUser appUser);
    //permet de ajouter un role
    AppRole addNewRole (AppRole approle);
    //permet de ajouter un role a un utilisateur
    void addRoleToUser (String username,String roleName);
    //permet de returner un utilisateur
    AppUser loadUserByUsername (String username);
    //permet de returnet un liste des utilisateur
    List<AppUser> listUsers();
}
