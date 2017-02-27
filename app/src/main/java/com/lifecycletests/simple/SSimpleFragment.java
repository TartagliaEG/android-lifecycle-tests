package com.lifecycletests.simple;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lifecycletests.CustomName;
import com.lifecycletests.R;
import com.lifecycletests.base.loggers.LoggerSupportFragment;


public class SSimpleFragment extends LoggerSupportFragment {
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    setHasOptionsMenu(true);
    super.onCreateView(inflater, container, savedInstanceState);
    View v = inflater.inflate(R.layout.fragment_layout, container, false);
    TextView txt = (TextView) v.findViewById(R.id.fragment_text);
    txt.setText(this instanceof CustomName ? ((CustomName) this).getCustomName() : getClass().getSimpleName());
    return v;
  }
}
