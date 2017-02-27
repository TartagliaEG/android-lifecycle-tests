package com.lifecycletests.backstack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Toast;

import com.lifecycletests.CustomName;
import com.lifecycletests.utils.DialogActivity;
import com.lifecycletests.R;
import com.lifecycletests.base.loggers.LoggerSupportActivity;


public class SBackStackFlowActivity extends LoggerSupportActivity {

  private static final String FRG_FIRST_TAG = "FIRST__";
  private static final String FRG_SECOND_TAG = "SECOND_";

  private SBackStackFlowFragment createFirstFragment() {
    return SBackStackFlowFragment.newInstance(FRG_FIRST_TAG);
  }

  private SBackStackFlowFragment createSecondFragment() {
    return SBackStackFlowFragment.newInstance(FRG_SECOND_TAG);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.backstack_activity);

    findViewById(R.id.btn_dialog).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(new Intent(SBackStackFlowActivity.this, DialogActivity.class));
      }
    });

    findViewById(R.id.btn_first_fragment).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Fragment curr = getSupportFragmentManager().findFragmentById(R.id.fragment_container);

        if (curr == null || !((CustomName) curr).getCustomName().contains(FRG_FIRST_TAG)) {
          Fragment first = createFirstFragment();
          addFragment(first);
        } else {
          Toast.makeText(SBackStackFlowActivity.this, "This fragment is being displayed already.", Toast.LENGTH_SHORT).show();
        }
      }
    });

    findViewById(R.id.btn_second_fragment).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Fragment curr = getSupportFragmentManager().findFragmentById(R.id.fragment_container);

        if (curr == null || !((CustomName) curr).getCustomName().contains(FRG_SECOND_TAG)) {
          Fragment second = createSecondFragment();
          addFragment(second);
        } else {
          Toast.makeText(SBackStackFlowActivity.this, "This fragment is being displayed already.", Toast.LENGTH_SHORT).show();
        }
      }
    });

  }

  private void addFragment(Fragment fragment) {
    getSupportFragmentManager()
      .beginTransaction()
      .replace(R.id.fragment_container, fragment)
      .addToBackStack(null)
      .commit();
  }

}
