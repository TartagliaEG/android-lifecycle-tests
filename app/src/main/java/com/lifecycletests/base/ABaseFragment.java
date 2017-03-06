package com.lifecycletests.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lifecycletests.base.loggers.LoggerFragment;
import com.lifecycletests.behaviors.Behavior;

public class ABaseFragment extends LoggerFragment {
  private String mName;

  public static ABaseFragment newInstance(String name, Context context, Behavior<ABaseActivity, ABaseFragment> behavior) {
    return behavior.onNewFragmentInstance(name, context);
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    @SuppressWarnings("unchecked")
    Behavior<ABaseActivity, ABaseFragment> behavior = (Behavior<ABaseActivity, ABaseFragment>)
      getArguments().getSerializable(Behavior.EXTRA_ARGS_KEY);
    mName = getArguments().getString(Behavior.EXTRA_ARGS_NAME);

    super.onCreateView(inflater, container, savedInstanceState);

    assert behavior != null;
    return behavior.onFragmentCreateView(this, inflater, container, savedInstanceState);
  }

  @Override
  public String getLogLabel() {
    return mName;
  }

}
