/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Julian Castro
 */
public class SingletonCaraExclusiva{
    
    private String Cabeza ;
    private String Ojos;
    private String Torso ;
    private String Piernas ;
  
    private static SingletonCaraExclusiva instance;

    private SingletonCaraExclusiva(){
        
        this.Cabeza = "";
        this.Ojos = "/images/OjosExclusivoLego.png";
        this.Torso = "/images/torso4LEGO.png";
        this.Piernas = "/images/pantalones4LEGO.png";
       
               
    }

    public static SingletonCaraExclusiva getInstance() {
        if(instance == null ){
            instance = new SingletonCaraExclusiva();
        }
        return instance;
    }
  
   
    public String getCabeza() {
        return Cabeza;
    }
    
  
    public void setCabeza(String Cabeza) {
        this.Cabeza = Cabeza;
    }

 
    public String getOjos() {
        return Ojos;
    }

 
    public void setOjos(String Ojos) {
        this.Ojos = Ojos;
    }

    public String getPiernas() {
        return Piernas;
    }

    public void setPiernas(String Piernas) {
        this.Piernas = Piernas;
    }

    public String getTorso() {
        return Torso;
    }


    public void setTorso(String Torso) {
        this.Torso = Torso;
    }
 
}
