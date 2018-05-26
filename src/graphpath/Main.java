package graphpath;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] cities = {"Seattle", "Miami", "Denver", "Kansas", "City", "Atlanta", "Endevour", "NYC", "London"};

        //index 0
        List<Integer> seattleConnections = new ArrayList<>();
        seattleConnections.add(2);

        //index 1
        List<Integer> miamiConnections = new ArrayList<>();
        miamiConnections.add(6);

        //index 2
        List<Integer> denverConnections = new ArrayList<>();
        denverConnections.add(0);
        denverConnections.add(3);

        //index 3
        List<Integer> kansasConnections = new ArrayList<>();
        kansasConnections.add(2);
        kansasConnections.add(4);
        kansasConnections.add(7);

        //index 4
        List<Integer> cityConnections = new ArrayList<>();
        cityConnections.add(3);
        cityConnections.add(5);
        cityConnections.add(7);

        //index 5
        List<Integer> atlantaConnections = new ArrayList<>();
        atlantaConnections.add(4);
        atlantaConnections.add(6);
        atlantaConnections.add(8);

        //index 6
        List<Integer> endevourConnections = new ArrayList<>();
        endevourConnections.add(1);
        endevourConnections.add(5);
        endevourConnections.add(8);

        //index 7
        List<Integer> nYCConnections = new ArrayList<>();
        nYCConnections.add(3);
        nYCConnections.add(4);

        //index 8
        List<Integer> londonConnections = new ArrayList<>();
        londonConnections.add(5);
        londonConnections.add(6);

        //NOW GRAPH LINKS HAS PREPARED

        //now we will prepare adjacency list
        List<List<Integer>> adjacencyList = new ArrayList<>();
        adjacencyList.add(seattleConnections);
        adjacencyList.add(miamiConnections);
        adjacencyList.add(denverConnections);
        adjacencyList.add(kansasConnections);
        adjacencyList.add(cityConnections);
        adjacencyList.add(atlantaConnections);
        adjacencyList.add(endevourConnections);
        adjacencyList.add(nYCConnections);
        adjacencyList.add(londonConnections);

        UnweightedGraphWithGetPath ugwg = new UnweightedGraphWithGetPath(cities, adjacencyList);
        ugwg.getPath(0, 1);
    }
}
