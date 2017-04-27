package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by linhtran on 25/04/2017.
 */
@Service("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager
{
    @Autowired
    EmployeeDAO dao;

    public EmployeeDTO createNewEmployee()
    {
        return dao.createNewEmployee();
    }
}