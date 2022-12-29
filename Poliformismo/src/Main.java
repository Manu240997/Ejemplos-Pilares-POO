public class Main {
    public static void main(String[] args) {
        Vehiculo misvehiculos[] = new Vehiculo[4];

        misvehiculos[0]= new Vehiculo("123","toyota","A1");
        misvehiculos[1]= new VehiculoTurismo("345","Susuki","F4",4);
        misvehiculos[2]=new VehiculoDeportivo("345","Susuki","F4",2000);
        misvehiculos[3]=new VehiculoFurgoneta("345","Susuki","F4",100);

        for (Vehiculo vehiculo: misvehiculos){
            System.out.println(vehiculo.mostrarDatos());
            System.out.println("");
        }



    }
}