package com.lifecycletests.base.loggers;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.lifecycletests.utils.Utils;


public class LoggerSupportActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    Utils.logBeforeSupper(this);
    super.onCreate(savedInstanceState);
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    Utils.logBeforeSupper(this);
    super.onActivityResult(requestCode, resultCode, data);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onAttachFragment(Fragment fragment) {
    Utils.logBeforeSupper(this);
    super.onAttachFragment(fragment);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    Utils.logBeforeSupper(this);
    super.onCreate(savedInstanceState, persistentState);
    Utils.logAfterSuper(this);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    Utils.logBeforeSupper(this);
    boolean b = super.onCreateOptionsMenu(menu);
    Utils.logAfterSuper(this);
    return b;
  }

  @Override
  protected void onDestroy() {
    Utils.logBeforeSupper(this);
    super.onDestroy();
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onNewIntent(Intent intent) {
    Utils.logBeforeSupper(this);
    super.onNewIntent(intent);
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
  public void onOptionsMenuClosed(Menu menu) {
    Utils.logBeforeSupper(this);
    super.onOptionsMenuClosed(menu);
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onPause() {
    Utils.logBeforeSupper(this);
    super.onPause();
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onPostCreate(Bundle savedInstanceState) {
    Utils.logBeforeSupper(this);
    super.onPostCreate(savedInstanceState);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    Utils.logBeforeSupper(this);
    super.onPostCreate(savedInstanceState, persistentState);
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onPostResume() {
    Utils.logBeforeSupper(this);
    super.onPostResume();
    Utils.logAfterSuper(this);
  }

  @Override
  public boolean onPrepareOptionsMenu(Menu menu) {
    Utils.logBeforeSupper(this);
    boolean b = super.onPrepareOptionsMenu(menu);
    Utils.logAfterSuper(this);
    return b;
  }

  @Override
  public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    Utils.logBeforeSupper(this);
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onRestart() {
    Utils.logBeforeSupper(this);
    super.onRestart();
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onRestoreInstanceState(Bundle savedInstanceState) {
    Utils.logBeforeSupper(this);
    super.onRestoreInstanceState(savedInstanceState);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
    Utils.logBeforeSupper(this);
    super.onRestoreInstanceState(savedInstanceState, persistentState);
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onResume() {
    Utils.logBeforeSupper(this);
    super.onResume();
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    Utils.logBeforeSupper(this);
    super.onSaveInstanceState(outState);
    Utils.logAfterSuper(this);
  }

  @Override
  public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
    Utils.logBeforeSupper(this);
    super.onSaveInstanceState(outState, outPersistentState);
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onStart() {
    Utils.logBeforeSupper(this);
    super.onStart();
    Utils.logAfterSuper(this);
  }

  @Override
  protected void onStop() {
    Utils.logBeforeSupper(this);
    super.onStop();
    Utils.logAfterSuper(this);
  }

}
