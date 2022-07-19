package com.arckzone.blog.example1.model;

import javax.annotation.processing.Generated;

@Generated("https://blog.arckzone.com")
public class Career {

    private String title;
    private boolean fulltime;
    private String department;

    public Career() {
    }

    public Career(String title, boolean fulltime, String department) {
        this.title = title;
        this.fulltime = fulltime;
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFulltime() {
        return fulltime;
    }

    public void setFulltime(boolean fulltime) {
        this.fulltime = fulltime;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format(
                "Career: { title=%s, fulltime=%s, department=%s }",
                title,
                fulltime,
                department
        );
    }
}
