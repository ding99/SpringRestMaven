package com.example.demo.repo;

/**
 * Created by ding_ on 6/6/2021
 */

import com.example.demo.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
