
import javax.swing.JOptionPane;

public class Villano extends Persona {
    
    private int edad;
    private String tipo_accidente;
    private String factores;
    private String superpoder;
    private boolean creyentes;
    private String religion;
    private String planeta;

    public Villano (String nombre, String poder, String debilidad, Escuadron escuadron, int fuerza, int agilidad_fisica, int agilidad_mental, String tipo) {
        super(nombre, poder, debilidad, escuadron, fuerza, agilidad_fisica, agilidad_mental, tipo);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo_accidente() {
        return tipo_accidente;
    }

    public void setTipo_accidente(String tipo_accidente) {
        this.tipo_accidente = tipo_accidente;
    }

    public String getFactores() {
        return factores;
    }

    public void setFactores(String factores) {
        this.factores = factores;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public boolean isCreyentes() {
        return creyentes;
    }

    public void setCreyentes(boolean creyentes) {
        this.creyentes = creyentes;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
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

    public void tipaje(){
        if ("Normal".equals(tipo)){
        } else if ("Mutante".equals(tipo)){
            factores = JOptionPane.showInputDialog(null, "Ingrese factor mutante");
        } else if ("Accidente Radioactivo".equals(tipo)){
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese edad al momento del accidente"));
            tipo_accidente = JOptionPane.showInputDialog(null, "Ingrese tipo de accidente");
        } else if ("Superhumano".equals(tipo)){
            superpoder = JOptionPane.showInputDialog(null, "Ingrese superpoder");
        } else if ("Extraterrestre".equals(tipo)){
            String ex = JOptionPane.showInputDialog(null, "[1] Deidad\n[2] Alien");
            int e = Integer.parseInt(ex);
            switch (e) {
                case 1:
                    String seguidores = JOptionPane.showInputDialog(null, "Tiene seguidores [s/n]");
                    if (seguidores.charAt(0) == 's'){
                        creyentes = true;
                    } else {
                        creyentes = false;
                    }
                    religion = JOptionPane.showInputDialog(null, "Ingrese religion");
                    break;
                case 2:
                    planeta = JOptionPane.showInputDialog(null, "Ingrese planeta de procedencia");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalido");
                    break;
            }
        }
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
