package com.lifecycletests.utils;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lifecycletests.R;
import com.lifecycletests.base.loggers.LoggerActivity;

/**
 * An empty dialog overlay used to pause the current visible activity.
 */
public class DialogActivity extends LoggerActivity {

  @Override
  public String getLogLabel() {
    return getClass().getName();
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    setContentView(R.layout.activity_dialog);
    super.onCreate(savedInstanceState);
    findViewById(R.id.btn_send_response).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
//        setResult(Activity.RESULT_CANCELED);
//        finish();
        startActivityForResult(new Intent(DialogActivity.this, ResultActivity.class), Utils.REQUEST_CODE);
      }
    });

  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
  }
}
