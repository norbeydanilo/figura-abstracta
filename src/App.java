public class App {
    public static void main(String[] args) throws Exception {
        polimorfismo(new Triangulo(2, 4, "Triangulo"));
        polimorfismo(new Cuadrado(4, "Cuadrado"));
        polimorfismo(new Ovalo(4, 2, "Ovalo"));
    }

    public static void polimorfismo(Figura miFigura){
        System.out.println("Tipo: " + miFigura.getTipo());
        System.out.println("Área: " + miFigura.area());
    }
}
