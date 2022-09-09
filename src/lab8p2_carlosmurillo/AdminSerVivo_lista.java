package lab8p2_carlosmurillo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminSerVivo_lista {
    ArrayList<SerVivo> lista;
    private File archivo = null;

    public AdminSerVivo_lista(String path) {
        archivo = new File(path);
    }

    public ArrayList<SerVivo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<SerVivo> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setUniverso(SerVivo ser){
        this.lista.add(ser);
    }
    
    public void cargarArchivo() {
        try {            
            lista = new ArrayList();
            SerVivo ser;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((ser = (SerVivo) objeto.readObject()) != null) {
                        lista.add(ser);
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
            for (SerVivo s : lista) {
                bw.writeObject(s);
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
