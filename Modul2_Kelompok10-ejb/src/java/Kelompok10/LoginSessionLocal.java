/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelompok10;

import javax.ejb.Local;

/**
 *
 * @author Knight-Son
 */
@Local
public interface LoginSessionLocal {

    boolean Login(String Nama, String Nim);

    boolean isLoginStatus();

    void setLoginStatus(boolean param);
    
}
