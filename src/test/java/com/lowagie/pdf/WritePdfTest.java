package com.lowagie.pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class WritePdfTest {


	@Test
	public void writeFile() throws IOException, DocumentException {
		File file = File.createTempFile("testfile", ".pdf");
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(file));
		document.open();
		for(int i = 0; i < 100; i++) {
		document.add(new Paragraph("Test"));
		}
		document.close();
		Assert.assertTrue(file.length() > 0);
		file.delete();
	}
	
	
}
