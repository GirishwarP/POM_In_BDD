package com.YOU.util;

import java.util.Iterator;
import java.util.Set;

import com.YOU.Base.Base;

public class Utility extends Base {
	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 20;
	
	public static String getWindowID() {
		String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();

		while (iterator.hasNext()) {
			String childWindow = iterator.next();

			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				return childWindow;
			}
		}
		return parentWindow;
	}
}
