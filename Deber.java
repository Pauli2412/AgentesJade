/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agentedemo;
import java.util.Date;

/**
 *
 * @author pauli
 */
class Deber {
    private String nombre;
    private String descripcion;
    private String unidad;
    private int numero;
    private Date fecha; // Nueva variable para almacenar la fecha

    public Deber(String nombre, String descripcion, String unidad, int numero) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidad = unidad;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
