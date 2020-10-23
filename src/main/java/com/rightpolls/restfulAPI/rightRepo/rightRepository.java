package com.rightpolls.restfulAPI.rightRepo;

import com.rightpolls.restfulAPI.rightEntity.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;

public interface rightRepository extends JpaRepository<UserRegister, Integer> {

    UserRegister findByEmail(String email);
}
