
package models;


public class ComboBuilder implements Builder {
    
    // Attributes
    private Combo combo;
    
    // Constructor
    public ComboBuilder(Combo combo) {
        this.combo = combo;
    }
    
    // Methods
    @Override
    public void modifyBebida(String bebida) {
        combo.setBebida(bebida);
    }
    
    @Override
    public void modifyAcompañamiento(String acomp) {
        combo.setAcompañamiento(acomp);
    }
    
    @Override
    public void modifyExtra(String extra) {
        combo.setExtra(extra);
    }
    
    
}
