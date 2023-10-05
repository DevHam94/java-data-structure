package graph;

import java.util.*;

public class AdjacencyMatrixGraph implements IGraph {

    private Integer[][] matrix;
    private Set<Integer> vertexes;
    private Map<Integer, Integer> indegress;
    // indegress.get(3) = 5 -> 노드 3을 가르키는 노드의 갯수가 5

    public AdjacencyMatrixGraph(int numOfVertex) {
        this.vertexes = new HashSet<>();
        this.indegress = new HashMap<>();
        this.matrix = new Integer[numOfVertex][];
        for (int i = 0; i < numOfVertex; i++) {
            this.matrix[i] = new Integer[numOfVertex];
        }
    }

    @Override
    public void add(int from, int to) {
        this.vertexes.add(from);
        this.vertexes.add(to);

        int count = this.indegress.getOrDefault(to, 0);
        indegress.put(to, count + 1);

        matrix[from][to] = 1;
        //matrix[to][from] = 1;
    }

    @Override
    public void add(int from, int to, Integer distance) {
        this.vertexes.add(from);
        this.vertexes.add(to);

        // map.add(1, 3)
        // map.getOrDefault(1, 0) -> 4
        // map.getOrDefault(2, 0) -> 0
        int count = this.indegress.getOrDefault(to, 0);
        indegress.put(to, count + 1);

        matrix[from][to] = distance;
        //matrix[to][from] = distance;
    }

    @Override
    public Integer getDistance(int from, int to) {
        return this.matrix[from][to];
    }

    @Override
    public Map<Integer, Integer> getIndegress() {
        return this.indegress;
    }

    @Override
    public Set<Integer> getVertexes() {
        return this.vertexes;
    }

    @Override
    public List<Integer> getNodes(int vertex) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < this.matrix[vertex].length; i++) {
            if (this.matrix[vertex][i] != null) {
                result.add(i);
            }
        }
        return result;
    }
}
