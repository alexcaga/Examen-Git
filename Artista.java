package evf.javadoc.original;
// Nombre: Álex Carpio
public class Artista {
    String nombreArtista;
    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public String getNombreArtista() {
        return nombreArtista;
	//Prueba fetch
	//Prueba fetch 2
    }
    
}


