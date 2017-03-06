package com.lifecycletests.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lifecycletests.base.loggers.LoggerSupportFragment;
import com.lifecycletests.behaviors.Behavior;


public class SBaseFragment extends LoggerSupportFragment {
  private String mName;

  public static SBaseFragment newInstance(String name, Context context, Behavior<SBaseActivity, SBaseFragment> behavior) {
    return behavior.onNewFragmentInstance(name, context);
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    Behavior<SBaseActivity, SBaseFragment> behavior = getArguments().getParcelable(Behavior.EXTRA_ARGS_KEY);
    mName = getArguments().getString(Behavior.EXTRA_ARGS_NAME);

    super.onCreateView(inflater, container, savedInstanceState);

    return behavior.onFragmentCreateView(this, inflater, container, savedInstanceState);
  }

  @Override
  public String getLogLabel() {
    return mName;
  }
}
