package com.example.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee-list")
    public String getAllEmployees(Model model) {
        List<Employee> employees = employeeService.findAllEmployees();
        model.addAttribute("employees", employees);
        return "employee-list";
    }

    @GetMapping("/add-employee")
    public String showAddEmployeeForm() {
        return "add-employee";
    }

    @PostMapping("/add-employee")
    public String addEmployee(@RequestParam String name, @RequestParam String position, @RequestParam Double salary, @RequestParam String department) {
        Employee employee = new Employee(name, position, salary,department);
        employeeService.addEmployee(employee);
        return "redirect:/employee-list";
    }
}
