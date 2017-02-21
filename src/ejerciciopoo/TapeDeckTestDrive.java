package ejerciciopoo;

class TapeDeckTestDrive {
    
    /*
    El programa no funciona porque falta declarar el objeto "t" (instancia de la 
    clase TapeDeck) y liberar memoria para este mismo.
    */
    
    public static void main(String[] args) {        
        t.canRecord = true;
        t.playTape();
        
        if(t.canRecord == true){
            t.recordTape();
        }
    }  
    
}
