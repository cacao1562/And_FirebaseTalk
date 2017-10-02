package com.talk.hwanungyu.and_firebasetalk.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hwanungyu on 2017. 9. 25..
 */

public class ChatModel {
    //public String uid;
    //public String destinationUid;

    public Map<String,Boolean> users = new HashMap<>(); //채팅방 유저들
    public Map<String,Comment> comments = new HashMap<>(); //채팅방의 대화내용

    public static class Comment {
        public String uid;
        public String message;


    }


}
