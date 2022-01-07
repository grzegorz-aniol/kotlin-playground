package org.gangel.javanullornotnull;

import java.util.List;

public abstract class VertexProcessor {

  public abstract void process(List<Vertex> elements);

  public List<Vertex> generate() {
    return List.of(
            new Vertex(), new Vertex(), new Vertex()
    );
  }
  
}
