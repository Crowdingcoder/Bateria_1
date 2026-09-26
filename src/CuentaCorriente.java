public class CuentaCorriente extends Cuenta {
    private int lineaCredito;

    ///constructores
    public CuentaCorriente(int numero, Persona titular) {
        super(numero, titular);
        this.lineaCredito = 300_000; ///Podemos serar numeros con un guion bajo para mejor lectura, sigue siendo trecientos mil ///
    }



    ///constructores sin parametro ///

    public CuentaCorriente() {
        super();
        this.lineaCredito = 300_000;
    }

    ///getter and setters ///
    public int getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(int lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    @Override
    public void girar(double monto) {
        if (monto<= this.getSaldo()+ this.lineaCredito){
            if(monto <= this.getSaldo()) {
                this.setSaldo(this.getSaldo() - monto);
            }else{
                this.lineaCredito -= (monto-this.getSaldo());
                this.setSaldo(0);
            }
        } else {
            System.out.println("No hay saldo suficiente ni linea de credito suficiente");
        }
    }


    @Override
    public void imprimirCartola() {
        System.out.println("----Cartola----");
        System.out.println("N° "+this.getNumero());
        System.out.println("Nombre Titular"+this.getTitular().getNombre());
        System.out.println("Saldo $"+this.getSaldo());
        System.out.println("Linea credito $"+this.getLineaCredito());
    }
}
