/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice.graphs;

/**
 *
 * @author PC
 */

//  Directed graph
public class Edge {
    private Vertex start;
    private Vertex end;
    private Integer weight;
    
    
    public Edge(Vertex start, Vertex end, Integer inputWeight) {
         this.start = start;
         this.end = end;
         this.weight = inputWeight;
    }

    /**
     * @return the start
     */
    public Vertex getStart() {
        return start;
    }

    /**
     * @param start the start to set
     */
    public void setStart(Vertex start) {
        this.start = start;
    }

    /**
     * @return the end
     */
    public Vertex getEnd() {
        return end;
    }

    /**
     * @param end the end to set
     */
    public void setEnd(Vertex end) {
        this.end = end;
    }

    /**
     * @return the weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    
    
    
    
    
    
}
