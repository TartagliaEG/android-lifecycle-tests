package com.lifecycletests.use_case.static_dynamic_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lifecycletests.R;
import com.lifecycletests.base.android.ABaseActivity;
import com.lifecycletests.base.android.ABaseBehavior;
import com.lifecycletests.base.android.ABaseFragment;
import com.lifecycletests.utils.DialogAndResultButtons;


public class ABStaticDynamicFragment extends ABaseBehavior {

  @Override
  public void onActivityCreate(ABaseActivity activity, Bundle savedInstanceState) {
    activity.setContentView(R.layout.dynamic_and_static_fragment);

    new DialogAndResultButtons()
      .configureDialogActivity(activity, R.id.btn_dialog)
      .configureResultActivity(activity, R.id.btn_activity);

    Fragment f = activity.getFragmentManager().findFragmentById(R.id.fragment_container);
    if (f == null) {
      activity.getFragmentManager()
        .beginTransaction()
        .replace(R.id.fragment_container, ABaseFragment.newInstance("Dynamic", activity, this))
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
