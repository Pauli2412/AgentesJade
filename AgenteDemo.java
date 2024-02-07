/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agentedemo;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author pauli
 */
class AgentesDemo {

    public static void main(String[] args) {
        try {
            jade.core.Runtime rt = jade.core.Runtime.instance();
            jade.core.Profile p = new jade.core.ProfileImpl();
            jade.wrapper.ContainerController container = rt.createMainContainer(p);

            jade.wrapper.AgentController estudiante = container.createNewAgent("estudiante", EstudianteAgente.class.getName(), null);
            jade.wrapper.AgentController licenciado = container.createNewAgent("licenciado", LicenciadoAgente.class.getName(), null);
            jade.wrapper.AgentController asistente = container.createNewAgent("asistente", AsistenteAgente.class.getName(), null);

            estudiante.start();
            licenciado.start();
            asistente.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
