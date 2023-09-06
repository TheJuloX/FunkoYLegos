/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import javax.swing.ImageIcon;
import model.*;

/**
 *
 * @author Julian Castro
 */
public class EventManager {
    Director d = new Director();
    public ToyFactory ff = new Funkofactory();
    public ToyFactory lf = new LegoFactory();
    
    private Funko  k = ff.createFunko();
    private Lego  l = lf.createLego();
    
    ImageIcon cabeza_icon, torso_icon, ojos_icon,piernas_icon,zapatos_icon;
    
       
    //LEGOS
    Lego rretorno;
    Builder estiloLEGO = new LEGObuilderconcreteEstilo1(); //MILITAR
    
    public Lego Builder1ToViewLEGO1(){       
        d.setToyBuilder(estiloLEGO);
        d.BuildToy();
        rretorno = d.getLego();
        return rretorno;
    }
    
    public SingletonCaraExclusiva caraExclusivaLego(){
        SingletonCaraExclusiva s = SingletonCaraExclusiva.getInstance() ;       
        return s;     
    }
    
    public ImageIcon cambiar_PiernasLEGO(int parte){
        
        HashMap hm = l.PiernasLego();
        if(parte == 0){
                           
            l.setPiernas((String) hm.get(parte));           
            piernas_icon = new ImageIcon(getClass().getResource(l.getPiernas()));
            return piernas_icon;    
        }
        if(parte == 1){
                           
            l.setPiernas((String) hm.get(parte));           
            piernas_icon = new ImageIcon(getClass().getResource(l.getPiernas()));
            return piernas_icon;    
        }
        if(parte == 2){
                           
            l.setPiernas((String) hm.get(parte));           
            piernas_icon = new ImageIcon(getClass().getResource(l.getPiernas()));
            return piernas_icon;    
        }
        if(parte == 3){
                           
            l.setPiernas((String) hm.get(parte));           
            piernas_icon = new ImageIcon(getClass().getResource(l.getPiernas()));
            return piernas_icon;    
        }
        
        
        return null;
        
    }
    
    
    public ImageIcon cambiar_torsoLego(int parte){
        
        HashMap hm = l.TorsoLego();
        if(parte == 0){
                           
            l.setTorso((String) hm.get(parte));           
            torso_icon = new ImageIcon(getClass().getResource(l.getTorso()));
            return torso_icon;    
        }
        if(parte == 1){
                           
            l.setTorso((String) hm.get(parte));           
            torso_icon = new ImageIcon(getClass().getResource(l.getTorso()));
            return torso_icon;    
        }
        if(parte == 2){
                           
            l.setTorso((String) hm.get(parte));           
            torso_icon = new ImageIcon(getClass().getResource(l.getTorso()));
            return torso_icon;    
        }
        if(parte == 3){
                           
            l.setTorso((String) hm.get(parte));           
            torso_icon = new ImageIcon(getClass().getResource(l.getTorso()));
            return torso_icon;    
        }
        
        return null;       
    }
    
    public ImageIcon cambiar_OjosLEGO(int parte){
        
        HashMap hm = l.OjosLego();
        if(parte == 0){
                           
            l.setOjos((String) hm.get(parte));           
            ojos_icon = new ImageIcon(getClass().getResource(l.getOjos()));
            return ojos_icon;    
        }
        if(parte == 1){
                           
            l.setOjos((String) hm.get(parte));           
            ojos_icon = new ImageIcon(getClass().getResource(l.getOjos()));
            return ojos_icon;    
        }
        if(parte == 2){
                           
            l.setOjos((String) hm.get(parte));           
            ojos_icon = new ImageIcon(getClass().getResource(l.getOjos()));
            return ojos_icon;    
        }
        if(parte == 3){
                           
            l.setOjos((String) hm.get(parte));           
            ojos_icon = new ImageIcon(getClass().getResource(l.getOjos()));
            return ojos_icon;    
        }
           
        return null;
    }
    
    public ImageIcon cambiar_cabezaLego(int parte){
        
        HashMap hm = l.CabezasLego();
        
        if(parte == 0){
                           
            k.setCabeza((String) hm.get(parte));           
            cabeza_icon = new ImageIcon(getClass().getResource(k.getCabeza()));
            return cabeza_icon;    
        }
        if(parte == 1){
                           
            k.setCabeza((String) hm.get(parte));           
            cabeza_icon = new ImageIcon(getClass().getResource(k.getCabeza()));
            return cabeza_icon;    
        }
        if(parte == 2){
                           
            k.setCabeza((String) hm.get(parte));           
            cabeza_icon = new ImageIcon(getClass().getResource(k.getCabeza()));
            return cabeza_icon;    
        }
        if(parte == 3){
                           
            k.setCabeza((String) hm.get(parte));           
            cabeza_icon = new ImageIcon(getClass().getResource(k.getCabeza()));
            return cabeza_icon;    
        }
              
        return null;
        
    }
    
    //funkos
    
    public Funko PrototypeBlank(){
        
        Funko f = ff.createFunko() ;
        k = f.clone();
        return k;
    }    
    
    public ImageIcon cambiar_OJOSFunko(int parte){
        
        HashMap hm = k.Ojos();
        if(parte == 0){
                           
            k.setOjos((String) hm.get(parte));           
            ojos_icon = new ImageIcon(getClass().getResource(k.getOjos()));
            return ojos_icon;    
        }
        if(parte == 1){
                           
            k.setOjos((String) hm.get(parte));           
            ojos_icon = new ImageIcon(getClass().getResource(k.getOjos()));
            return ojos_icon;    
        }
        if(parte == 2){
                           
            k.setOjos((String) hm.get(parte));           
            ojos_icon = new ImageIcon(getClass().getResource(k.getOjos()));
            return ojos_icon;    
        }
        if(parte == 3){
                           
            k.setOjos((String) hm.get(parte));           
            ojos_icon = new ImageIcon(getClass().getResource(k.getOjos()));
            return ojos_icon;    
        }
        
        
        return null;
    }
    public ImageIcon cambiar_cabezaFunko(int parte){
        
        HashMap hm = k.Cabezas();
        if(parte == 0){
                           
            k.setCabeza((String) hm.get(parte));           
            cabeza_icon = new ImageIcon(getClass().getResource(k.getCabeza()));
            return cabeza_icon;    
        }
        
        if(parte == 1){
                           
            k.setCabeza((String) hm.get(parte));           
            cabeza_icon = new ImageIcon(getClass().getResource(k.getCabeza()));
            return cabeza_icon;    
        }
        
        if(parte == 2){
                           
            k.setCabeza((String) hm.get(parte));           
            cabeza_icon = new ImageIcon(getClass().getResource(k.getCabeza()));
            return cabeza_icon;    
        }
        
        if(parte == 3){
                           
            k.setCabeza((String) hm.get(parte));           
            cabeza_icon = new ImageIcon(getClass().getResource(k.getCabeza()));
            return cabeza_icon;    
        }
              
       
        return null;
    }
    
    
    
    public ImageIcon cambiar_Torso(int parte){      
        HashMap hm = k.Torso();
        if(parte == 0){                           
            k.setTorso((String) hm.get(parte));           
            torso_icon = new ImageIcon(getClass().getResource(k.getTorso()));
            return torso_icon;    
        }
        if(parte == 1){                           
            k.setTorso((String) hm.get(parte));           
            torso_icon = new ImageIcon(getClass().getResource(k.getTorso()));
            return torso_icon;    
        }
        if(parte == 2){                           
            k.setTorso((String) hm.get(parte));           
            torso_icon = new ImageIcon(getClass().getResource(k.getTorso()));
            return torso_icon;    
        }
        if(parte == 3){                           
            k.setTorso((String) hm.get(parte));           
            torso_icon = new ImageIcon(getClass().getResource(k.getTorso()));
            return torso_icon;    
        }
              
        return null;    
    }
    
    
    public ImageIcon cambiar_Piernas(int parte){      
        HashMap hm = k.Piernas();
        if(parte == 0){                           
            k.setPiernas((String) hm.get(parte));           
            piernas_icon = new ImageIcon(getClass().getResource(k.getPiernas()));
            return piernas_icon;    
        }
        if(parte == 1){                           
            k.setPiernas((String) hm.get(parte));           
            piernas_icon = new ImageIcon(getClass().getResource(k.getPiernas()));
            return piernas_icon;    
        }
        if(parte == 2){                           
            k.setPiernas((String) hm.get(parte));           
            piernas_icon = new ImageIcon(getClass().getResource(k.getPiernas()));
            return piernas_icon;    
        }
        if(parte == 3){                           
            k.setPiernas((String) hm.get(parte));           
            piernas_icon = new ImageIcon(getClass().getResource(k.getPiernas()));
            return piernas_icon;    
        }
                   
        return null;    
    }
    
    public ImageIcon cambiar_Zapatos(int parte){      
        HashMap hm = k.Zapatos();
        if(parte == 0){                           
            k.setZapatos((String) hm.get(parte));           
            zapatos_icon = new ImageIcon(getClass().getResource(k.getZapatos()));
            return zapatos_icon;    
        }
         if(parte == 1){                           
            k.setZapatos((String) hm.get(parte));           
            zapatos_icon = new ImageIcon(getClass().getResource(k.getZapatos()));
            return zapatos_icon;    
        }
          if(parte == 2){                           
            k.setZapatos((String) hm.get(parte));           
            zapatos_icon = new ImageIcon(getClass().getResource(k.getZapatos()));
            return zapatos_icon;    
        }
           if(parte == 3){                           
            k.setZapatos((String) hm.get(parte));           
            zapatos_icon = new ImageIcon(getClass().getResource(k.getZapatos()));
            return zapatos_icon;    
        }
                 
        return null;    
    }
    
    Funko retorno;
    
    
    Builder estilo2Funko = new FunkoBuilderConcreteEstilo2(); //MILITAR
    Builder estilo3Funko = new FunkoBuilderConcreteEstilo3(); //FARRA
    Builder estilo1Funko = new FunkoBuilderConcreteEstilo1(); //NIÑA SUPERMAN SHARINGAN
    
    public Funko Builder1ToViewFunko(){       
        d.setToyBuilder(estilo1Funko);
        d.BuildToy();
        retorno = d.getFunko();
        return retorno;
    }
    public Funko Builder2ToViewFunko(){       
        d.setToyBuilder(estilo2Funko);
        d.BuildToy();
        retorno = d.getFunko();
        return retorno;
    }
    
    public Funko Builder3ToViewFunko(){     
        d.setToyBuilder(estilo3Funko);
        d.BuildToy();
        retorno = d.getFunko();
        return retorno;
    }
      
}
