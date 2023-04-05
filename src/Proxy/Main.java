package Proxy;

// Clase principal donde se usa el proxy para conectarse a sitios web
public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        internet.connectTo("google.com");
        internet.connectTo("site1.com");
        internet.connectTo("site2.com");
        internet.connectTo("site33.com");
    }
}
