package graph;

import java.util.List;

public interface Graph {
    List<Integer> getNeighbors(Integer vertex);
    void addVertex(Integer vertex);
    void addEdge(String edge, Integer vertex1, Integer vertex2);
}
