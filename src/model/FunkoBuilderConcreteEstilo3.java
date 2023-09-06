/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author Julian Castro
 */
public class FunkoBuilderConcreteEstilo3 extends Builder{
     
    @Override
    public void buildCabeza() {
        funko.setCabeza("/images/cabeza2.png");
    }

    @Override
    public void buildOjos() {
        funko.setOjos("/images/ojos2.png");
    }

    @Override
    public void buildTorso() {
        funko.setTorso("/images/torso3.png");
    }

    @Override
    public void builPiernas() {
        funko.setPiernas("/images/piernas4.png");
    }

    @Override
    public void buildZapatos() {
        funko.setZapatos("/images/zapatos2.png");
    }
  
       
}
