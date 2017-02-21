package ejerciciopoo;

public class CuentaBancariaTestDrive {

    public static void main(String[] args) {
       CuentaBancaria Magdalena = new CuentaBancaria(1012, 1234, "Magdalena Sanchez", 0);       
       Magdalena.ConsignarDinero(100000);
       
       CuentaBancaria Joselito = new CuentaBancaria(1013, 9876, "Joselito Perez", 500000);
       Joselito.CambiarClave(6897);
       Joselito.ConsultarSaldo();
    }
 
}
