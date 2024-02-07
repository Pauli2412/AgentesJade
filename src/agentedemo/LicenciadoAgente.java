/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agentedemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pauli
 */
public class LicenciadoAgente extends jade.core.Agent {
    protected void setup() {
        addBehaviour(new jade.core.behaviours.OneShotBehaviour(this) {
            public void action() {
                Deber deber = new Deber("Tarea de Matemáticas", "Resolver problemas del capítulo 5", "Matemáticas", 1);
                asignarFechaDeber(deber);

                EstudianteAgente estudiante = new EstudianteAgente();
                enviarDeber(estudiante, deber);
            }
        });
    }

    private void asignarFechaDeber(Deber deber) {
        // Simulando la asignación de la fecha al deber (en este caso, la fecha actual)
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fecha = new Date();
        System.out.println("Licenciado Agente asignó la fecha " + dateFormat.format(fecha) + " al deber: " + deber.getNombre());
        deber.setFecha(fecha);
    }

    private void enviarDeber(EstudianteAgente estudiante, Deber deber) {
        String contenido = "Deber: " + deber.getNombre();
        enviarMensaje(estudiante, contenido, jade.lang.acl.ACLMessage.INFORM);
    }

    private void enviarMensaje(EstudianteAgente estudiante, String contenido, int tipo) {
        jade.lang.acl.ACLMessage msg = new jade.lang.acl.ACLMessage(tipo);
        msg.setContent(contenido);
        msg.addReceiver(estudiante.getAID());
        send(msg);
        System.out.println("Nuevo Deber Asignado");
    }
}
