/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;

/**
 *
 * @author carol
 */
public class Musica {
    private String titulo,artista;
    private boolean favorita,descarga;
    private Integer minutos,segundos;
    private int n , m , s ;
    public Musica(String titulo, String artista, Integer minutos, Integer segundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.minutos = minutos;
        this.segundos = segundos;
 
   
        
    }

 
    public Musica(boolean favorita, boolean descargas) {
        this.favorita = favorita;
        this.descarga = descarga;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public boolean isDescarga() {
        return descarga;
    }

    public void setDescarga(boolean descarga) {
        this.descarga = descarga;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }
 


    
    

    /**
     * @param args the command line arguments
     */
    public void adelantar(int m, int s ){
            System.out.println("adelantadar al " + m+ ":"+s);
    
        
        
     
    
       
        
        
    }    
        
    public void reproducir(){
        System.out.println("Reproduciendo su cancion " + titulo + " del artista " + artista);
        
        // TODO code application logic here
    }        
    public void detallar(){
        System.out.println("Detalles de cancion elegidas: ");
        System.out.println("Artista: "+artista);
        System.out.println("duracion:"+minutos+":"+segundos);
        if(descarga){
            System.out.println("Descargada: SI");
        }else{
            System.out.println("Descargada: NO");
            
        }
         if (favorita){
             System.out.println("favorita: SI");
             
        }else{
             System.out.println("Favorita: NO");
             
         }}
             
    public void cancionLargaNormal(){
            if( minutos > 5){
                System.out.println("es una cancion Larga ");
            };
            if(minutos < 5){
                System.out.println("es una cancion Normal");
            };
        }
        
    }
             
     
             
             
             
    
             
        
             

  
         
        
    
                    
   
            
             
        
             
        
         
         
      
    
    

