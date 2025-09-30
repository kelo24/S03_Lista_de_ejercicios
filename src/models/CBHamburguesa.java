
package models;


public class CBHamburguesa extends ComboFactory {
    
    private Combo combo;
    
    // Constructor
    public CBHamburguesa() {
        combo = new Combo();
        combo.setBase("Hamburguesa");
    }
    
    // Methods
    @Override
    public Combo devolverCombo() {
        
        return this.combo;
    }
    
}
