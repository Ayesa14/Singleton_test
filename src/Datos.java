public class Datos {
    private String nombre;
    private int edad;

    // única instancia
    private static Datos instance = null;

    // constructor bloqueado con private
    private Datos(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }


    public static Datos getInstance(){
        //compruebo si ya está creada
        if (instance == null){
            //si no está creada la creo
            //desde aquí puedo acceder al cosntructor porque estoy en la misma clase
            instance = new Datos("pepe", 23);
        }
        //devuelvo la instancia
        return instance;
    }

    /**
     * nombre de la persona
     * @param nombre de la persona
     */
    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    /**
     * edad de la persona
     * @param edad de la persona
     */
    public void setEdad(int edad){
        this.edad= edad;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
