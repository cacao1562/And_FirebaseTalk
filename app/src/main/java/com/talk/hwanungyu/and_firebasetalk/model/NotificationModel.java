package com.talk.hwanungyu.and_firebasetalk.model;

/**
 * Created by hwanungyu on 2017. 12. 5..
 */

public class NotificationModel {

    public String to;
    public Notification notification = new Notification();
    public Data data = new Data();

    public static class Notification {
        public String title;
        public String text;
    }

    public static class Data{
        public String title;
        public String text;
    }
}
