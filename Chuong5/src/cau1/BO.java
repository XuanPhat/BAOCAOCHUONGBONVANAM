/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Thehap Rok
 */
public class BO extends UnicastRemoteObject implements IBO {

    public BO() throws RemoteException {
        super();
    }

    @Override
    public float tinhDienTich(float x, float y) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return x * y;
    }

    @Override
    public String chuanHoaTen(String ten) {
        ten = ten.toLowerCase();
        String chuanHoa = "";
        try {
            chuanHoa+= (ten.charAt(0)+"").toUpperCase();
            for (int i = 1; i < ten.length(); i++) {
                if (' ' == ten.charAt(i - 1) && ((int) ten.charAt(i)) > 90) {
                    int x = ((int) ten.charAt(i)) - 32;
                    chuanHoa += ((char) (x));
                } else {
                    chuanHoa += ten.charAt(i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("chuanhoa: "+chuanHoa);
        return chuanHoa;
    }

}
