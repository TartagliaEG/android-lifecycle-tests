package com.lifecycletests.base.loggers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lifecycletests.CustomName;
import com.lifecycletests.R;
import com.lifecycletests.utils.Utils;


public class LoggerSupportFragment extends Fragment {
  @Override
  public void onActivityCreated(Bundle savedInstanceState) {
    Utils.logBeforeSupper(this);
    super.onActivityCreated(savedInstanceState);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onActivityResult(int requestCode, int resultCode, Intent data) {
    Utils.logBeforeSupper(this);
    super.onActivityResult(requestCode, resultCode, data);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onAttach(Context context) {
    Utils.logBeforeSupper(this);
    super.onAttach(context);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onAttachFragment(Fragment childFragment) {
    Utils.logBeforeSupper(this);
    super.onAttachFragment(childFragment);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    Utils.logBeforeSupper(this);
    super.onCreate(savedInstanceState);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
    Utils.logBeforeSupper(this);
    super.onCreateOptionsMenu(menu, inflater);
    Utils.logAfterSuper(this);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    Utils.logBeforeSupper(this);
    super.onCreateView(inflater, container, savedInstanceState);
    Utils.logAfterSuper(this);
    View v = inflater.inflate(R.layout.fragment_layout, container, false);
    TextView txt = (TextView) v.findViewById(R.id.fragment_text);
    txt.setText(this instanceof CustomName ? ((CustomName) this).getCustomName() : getClass().getSimpleName());
    return v;
  }

  @Override
  public void onDestroy() {
    Utils.logBeforeSupper(this);
    super.onDestroy();
    Utils.logAfterSuper(this);
  }

  @Override
  public void onDestroyOptionsMenu() {
    Utils.logBeforeSupper(this);
    super.onDestroyOptionsMenu();
    Utils.logAfterSuper(this);
  }

  @Override
  public void onDestroyView() {
    Utils.logBeforeSupper(this);
    super.onDestroyView();
    Utils.logAfterSuper(this);
  }

  @Override
  public void onDetach() {
    Utils.logBeforeSupper(this);
    super.onDetach();
    Utils.logAfterSuper(this);
  }

  @Override
  public void onLowMemory() {
    Utils.logBeforeSupper(this);
    super.onLowMemory();
    Utils.logAfterSuper(this);
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    Utils.logBeforeSupper(this);
    boolean b = super.onOptionsItemSelected(item);
    Utils.logAfterSuper(this);
    return b;
  }

  @Override
  public void onPause() {
    Utils.logBeforeSupper(this);
    super.onPause();
    Utils.logAfterSuper(this);
  }

  @Override
  public void onPrepareOptionsMenu(Menu menu) {
    Utils.logBeforeSupper(this);
    super.onPrepareOptionsMenu(menu);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    Utils.logBeforeSupper(this);
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onResume() {
    Utils.logBeforeSupper(this);
    super.onResume();
    Utils.logAfterSuper(this);
  }

  @Override
  public void onSaveInstanceState(Bundle outState) {
    Utils.logBeforeSupper(this);
    super.onSaveInstanceState(outState);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onStart() {
    Utils.logBeforeSupper(this);
    super.onStart();
    Utils.logAfterSuper(this);
  }

  @Override
  public void onStop() {
    Utils.logBeforeSupper(this);
    super.onStop();
    Utils.logAfterSuper(this);
  }

  @Override
  public void onViewCreated(View view, Bundle savedInstanceState) {
    Utils.logBeforeSupper(this);
    super.onViewCreated(view, savedInstanceState);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onViewStateRestored(Bundle savedInstanceState) {
    Utils.logBeforeSupper(this);
    super.onViewStateRestored(savedInstanceState);
    Utils.logAfterSuper(this);
  }
}
