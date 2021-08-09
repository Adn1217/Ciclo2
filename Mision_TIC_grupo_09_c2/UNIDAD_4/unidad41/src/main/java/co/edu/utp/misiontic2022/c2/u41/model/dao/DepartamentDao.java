package co.edu.utp.misiontic2022.c2.u41.model.dao;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import co.edu.utp.misiontic2022.c2.u41.model.vo.Departament;


public class DepartamentDao {

    private final String FILE_NAME = "departments.txt";

    public List<Departament> findAll() throws IOException {
        var response = new ArrayList<Departament>();
        try (var br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line = br.readLine();
            while (line != null) {
                var data = line.split(";");

                var department = new Departament();
                department.setId(Integer.valueOf(data[0]));
                department.setName(data[1]);
                response.add(department);

                line = br.readLine();
            }
        }
        return response;
    }

    public Departament findById(Integer id) throws IOException {
        Departament response = null;
        try (var br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line = br.readLine();
            while (line != null) {
                var data = line.split(";");
                if (Integer.valueOf(data[0]).equals(id)) {
                    response = new Departament();
                    response.setId(Integer.valueOf(data[0]));
                    response.setName(data[1]);
                    break;
                }

                line = br.readLine();
            }
        }
        return response;
    }
}

