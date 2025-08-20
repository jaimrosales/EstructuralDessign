package Proxi.src;

public class ServidorReal implements Servidor {
    private String host;

    public ServidorReal(String host) {
        this.host = host;
        System.out.println("Servidor creado en: " + host);
    }
    @Override
    public void descargar(String url) {
        System.out.println("Descargando desde: "+ host + url);
        // Aquí se implementaría la lógica de descarga real
    }
    
}
