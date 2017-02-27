package com.lifecycletests.simple;

import android.os.Bundle;

import com.lifecycletests.base.loggers.LoggerSupportFragment;


public class SSimpleFragment extends LoggerSupportFragment {
  @Override public void onCreate(Bundle savedInstanceState) {
    setHasOptionsMenu(true);
    super.onCreate(savedInstanceState);
  }
}
