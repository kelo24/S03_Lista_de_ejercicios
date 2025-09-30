
package models;

import java.util.ArrayList;


public class Pedido {
    
    // Attributes
    static private ArrayList<Combo> combos = new ArrayList<>();
    
    // Methods
    public void addCombo(Combo combo) {
        
        combos.add(combo);
    }

    public ArrayList<Combo> getCombos() {
        return combos;
    }
    
    
}
