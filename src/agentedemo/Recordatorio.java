/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agentedemo;

/**
 *
 * @author pauli
 */
class Recordatorio {
    private String mensaje;
    private String unidad;
    private int numero;

    public Recordatorio(String mensaje, String unidad, int numero) {
        this.mensaje = mensaje;
        this.unidad = unidad;
        this.numero = numero;
    }

    public String getMensaje() {
        return mensaje;
    }
}