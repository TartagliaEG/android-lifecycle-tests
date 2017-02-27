package com.lifecycletests.utils;

import com.lifecycletests.CustomName;

/**
 * Created by erik on 25/02/17.
 * ...
 */
public class Utils {
  public static final int REQUEST_CODE = 111;
  private static String indent = "";


  public static void logBeforeSuper(Object obj) {
    String method = Thread.currentThread().getStackTrace()[3].getMethodName();
    String name = obj instanceof CustomName ? ((CustomName) obj).getCustomName() : obj.getClass().getSimpleName();
    System.out.println(System.currentTimeMillis() + " - " + name + " >>> " + indent + method);
    indent = indent + "   ";
  }

  public static void logAfterSuper(Object obj) {
    String method = Thread.currentThread().getStackTrace()[3].getMethodName();
    indent = indent.substring(0, indent.length() - 3);
    String name = obj instanceof CustomName ? ((CustomName) obj).getCustomName() : obj.getClass().getSimpleName();
    System.out.println(System.currentTimeMillis() + " - " + name + " <<< " + indent + method);

  }
}
