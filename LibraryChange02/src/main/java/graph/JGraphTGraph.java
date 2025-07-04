package graph;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class JGraphTGraph implements Graph {
    private final SimpleGraph<Integer, DefaultEdge> graph;

    public JGraphTGraph() {
        this.graph = new SimpleGraph<>(DefaultEdge.class);
    }

    @Override
    public List<Integer> getNeighbors(Integer vertex) {
        Set<DefaultEdge> edges = graph.edgesOf(vertex);
        List<Integer> neighbors = new ArrayList<>();

        for (DefaultEdge edge : edges) {
            Integer source = graph.getEdgeSource(edge);
            Integer target = graph.getEdgeTarget(edge);

            if (source.equals(vertex)) {
                neighbors.add(target);
            } else {
                neighbors.add(source);
            }
        }

        return neighbors;
    }

    @Override
    public void addVertex(Integer vertex) {
        graph.addVertex(vertex);
    }

    @Override
    public void addEdge(String edge, Integer vertex1, Integer vertex2) {
        graph.addEdge(vertex1, vertex2);
    }
}
