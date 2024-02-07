/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agentedemo;

/**
 *
 * @author pauli
 */
public class EstudianteAgente extends jade.core.Agent {
    protected void setup() {
        addBehaviour(new jade.core.behaviours.CyclicBehaviour(this) {
            public void action() {
                jade.lang.acl.ACLMessage msg = receive();
                if (msg != null) {
                    System.out.println("Estudiante Agente recibió el mensaje: " + msg.getContent());
                    System.out.println("De: " + msg.getSender().getName());
                } else {
                    block();
                }
            }
        });
    }
}