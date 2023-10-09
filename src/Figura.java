public abstract class Figura {
    /*
     * Clase abstracta Figura
     */
    private String tipo;

    public Figura(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    /*
     * Método abstracto area()
     * Se define pero son las subclases las obligadas a implementar el método
     */
    public abstract double area();
}
