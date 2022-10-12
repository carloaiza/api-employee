package co.edu.umanizales.apiemployee.service;

import co.edu.umanizales.apiemployee.model.Employee;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class EmployeeService {
    private List<Employee> employees;

    public EmployeeService() {
        employees = new ArrayList<>();
        employees.add(new Employee("12345","Carlos","Loaiza",44,"3016052808"));
        employees.add(new Employee("4554545445","Miguel","Aguirre",21,"323232322"));

        employees.add(new Employee("122112121","Alejandra","Cuesta",24,"3204567893"));

    }


    public Employee getEmployeeById(String id)
    {
        /*
        for(Employee emp:  this.employees)
        {
            if(emp.getIdentification().equals(id))
            {
                return emp;
            }
        }

        return null;
        */
         return this.getEmployees().stream().filter(x -> x.getIdentification().equals(id)).toList().get(0);
    }

    public String addEmployee(Employee employee)
    {
        //Validaciones
        employees.add(employee);
        return  "Empleado adicionado con éxito";
    }
}
