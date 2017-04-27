package annotations;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by linhtran on 25/04/2017.
 */
@Repository ("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO
{
    public EmployeeDTO createNewEmployee()
    {
        EmployeeDTO e = new EmployeeDTO();
        e.setId(1);
        e.setFirstName("Tran ");
        e.setLastName("Van Linh");
        return e;
    }
}