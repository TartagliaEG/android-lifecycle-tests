package com.lifecycletests.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.lifecycletests.behaviors.Behavior;

public abstract class SBaseBehavior implements Behavior<SBaseActivity, SBaseFragment> {

  @Override
  public Intent onNewActivityInstance(String name, Context context) {
    Intent intent = new Intent(context, SBaseActivity.class);
    intent.putExtra(EXTRA_ARGS_KEY, this);
    intent.putExtra(EXTRA_ARGS_NAME, name);
    return intent;
  }

  @Override
  public SBaseFragment onNewFragmentInstance(String name, Context context) {
    Bundle bundle = new Bundle();
    bundle.putSerializable(EXTRA_ARGS_KEY, this);
    bundle.putString(EXTRA_ARGS_NAME, name);
    SBaseFragment fragment = new SBaseFragment();
    fragment.setArguments(bundle);
    return fragment;
  }

}
