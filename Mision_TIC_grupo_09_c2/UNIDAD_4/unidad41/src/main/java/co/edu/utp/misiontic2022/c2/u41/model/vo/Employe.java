package co.edu.utp.misiontic2022.c2.u41.model.vo;


import java.io.Serializable;

public class Employe implements Serializable {
    private Integer id;
    private String name;
    private String email;
    private Departament department;

    public Employe() {
    }

    public Employe(String name) {
        this.name = name;
    }

    public Employe(String name, String email, Departament department) {
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public Employe(Integer id, String name, String email, Departament department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Departament getDepartment() {
        return department;
    }

    public void setDepartment(Departament department) {
        this.department = department;
    }

}

