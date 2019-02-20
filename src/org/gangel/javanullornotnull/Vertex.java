package org.gangel.javanullornotnull;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class Vertex {
  private String id;
  private String type;

  public Vertex() {
    this.id = UUID.randomUUID().toString();
  }

  public @NotNull String getId() {
    return this.id;
  }

  public @Nullable String getTypeWithNullable() {
    return this.type;
  }

  public String getType() {
    return this.type;
  }

  public void setTypeWithNullCheck(@NotNull String type) {
    this.type = type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
