package com.lifecycletests.commons;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.lifecycletests.R;
import com.lifecycletests.base.support.SLoggerActivity;

/**
 * A dialog overlay used to pause the current visible activity.
 */
public class SDialogActivity extends SLoggerActivity {

  @Override
  public String getLogLabel() {
    return "[S][A] utils_dialog_activity";
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_dialog);
    super.onCreate(savedInstanceState);

    findViewById(R.id.btn_send_response).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
//        setResult(Activity.RESULT_OK);
//        finish();
        startActivityForResult(new Intent(SDialogActivity.this, SResultActivity.class), 3);
      }
    });
  }

}
