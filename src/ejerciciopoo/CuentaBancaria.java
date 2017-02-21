package ejerciciopoo;

public class CuentaBancaria {
    private final int Numero;
    private int Clave;
    private String Titular;
    private double Saldo;
    
    public CuentaBancaria(int n, int c, String t, double s){
        Numero = n;
        Clave = c;
        Titular = t;
        Saldo = s;
    }
    
    public void ConsignarDinero(double d){
        Saldo += d;
        System.out.println("Se han consignado "+'$'+d+" a la cuenta bancaria No. "+Numero);
    }
    
    public void RetirarDinero(double d){
        Saldo -= d;
        System.out.println("Se han retirado "+'$'+d+" de la cuenta bancaria No. "+Numero);
    }
    
    public void CambiarClave(int c){
        Clave = c;
        System.out.println("Se ha cambiado la clave de la cuenta No. "+Numero+" a \""+Clave+"\"");
    }
    
    public void ConsultarSaldo(){
        System.out.println("El saldo de la cuenta No. "+Numero+" es: "+'$'+Saldo);
    }
}
