/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok10;

import javax.ejb.Stateful;

/**
 *
 * @author Knight-Son
 */
@Stateful
public class LoginSession implements LoginSessionLocal {

   
    
    private final String [] Nama = {"Kornelius Satria B"};
    private final String [] Nim = {"21120116120007"};
    private boolean loginStatus = false;
    @Override
    public boolean Login(String Nama, String Nim) {
        return Nama.equals(this.Nama[0]) && Nim.equals(this.Nim[0]);
    }
    @Override
    public boolean isLoginStatus() {
        return loginStatus;
    }
    @Override
    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

//    @Override
//    public boolean Login(String Nama, String Nim) {
//        return false;
//    }
//
//    // Add business logic below. (Right-click in editor and choose
//    // "Insert Code > Add Business Method")
//
//    @Override
//    public boolean isLoginStatus() {
//        return false;
//    }
//
//    @Override
//    public void setLoginStatus(boolean param) {
//    }
}
