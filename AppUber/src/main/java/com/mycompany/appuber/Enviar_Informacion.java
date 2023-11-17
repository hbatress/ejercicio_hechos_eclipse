/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appuber;

/**
 *
 * @author usuario
 */
public class Enviar_Informacion {
  int ID_usuario;
  String NAME_USER;
  String DOCUMENTATION;
  String EMAIL;
  String Password;
  
  public Enviar_Informacion(){
      
  }
  public Enviar_Informacion(String NAME_USER,String DOCUMENTATION, String EMAIL, String Password){
  
    this.NAME_USER=NAME_USER;
    this.DOCUMENTATION=DOCUMENTATION;
    this.EMAIL=EMAIL;
    this.Password=Password;
  }

    public int getID_usuario() {
        return ID_usuario;
    }

    public void setID_usuario(int ID_usuario) {
        this.ID_usuario = ID_usuario;
    }

    public String getNAME_USER() {
        return NAME_USER;
    }

    public void setNAME_USER(String NAME_USER) {
        this.NAME_USER = NAME_USER;
    }

    public String getDOCUMENTATION() {
        return DOCUMENTATION;
    }

    public void setDOCUMENTATION(String DOCUMENTATION) {
        this.DOCUMENTATION = DOCUMENTATION;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
  
}
