package com.rakib.springbootmultipledatasource.db_config.user.repostory;

import com.rakib.springbootmultipledatasource.db_config.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
