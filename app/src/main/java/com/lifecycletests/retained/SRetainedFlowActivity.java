package com.lifecycletests.retained;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

import com.lifecycletests.utils.DialogActivity;
import com.lifecycletests.R;
import com.lifecycletests.base.loggers.LoggerSupportActivity;


public class SRetainedFlowActivity extends LoggerSupportActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_retained);
    Fragment fragment = getSupportFragmentManager().findFragmentByTag("TAG");

    findViewById(R.id.btn_dialog).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(new Intent(SRetainedFlowActivity.this, DialogActivity.class));
      }
    });

    if (fragment == null) {
      fragment = new SRetainedFlowFragment();
      getSupportFragmentManager()
        .beginTransaction()
        .add(fragment, "TAG")
        .commit();
      fragment.setRetainInstance(true);
    }
  }

  @Override public void onAttachFragment(Fragment fragment) {
    super.onAttachFragment(fragment);
    TextView v = (TextView) findViewById(R.id.btn_retained_flow_text);
    v.setText("Invisible retained fragment: " + getSupportFragmentManager().findFragmentByTag("TAG").getClass().getSimpleName());
  }
}
