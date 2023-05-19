
public class Persona {
    
    protected String nombre;
    protected String poder;
    protected String debilidad;
    protected Escuadron escuadron;
    protected int fuerza;
    protected int agilidad_fisica;
    protected int agilidad_mental;
    protected String tipo;

    public Persona(String nombre, String poder, String debilidad, Escuadron escuadron, int fuerza, int agilidad_fisica, int agilidad_mental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuadron = escuadron;
        this.fuerza = fuerza;
        this.agilidad_fisica = agilidad_fisica;
        this.agilidad_mental = agilidad_mental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public Escuadron getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(Escuadron escuadron) {
        this.escuadron = escuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad_fisica() {
        return agilidad_fisica;
    }

    public void setAgilidad_fisica(int agilidad_fisica) {
        this.agilidad_fisica = agilidad_fisica;
    }

    public int getAgilidad_mental() {
        return agilidad_mental;
    }

    public void setAgilidad_mental(int agilidad_mental) {
        this.agilidad_mental = agilidad_mental;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", escuadron=" + escuadron + ", fuerza=" + fuerza + ", agilidad_fisica=" + agilidad_fisica + ", agilidad_mental=" + agilidad_mental + ", tipo=" + tipo + '}';
    }
    
    
    
}
