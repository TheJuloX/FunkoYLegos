/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author Julian Castro
 */
public class FunkoBuilderConcreteEstilo1 extends Builder{
     
    @Override
    public void buildCabeza() {
        funko.setCabeza("/images/cabeza1.png");
    }

    @Override
    public void buildOjos() {
        funko.setOjos("/images/ojos1.png");
    }

    @Override
    public void buildTorso() {
        funko.setTorso("/images/torso1.png");
    }

    @Override
    public void builPiernas() {
        funko.setPiernas("/images/piernas1.png");
    }

    @Override
    public void buildZapatos() {
        funko.setZapatos("/images/zapatos1.png");
    }
  
       
}
