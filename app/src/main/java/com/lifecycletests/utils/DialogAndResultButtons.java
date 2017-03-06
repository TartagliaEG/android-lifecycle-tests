package com.lifecycletests.utils;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.view.View;

/**
 * Created by erik on 05/03/17.
 * ...
 */

public class DialogAndResultButtons {

  public DialogAndResultButtons configureResultActivity(final Activity activity, @IdRes int resultActivityId) {
    activity.findViewById(resultActivityId).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        activity.startActivityForResult(new Intent(activity, ResultActivity.class), Utils.REQUEST_CODE);
      }
    });
    return this;
  }

  public DialogAndResultButtons configureDialogActivity(final Activity activity, @IdRes int dialogActivityId) {
    activity.findViewById(dialogActivityId).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        activity.startActivityForResult(new Intent(activity, DialogActivity.class), Utils.REQUEST_CODE);
      }
    });
    return this;
  }

}
