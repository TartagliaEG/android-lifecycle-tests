package com.lifecycletests.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.Serializable;

/**
 * The activity/fragment behavior.
 * <p>
 * This class should be used instead of creating multiple activities and fragments. It have two
 * callbacks (instantiation and creation) for each component.
 * <p>
 * There are two default implementers for the most common cases.
 *
 * @param <TActivity> The Activity handled by this behavior (Usually AppCompatActivity or Activity)
 * @param <TFragment> The Fragment handled by this behavior (Usually v4.app.Fragment or android.app.Fragment)
 * @see com.lifecycletests.base.support.SBaseBehavior support,
 * @see com.lifecycletests.base.android.ABaseBehavior android
 */
public interface Behavior<TActivity, TFragment> extends Serializable {
  String EXTRA_ARGS_KEY = Behavior.class.getName() + ".KEY";
  String EXTRA_ARGS_NAME = Behavior.class.getName() + ".NAME";
  int DEFAULT_REQUEST_CODE = 1777;

  TFragment onNewFragmentInstance(String name, Context context);

  Intent onNewActivityInstance(Context context);

  void onActivityCreate(TActivity activity, Bundle savedInstanceState);

  View onFragmentCreateView(TFragment fragment, LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState);

  String getActivityLogLabel();

}
