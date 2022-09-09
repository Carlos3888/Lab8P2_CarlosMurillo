package lab8p2_carlosmurillo;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JProgressBar;

public class Hilo extends Principal implements Runnable{
    private ArrayList lista;

    public Hilo(ArrayList lista) {
        this.lista = lista;
    }
    
    @Override
    public void run() {
        int d = 1;
        if (barra.getValue() > 0) {
            d = barra.getValue();
        }
        barra.setValue(d+1);
        
        
        
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < lista.size(); i++) {
            String nombre = lista.get(i).toString();
            modelo.addElement(nombre);
        }
        lista_seres.setModel(modelo);
        
        
        try {
            Thread.sleep(60);
        } catch (InterruptedException ex) {
        }
    }

}
