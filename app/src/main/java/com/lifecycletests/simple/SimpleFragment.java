package com.lifecycletests.simple;

import android.os.Bundle;

import com.lifecycletests.base.loggers.LoggerFragment;


public class SimpleFragment extends LoggerFragment {
  @Override public void onCreate(Bundle savedInstanceState) {
    setHasOptionsMenu(true);
    super.onCreate(savedInstanceState);
  }
}
