import java.util.ArrayList; ///importamos el Arraylist
public class Banco {
    private ArrayList<Cuenta> cuentas; /// definimos el arraylist
    public Banco(){
    this.cuentas = new ArrayList<>();
    }

    /// agregar cuenta a la lista de cuentas
    public void agregarCuenta(Cuenta cta){
    this.cuentas.add(cta); ///agregar a la lista con cuentas.add
        System.out.println("----Cuenta agregada!!!----");
    }

    ///listar cuentas en la lista de cuentas
    public void listarCuentas(){
        System.out.println("\n----Lista Cuentas----");
        if (cuentas.size() == 0){
            System.out.println("No hay cuentas registradas.");
        } else {
            for (Cuenta cuenta : cuentas) { /// se crea ciclo for con iter
                cuenta.imprimirCartola();
                System.out.println("-----");
            }
        }

    }

    ///metodo listar por run
    public void listarCuentasRun(String run){
        boolean encontrado = false;
        System.out.println("----Buscador run----");
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getTitular().getRun().equals(run)){
                encontrado = true;
                System.out.println("Nombre: "+cuenta.getTitular().getNombre());
                System.out.println("Saldo $"+cuenta.getSaldo());
            }

        }
        if (encontrado == false){
            System.out.println("No hay cuenta asociada con el run: "+run);
        }
    }

}
