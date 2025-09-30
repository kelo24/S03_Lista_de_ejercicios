
package models;


public class CBVegetariano extends ComboFactory {
    
    private Combo combo;
    
    // Constructor
    public CBVegetariano() {
        combo = new Combo();
        combo.setBase("Vegetariano");
    }
    
    // Methods
    @Override
    public Combo devolverCombo() {
        
        return this.combo;
    }
}
