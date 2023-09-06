/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Julian Castro
 */
public class LegoFactory implements ToyFactory{
    
    @Override
    public Funko createFunko() {
           
        
        return null;     
    }

    @Override
    public Lego createLego() {
        return new Lego(); // ES DE LEGOS 
    }
    
}
