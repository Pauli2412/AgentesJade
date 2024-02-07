/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agentedemo;

/**
 *
 * @author pauli
 */
public class AsistenteAgente extends jade.core.Agent {
    protected void setup() {
        addBehaviour(new jade.core.behaviours.OneShotBehaviour(this) {
            public void action() {
                Deber deber = recibirDeber();

                // Enviar recordatorio mencionando la fecha asignada por LicenciadoAgente
                Recordatorio recordatorio = new Recordatorio("Recuerda completar la tarea de Matemáticas antes del " + deber.getFecha(), "Matemáticas", 1);
                EstudianteAgente estudiante = new EstudianteAgente();
                enviarRecordatorio(estudiante, recordatorio);
            }
        });
    }

    private Deber recibirDeber() {
        // Simulando la recepción de un deber del LicenciadoAgente (en este caso, creando uno por ahora)
        return new Deber("Tarea de Matemáticas", "Resolver problemas del capítulo 5", "Matemáticas", 1);
    }

    private void enviarRecordatorio(EstudianteAgente estudiante, Recordatorio recordatorio) {
        String contenido = "Recordatorio: " + recordatorio.getMensaje();
        enviarMensaje(estudiante, contenido, jade.lang.acl.ACLMessage.INFORM);
    }

    private void enviarMensaje(EstudianteAgente estudiante, String contenido, int tipo) {
        jade.lang.acl.ACLMessage msg = new jade.lang.acl.ACLMessage(tipo);
        msg.setContent(contenido);
        msg.addReceiver(estudiante.getAID());
        send(msg);
        System.out.println("Asistente Agente envió mensaje a Estudiante Agente");
    }
}
