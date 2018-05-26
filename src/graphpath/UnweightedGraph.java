package graphpath;

import java.util.List;

public class UnweightedGraph {
    static String cities[];
    static List<List<Integer>> connections;
    public UnweightedGraph(String cities[], List<List<Integer>> connections){
        this.cities = cities;
        this.connections = connections;
    }
}
