/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Julian Castro
 */
public class Director {
    
    private Builder builder;
    
    public void setToyBuilder(Builder b){
        builder = b;
    }
    
    public Funko getFunko(){
        return builder.getFunko();       
    }
    
    public Lego getLego(){
        return builder.getLego();       
    }
    
    public void BuildToy(){                 
        builder.buildCabeza();
        builder.builPiernas();
        builder.buildOjos();
        builder.buildTorso();
        builder.buildTorso();
        builder.buildZapatos();     
    }
        
}
