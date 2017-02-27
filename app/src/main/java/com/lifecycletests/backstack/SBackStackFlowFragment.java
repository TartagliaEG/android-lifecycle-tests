package com.lifecycletests.backstack;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.lifecycletests.CustomName;
import com.lifecycletests.base.loggers.LoggerSupportFragment;


public class SBackStackFlowFragment extends LoggerSupportFragment implements CustomName {
  private static final String ARG_NAME = BackStackFlowFragment.class.getName() + ".arg_name";

  public static SBackStackFlowFragment newInstance(@NonNull String name) {
    Bundle args = new Bundle();
    args.putString(ARG_NAME, name);
    SBackStackFlowFragment fragment = new SBackStackFlowFragment();
    fragment.setArguments(args);

    return fragment;
  }

  @Override
  public String getCustomName() {
    return "BS" + getArguments().getString(ARG_NAME) + "FlowFragment";
  }
}
