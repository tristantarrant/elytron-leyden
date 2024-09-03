package com.redhat.leyden;

import org.wildfly.security.password.WildFlyElytronPasswordProvider;

public class Main {
   public static void main(String[] args) {
      System.out.println(WildFlyElytronPasswordProvider.getInstance().getName());
   }
}