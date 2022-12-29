public class Estudiante extends Persona{
    private int codigoest;
    private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad, int codigoest, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoest = codigoest;
        this.notaFinal = notaFinal;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nCodigo Estudiante: "+codigoest+
                "\nNota Final: "+notaFinal);
    }
}
