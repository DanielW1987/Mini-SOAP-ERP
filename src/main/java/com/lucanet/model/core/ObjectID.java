package com.lucanet.model.core;

import java.util.concurrent.atomic.AtomicLong;

public class ObjectID {

  private static AtomicLong nextId = new AtomicLong(1);

  public static long nextId() {
    return nextId.getAndIncrement();
  }

}