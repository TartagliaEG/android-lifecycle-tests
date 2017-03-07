package com.lifecycletests.base.support;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.lifecycletests.base.Behavior;

public class SBaseActivity extends SLoggerActivity {
  private String mName;

  public static Intent newIntent(Context context, Behavior<SBaseActivity, SBaseFragment> behavior) {
    return behavior.onNewActivityInstance(context);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    @SuppressWarnings("unchecked")
    Behavior<SBaseActivity, SBaseFragment> behavior =
      (Behavior<SBaseActivity, SBaseFragment>) getIntent().getSerializableExtra(Behavior.EXTRA_ARGS_KEY);
    mName = getIntent().getStringExtra(Behavior.EXTRA_ARGS_NAME);

    super.onCreate(savedInstanceState);

    behavior.onActivityCreate(this, savedInstanceState);
  }

  @Override
  public String getLogLabel() {
    return mName;
  }
}
