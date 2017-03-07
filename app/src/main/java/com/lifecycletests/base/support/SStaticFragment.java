package com.lifecycletests.base.support;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lifecycletests.R;

public class SStaticFragment extends SLoggerFragment {
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    setHasOptionsMenu(true);
    return inflater.inflate(R.layout.fragment_layout, container, false);
  }

  @Override
  public String getLogLabel() {
    return "[S][F] static";
  }
}
