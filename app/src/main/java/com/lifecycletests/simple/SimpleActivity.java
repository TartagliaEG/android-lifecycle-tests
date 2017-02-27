package com.lifecycletests.simple;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lifecycletests.utils.DialogActivity;
import com.lifecycletests.R;
import com.lifecycletests.utils.ResultActivity;
import com.lifecycletests.utils.Utils;
import com.lifecycletests.base.loggers.LoggerActivity;


public class SimpleActivity extends LoggerActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fragment);
    Fragment f = getFragmentManager().findFragmentById(R.id.fragment_container);

    findViewById(R.id.btn_dialog).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(new Intent(SimpleActivity.this, DialogActivity.class));
      }
    });

    findViewById(R.id.btn_activity).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivityForResult(new Intent(SimpleActivity.this, ResultActivity.class), Utils.REQUEST_CODE);
      }
    });

    if (f == null) {
      getFragmentManager()
        .beginTransaction()
        .replace(R.id.fragment_container, new SimpleFragment())
        .commit();
    }
  }
}
