package models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Productos {
    @Getter
    @Setter
    private  Long id;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private Double precio;
    @Getter
    @Setter
    private Date fechaAlta;
}
