package com.lifecycletests.utils;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.lifecycletests.R;
import com.lifecycletests.base.loggers.LoggerActivity;


/**
 * Just exposes a button that send the result back to the parent activity.
 */
public class ResultActivity extends LoggerActivity {

  @Override public String getLogLabel() {
    return getClass().getName();
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_result);
    findViewById(R.id.btn_send_result).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        setResult(Activity.RESULT_OK);
        finish();
      }
    });
  }

}
