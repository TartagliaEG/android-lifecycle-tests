package com.lifecycletests.base.android;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.lifecycletests.base.Logger;


public abstract class ALoggerFragment extends Fragment implements Logger.LogLabel {

  @Override public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
    Logger.logBeforeSuper(this);
    super.onInflate(context, attrs, savedInstanceState);
    Logger.logAfterSuper(this);
  }

  @Override
  public void onActivityCreated(Bundle savedInstanceState) {
    Logger.logBeforeSuper(this);
    super.onActivityCreated(savedInstanceState);
    Logger.logAfterSuper(this);
  }

  @Override
  public void onActivityResult(int requestCode, int resultCode, Intent data) {
    Logger.logBeforeSuper(this);
    super.onActivityResult(requestCode, resultCode, data);
    Logger.logAfterSuper(this);
  }

  @Override
  public void onAttach(Context context) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
      Logger.logBeforeSuper(this);

    super.onAttach(context);

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
      Logger.logAfterSuper(this);
  }

  @Override public void onAttach(Activity activity) {
    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M)
      Logger.logBeforeSuper(this);

    super.onAttach(activity);

    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
      Logger.logAfterSuper(this);
    }
  }

  @Override
  public void onAttachFragment(Fragment childFragment) {
    Logger.logBeforeSuper(this);
    super.onAttachFragment(childFragment);
    Logger.logAfterSuper(this);
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    Logger.logBeforeSuper(this);
    super.onCreate(savedInstanceState);
    Logger.logAfterSuper(this);
  }

  @Override
  public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
    Logger.logBeforeSuper(this);
    super.onCreateOptionsMenu(menu, inflater);
    Logger.logAfterSuper(this);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    Logger.logBeforeSuper(this);
    View v = super.onCreateView(inflater, container, savedInstanceState);
    Logger.logAfterSuper(this);
    return v;
  }

  @Override
  public void onDestroy() {
    Logger.logBeforeSuper(this);
    super.onDestroy();
    Logger.logAfterSuper(this);
  }

  @Override
  public void onDestroyOptionsMenu() {
    Logger.logBeforeSuper(this);
    super.onDestroyOptionsMenu();
    Logger.logAfterSuper(this);
  }

  @Override
  public void onDestroyView() {
    Logger.logBeforeSuper(this);
    super.onDestroyView();
    Logger.logAfterSuper(this);
  }

  @Override
  public void onDetach() {
    Logger.logBeforeSuper(this);
    super.onDetach();
    Logger.logAfterSuper(this);
  }

  @Override
  public void onLowMemory() {
    Logger.logBeforeSuper(this);
    super.onLowMemory();
    Logger.logAfterSuper(this);
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    Logger.logBeforeSuper(this);
    boolean b = super.onOptionsItemSelected(item);
    Logger.logAfterSuper(this);
    return b;
  }

  @Override
  public void onPause() {
    Logger.logBeforeSuper(this);
    super.onPause();
    Logger.logAfterSuper(this);
  }

  @Override
  public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
    Logger.logBeforeSuper(this);
    super.onPictureInPictureModeChanged(isInPictureInPictureMode);
    Logger.logAfterSuper(this);
  }

  @Override
  public void onPrepareOptionsMenu(Menu menu) {
    Logger.logBeforeSuper(this);
    super.onPrepareOptionsMenu(menu);
    Logger.logAfterSuper(this);
  }

  @Override
  public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    Logger.logBeforeSuper(this);
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    Logger.logAfterSuper(this);
  }

  @Override
  public void onResume() {
    Logger.logBeforeSuper(this);
    super.onResume();
    Logger.logAfterSuper(this);
  }

  @Override
  public void onSaveInstanceState(Bundle outState) {
    Logger.logBeforeSuper(this);
    super.onSaveInstanceState(outState);
    Logger.logAfterSuper(this);
  }

  @Override
  public void onStart() {
    Logger.logBeforeSuper(this);
    super.onStart();
    Logger.logAfterSuper(this);
  }

  @Override
  public void onStop() {
    Logger.logBeforeSuper(this);
    super.onStop();
    Logger.logAfterSuper(this);
  }

  @Override
  public void onViewCreated(View view, Bundle savedInstanceState) {
    Logger.logBeforeSuper(this);
    super.onViewCreated(view, savedInstanceState);
    Logger.logAfterSuper(this);
  }

  @Override public void onViewStateRestored(Bundle savedInstanceState) {
    Logger.logBeforeSuper(this);
    super.onViewStateRestored(savedInstanceState);
    Logger.logAfterSuper(this);
  }
}
