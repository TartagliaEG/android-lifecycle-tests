package com.lifecycletests.behaviors;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.Serializable;


public interface Behavior<TActivity, TFragment> extends Serializable {
  String EXTRA_ARGS_KEY = Behavior.class.getName() + ".KEY";
  String EXTRA_ARGS_NAME = Behavior.class.getName() + ".NAME";

  TFragment onNewFragmentInstance(String name, Context context);

  Intent onNewActivityInstance(String name, Context context);

  void onActivityCreate(TActivity activity, Bundle savedInstanceState);

  View onFragmentCreateView(TFragment fragment, LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState);

  String getActivityLogLabel();

}
