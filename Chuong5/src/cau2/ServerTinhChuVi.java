/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import cau1.BO;
import cau1.IBO;
import static cau1.ServerCau1.registerObject;
import static cau1.ServerCau1.startRegistry;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Thehap Rok
 */
public class ServerTinhChuVi {
     private static final int PORT = 1099;
    private static Registry registry;

    public static void startRegistry() throws RemoteException {

        // Tạo một bộ đăng ký (Registry) tại Server.
        registry = LocateRegistry.createRegistry(PORT);
    }

    public static void registerObject(String name, Remote remoteObj)
            throws RemoteException, AlreadyBoundException {
        // Đăng ký đối tượng vào bộ đăng ký.
        // Nó được gắn với cái tên nào đó.
        // Client sẽ tìm trên bộ đăng ký với tên này để có thể gọi đối tượng.

        registry.bind(name, remoteObj);
        System.out.println("Registered: " + name + " -> "
                + remoteObj.getClass().getName() + "[" + remoteObj + "]");
    }
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
         System.out.println("Server waiting...");
        startRegistry();
        registerObject(ITinhChuVi.class.getSimpleName(), new TinhChuVi());
        System.out.println("Server started!");
    }
}
