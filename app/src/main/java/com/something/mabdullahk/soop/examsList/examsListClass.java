package com.something.mabdullahk.soop.examsList;

public class examsListClass {

    String id;
    String title;
    String start_date;
    String end_date;
    String result_announced;
    String SID;

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public examsListClass(String id, String title, String start_date, String end_date, String result_announced, String SID) {
        this.id = id;
        this.title = title;
        this.start_date = start_date;
        this.end_date = end_date;
        this.result_announced = result_announced;
        this.SID = SID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getResult_announced() {
        return result_announced;
    }

    public void setResult_announced(String result_announced) {
        this.result_announced = result_announced;
    }



}
