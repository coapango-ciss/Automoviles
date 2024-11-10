package utez.edu.mx.automoviles.modules.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utez.edu.mx.automoviles.utils.CustomResponseEntity;

@RestController
@RequestMapping("api/automoviles/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CustomResponseEntity customResponseEntity;


    @GetMapping("")
    @Secured("ROLE_ADMIN")
    public ResponseEntity<?> findAll() {
        return employeeService.findAll();
    }
}
