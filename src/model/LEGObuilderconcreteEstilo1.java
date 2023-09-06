/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Julian Castro
 */
public class LEGObuilderconcreteEstilo1 extends Builder{

    @Override
    public void buildCabeza() {
        lego.setCabeza("/images/cabeza1Lego.png");
    }

    @Override
    public void buildOjos() {
        lego.setOjos("/images/ojos1Lego.png");
    }

    @Override
    public void buildTorso() {
        lego.setPiernas("/images/torso1LEGO.png");
    }

    @Override
    public void builPiernas() {
        lego.setTorso("/images/pantalones3LEGO.png");
    }

    @Override
    public void buildZapatos() {
        lego.setZapatos("");
    }
    
}
