package pl.server.oldschool;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class OldSchoolServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);

        /*
        Use 'curl localhost:8080' to connect to server
         */
        while (true) {
            Socket connection = serverSocket.accept();

            OutputStream outputStream = connection.getOutputStream();
            outputStream.write("Hello World\n".getBytes());

            connection.close();
        }
    }
}