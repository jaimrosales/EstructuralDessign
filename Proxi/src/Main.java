package Proxi.src;

class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Proxi!");

        Servidor servidor = new ProxiServer("http://example.com");
        servidor.descargar("/file1.txt");
    }
}


