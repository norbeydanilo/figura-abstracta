public class App {
    /*
     * Llama al método polimorfismo tres veces, pasando diferentes instancias de las clases 
     * Triangulo, Cuadrado y Ovalo como argumentos.
     */
    public static void main(String[] args) throws Exception {
        polimorfismo(new Triangulo(2, 4, "Triangulo"));
        polimorfismo(new Cuadrado(4, "Cuadrado"));
        polimorfismo(new Ovalo(4, 2, "Ovalo"));
    }

    /*
     * Método que toma un objeto de tipo Figura como parámetro. 
     * Imprime el tipo de la figura y su área.
     * Se resuelve por POLIMORFISMO.
     */
    public static void polimorfismo(Figura miFigura){
        System.out.println("Tipo: " + miFigura.getTipo());
        System.out.println("Área: " + miFigura.area());
    }
}
