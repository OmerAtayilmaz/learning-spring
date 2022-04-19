package com.app.repo;

import com.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface PersonRepository extends JpaRepository<User,Long> {
}
