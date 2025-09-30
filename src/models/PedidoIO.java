
package models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;


public class PedidoIO {
    
    // Attributes
    private static final String DIRECTORY = ".";
    private static final String FILE = "pedidos.txt";
    
    // Methods
    /* Agrega un pedido a la base de datos  */
    public void agregarPedido(Pedido pedido){ 
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(DIRECTORY, FILE), true));
            writer.write(pedido.toString(), 0, pedido.toString().length());
            writer.newLine();
            writer.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontró el archivo.");
        } catch (Exception ex) {
            System.out.println("Error while writing the file");
        }
    }
}
