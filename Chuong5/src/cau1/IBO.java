/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Thehap Rok
 */
public interface IBO extends Remote{
    public float tinhDienTich(float x,float y)throws RemoteException;;
    public String chuanHoaTen(String ten)throws RemoteException;;
}
