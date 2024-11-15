/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.graphs;
import com.practice.nodes.LinkedList;

/**
 *
 * @author PC
 */
public class Vertex {
    private String data;
    private LinkedList<Edge> edges;
    
    public Vertex(String inputData) {
        this.data = inputData;
        this.edges = new LinkedList<Edge>();
    }
    
    public void addEdge(Vertex endVertex, Integer weight ){
        this.edges.add(this, endVertex, weight);
    }
    
//    public void removeEdge(Vertex endVertex) {
//       
//    }
    
    
}
