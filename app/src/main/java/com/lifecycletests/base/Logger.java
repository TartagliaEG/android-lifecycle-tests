package com.lifecycletests.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/**
 * Created by erik on 25/02/17.
 * <p>
 * The application logger.
 */
public class Logger {
  // Logger pattern:
  // <TIMESTAMP> - <LABEL> <BEF/AFT SUPER> <METHOD>

  // Specify if the method will be logged before calling "super"
  private static final boolean LOG_BEFORE_SUPER = true;

  // Specify if the method will be logged after calling "super"
  private static final boolean LOG_AFTER_SUPER = true;


  // Every logged method enqueues a log message on the main loop, it is used to identify methods that
  // aren't synchronously executed.

  private static final boolean ENQUEUE_LOG_MESSAGE_BEFORE_SUPER = false;
  private static final boolean ENQUEUE_LOG_MESSAGE_AFTER_SUPER = false;

  // Specify the length of the label printed by the Logger.
  private static final int LOG_LABEL_LENGTH = 15;


  private static String indent = "";

  public static void logBeforeSuper(Object obj) {
    String method = Thread.currentThread().getStackTrace()[3].getMethodName();
    String name = toFixedSize(obj instanceof LogLabel ? ((LogLabel) obj).getLogLabel() : obj.getClass().getSimpleName());

    if (LOG_BEFORE_SUPER)
      System.out.println(System.currentTimeMillis() + "            - " + name + " >>> " + indent + method);

    if (ENQUEUE_LOG_MESSAGE_BEFORE_SUPER)
      dispatchMessageToMainThread(name + " >>> " + indent + method);

    indent = indent + "   ";
  }


  public static void logAfterSuper(Object obj) {
    String method = Thread.currentThread().getStackTrace()[3].getMethodName();
    indent = indent.substring(0, indent.length() - 3);
    String name = toFixedSize(obj instanceof LogLabel ? ((LogLabel) obj).getLogLabel() : obj.getClass().getSimpleName());

    if (LOG_AFTER_SUPER)
      System.out.println(System.currentTimeMillis() + "            - " + name + " <<< " + indent + method);

    if (ENQUEUE_LOG_MESSAGE_AFTER_SUPER)
      dispatchMessageToMainThread(name + " <<< " + indent + method);
  }

  private static void dispatchMessageToMainThread(final String message) {
    new Handler(Looper.getMainLooper()) {
      @Override public void handleMessage(Message msg) {
        System.out.println(System.currentTimeMillis() + " (ENQUEUED) - " + message);
      }
    }.obtainMessage().sendToTarget();
  }


  private static String toFixedSize(String name) {
    return (name + String.format("%" + LOG_LABEL_LENGTH + "s", "")).substring(0, LOG_LABEL_LENGTH);
  }


  /**
   * Implementers must specify the label to be logged.
   */
  public interface LogLabel {
    String getLogLabel();
  }
}
