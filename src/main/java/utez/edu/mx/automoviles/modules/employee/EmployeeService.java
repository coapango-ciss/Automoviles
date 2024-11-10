package utez.edu.mx.automoviles.modules.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import utez.edu.mx.automoviles.utils.CustomResponseEntity;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    private CustomResponseEntity customResponseEntity;

    @Transactional(readOnly = true)
    public ResponseEntity<?> findAll(){
        List<Employee> employees = employeeRepository.findAll();
        String message = "";
        if(employees.isEmpty()) message = "Aun no hay empleados registrados";
        else message = "Operación ecxitosa";
        return customResponseEntity.getOkResponse(message,"OK",200,employees);
    }
}
