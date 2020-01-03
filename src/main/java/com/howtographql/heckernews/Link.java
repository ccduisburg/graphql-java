package com.howtographql.heckernews;

import javax.persistence.*;

import lombok.Data;
@Data
@Entity
@Table(name="link")
public class Link {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id; //the new field
    private final String url;
    private final String description;


    public Link(String url, String description) {
        this.url = url;
        this.description = description;
    }
}

