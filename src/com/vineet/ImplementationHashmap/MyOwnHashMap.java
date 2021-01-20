package com.vineet.ImplementationHashmap;

public class MyOwnHashMap {

	Entry[] hashMap = new Entry[5];

	public void put(Key key, String value) {

		int index = getIndex(key);
		if (hashMap[index] == null) {
			Entry node = new Entry(key, value);
			hashMap[index] = node;
		} else {
			Entry nodeSet = hashMap[index];

			while (nodeSet != null) {
				if (nodeSet.key.equals(key)) {
					nodeSet.value = value;
					return;
				} else if (nodeSet.next == null) {
					Entry node = new Entry(key, value);
					nodeSet.next = node;
					return;
				} else {
					nodeSet = nodeSet.next;
				}
			}
		}
	}

	public int getIndex(Key key) {
		return key.hashCode();
	}

	public String get(Key key) {
		int getIndex = getIndex(key);

		if (hashMap[getIndex] == null) {
			return null;
		} else {
			Entry nodeSet = hashMap[getIndex];
			while (nodeSet != null) {
				if (nodeSet.key.equals(key)) {
					return nodeSet.value;
				} else {
					nodeSet = nodeSet.next;
				}
			}
		}
		return null;
	}
}
