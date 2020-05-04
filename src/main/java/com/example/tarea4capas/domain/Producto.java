package com.example.tarea4capas.domain;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

public class Producto {

    @Size(min=12, max=12, message = "El campo Codigo de producto universal deber tener 12 caracteres")
    String CPU;

    @Size(min=1, max=100, message = "El campo nombre de Producto debe tener una longitud entre 1 y 100 caracteres")
    String nombre;

    @Size(min=1, max=100, message = "El campo nombre de Producto debe tener una longitud entre 1 y 100 caracteres")
    String marca;

    @Size(min=1, max=500, message = "El campo nombre de Producto debe tener una longitud entre 1 y 500 caracteres")
    String descripcion;

    @Digits(integer = 10, fraction = 0, message = "El valor de existencia debe ser entero")
    String existencia;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    String fecha;

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
