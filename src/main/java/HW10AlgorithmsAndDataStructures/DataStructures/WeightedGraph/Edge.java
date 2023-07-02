package main.java.HW10AlgorithmsAndDataStructures.DataStructures.WeightedGraph;

public class Edge {
    City source;
    City destination;
    int weight;

    public Edge(City source, City destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}
