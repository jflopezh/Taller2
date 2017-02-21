package ejerciciopoo;

import java.awt.Color;

public class EscenaTestDrive {
    
    public static void main(String[] args) {
        Escena e = new Escena();
        e.Tortuga.speed(9999999);
        e.Tortuga.setPenColor(Color.BLACK);
        e.Tortuga.setPos(-180, 20);
        for(int i=3;i<6;i++){
            e.PoligonoRegular(80, i, false);
            e.Tortuga.setX(e.Tortuga.getX()+130);
        } 
    }  
    
}
