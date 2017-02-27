package com.lifecycletests.simple;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.lifecycletests.utils.DialogActivity;
import com.lifecycletests.base.loggers.LoggerSupportActivity;
import com.lifecycletests.R;
import com.lifecycletests.utils.ResultActivity;
import com.lifecycletests.utils.Utils;


public class SSimpleActivity extends LoggerSupportActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fragment);
    Fragment f = getSupportFragmentManager().findFragmentById(R.id.fragment_container);

    findViewById(R.id.btn_dialog).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(new Intent(SSimpleActivity.this, DialogActivity.class));
      }
    });

    findViewById(R.id.btn_activity).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivityForResult(new Intent(SSimpleActivity.this, ResultActivity.class), Utils.REQUEST_CODE);
      }
    });

    if (f == null) {
      getSupportFragmentManager()
        .beginTransaction()
        .replace(R.id.fragment_container, new SSimpleFragment())
        .commit();
    }
  }
}
