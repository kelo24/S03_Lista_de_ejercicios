
package models;


public class CBPollo extends ComboFactory {
    
    private Combo combo;
    
    // Constructor
    public CBPollo() {
        combo = new Combo();
        combo.setBase("Pollo");
    }
    
    // Methods
    @Override
    public Combo devolverCombo() {
        
        return this.combo;
    }
}
