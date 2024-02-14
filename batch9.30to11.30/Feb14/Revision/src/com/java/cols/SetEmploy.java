package com.java.cols;

import java.util.HashSet;
import java.util.Set;

public class SetEmploy {

	public static void main(String[] args) {
		Set employs = new HashSet();
		employs.add(new Employ(1, "Ravi Teja", 88423));
		employs.add(new Employ(2, "Tejas", 90033));
		employs.add(new Employ(3, "Srujan", 90323));
		employs.add(new Employ(4, "Manisha", 91144));
		employs.add(new Employ(5, "Shivani", 90314));
		employs.add(new Employ(1, "Ravi Teja", 88423));
		employs.add(new Employ(2, "Tejas", 90033));
		employs.add(new Employ(3, "Srujan", 90323));
		employs.add(new Employ(4, "Manisha", 91144));
		employs.add(new Employ(5, "Shivani", 90314));
		employs.add(new Employ(1, "Ravi Teja", 88423));
		employs.add(new Employ(2, "Tejas", 90033));
		employs.add(new Employ(3, "Srujan", 90323));
		employs.add(new Employ(4, "Manisha", 91144));
		employs.add(new Employ(5, "Shivani", 90314));
		employs.add(new Employ(1, "Ravi Teja", 88423));
		employs.add(new Employ(2, "Tejas", 90033));
		employs.add(new Employ(3, "Srujan", 90323));
		employs.add(new Employ(4, "Manisha", 91144));
		employs.add(new Employ(5, "Shivani", 90314));
		System.out.println("Employ List  ");
		for (Object object : employs) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
	}
}
