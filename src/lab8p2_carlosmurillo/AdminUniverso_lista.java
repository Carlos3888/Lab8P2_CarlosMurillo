package lab8p2_carlosmurillo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminUniverso_lista {
    ArrayList<Universo> lista;
    private File archivo = null;

    public AdminUniverso_lista(String path) {
        archivo = new File(path);
    }

    public ArrayList<Universo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Universo> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setUniverso(Universo uni){
        this.lista.add(uni);
    }
    
    public void cargarArchivo() {
        try {            
            lista = new ArrayList();
            Universo uni;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((uni = (Universo) objeto.readObject()) != null) {
                        lista.add(uni);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Universo u : lista) {
                bw.writeObject(u);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
