package com.example.fristproject.AdminController;

import com.example.fristproject.Models.Admin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
@RestController
 class AdminController
{
    private final HashMap<Integer, Admin> adminMap=new HashMap<>();
    @PostMapping("/add admin")
    public String addAdmin(Admin admin){
        adminMap.put(admin.getId(), admin);
        return "Admin added Successfully";
    }
}
