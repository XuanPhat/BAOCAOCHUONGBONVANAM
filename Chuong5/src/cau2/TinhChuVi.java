/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Thehap Rok
 */
public class TinhChuVi extends UnicastRemoteObject implements ITinhChuVi{

    public TinhChuVi() throws RemoteException{
        super();
    }
    
    @Override
    public float tinhChuVi(float x, float y) throws RemoteException {
        try{
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return (x+y)*2;
    }
    
}
