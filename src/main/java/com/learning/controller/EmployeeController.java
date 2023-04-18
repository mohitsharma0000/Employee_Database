package com.learning.controller;

import com.learning.entity.Employee;
import com.learning.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping
    public void postEmployee(@RequestBody Employee employee ){
         employeeService.postEmployee(employee);
    }

    //with the help of input id (/111) we can get data of the id person:-
    //with the help of crud repository:-
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") String id){
        return employeeService.getEmployee(id);
    }


    // we can get data of all employees:-
    //with the help of Jpa repository:-
    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
//    @PostMapping("/Api")
//    public void createEmployee(@RequestBody Employee employee){
//        employeeService.createEmployee(employee);
//    }
//    // {id} is a placeholder which id we want to delete we write it down their.
//    // ("/Api") http://localhost:9111/employee/Api
//    // http://localhost:9111/employee/101 , when we want to delete.
//
    @PutMapping("/{id}")
    public void putEmployee(@PathVariable("id") String id,@RequestBody Employee employee)
    {
        employeeService.putEmployee(id,employee);
        //return "Updated";
    }

    @DeleteMapping("/{id}")
        public void deleteEmployee (@PathVariable("id") String id){
            employeeService.deleteEmployee(id);
    }
}


