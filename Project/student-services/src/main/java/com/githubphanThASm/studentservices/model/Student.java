package com.githubphanThASm.studentservices.model;

import lombok.Data;

import java.util.List;

@Data
public class Student {
  private String id;
  private String name;
  private String description;
  private List<Course> courses;

  public Student(String id, String name, String description, List<Course> courses) {
    super();
    this.id = id;
    this.name = name;
    this.description = description;
    this.courses = courses;
  }

  @Override
  public String toString() {
    return String.format(
        "Student [id=%s, name%s, description=%s, courses=%s]",
        this.id, this.name, this.description, this.courses
    );
  }
}