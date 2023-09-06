/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Julian Castro
 */
public abstract class Toy {
    
    protected String Cabeza;
    protected String Ojos;
    protected String Piernas;
    protected String Torso;
    protected String Zapatos;
    
    public abstract String getCabeza();
    public abstract void setCabeza(String Cabeza);
    public abstract String getOjos();
    public abstract void setOjos(String Ojos);
    public abstract String getPiernas();
    public abstract void setPiernas(String Piernas);
    public abstract String getTorso();
    public abstract void setTorso(String Torso);
    public abstract String getZapatos();
    public abstract void setZapatos(String Zapatos);

  
}
