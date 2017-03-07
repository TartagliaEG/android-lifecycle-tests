package com.lifecycletests.commons;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.lifecycletests.R;
import com.lifecycletests.base.android.ALoggerActivity;


/**
 * Just exposes a button that send the result back to the parent activity.
 */
public class AResultActivity extends ALoggerActivity {

  @Override public String getLogLabel() {
    return "[A][A] utils_result_activity";
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
