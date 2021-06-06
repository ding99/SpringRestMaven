package com.example.back.repo;

/**
 * Created by ding_ on 6/6/2021
 */

import com.example.back.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
