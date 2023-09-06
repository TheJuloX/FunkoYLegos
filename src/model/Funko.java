/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;

/**
 *
 * @author Julian Castro
 */
public class Funko extends Toy implements Cloneable{
      
    @Override
    public String getCabeza() {
        return Cabeza;
    }

    @Override
    public void setCabeza(String Cabeza) {
        this.Cabeza = Cabeza;
    }
    
    @Override
    public String getOjos() {
        return Ojos;
    }
    
    @Override
    public void setOjos(String Ojos) {
        this.Ojos = Ojos;
    }
    
    @Override
    public String getPiernas() {
        return Piernas;
    }
    
    @Override
    public void setPiernas(String Piernas) {
        this.Piernas = Piernas;
    }
    
    @Override
    public String getTorso() {
        return Torso;
    }
    
    @Override
    public void setTorso(String Torso) {
        this.Torso = Torso;
    }
    
    @Override
    public String getZapatos() {
        return Zapatos;
    }
    
    @Override
    public void setZapatos(String Zapatos) {
        this.Zapatos = Zapatos;
    }
    
    //HASHMAPS DE LAS URL;
    public HashMap Cabezas(){
        HashMap<Integer, String> hashCabezas = new HashMap();
        hashCabezas.put(0, "/images/cabeza1.png");
        hashCabezas.put(1, "/images/cabeza2.png");
        hashCabezas.put(2, "/images/cabeza3.png");
        hashCabezas.put(3, "/images/cabeza4.png");
        
        return hashCabezas;      
    }
    
    public HashMap Ojos(){
        HashMap<Integer, String> hashOjos = new HashMap();
        hashOjos.put(0, "/images/ojos1.png");
        hashOjos.put(1, "/images/ojos2.png");
        hashOjos.put(2, "/images/ojos3.png");
        hashOjos.put(3, "/images/ojos4.png");
        
        return hashOjos;      
    }
    
    public HashMap Torso(){
        HashMap<Integer, String> hashTorso = new HashMap();
        hashTorso.put(0, "/images/torso1.png");
        hashTorso.put(1, "/images/torso2.png");
        hashTorso.put(2, "/images/torso3.png");
        hashTorso.put(3, "/images/torso4.png");
        
        return hashTorso;      
    }
    
    public HashMap Piernas(){
        HashMap<Integer, String> hashPiernas = new HashMap();
        hashPiernas.put(0, "/images/piernas1.png");
        hashPiernas.put(1, "/images/piernas2.png");
        hashPiernas.put(2, "/images/piernas3.png");
        hashPiernas.put(3, "/images/piernas4.png");
        
        return hashPiernas;      
    }
    
    public HashMap Zapatos(){
        HashMap<Integer, String> hashZapatos = new HashMap();
        hashZapatos.put(0, "/images/zapatos1.png");
        hashZapatos.put(1, "/images/zapatos2.png");
        hashZapatos.put(2, "/images/zapatos3.png");
        hashZapatos.put(3, "/images/zapatos4.png");
        
        return hashZapatos;      
    }

    @Override
    public Funko clone(){
        
        Funko resetPrototipo = new Funko();
        resetPrototipo.setCabeza("");
        resetPrototipo.setOjos("");
        resetPrototipo.setTorso("");
        resetPrototipo.setPiernas("");
        resetPrototipo.setZapatos("");
        return resetPrototipo; 
    }
 
    
    
    
}
