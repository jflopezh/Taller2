package ejerciciopoo;

class DVDPlayerTestDrive {
    
    /* 
    El programa no funciona porque la función "playDVD" no está declarada en la
    clase "DVDPlayer"
    */
    
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();
        
        if(d.canRecord == true){
            d.recordDVD();
        }
    }
    
}
