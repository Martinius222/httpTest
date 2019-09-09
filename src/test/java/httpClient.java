import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.Socket;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class httpClient {

    @Test
    void mathShouldWork() {
        assertEquals(5, 3+2);
    }

    @Test
    void moreMathShouldWork() {
        assertEquals(10, 6+4);
    }

    @Test
    void evenMoreMathShouldWork() {
        assertEquals(8, 4+4);
    }

    // This is a commit test commentary

    // This is test commentary number 2

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("urlecho.appspot.com", 80);
        socket.getOutputStream().write("GET /echo?status=200&Content-Type=text%2Fhtml&body=Hello%20world! HTTP/1.1\r\n".getBytes());
        socket.getOutputStream().write("Host: urlecho.appspot.com\r\n".getBytes());
        socket.getOutputStream().write("\r\n".getBytes());
        socket.getOutputStream().flush();

        int c;
        while ((c = socket.getInputStream().read()) != -1) {
            System.out.print((char)c);
        }
    }
}
