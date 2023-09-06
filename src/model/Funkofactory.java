/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Julian Castro
 */
public class Funkofactory implements ToyFactory{

    @Override
    public Funko createFunko() {
           
        return new Funko();  
    }

    @Override
    public Lego createLego() {
        return null; //NO ES DE LEGOS 
    }
    
}
