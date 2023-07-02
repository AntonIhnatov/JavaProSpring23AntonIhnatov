package main.java.HW10AlgorithmsAndDataStructures.DataStructures.WeightedGraph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<City> cities;
    List<Edge> edges;

    public Graph() {
        this.cities = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public void addEdge(City source, City destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        edges.add(edge);
    }

    public List<Edge> getAdjacentEdges(City city) {
        List<Edge> adjacentEdges = new ArrayList<>();
        for (Edge edge : edges) {
            if (edge.source == city) {
                adjacentEdges.add(edge);
            }
        }
        return adjacentEdges;
    }
}