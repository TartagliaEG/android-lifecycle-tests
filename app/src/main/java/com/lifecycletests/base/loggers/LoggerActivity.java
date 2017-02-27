package com.lifecycletests.base.loggers;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.view.Menu;
import android.view.MenuItem;

import com.lifecycletests.utils.Utils;

public class LoggerActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    Utils.logBeforeSuper(this);
    super.onCreate(savedInstanceState);
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    Utils.logBeforeSuper(this);
    super.onActivityResult(requestCode, resultCode, data);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onAttachFragment(Fragment fragment) {
    Utils.logBeforeSuper(this);
    super.onAttachFragment(fragment);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    Utils.logBeforeSuper(this);
    super.onCreate(savedInstanceState, persistentState);
    Utils.logAfterSuper(this);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    Utils.logBeforeSuper(this);
    boolean b = super.onCreateOptionsMenu(menu);
    Utils.logAfterSuper(this);
    return b;
  }

  @Override
  protected void onDestroy() {
    Utils.logBeforeSuper(this);
    super.onDestroy();
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onNewIntent(Intent intent) {
    Utils.logBeforeSuper(this);
    super.onNewIntent(intent);
    Utils.logAfterSuper(this);
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    Utils.logBeforeSuper(this);
    boolean b = super.onOptionsItemSelected(item);
    Utils.logAfterSuper(this);
    return b;
  }

  @Override
  public void onOptionsMenuClosed(Menu menu) {
    Utils.logBeforeSuper(this);
    super.onOptionsMenuClosed(menu);
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onPause() {
    Utils.logBeforeSuper(this);
    super.onPause();
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onPostCreate(Bundle savedInstanceState) {
    Utils.logBeforeSuper(this);
    super.onPostCreate(savedInstanceState);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    Utils.logBeforeSuper(this);
    super.onPostCreate(savedInstanceState, persistentState);
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onPostResume() {
    Utils.logBeforeSuper(this);
    super.onPostResume();
    Utils.logAfterSuper(this);
  }

  @Override
  public boolean onPrepareOptionsMenu(Menu menu) {
    Utils.logBeforeSuper(this);
    boolean b = super.onPrepareOptionsMenu(menu);
    Utils.logAfterSuper(this);
    return b;
  }

  @Override
  public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    Utils.logBeforeSuper(this);
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onRestart() {
    Utils.logBeforeSuper(this);
    super.onRestart();
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onRestoreInstanceState(Bundle savedInstanceState) {
    Utils.logBeforeSuper(this);
    super.onRestoreInstanceState(savedInstanceState);
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onResume() {
    Utils.logBeforeSuper(this);
    super.onResume();
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    Utils.logBeforeSuper(this);
    super.onSaveInstanceState(outState);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
    Utils.logBeforeSuper(this);
    super.onSaveInstanceState(outState, outPersistentState);
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onStart() {
    Utils.logBeforeSuper(this);
    super.onStart();
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onStop() {
    Utils.logBeforeSuper(this);
    super.onStop();
    Utils.logAfterSuper(this);
  }

}
