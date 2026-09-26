void main() {
    Banco banco = new Banco(); /// Se tiene que crear el banco para que funcione el arraylist, es decir crear el objeto
    System.out.println("----Test lista vacia.-----");
    banco.listarCuentas();
    ///Crear objeto de cada cuenta///
    CuentaAhorro cuenta1 = new CuentaAhorro(1234,new Persona("111-1","Juan Perez",67,"Granjero"));
    CuentaCorriente cuenta2 = new CuentaCorriente(69,new Persona("222-2","Alonoso Perez",69,"Ingeniero"));

    System.out.println("\n----Test deposito----");
    cuenta1.depositar(150_000);
    cuenta1.imprimirCartola();
    cuenta2.depositar(600_000);
    cuenta2.imprimirCartola();

    System.out.println("\n----Test giro----");
    cuenta2.girar(700_000);
    cuenta1.girar(140_000);
    cuenta1.girar(1000);

    cuenta1.imprimirCartola();
    cuenta2.imprimirCartola();

    System.out.println("\n----Test Agregar cuentas----");
    banco.agregarCuenta(cuenta1);
    banco.agregarCuenta(cuenta2);
    banco.listarCuentas();

    System.out.println("\n----Test Listar Cuentas Run----");
    banco.listarCuentasRun("676769");
    banco.listarCuentasRun("111-1");

}
