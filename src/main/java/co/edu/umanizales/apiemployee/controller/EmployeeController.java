package co.edu.umanizales.apiemployee.controller;

import co.edu.umanizales.apiemployee.model.Employee;
import co.edu.umanizales.apiemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployees()
    {
        return employeeService.getEmployees();
    }

    @GetMapping(path = "/message")
    public String getMessage()
    {
        return "Hola campeones";
    }

    @GetMapping(path="/{id}")
    public Employee getEmployeeById(@PathVariable String id)
    {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public String saveEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

}
