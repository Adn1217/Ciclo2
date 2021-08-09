package co.edu.utp.misiontic2022.c2.u41.model.dao;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import co.edu.utp.misiontic2022.c2.u41.model.vo.Employe;



public class EmployeDao {

    private final String FILE_NAME = "employees.obj";

    public EmployeDao() {
    }

    public List<Employe> findAll() throws ClassNotFoundException, IOException {
        var response = new ArrayList<Employe>();
        var file = new File(FILE_NAME);
        if (file.exists()) {
            try (var ois = new ObjectInputStream(new FileInputStream(file))) {
                var employee = (Employe) ois.readObject();
                while (employee != null) {
                    response.add(employee);
                    employee = (Employe) ois.readObject();
                }
            } catch (EOFException e) {
            }
        }
        return response;
    }

    public Employe findById(Integer id) throws ClassNotFoundException, IOException {
        Employe response = null;
        var file = new File(FILE_NAME);
        if (file.exists()) {
            try (var ois = new ObjectInputStream(new FileInputStream(file))) {
                var employee = (Employe) ois.readObject();
                while (employee != null) {
                    if (employee.getId().equals(id)) {
                        response = employee;
                        break;
                    }

                    employee = (Employe) ois.readObject();
                }
            } catch (EOFException e) {
            }
        }
        return response;
    }

    public Employe save(Employe employee) throws ClassNotFoundException, IOException {
        var file = new File(FILE_NAME);
        var isNew = employee.getId() == null;

        if (isNew) {
            employee.setId(generarConsecutivo());
        }

        List<Employe> employees = findAll();
        try (var oos = new ObjectOutputStream(new FileOutputStream(file))) {

            for (Employe oldEmployee : employees) {
                if (oldEmployee.getId().equals(employee.getId())) {
                    oos.writeObject(employee);
                } else {
                    oos.writeObject(oldEmployee);
                }
            }
            if (isNew) {
                oos.writeObject(employee);
            }
        }

        return employee;
    }

    public Employe delete(Integer id) throws Exception {
        var employee = findById(id);
        if (employee == null) {
            throw new Exception("Empleado no existe");
        }

        List<Employe> employees = findAll();
        try (var oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            for (Employe oldEmployee : employees) {
                if (!oldEmployee.getId().equals(id)) {
                    oos.writeObject(oldEmployee);
                }
            }
        }

        return employee;
    }

    private Integer generarConsecutivo() throws ClassNotFoundException, IOException {
        Integer consecutivo = 1;

        try (var ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            var employee = (Employe) ois.readObject();
            while (employee != null) {
                if (consecutivo <= employee.getId()) {
                    consecutivo = employee.getId() + 1;
                }
                employee = (Employe) ois.readObject();
            }
        } catch (EOFException e) {
            e.printStackTrace();
        }
        return consecutivo;
    }

}

