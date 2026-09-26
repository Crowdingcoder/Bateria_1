public final class  CuentaAhorro extends Cuenta {/// colocar final para que de esta clase no se puedan crear subclases
    final double TASA_AHORRO = 1.015; ///constante
    private int numGiros;

    public CuentaAhorro(int numero, Persona titular) {
        super(numero, titular);
        this.numGiros = 0;
    }

    public CuentaAhorro() {
        super();
        this.numGiros = 0;
    }

    public double getTASA_AHORRO() {
        return TASA_AHORRO;
    }

    public int getNumGiros() {
        return numGiros;
    }

    public void setNumGiros(int numGiros) {
        this.numGiros = numGiros;
    }

    @Override
    public void girar(double monto) {
        if (monto<= this.getSaldo()){
            this.setSaldo(this.getSaldo()-monto); /// Se utiliza set para declarar el nuevo saldo
            this.setNumGiros(this.getNumGiros() +1); ///Aplicar contador de giros
        } else {
            System.out.println("No hay saldo suficiente");
        }
    }

    @Override
    public void imprimirCartola() {
        System.out.println("----Cartola----");
        System.out.println("N° "+this.getNumero());
        System.out.println("Nombre Titular"+this.getTitular().getNombre());
        System.out.println("Saldo $"+this.getSaldo());
        System.out.println("Numero giros:"+this.getNumGiros());

    }
}
