package org.sid.sec_service.sec.repo;

import org.sid.sec_service.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser ,Long> {
    AppUser findByUsername(String username);
}
