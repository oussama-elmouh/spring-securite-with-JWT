package org.sid.sec_service.sec.repo;

import org.sid.sec_service.sec.entities.AppRole;
import org.sid.sec_service.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole ,Long> {
    AppRole findByRoleName(String roleName);
}
