package com.talk.hwanungyu.and_firebasetalk.chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.talk.hwanungyu.and_firebasetalk.R;
import com.talk.hwanungyu.and_firebasetalk.model.ChatModel;

public class MessageActivity extends AppCompatActivity {

    private String destinationUid;
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        destinationUid = getIntent().getStringExtra("destinationUid");
        button = (Button)findViewById(R.id.messageActivity_button);
        editText = (EditText)findViewById(R.id.messageActivity_edittext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChatModel chatModel = new ChatModel();
                chatModel.uid = FirebaseAuth.getInstance().getCurrentUser().getUid();
                chatModel.destinationUid = destinationUid;
                                                                                //push가 있어야 채팅방 이름이 생김
                FirebaseDatabase.getInstance().getReference().child("chatrooms").push().setValue(chatModel);
            }
        });

    }
}
