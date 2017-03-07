package com.lifecycletests.use_case.main_flow_all_fragment_types;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lifecycletests.R;
import com.lifecycletests.base.Behavior;
import com.lifecycletests.base.android.ABaseActivity;
import com.lifecycletests.base.android.ABaseBehavior;
import com.lifecycletests.base.android.ABaseFragment;
import com.lifecycletests.commons.ADialogActivity;
import com.lifecycletests.commons.AResultActivity;
import com.lifecycletests.commons.DialogAndResultButtons;


public class ABAllFragmentTypes extends ABaseBehavior {

  @Override
  public void onActivityCreate(ABaseActivity activity, Bundle savedInstanceState) {
    activity.setContentView(R.layout.a_all_fragment_types);

    new DialogAndResultButtons()
      .configureDialogActivity(activity, R.id.btn_dialog, ADialogActivity.class)
      .configureResultActivity(activity, R.id.btn_activity, AResultActivity.class);

    Fragment f = activity.getFragmentManager().findFragmentById(R.id.fragment_container);
    if (f == null) {
      activity.getFragmentManager()
        .beginTransaction()
        .replace(R.id.fragment_container, ABaseFragment.newInstance("[A][F] dynamic", activity, this))
        .add(ABaseFragment.newInstance("[A][F] retained", activity, this), "TAG")
        .commit();
    }
  }


  @Override
  public View onFragmentCreateView(ABaseFragment fragment, LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
    if ("[A][F] retained".equals(fragment.getArguments().getString(Behavior.EXTRA_ARGS_NAME))) {
      fragment.setHasOptionsMenu(false);
      return null;
    }

    fragment.setHasOptionsMenu(true);
    return inflater.inflate(R.layout.fragment_layout, container, false);
  }


  @Override
  public String getActivityLogLabel() {
    return "[A][A] a_all_fragment_types";
  }
}
