package com.all4k.kauan.repositories;

import com.all4k.kauan.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}


