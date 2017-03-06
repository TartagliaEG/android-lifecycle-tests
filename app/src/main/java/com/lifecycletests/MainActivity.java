package com.lifecycletests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lifecycletests.base.ABaseActivity;
import com.lifecycletests.behaviors.dynamic_and_static_fragment.ABSingleFragment;


public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    final MainActivity that = this;
    setContentView(R.layout.activity_main);

    findViewById(R.id.btn_simple_flow_activity).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startActivity(ABaseActivity.newIntent(that, new ABSingleFragment()));
      }
    });

//    findViewById(R.id.btn_simple_flow_support_activity).setOnClickListener(new View.OnClickListener() {
//      @Override public void onClick(View v) {
//        startActivity(new Intent(MainActivity.this, SSimpleActivity.class));
//      }
//    });

//    findViewById(R.id.btn_retained_flow_activity).setOnClickListener(new View.OnClickListener() {
//      @Override public void onClick(View v) {
//        startActivity(new Intent(MainActivity.this, RetainedFlowActivity.class));
//      }
//    });
//
//    findViewById(R.id.btn_retained_flow_support_activity).setOnClickListener(new View.OnClickListener() {
//      @Override public void onClick(View v) {
//        startActivity(new Intent(MainActivity.this, SRetainedFlowActivity.class));
//      }
//    });
//
//    findViewById(R.id.btn_back_stack_flow_activity).setOnClickListener(new View.OnClickListener() {
//      @Override public void onClick(View v) {
//        startActivity(new Intent(MainActivity.this, BackStackFlowActivity.class));
//      }
//    });
//
//    findViewById(R.id.btn_back_stack_support_activity).setOnClickListener(new View.OnClickListener() {
//      @Override public void onClick(View v) {
//        startActivity(new Intent(MainActivity.this, SBackStackFlowActivity.class));
//      }
//    });


  }
}
