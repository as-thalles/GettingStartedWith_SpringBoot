package com.githubphanThASm.studentservices.model;

import lombok.Data;

import java.util.List;

@Data
public class Course {
  private String id;
  private String name;
  private String description;
  private List<String> steps;

  public Course() {}

  public Course(String id, String name, String description, List<String> steps) {
    super();
    this.id = id;
    this.name = name;
    this.description = description;
    this.steps = steps;
  }

  @Override
  public String toString() {
    return String.format(
        "Course [id=%s, name=%s, description=%s, steps=%s]",
        this.id, this.name, this.description, this.steps
    );
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : this.id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj == null)
      return false;

    if(this == obj)
      return true;

    if(this.getClass() != obj.getClass())
      return false;

    Course newCourse = (Course) obj;

    if(this.id == null) {
      if(newCourse.getId() != null)
        return false;
    }
    else {
      if (!this.id.equals(newCourse.getId()))
        return false;
    }

    return true;
  }
}
