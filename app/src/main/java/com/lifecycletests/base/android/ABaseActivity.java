package com.lifecycletests.base.android;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.lifecycletests.base.Behavior;

public class ABaseActivity extends ALoggerActivity {
  private String mName;

  public static Intent newIntent(Context context, Behavior<ABaseActivity, ABaseFragment> behavior) {
    return behavior.onNewActivityInstance(context);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    @SuppressWarnings("unchecked")
    Behavior<ABaseActivity, ABaseFragment> behavior = (Behavior<ABaseActivity, ABaseFragment>)
      getIntent().getSerializableExtra(Behavior.EXTRA_ARGS_KEY);
    mName = getIntent().getStringExtra(Behavior.EXTRA_ARGS_NAME);

    super.onCreate(savedInstanceState);

    behavior.onActivityCreate(this, savedInstanceState);
  }

  @Override public String getLogLabel() {
    return mName;
  }
}
