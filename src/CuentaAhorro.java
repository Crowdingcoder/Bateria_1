public class CuentaAhorro extends Cuenta {
    final double TASA_AHORRO = 1.015; ///constante
    private int numGiros;

    public CuentaAhorro(int numero, Persona titular, int numGiros) {
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

    }

    @Override
    public void imprimirCartola() {

    }
}
