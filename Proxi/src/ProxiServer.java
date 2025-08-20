package Proxi.src;

public class ProxiServer implements Servidor {
    private ServidorReal servidorReal;
    private String host;

    public ProxiServer(String host) {
        this.host = host;
        servidorReal = null;
        System.out.println("Inicializando ProxiServer en: " + host);
    }

    @Override
    public void descargar(String url) {
        if (servidorReal == null) {
            servidorReal = new ServidorReal(host);
            System.out.println("ServidorReal creado para manejar descargas.");
        } else {
            System.out.println("Reutilizando ServidorReal existente.");
            
        }
        System.out.println("ProxiServer: Redirigiendo descarga a " + host + url);
        servidorReal.descargar(url);
    }
    
}
