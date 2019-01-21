package com.wafuwa.create.android.reptilesnote;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ツールバーの設定 //
        Toolbar toolbar = findViewById(R.id.toolbar01);          // Toolbarを取得
        toolbar.setLogo(R.drawable.logo);                         // Toolbarにアプリ名のロゴを設定
        setSupportActionBar(toolbar);                              // ActionbarにToolbarを設定
    }

    // 登録ボタンクリック時の遷移設定 //
    public void onAddClick(View view) {
        Intent intent = new Intent(MainActivity.this, AddReptileActivity.class);
        startActivity(intent);
    }

}