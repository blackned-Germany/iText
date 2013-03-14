package com.lowagie.pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class WritePdfTableTest {

	
	@Test
	public void writeFile() throws IOException, DocumentException {
		Document document = new Document();		
		File tempFile = File.createTempFile("pdffile", ".pdf");
		PdfWriter.getInstance(document, new FileOutputStream(tempFile));
		document.open();
		Paragraph para = new Paragraph("Test");
		document.add(para);
		PdfPTable table = new PdfPTable(2);
		document.add(table);
		document.close();
		tempFile.delete();
	}
}
