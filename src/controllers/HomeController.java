
package controllers;

import models.CBHamburguesa;
import models.CBPollo;
import models.CBVegetariano;
import models.Combo;
import models.ComboBuilder;
import models.Pedido;

public class HomeController {
    
    // Attributes
    static public Pedido pedido = new Pedido();
    
    // Methods
    public static void registrarComboHamburguesa(String acomp, String bebida, String extra) {
        
        // Crear combo
        Combo combo = new CBHamburguesa().devolverCombo();
        ComboBuilder builder = new ComboBuilder(combo);
        builder.modifyBebida(acomp);
        builder.modifyAcompañamiento(bebida);
        builder.modifyExtra(extra);
        
        // Guardar combo
        pedido.addCombo(combo);
        
//        System.out.println(combo.toString());
//        System.out.println(pedido.getCombos().toString());
        
    }
    
    public static void registrarComboPollo(String acomp, String bebida, String extra) {
        
        // Crear combo
        Combo combo = new CBPollo().devolverCombo();
        ComboBuilder builder = new ComboBuilder(combo);
        builder.modifyBebida(acomp);
        builder.modifyAcompañamiento(bebida);
        builder.modifyExtra(extra);
        
        // Guardar combo
        pedido.addCombo(combo);
        
//        System.out.println(combo.toString());
//        System.out.println(pedido.getCombos().toString());
    }
    
    public static void registrarComboVegetariano(String acomp, String bebida, String extra) {
        
        // Crear combo
        Combo combo = new CBVegetariano().devolverCombo();
        ComboBuilder builder = new ComboBuilder(combo);
        builder.modifyBebida(acomp);
        builder.modifyAcompañamiento(bebida);
        builder.modifyExtra(extra);
        
        // Guardar combo
        pedido.addCombo(combo);
        
//        System.out.println(combo.toString());
//        System.out.println(pedido.getCombos().toString());
    }
    
    public static void modifyButtonActionPerformed() {
        
    }
    
    public static void finalButtonActionPerformed() {
        
    }
    
}
