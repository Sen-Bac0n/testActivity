package com.example.testactivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Button button=(Button)findViewById(R.id.buttonReturn);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Integer age = intent.getIntExtra("age",20);
        Toast.makeText(AnotherActivity.this, name+age, Toast.LENGTH_SHORT).show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String name = intent.getStringExtra("name");
                Integer age = intent.getIntExtra("age",20);
                intent.putExtra("result","姓名:"+name+"年龄:"+age);
                setResult(0,intent);
                finish();
            }
        });
    }

}