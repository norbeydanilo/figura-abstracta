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

    public abstract double area();
}
