package com.bridgelabz.excel;

import java.io.File;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelDemo {
	public static void main(String[] args) {
		try {
			WritableWorkbook workbook = Workbook.createWorkbook(new File("ExcelDemo.xls"));
			System.out.println("file created Successfully");
			WritableSheet sheet = workbook.createSheet("sheet 1", 0);

			WritableCell cell = new Label(0, 0, "Milind");
			WritableCell cell1 = new Label(1, 0, "Bhatu");
			WritableCell cell2 = new Label(2, 0, "Patil");

			sheet.addCell(cell);
			sheet.addCell(cell1);
			sheet.addCell(cell2);

			workbook.write();

			workbook.close();

			Workbook readable = Workbook.getWorkbook(new File("ExcelDemo.xls"));

			Sheet sheet1 = readable.getSheet(0);
			System.out.println(sheet1.getCell(0, 0).getContents());
			System.out.println(sheet1.getCell(1, 0).getContents());
			System.out.println(sheet1.getCell(2, 0).getContents());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
