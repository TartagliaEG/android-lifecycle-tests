package com.lifecycletests.use_case.main_flow_all_fragment_types;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lifecycletests.R;
import com.lifecycletests.base.Behavior;
import com.lifecycletests.base.support.SBaseActivity;
import com.lifecycletests.base.support.SBaseBehavior;
import com.lifecycletests.base.support.SBaseFragment;
import com.lifecycletests.commons.DialogAndResultButtons;
import com.lifecycletests.commons.SDialogActivity;
import com.lifecycletests.commons.SResultActivity;


public class SBAllFragmentTypes extends SBaseBehavior {

  @Override
  public void onActivityCreate(SBaseActivity activity, Bundle savedInstanceState) {
    activity.setContentView(R.layout.s_all_fragment_types);

    new DialogAndResultButtons()
      .configureDialogActivity(activity, R.id.btn_dialog, SDialogActivity.class)
      .configureResultActivity(activity, R.id.btn_activity, SResultActivity.class);

    Fragment f = activity.getSupportFragmentManager().findFragmentById(R.id.fragment_container);
    if (f == null) {
      activity.getSupportFragmentManager()
        .beginTransaction()
        .replace(R.id.fragment_container, SBaseFragment.newInstance("[S][F] dynamic", activity, this))
        .add(SBaseFragment.newInstance("[S][F] retained", activity, this), "TAG")
        .commit();
    }

  }

  @Override
  public View onFragmentCreateView(SBaseFragment fragment, LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
    if ("[S][F] retained".equals(fragment.getArguments().getString(Behavior.EXTRA_ARGS_NAME))) {
      fragment.setHasOptionsMenu(false);
      return null;
    }
    fragment.setHasOptionsMenu(true);
    return inflater.inflate(R.layout.fragment_layout, container, false);
  }

  @Override public String getActivityLogLabel() {
    return "[S][A] s_all_fragment_types";
  }
}
