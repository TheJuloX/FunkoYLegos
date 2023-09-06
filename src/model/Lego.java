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
public class Lego extends Toy{
    
    @Override
    public String getCabeza() {
        return Cabeza;
    }

    @Override
    public void setCabeza(String cabeza) {
        this.Cabeza = cabeza;
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
    public String getTorso() {
        return Torso;
    }

    @Override
    public void setTorso(String Torso) {
        this.Torso = Torso;
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
    public String getZapatos() {
        return null;
    }

    @Override
    public void setZapatos(String Cabeza) {
       
    }
    
    public HashMap CabezasLego(){
        HashMap<Integer, String> hashCabezasLego = new HashMap();
        hashCabezasLego.put(0, "/images/cabeza1Lego.png");
        hashCabezasLego.put(1, "/images/cabeza2Lego.png");
        hashCabezasLego.put(2, "/images/cabeza3Lego.png");
        hashCabezasLego.put(3, "/images/cabeza4Lego.png");
        
        return hashCabezasLego;      
    }
    
    public HashMap OjosLego(){
        HashMap<Integer, String> hashojosLego = new HashMap();
        hashojosLego.put(0, "/images/ojos1Lego.png");
        hashojosLego.put(1, "/images/ojos2Lego.png");
        hashojosLego.put(2, "/images/ojos3Lego.png");
        hashojosLego.put(3, "/images/ojos4Lego.png");
        
        return hashojosLego;      
    }
    
    public HashMap TorsoLego(){
        HashMap<Integer, String> TorsoLego = new HashMap();
        TorsoLego.put(0, "/images/torso1Lego.png");
        TorsoLego.put(1, "/images/torso2Lego.png");
        TorsoLego.put(2, "/images/torso3Lego.png");
        TorsoLego.put(3, "/images/torso4Lego.png");
        
        return TorsoLego;      
    }
    
    public HashMap PiernasLego(){
        HashMap<Integer, String> PiernasLego = new HashMap();
        PiernasLego.put(0, "/images/pantalones1Lego.png");
        PiernasLego.put(1, "/images/pantalones2Lego.png");
        PiernasLego.put(2, "/images/pantalones3Lego.png");
        PiernasLego.put(3, "/images/pantalones4Lego.png");
        
        return PiernasLego;      
    }
    
    
    
    
    
}
