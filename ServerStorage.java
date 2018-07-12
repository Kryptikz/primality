import java.net.*;
import java.io.*;
public class ServerStorage {
    Nodes nodelist;
    public ServerStorage() {
        nodelist=new Nodes();
    }
    public Nodes getNodes() {
        return nodelist;
    }
    public void setNodes(Nodes nl) {
        nodelist=nl;
    }
}