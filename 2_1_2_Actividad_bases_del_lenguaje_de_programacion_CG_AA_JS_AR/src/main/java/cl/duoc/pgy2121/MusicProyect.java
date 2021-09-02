/*
 * Proyecto musical
 * 2.1.2 Actividad Bases del lenguaje de programación
 * 
 */
package cl.duoc.pgy2121;

/**
 *
 * @author carol
 */
public class MusicProyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("bienvenido a tu portal de musica\n");
        
        Musica cancion1 = new Musica( "ojala ", "silvio rodriguez " ,3,37);
        cancion1.setFavorita(false);
        cancion1.setDescarga(true);
        
       
        //reproducir
        cancion1.reproducir();
        //adelantar cancion 
        cancion1.adelantar(1,5);
        
        cancion1.detallar();
        
        cancion1.cancionLargaNormal();
        
        System.out.println();
        
        // Imprimir detalles de cancion
        
        Musica cancion2 = new Musica( "pronta entrega ", "virus" ,4,37);
        cancion2.setFavorita(true);
        cancion2.setDescarga(true);
        
        //reproducir
        cancion2.reproducir();
        //adelantar cancion 
        cancion2.adelantar(1,2);
        
        
        cancion2.detallar();
        cancion2.cancionLargaNormal();
        
        System.out.println();
        
        Musica cancion3 = new Musica( "Light My Fire ","The Doors" ,9,22);
        cancion3.setFavorita(true);
        cancion3.setDescarga(false);
        
        //reproducir
        cancion3.reproducir();
        //adelantar cancion 
        cancion3.adelantar(2,3);
        
        cancion3.detallar();
        
        cancion3.cancionLargaNormal();
        
        System.out.println();
        
        
        Musica cancion4 = new Musica( "cry baby ","Janis Joplin" ,3,54);
        cancion4.setFavorita(true);
        cancion4.setDescarga(false);
        
        //reproducir
        cancion4.reproducir();
        //adelantar cancion 
        cancion4.adelantar(2,10);
        
        cancion4.detallar();
        cancion4.cancionLargaNormal();
        
        
        
        
        System.out.println();
        
        

        System.out.println("Gracias por visitar tu portal de musica\n");
    
    
    
    }    
    
}
