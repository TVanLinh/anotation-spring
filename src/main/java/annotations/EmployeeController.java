package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by linhtran on 25/04/2017.
 */
@Controller("employeeController")
public class EmployeeController
{
    @Autowired
    EmployeeManager manager;

    public EmployeeDTO createNewEmployee()
    {
        return manager.createNewEmployee();
    }
}