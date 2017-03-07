package com.lifecycletests.commons;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.view.View;

import com.lifecycletests.base.Behavior;

/**
 * Created by erik on 05/03/17.
 * ...
 */

public class DialogAndResultButtons {

  public DialogAndResultButtons configureResultActivity(final Activity activity, @IdRes int resultActivityId, final Class<? extends Activity> clazz) {
    activity.findViewById(resultActivityId).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        activity.startActivityForResult(new Intent(activity, clazz), Behavior.DEFAULT_REQUEST_CODE);
      }
    });
    return this;
  }

  public DialogAndResultButtons configureDialogActivity(final Activity activity, @IdRes int dialogActivityId, final Class<? extends Activity> clazz) {
    activity.findViewById(dialogActivityId).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        activity.startActivityForResult(new Intent(activity, clazz), Behavior.DEFAULT_REQUEST_CODE);
      }
    });
    return this;
  }

}
