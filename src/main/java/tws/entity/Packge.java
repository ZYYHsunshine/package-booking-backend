package tws.entity;

import java.io.Serializable;
import java.util.Date;

public class Packge implements Serializable {
    private int id;
    private String name;
    private String phone;
    private String status;
    private Date preTime;

    public Packge() {

    }

    public Packge(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.status = status;
        this.preTime = preTime;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getpreTime() {
        return preTime;
    }

    public Date setpreTime(preTime) {
        this.preTime = preTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
