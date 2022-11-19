package com.collicode.security.security.repository;

import com.collicode.security.security.entity.AppUser;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Repository
public interface AppUserRepository {
    Optional<AppUser> findByEmail(String email);
}
