package com.cst8277.ums;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
    RoleRepository roleRepository;

    //Get all roles
    @GetMapping("/roles")
    public @ResponseBody Iterable<Role> getAllRoles(){
        return roleRepository.findAll();
    }

/* INSERTING a Role is not needed
    @GetMapping("/insertrole")
    public @ResponseBody String insertRole(@RequestParam String name,
                                           @RequestParam String description){
        Role newrole = new Role();
        newrole.setName(name);
        newrole.setDescription(description);
        roleRepository.save(newrole);
        return "Role Inserted into Records";
    }
    */
}
