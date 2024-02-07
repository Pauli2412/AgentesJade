/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agentedemo;

/**
 *
 * @author pauli
 */
class Recurso {
    private String nombre;
    private String descripcion;
    private String unidad;
    private int numero;

    public Recurso(String nombre, String descripcion, int numero) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidad = unidad;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }
}
