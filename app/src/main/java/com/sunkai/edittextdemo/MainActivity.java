package com.sunkai.edittextdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * EditText 组件测试 demo
 */
public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.buton1);
        button2 = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.text_view);
        editText = (EditText) findViewById(R.id.edit_text);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("123");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("123456");
            }
        });
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                textView.append("beforeTextChanged，s: " + s + ",start: " + start + ",count: " + count + ", after: " + after+"\n");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textView.append("onTextChanged，s: " + s + ",start: " + start + ",before: " + before + ", count: " + count+"\n");

            }

            @Override
            public void afterTextChanged(Editable s) {
                textView.append("afterTextChanged，s: "+s+"\n");
            }
        });
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());

    }

}
