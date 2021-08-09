package co.edu.utp.misiontic2022.c2.u41.model.vo;


import java.io.Serializable;

public class Departament implements Serializable {
    private Integer id;
    private String name;
    
    public Departament() {
    }

    public Departament(String name) {
        this.name = name;
    }

    public Departament(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return name;
    }

}
