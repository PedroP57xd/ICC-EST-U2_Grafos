
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;

public class Graph {
    Set<Node> nodes;

    public Graph() {
        this.nodes = new LinkedHashSet<>();
    }

    public Node addNode(int value) {
        Node newNode = new Node(value);
        nodes.add(newNode);
        return newNode;

    }

    public void addEdge(Node src, Node dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    public void addEdgeUni(Node src, Node dest) {
        src.addNeighbor(dest);
    }

    // Metodo para imprimir el grafo
    // Para cada nodo imprimir sus conecciones
    // Vertex 0: 1->3->5

    public void printGraph() {
        for (Node node : nodes) {
            if (node.getNeighbors().isEmpty())
                continue;
            System.out.print("Vertex " + node.getValue() + ": ");
            for (Node neighbor : node.getNeighbors()) {
                System.out.print("-> " + neighbor.getValue());
            }
            System.out.println();
        }
    }

    public void getDFS(Node startNode) {

    }

    private void getDFSUtil(Node node, boolean[] visited) {

    }

    public void getBFS(Node startNode) {

    }

    private void getBFSUtil(Node node) {

    }

    public int[][] getAdjacencyMatrix() {

        return new int[0][0];
    }

    public void printAdjacencyMatrix() {

    }

}