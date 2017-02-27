package com.lifecycletests.backstack;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.lifecycletests.CustomName;
import com.lifecycletests.base.loggers.LoggerFragment;

public class BackStackFlowFragment extends LoggerFragment implements CustomName {
  private static final String ARG_NAME = BackStackFlowFragment.class.getName() + ".arg_name";

  public static BackStackFlowFragment newInstance(@NonNull String name) {
    Bundle args = new Bundle();
    args.putString(ARG_NAME, name);
    BackStackFlowFragment fragment = new BackStackFlowFragment();
    fragment.setArguments(args);

    return fragment;
  }

  @Override
  public String getCustomName() {
    return "BS" + getArguments().getString(ARG_NAME) + "FlowFragment";
  }
}
