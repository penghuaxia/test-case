package com.xia.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRULinkedHashMap<k, v> extends LinkedHashMap<k, v> {

  private static final int MAX_ENTRIES = 5;

  public LRULinkedHashMap(){
    super(16,0.75f,true);
  }
  protected boolean removeEldestEntry(Map.Entry eldest) {
    return size() > MAX_ENTRIES;
  }
}
