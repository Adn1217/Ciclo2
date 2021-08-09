package co.edu.utp.misiontic2022.c2.u41.controller;

import java.io.IOException;
import java.util.List;

import co.edu.utp.misiontic2022.c2.u41.model.dao.DepartamentDao;
import co.edu.utp.misiontic2022.c2.u41.model.dao.EmployeDao;
import co.edu.utp.misiontic2022.c2.u41.model.vo.Departament;
import co.edu.utp.misiontic2022.c2.u41.model.vo.Employe;


public class HumanResourcesController {

    private final DepartamentDao departmentDao;
    private final EmployeDao employeeDao;

    public HumanResourcesController() {
        this.departmentDao = new DepartamentDao();
        this.employeeDao = new EmployeDao();
    }

    public List<Departament> findAllDepartments() throws IOException {
        return departmentDao.findAll();
    }

    public List<Employe> findAllEmployees() throws ClassNotFoundException, IOException {
        return employeeDao.findAll();
    }

    public Employe findEmployee(Integer id) throws ClassNotFoundException, IOException {
        return employeeDao.findById(id);
    }

    public Employe createEmployee(String name, String email, Integer departmentId) throws ClassNotFoundException, IOException {
        var employee = new Employe();
        employee.setName(name);
        employee.setEmail(email);
        employee.setDepartment(departmentDao.findById(departmentId));

        employee = employeeDao.save(employee);

        return employee;
    }

    public Employe updateEmployee(Integer id, String name, String email, Integer departmentId) throws ClassNotFoundException, IOException {
        var employee = new Employe();
        employee.setId(id);
        employee.setName(name);
        employee.setEmail(email);
        employee.setDepartment(departmentDao.findById(departmentId));

        employee = employeeDao.save(employee);

        return employee;
    }
    public Employe deleteEmployee(Integer id) throws Exception {
        return employeeDao.delete(id);
    }

}

