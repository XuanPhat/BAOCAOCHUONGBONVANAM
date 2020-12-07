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
public class TinhDienTich extends UnicastRemoteObject implements ITinhDientich{

    public TinhDienTich() throws RemoteException{
        super();
    }
    
    @Override
    public float tinhDienTich(float x, float y) throws RemoteException {
        try{
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return x*y;
    }
    
}
