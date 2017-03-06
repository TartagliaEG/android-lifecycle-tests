package com.lifecycletests.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.util.Log;

import com.lifecycletests.base.loggers.LogLabel;

/**
 * Created by erik on 25/02/17.
 * ...
 */
public class Utils {
  public static final int REQUEST_CODE = 111;
  private static String indent = "";

  public interface AfterSleep<T> {
    T run();
  }

  public @NonNull static <T> T sleep(int millis, AfterSleep<T> runnable) {
    try {
      Thread.sleep(millis);
      return runnable.run();
    } catch (InterruptedException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  public static void dispatchMessageToMainThread(final String message) {

    new Handler(Looper.getMainLooper()) {
      @Override public void handleMessage(Message msg) {
        Log.d(">>><<<", "handleMessage: " + message);
      }
    }.obtainMessage().sendToTarget();
  }

  public static void logBeforeSuper(Object obj) {
    String method = Thread.currentThread().getStackTrace()[3].getMethodName();
    String name = obj instanceof LogLabel ? ((LogLabel) obj).getLogLabel() : obj.getClass().getSimpleName();
    System.out.println(System.currentTimeMillis() + " - " + name + " >>> " + indent + method);
    indent = indent + "   ";
  }

  public static void logAfterSuper(Object obj) {
    String method = Thread.currentThread().getStackTrace()[3].getMethodName();
    indent = indent.substring(0, indent.length() - 3);
    String name = obj instanceof LogLabel ? ((LogLabel) obj).getLogLabel() : obj.getClass().getSimpleName();
    System.out.println(System.currentTimeMillis() + " - " + name + " <<< " + indent + method);
  }


}
