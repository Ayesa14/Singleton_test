public class Main {
    public static void main(String[] args) {
        System.out.println("Proyecto Singleton");

        //creamos un objeto
        Datos dato1 = Datos.getInstance();
        //rellenamos los atributos
        dato1.setNombre("Pepe");
        dato1.setEdad(23);

        //creamos otro objeto
        Datos dato2 = Datos.getInstance();
        dato2.setNombre("Pepe");
        dato2.setEdad(23);

    }
}