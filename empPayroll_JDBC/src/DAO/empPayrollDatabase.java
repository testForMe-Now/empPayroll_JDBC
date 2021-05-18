package DAO;
import java.sql.SQLException;
import java.util.List;

import MODEL.EmpPayrollData;

public interface empPayrollDatabase{
    public List<EmpPayrollData> getEmployees() throws SQLException;
    public void update() throws SQLException;
    public List<EmpPayrollData> getEmpDetailsViaName() throws SQLException;
    public void empViaJoinDate() throws SQLException;
}
