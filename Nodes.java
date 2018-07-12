import java.net.*;
import java.io.*;
import java.util.*;
public class Nodes {
    ArrayList<Node> nodes;
    public Nodes() {
        nodes = new ArrayList<Node>();
    }
    public void addNode(Node n) {
        nodes.add(n);
    }
    public Node getNode(int i) {
        return nodes.get(i);
    }
    public int nextUnit() {
        return nodes.size()+1;
    }
}