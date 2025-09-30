
package models;


public class Combo {
    
    // Attributes
    private String base;
    private String bebida;
    private String acompañamiento;
    private String extra;
    
    // Constructor
    Combo() {
        
    }
    
    //GS
    public String getBase() {
        return base;
    }
    public void setBase(String base) {
        this.base = base;
    }
    public String getBebida() {
        return bebida;
    }
    public void setBebida(String bebida) {
        this.bebida = bebida;
    }
    public String getAcompañamiento() {
        return acompañamiento;
    }
    public void setAcompañamiento(String acompañamiento) {
        this.acompañamiento = acompañamiento;
    }
    public String getExtra() {
        return extra;
    }
    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Combo{" + "base=" + base + ", bebida=" + bebida + ", acompa\u00f1amiento=" + acompañamiento + ", extra=" + extra + '}';
    }
    
}
