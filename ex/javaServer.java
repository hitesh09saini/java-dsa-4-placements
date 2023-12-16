package ex;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class javaServer {

    // Constants
    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        // Create an HTTP server that listens on the specified port
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);

        // Create contexts and set handlers
        server.createContext("/", new RootHandler());
        server.createContext("/ping", new PingHandler());

        // Start the server
        server.start();

        System.out.println("Server started on port http://localhost:" + PORT);
    }

    // Define a custom handler for the root path
    static class RootHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Send a simple response back to the client
            String response = "Hello, this is a simple HTTP server!";
            sendResponse(exchange, response);
        }
    }

    // Define a custom handler for the /ping path
    static class PingHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Send a simple response back to the client
            String response = "Server is running";
            sendResponse(exchange, response);
        }
    }

    // Helper method to send the HTTP response
    private static void sendResponse(HttpExchange exchange, String response) throws IOException {
        exchange.sendResponseHeaders(200, response.getBytes().length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }
}
