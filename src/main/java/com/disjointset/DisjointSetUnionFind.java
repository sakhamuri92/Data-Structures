package com.disjointset;


import java.util.ArrayList;

class Graph {
    public ArrayList<ArrayList<Integer>> adjacencyListGraph;
    public ArrayList<Integer> parentMappingList;
    public int Edges;
    public int Vertices;
    public Graph(int vertices){
        this.Edges = 0;
        this.Vertices = vertices;
        this.adjacencyListGraph = new ArrayList<>();
        this.parentMappingList = new ArrayList<>();
        for(int v=0;v<vertices;v++){
            this.adjacencyListGraph.add(new ArrayList<Integer>());
            this.parentMappingList.add(-1);
        }
    }

    public ArrayList<ArrayList<Integer>> getAdjacencyListGraph() {
        return adjacencyListGraph;
    }

    public ArrayList<Integer> getParentMappingList() {
        return parentMappingList;
    }


    public void addEdge(int from, int to){
        this.adjacencyListGraph.get(from).add(to);
        this.adjacencyListGraph.get(to).add(from);
        this.Edges++;
    }
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append(this.Vertices + "vertices "+ this.Edges + "Edges\n");
        for(int v=0;v<this.Vertices;v++) {
            sb.append(v + ":");
            for(int w: adjacencyListGraph.get(v)) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public void printGraph(){
        for(int i=0;i<this.adjacencyListGraph.size();i++){
            System.out.println("\nVertex "+ i + ":" );
            for(int j=0;j<this.adjacencyListGraph.get(i).size();j++){
                System.out.println(" ->"+ this.adjacencyListGraph.get(i).get(j));
            }
        }
    }
}

public class DisjointSetUnionFind {
    public ArrayList<ArrayList<Integer>> adjacencyListGraph;
    public ArrayList<Integer> parentMappingList;

    public DisjointSetUnionFind(ArrayList<ArrayList<Integer>> adjacencyListGraph,ArrayList<Integer> parentMappingList) {
        this.adjacencyListGraph = adjacencyListGraph;
        this.parentMappingList = parentMappingList;
    }

    public boolean isCyclic(){

        int count =0;
        for(int i=0;i<this.adjacencyListGraph.size()-1;i++) {
            int fromParent = findParent(i);
            System.out.println(this.adjacencyListGraph.get(i)+"-----------------");
            int toParent = 0;
            for(int j=0;j<this.adjacencyListGraph.get(i).size();j++){
                toParent =  findParent(this.adjacencyListGraph.get(i).get(j));
            }
            if(fromParent == toParent) {
                System.out.println("Cycle is Present");
                return true;
            }
            unionOperation(fromParent,toParent);
        }
        return false;
    }
    public Integer findParent(Integer v){
        if(this.parentMappingList.get(v) == -1)
            return v;
        return findParent(this.parentMappingList.get(v));
    }
    public void unionOperation(Integer fromParent,Integer toParent){
        Integer frmParent = findParent(fromParent);
        Integer tParent = findParent(toParent);
        this.parentMappingList.set(frmParent,tParent);
        System.out.println((this.parentMappingList));
    }
    public static void main(String[] args) {
        System.out.println("started");
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(2, 3);
        g.addEdge(1, 2);

        Graph g1 = new Graph(5);
        g1.addEdge(0, 1);
        g1.addEdge(1, 2);
        g1.addEdge(2, 3);
        g1.addEdge(3, 4);


        g.printGraph();
        DisjointSetUnionFind d = new DisjointSetUnionFind(g.getAdjacencyListGraph(),g.getParentMappingList());
        System.out.println(d.isCyclic());

        DisjointSetUnionFind d1 = new DisjointSetUnionFind(g1.getAdjacencyListGraph(),g1.getParentMappingList());
        System.out.println(d1.isCyclic()+"==============second graph");

    }
}
