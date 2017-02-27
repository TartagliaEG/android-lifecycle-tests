package com.lifecycletests.backstack;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.lifecycletests.CustomName;
import com.lifecycletests.utils.DialogActivity;
import com.lifecycletests.R;
import com.lifecycletests.base.loggers.LoggerActivity;


public class BackStackFlowActivity extends LoggerActivity {
  private static final String FRG_FIRST_TAG = "FIRST__";
  private static final String FRG_SECOND_TAG = "SECOND_";

  private BackStackFlowFragment createFirstFragment() {
    return BackStackFlowFragment.newInstance(FRG_FIRST_TAG);
  }

  private BackStackFlowFragment createSecondFragment() {
    return BackStackFlowFragment.newInstance(FRG_SECOND_TAG);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.backstack_activity);

    findViewById(R.id.btn_dialog).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(new Intent(BackStackFlowActivity.this, DialogActivity.class));
      }
    });

    findViewById(R.id.btn_first_fragment).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Fragment curr = getFragmentManager().findFragmentById(R.id.fragment_container);

        if (curr == null || !((CustomName) curr).getCustomName().contains(FRG_FIRST_TAG)) {
          Fragment first = createFirstFragment();
          addFragment(first);
        } else {
          Toast.makeText(BackStackFlowActivity.this, "This fragment is being displayed already.", Toast.LENGTH_SHORT).show();
        }
      }
    });

    findViewById(R.id.btn_second_fragment).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Fragment curr = getFragmentManager().findFragmentById(R.id.fragment_container);

        if (curr == null || !((CustomName) curr).getCustomName().contains(FRG_SECOND_TAG)) {
          Fragment second = createSecondFragment();
          addFragment(second);
        } else {
          Toast.makeText(BackStackFlowActivity.this, "This fragment is being displayed already.", Toast.LENGTH_SHORT).show();
        }
      }
    });

  }

  private void addFragment(Fragment fragment) {
    getFragmentManager()
      .beginTransaction()
      .replace(R.id.fragment_container, fragment)
      .addToBackStack(null)
      .commit();
  }
}
