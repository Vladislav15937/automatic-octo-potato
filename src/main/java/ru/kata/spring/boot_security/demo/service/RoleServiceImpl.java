package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.entity.Role;
import ru.kata.spring.boot_security.demo.repositoryes.RoleRepositry;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {


    private final RoleRepositry roleRepositry;

    public RoleServiceImpl(RoleRepositry roleRepositry) {
        this.roleRepositry = roleRepositry;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepositry.findAll();
    }
}
