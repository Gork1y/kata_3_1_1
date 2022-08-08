package com.gorkiy.kata_3_1_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gorkiy.kata_3_1_1.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
