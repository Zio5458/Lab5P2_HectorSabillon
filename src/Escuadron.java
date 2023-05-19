
import java.util.ArrayList;


public class Escuadron {
    
    private String nombre;
    private String lugar;
    private String lider;
    private String tipo;
    private ArrayList<Persona> miembros = new ArrayList();

    
    
    public Escuadron(String nombre, String lugar, String tipo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + ", lugar = " + lugar + ", tipo = " + tipo;
    }
    
    
    
}
