/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;
/**
 *
 * @author Julian Castro
 */
public abstract class Builder {
    
    Funkofactory ff = new Funkofactory();
    public Toy funko = ff.createFunko();
    
    LegoFactory lf = new LegoFactory();
    public Toy lego = lf.createLego();
    
    
    public Funko getFunko(){
        return (Funko)funko;
    }
    public Lego getLego(){
        return (Lego)lego;
    }
       
    public abstract void buildCabeza();
    public abstract void buildOjos();
    public abstract void buildTorso();
    public abstract void builPiernas();
    public abstract void buildZapatos();
        
    
}
