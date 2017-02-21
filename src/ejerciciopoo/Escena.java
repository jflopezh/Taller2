package ejerciciopoo;
import ch.aplu.turtle.Turtle;

public class Escena {
    public final Turtle Tortuga;
    
    public Escena(){
        Tortuga=new Turtle();
    }
    
    public void Cuadrado(double lado){
        for(int i=0;i<4;i++){
            Tortuga.fd(lado);
            Tortuga.right(90);
        }
    }
    
    public void Patron(){
        for(int i=0;i<8;i++){
            Cuadrado(100);
            Tortuga.right(45);
        }
    }
    
    public void Triangulo(double lado, int direccion){
        if(direccion>1){
            Tortuga.penUp();
            Tortuga.fd(lado*(direccion-1)/2);
            Tortuga.penDown();
        }            
        int AnguloInicial=(direccion*30);
        Tortuga.right(AnguloInicial);
        for(int i=0;i<3;i++){
            Tortuga.fd(lado);
            if(i==2)
                Tortuga.right(120-AnguloInicial);
            else
                Tortuga.right(120);
        }
        if(direccion>1){
            Tortuga.penUp();
            Tortuga.bk(lado*(direccion-1)/2);
            Tortuga.penDown();
        }
    }
    
    public void Circulo(double radio){
        Tortuga.penUp();
        Tortuga.fd(radio);
        Tortuga.penDown();
        double l=3.1416*radio/180;
        for(int i=0;i<360;i++){
            Tortuga.rt(1);
            Tortuga.fd(l);
        }
        Tortuga.penUp();
        Tortuga.bk(radio);
        Tortuga.penDown();
    }
    
    public void Rectangulo(double ancho, double alto){
        if(ancho==alto){
            Cuadrado(ancho);
            return;
        }
        boolean iancho=false;
        for(int i=0;i<4;i++){
            if(iancho){
                Tortuga.fd(ancho);
                iancho=false;
            }else{
                Tortuga.fd(alto);
                iancho=true;
            }
            Tortuga.rt(90);
        }
    }
    
    public void PoligonoRegular(double lado, int nlados, boolean direccion){
        double angulo=360/nlados;
        Tortuga.rt(90);
        if(direccion)
            for(int i=0;i<nlados;i++){
                Tortuga.fd(lado);
                Tortuga.lt(angulo);
            }
        else
            for(int i=0;i<nlados;i++){
                Tortuga.fd(lado);
                Tortuga.rt(angulo);
            }
        Tortuga.lt(90);
    }
    
    public void PoligonoRegularR(double radio, int nlados, boolean direccion){
        double angulo=360/nlados;
        double lado=radio*2*(Math.sin(Math.toRadians(angulo/2)));
        Tortuga.rt(90);
        if(direccion)
            for(int i=0;i<nlados;i++){
                Tortuga.fd(lado);
                Tortuga.lt(angulo);
            }
        else
            for(int i=0;i<nlados;i++){
                Tortuga.fd(lado);
                Tortuga.rt(angulo);
            }
        Tortuga.lt(90);
    }
}
