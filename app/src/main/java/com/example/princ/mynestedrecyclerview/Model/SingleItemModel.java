package com.example.princ.mynestedrecyclerview.Model;

public class SingleItemModel {
    private String name;
    private String url;
    private String description;
    private String createdFor;


    public SingleItemModel() {
    }


    public SingleItemModel(String name, String url, String createdFor) {
        this.name = name;
        this.url = url;
        this.createdFor = createdFor;

    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedFor() {   return createdFor;  }

    public void setCreatedFor(String createdFor) {   this.createdFor = createdFor;   }
}
