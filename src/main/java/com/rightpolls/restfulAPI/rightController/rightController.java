package com.rightpolls.restfulAPI.rightController;

import com.rightpolls.restfulAPI.rightEntity.UserRegister;
import com.rightpolls.restfulAPI.rightRepo.rightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rightPolls")
public class rightController {
    @Autowired
    private rightRepository repo;
    @GetMapping(path = "/users")
    private List<UserRegister> getAllUsers(){
        return repo.findAll();
    }
    @GetMapping(path = "/getUser/{email}")
    private UserRegister getUserByEmail(@PathVariable String email){
        return repo.findByEmail(email);
    }

}
