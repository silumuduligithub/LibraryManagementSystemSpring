package com.example.fristproject.AdminController;

import com.example.fristproject.Models.Admin;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("Admin")
 class AdminController
{
     private final HashMap<Integer, Admin> adminMap=new HashMap<>();
    @PostMapping("/add_admin")
    public String addAdmin(@RequestBody Admin admin){
        adminMap.put(admin.getId(), admin);
        return "Admin added Successfully";
    }
    @GetMapping("/get_admin")
    public List<Admin> getAdmin(){
        return new ArrayList<>(adminMap.values());
    }
}
// getAdminByName
//deleteAdmin
//upDateAdminByName

// getAllStudent
//get student by name
//delete student
//remove all the student
//update student

// getAllBook
//get book by name
//delete book
//remove all the book
//update book name