package com.jam.horrorjam.utils;

import com.ovl.utils.OverloadRandom;

import java.util.ArrayList;

public class Arrays {
	public static <T> T[] shuffle(T array[]){
		int counter = array.length;

		while (counter > 0) {
			int index = OverloadRandom.next(counter);

			counter--;

			T temp = array[counter];
			array[counter] = array[index];
			array[index] = temp;
		}

		return array;
	}
}
