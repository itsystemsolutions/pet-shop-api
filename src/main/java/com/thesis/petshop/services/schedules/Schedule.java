package com.thesis.petshop.services.schedules;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name ="schedules")
public class Schedule {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column (name = "id")
    private Long id;

    @Column( name = "time_stamp" )
    private String timeStamp = LocalDateTime.now().toString();

    @Column( name = "user_id")
    private Long userId;

    @Column( name = "date")
    private String date;

    @Column(name = "time")
    private String time;

    @Column(name = "message")
    private String message;

    @Column(name = "pet_code")
    private String petCode;

    @Column(name = "zoomLink")
    private String zoomLink;

    @Column(name = "status")
    private String status;

    public Schedule() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPetCode() {
        return petCode;
    }

    public void setPetCode(String petCode) {
        this.petCode = petCode;
    }

    public String getZoomLink() {
        return zoomLink;
    }

    public void setZoomLink(String zoomLink) {
        this.zoomLink = zoomLink;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}