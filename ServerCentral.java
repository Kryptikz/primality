import java.net.*;
import java.io.*;
public class ServerCentral {
    ServerSocket ss;
    Socket s;
    BufferedReader din;
    DataOutputStream dout;
    ServerStorage serv;
    public static void main(String[] args) throws Exception {
        new ServerCentral();
    }
    public ServerCentral() {
        serv = new ServerStorage();
        try {
            ss = new ServerSocket(8191);
            listen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void listen() {
        while(true) {
            try {
                s = ss.accept();
                System.out.println("new node connection from " + s.getInetAddress());
                serv.getNodes().addNode(new Node(""+(s.getInetAddress()),""+s.getPort(),""+serv.getNodes().nextUnit()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}