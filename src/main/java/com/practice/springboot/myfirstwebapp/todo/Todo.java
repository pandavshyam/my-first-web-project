package com.practice.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

public class Todo {
  private Integer id;
  private String username;
  private String description;
  private LocalDate targetDate;
  private Boolean done;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getTargetDate() {
    return targetDate;
  }

  public void setTargetDate(LocalDate targetDate) {
    this.targetDate = targetDate;
  }

  public Boolean getDone() {
    return done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }

  public Todo(Integer id, String username, String description, LocalDate targetDate, Boolean done) {
    super();
    this.id = id;
    this.username = username;
    this.description = description;
    this.targetDate = targetDate;
    this.done = done;
  }

  @Override
  public String toString() {
    return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate=" + targetDate
        + ", done=" + done + "]";
  }
}
