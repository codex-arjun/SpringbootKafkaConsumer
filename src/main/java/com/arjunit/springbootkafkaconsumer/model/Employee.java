package com.arjunit.springbootkafkaconsumer.model;

public class Employee {

    private Integer id;
    private String name;
    private String post;
    private double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, String post, double salary) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}