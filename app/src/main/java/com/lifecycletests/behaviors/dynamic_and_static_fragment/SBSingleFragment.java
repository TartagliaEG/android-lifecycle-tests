package com.lifecycletests.behaviors.dynamic_and_static_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lifecycletests.R;
import com.lifecycletests.base.SBaseActivity;
import com.lifecycletests.base.SBaseBehavior;
import com.lifecycletests.base.SBaseFragment;
import com.lifecycletests.utils.DialogAndResultButtons;


public class SBSingleFragment extends SBaseBehavior {

  @Override
  public void onActivityCreate(SBaseActivity activity, Bundle savedInstanceState) {
    activity.setContentView(R.layout.activity_fragment);

    new DialogAndResultButtons()
      .configureDialogActivity(activity, R.id.btn_dialog)
      .configureResultActivity(activity, R.id.btn_activity);

    Fragment f = activity.getSupportFragmentManager().findFragmentById(R.id.fragment_container);
    if (f == null) {
      activity.getSupportFragmentManager()
        .beginTransaction()
        .replace(R.id.fragment_container, SBaseFragment.newInstance("dynamic", activity, this))
        .commit();
    }
  }

  @Override
  public View onFragmentCreateView(SBaseFragment fragment, LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
    fragment.setHasOptionsMenu(true);
    return inflater.inflate(R.layout.fragment_layout, container, false);
  }

  @Override public String getActivityLogLabel() {
    return "SSingleFragment";
  }
}
