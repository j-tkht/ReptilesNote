package com.wafuwa.create.android.reptilesnote;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;

public class AddReptileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_reptile);

        // ツールバーの設定 //
        Toolbar toolbar = findViewById(R.id.toolbar01);          // Toolbarを取得
        toolbar.setLogo(R.drawable.logo);                         // Toolbarにアプリ名のロゴを設定
        setSupportActionBar(toolbar);                              // ActionbarにToolbarを設定
    }


/*    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 200 && resultCode == RESULT_OK) {
            Bitmap bitmap = data.getParcelableExtra("data");
            ImageView photo = findViewById(R.id.photo);
            photo.setImageBitmap(bitmap);
        }
    }


    //画像がクリックされた時のイベント onPhotoClick
    public void onPhotoClick(View view) {
        // Intentオブジェクト生成
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 200);
    }*/


}
