package com.github.diwakar1988.butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.BindInt;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DemoActivity extends AppCompatActivity {

    @Bind(R.id.txtView)
    TextView txtView;
    @Bind(R.id.btnView)
    Button btnClick;
    @BindInt(R.integer.MINUS_ONE)
    int count;
    @BindString(R.string.click_count)
    String strClickCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        ButterKnife.bind(this);
        takeAction();
    }

    @OnClick(R.id.btnView)
    void takeAction() {
        txtView.setText(strClickCount + " = " + (++count));
    }
}
