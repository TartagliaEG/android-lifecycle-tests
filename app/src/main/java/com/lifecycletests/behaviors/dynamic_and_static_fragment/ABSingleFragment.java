package com.lifecycletests.behaviors.dynamic_and_static_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lifecycletests.R;
import com.lifecycletests.base.ABaseActivity;
import com.lifecycletests.base.ABaseBehavior;
import com.lifecycletests.base.ABaseFragment;
import com.lifecycletests.utils.DialogAndResultButtons;


public class ABSingleFragment extends ABaseBehavior {

  @Override
  public void onActivityCreate(ABaseActivity activity, Bundle savedInstanceState) {
    activity.setContentView(R.layout.activity_fragment);

    new DialogAndResultButtons()
      .configureDialogActivity(activity, R.id.btn_dialog)
      .configureResultActivity(activity, R.id.btn_activity);

    Fragment f = activity.getFragmentManager().findFragmentByTag("TAG1");
    if (f == null) {
      activity.getFragmentManager()
        .beginTransaction()
        .add(ABaseFragment.newInstance("Dynamic", activity, this), "TAG1")
        .commit();
    }
  }


  @Override
  public View onFragmentCreateView(ABaseFragment fragment, LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
    fragment.setHasOptionsMenu(true);
    return inflater.inflate(R.layout.fragment_layout, container, false);
  }

  @Override public String getActivityLogLabel() {
    return "SingleFragment";
  }
}
