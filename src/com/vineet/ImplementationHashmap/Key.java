package com.vineet.ImplementationHashmap;

public class Key {

	public int Key;

	public Key(int key) {
		this.Key = key;
	}

	@Override
	public int hashCode() {
		int result = Key % 5;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Key key1 = (Key) obj;
		return this.Key == key1.Key;

	}

}
