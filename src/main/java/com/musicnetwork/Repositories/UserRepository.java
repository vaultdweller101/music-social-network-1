package com.musicnetwork.Repositories;

import com.musicnetwork.Entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Account, Long> {
    @Query(value = "select * from user where username = :username", nativeQuery = true)
    Account getUserByUsername(@Param("username") String username);
}
