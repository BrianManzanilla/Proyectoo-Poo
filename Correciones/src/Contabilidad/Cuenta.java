package Contabilidad;
import Inventarizacion.Producto;

public class Cuenta {
    private Mesa mesa;
    private CajaFuerte cajaFuerte;
    private final double totalPagar = mesa.calcularTotal();

    public Cuenta(Mesa mesa, CajaFuerte cajaFuerte) {
        this.mesa = mesa;
        this.cajaFuerte = cajaFuerte;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public CajaFuerte getCajaFuerte() {
        return cajaFuerte;
    }

    public void setCajaFuerte(CajaFuerte cajaFuerte) {
        this.cajaFuerte = cajaFuerte;
    }
   
    
    public void pagarCuenta(Double monto, int tipoPago){
        switch(tipoPago){
            case 1:
                if(monto >= totalPagar){
                    mesa.limpiarCuenta();
                    cajaFuerte.agregarAcumulado(totalPagar);
                }
                else{
                    System.out.println("Fondos insuficientes. ");
                }
                break;
            case 2:
                if(monto >= totalPagar){
                    mesa.limpiarCuenta();
                    cajaFuerte.agregarAcumulado(totalPagar);
                }
                break;
            default: System.out.println("Seleccione un tipo de pago valido");
        }      
    }

}
