class MyHashMap {

  int [] map;
  /** Initialize your data structure here. */
  public MyHashMap() {
      map = new int[Integer.MAX_VALUE];
      Arrays.fill(map, -1);
  }
  
  /** value will always be non-negative. */
  public void put(int key, int value) {
      map[key] = value;
  }
  
  /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
  public int get(int key) {
      return map[key];
  }
  
  /** Removes the mapping of the specified value key if this map contains a mapping for the key */
  public void remove(int key) {
      map[key]=-1;
  }
}
