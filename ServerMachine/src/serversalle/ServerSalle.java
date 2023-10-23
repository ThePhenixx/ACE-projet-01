/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serversalle;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
import servermachine.ServerMachine;
import service.MachineService;
import service.SalleService;

/**
 *
 * @author hp
 */
public class ServerSalle {
    
     public static void main(String[] args) throws RemoteException {
        try {
            IDao<Salle> dao = new SalleService();
            
            LocateRegistry.createRegistry(1098);
            
            Naming.bind("rmi://localhost:1098/dao", dao);
            
            System.out.println("En attente d'un client ");
            
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServerSalle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServerSalle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
