package by.zhdanovich.triangle.test;


import org.junit.Test;

import by.zhdanovich.triangle.reader.ReaderFile;

public class ReaderFileTest {	 
	@Test( expected = RuntimeException.class ) 
	public void readTextTest() throws RuntimeException {
		ReaderFile r = new ReaderFile();
		r.readeFile("data/text.txt", "Utf-8");
	}

}
