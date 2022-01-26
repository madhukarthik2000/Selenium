package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	public static void Read() throws Throwable {
		File f = new File("C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Maven_Project\\Excel\\Mavenproject.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(f1);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(3);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String scv = cell.getStringCellValue();
			System.out.println(scv);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double ncv = cell.getNumericCellValue();
			int value = (int) ncv;
			System.out.println(value);

		}
	}

	public static void main(String[] args) throws Throwable {
		Read();

	}

}
