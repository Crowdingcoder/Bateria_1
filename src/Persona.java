public class Persona {
    /// atributos de persona
    private String run;
    private String nombre;
    private int edad;
    private String ocupacion;
    /// constructores persona
    public Persona(String run, String nombre, int edad, String ocupacion) {
        this.run = run;
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }
    ///constructores vacios persona
    public Persona() {
        this("1111","No name",18,"No ocupacion");
    }

    /// getters y setters persona
    public String getRun() {
        return run;
    }
    /// regla negocio, no puede estar vacio
    public void setRun(String run) {
        if (run.isEmpty() || run == null ){
        throw new IllegalArgumentException("El run no puede estar vacio");
    }else {
            this.run = run ;
        }
    }

    public String getNombre() {
        return nombre;
    }
/// regla negocio, no puede estar vacio
    public void setNombre(String nombre) {
        if (nombre.isEmpty() || nombre == null ){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }else{
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }
/// regla negocio, no puede ser menor de 18
    public void setEdad(int edad) {
        if (edad < 18){
            throw new IllegalArgumentException("La edad no puede ser menor de 18");
        }else {
            this.edad = edad;
        }
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}
