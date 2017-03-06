package com.lifecycletests.base.android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lifecycletests.R;

/**
 * Created by erik on 06/03/17.
 *
 * This fragment is supposed to be put directly on the layout file.
 */
public class AStaticFragment extends LoggerFragment {

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    setHasOptionsMenu(true);
    return inflater.inflate(R.layout.fragment_layout, container, false);
  }

  @Override
  public String getLogLabel() {
    return AStaticFragment.class.getSimpleName();
  }
}
