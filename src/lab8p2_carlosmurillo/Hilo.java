package lab8p2_carlosmurillo;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JProgressBar;

public class Hilo extends Thread{
    private ArrayList lista;
    private int n = 0;
    DefaultListModel modelo = new DefaultListModel();
    private JProgressBar progBar;
    private JList lis;
    private boolean desi;

    public Hilo(ArrayList lista, JProgressBar progBar, JList lis) {
        this.lista = lista;
        this.progBar = progBar;
        this.lis = lis;
        desi = true;
    }

    
    
    @Override
    public void run() {
        try{
            while(desi){
                int d = 1;

                if (progBar.getValue() > 0) {
                    d = progBar.getValue();
                }
                int num = 100/lista.size();
                progBar.setValue(d+num);


                String nombre = lista.get(n).toString();
                modelo.addElement(nombre);

                lis.setModel(modelo);

                n+=1;
                try {
                    Thread.sleep(600);
                } catch (InterruptedException ex) {
                }
            }
        }catch(Exception e){
            
        }
    }

}
