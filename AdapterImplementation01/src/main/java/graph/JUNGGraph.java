package graph;

import edu.uci.ics.jung.graph.SparseMultigraph;

import java.util.ArrayList;
import java.util.List;

public class JUNGGraph implements Graph {
    private final SparseMultigraph<Integer, String> graph;

    public JUNGGraph() {
        this.graph = new SparseMultigraph<>();
    }

    @Override
    public List<Integer> getNeighbors(Integer vertex) {
        return new ArrayList<>(graph.getNeighbors(vertex));
    }

    @Override
    public void addVertex(Integer vertex) {
        graph.addVertex(vertex);
    }

    @Override
    public void addEdge(String edge, Integer vertex1, Integer vertex2) {
        graph.addEdge(edge, vertex1, vertex2);
    }
}
