package com.learning.service;

import com.learning.entity.Employee;
import com.learning.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //with the help of input id (/111) we can get data of the id person:-
    //with the help of Crud repository:-
    public Employee getEmployee(String id){
    return employeeRepository.findById(id).get();
    }

    // we can get data of all employees:-
    //with the help of Jpa repository:-
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee postEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void putEmployee(String id,Employee employee){
        employeeRepository.save(employee);
    }
    public void deleteEmployee(String id){
        employeeRepository.deleteById(id);
    }
//
//    public List<Employee> findAllEmployee(){
//        List<Employee> employeeList = employeeRepository.findAll();
//        return employeeList;
//    }
//
//    public void createEmployee(Employee employee){
//        employeeRepository.save(employee);
//    }
//
//    public void updateEmployee(Long id, Employee employee){
//        Optional<Employee> optionalEmployee= employeeRepository.findById(id);
//
//        if(optionalEmployee.isPresent()){
//           Employee emp = optionalEmployee.get();
//           //BeanUtils is used for copy the data
//            // to the other class.
//            BeanUtils.copyProperties(employee,emp);
//            employeeRepository.save(emp);
//
//        }
//    }
//
//    public void deleteEmployee(Long id){
//        if (employeeRepository.existsById(id)){
//            employeeRepository.deleteById(id);
//        }
//    }
}
