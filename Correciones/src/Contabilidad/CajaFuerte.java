package Contabilidad;

public class CajaFuerte {
    private double totalAcumulado;

    public CajaFuerte(double totalAcumulado) {
        this.totalAcumulado = totalAcumulado;
    }

    public double getTotalAcumulado() {
        return totalAcumulado;
    }

    public void setTotalAcumulado(double totalAcumulado) {
        this.totalAcumulado = totalAcumulado;
    }
    
    
    public void agregarAcumulado(double monto){
        totalAcumulado += monto;
    }
}
