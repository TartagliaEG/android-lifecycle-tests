package com.lifecycletests.base.android;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.view.Menu;
import android.view.MenuItem;

import com.lifecycletests.base.Logger;

public abstract class LoggerActivity extends Activity implements Logger.LogLabel {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    Logger.logBeforeSuper(this);
    super.onCreate(savedInstanceState);
    Logger.logAfterSuper(this);
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    Logger.logBeforeSuper(this);
    super.onActivityResult(requestCode, resultCode, data);
    Logger.logAfterSuper(this);
  }

  @Override
  public void onAttachFragment(Fragment fragment) {
    Logger.logBeforeSuper(this);
    super.onAttachFragment(fragment);
    Logger.logAfterSuper(this);
  }

  @Override
  public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    Logger.logBeforeSuper(this);
    super.onCreate(savedInstanceState, persistentState);
    Logger.logAfterSuper(this);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    Logger.logBeforeSuper(this);
    boolean b = super.onCreateOptionsMenu(menu);
    Logger.logAfterSuper(this);
    return b;
  }

  @Override
  protected void onDestroy() {
    Logger.logBeforeSuper(this);
    super.onDestroy();
    Logger.logAfterSuper(this);
  }

  @Override public void startActivityForResult(Intent intent, int requestCode) {
    Logger.logBeforeSuper(this);
    super.startActivityForResult(intent, requestCode);
    Logger.logAfterSuper(this);
  }

  @Override public void startActivity(Intent intent) {
    Logger.logBeforeSuper(this);
    super.startActivity(intent);
    Logger.logAfterSuper(this);
  }

  @Override
  protected void onNewIntent(Intent intent) {
    Logger.logBeforeSuper(this);
    super.onNewIntent(intent);
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
  public void onOptionsMenuClosed(Menu menu) {
    Logger.logBeforeSuper(this);
    super.onOptionsMenuClosed(menu);
    Logger.logAfterSuper(this);
  }

  @Override
  protected void onPause() {
    Logger.logBeforeSuper(this);
    super.onPause();
    Logger.logAfterSuper(this);
  }

  @Override
  protected void onPostCreate(Bundle savedInstanceState) {
    Logger.logBeforeSuper(this);
    super.onPostCreate(savedInstanceState);
    Logger.logAfterSuper(this);
  }

  @Override
  public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    Logger.logBeforeSuper(this);
    super.onPostCreate(savedInstanceState, persistentState);
    Logger.logAfterSuper(this);
  }

  @Override
  protected void onPostResume() {
    Logger.logBeforeSuper(this);
    super.onPostResume();
    Logger.logAfterSuper(this);
  }

  @Override
  public boolean onPrepareOptionsMenu(Menu menu) {
    Logger.logBeforeSuper(this);
    boolean b = super.onPrepareOptionsMenu(menu);
    Logger.logAfterSuper(this);
    return b;
  }

  @Override
  public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    Logger.logBeforeSuper(this);
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    Logger.logAfterSuper(this);
  }

  @Override
  protected void onRestart() {
    Logger.logBeforeSuper(this);
    super.onRestart();
    Logger.logAfterSuper(this);
  }

  @Override
  protected void onRestoreInstanceState(Bundle savedInstanceState) {
    Logger.logBeforeSuper(this);
    super.onRestoreInstanceState(savedInstanceState);
    Logger.logAfterSuper(this);
  }

  @Override
  protected void onResume() {
    Logger.logBeforeSuper(this);
    super.onResume();
    Logger.logAfterSuper(this);
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    Logger.logBeforeSuper(this);
    super.onSaveInstanceState(outState);
    Logger.logAfterSuper(this);
  }

  @Override
  public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
    Logger.logBeforeSuper(this);
    super.onSaveInstanceState(outState, outPersistentState);
    Logger.logAfterSuper(this);
  }

  @Override
  protected void onStart() {
    Logger.logBeforeSuper(this);
    super.onStart();
    Logger.logAfterSuper(this);
  }

  @Override
  protected void onStop() {
    Logger.logBeforeSuper(this);
    super.onStop();
    Logger.logAfterSuper(this);
  }

}
