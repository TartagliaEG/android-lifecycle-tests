package com.lifecycletests.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.lifecycletests.base.loggers.LoggerSupportActivity;
import com.lifecycletests.behaviors.Behavior;

public class SBaseActivity extends LoggerSupportActivity {
  private String mName;

  public static Intent newIntent(Context context, Behavior<SBaseActivity, SBaseFragment> behavior) {
    Intent intent = new Intent(context, ABaseActivity.class);
    intent.putExtra(Behavior.EXTRA_ARGS_KEY, behavior);
    intent.putExtra(Behavior.EXTRA_ARGS_NAME, behavior.getActivityLogLabel());
    return intent;
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    Behavior<SBaseActivity, SBaseFragment> behavior = getIntent().getParcelableExtra(Behavior.EXTRA_ARGS_KEY);
    mName = getIntent().getStringExtra(Behavior.EXTRA_ARGS_NAME);

    super.onCreate(savedInstanceState);

    behavior.onActivityCreate(this, savedInstanceState);
  }

  @Override
  public String getLogLabel() {
    return mName;
  }
}
