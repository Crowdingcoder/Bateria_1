public abstract class Cuenta { /// es abstracto
    private int numero;
    private Persona titular;///colabora la clase Persona con cuenta
    private double saldo;

    /// constructor
    public Cuenta(int numero, Persona titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0; ///Asi queda en 0 de manera automatica
    }
/// constructores vacios
    public Cuenta() {
        this.numero = 1;
        this.titular = new Persona(); ///implementa persona en blanco
        this.saldo= 0;
    }
/// setters and getters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            throw new IllegalArgumentException("El numero de cuenta no puede ser menor o igual a 0");
        }else {
            this.numero = numero;
        }
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0){
            throw new IllegalArgumentException("El saldo no puede ser menor que 0");
        }else {
            this.saldo = saldo;
        }
    }

    /// metodos
    public void depositar(double monto) {

    }

    public abstract void girar(double monto);

    public abstract void imprimirCartola();
}
