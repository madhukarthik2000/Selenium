package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.ElementNotSelectableException;

public class Readexcal {
	public static void Read() throws Throwable {
		File f = new File("C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Maven_Project\\Excel\\Mavenproject.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(f1);
		Sheet sheetAt = b.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String scv = cell.getStringCellValue();
			System.out.println(scv);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double ncv = cell.getNumericCellValue();
			int val = (int) ncv;
			System.out.println(val);

		}
	}

	public static void Multiple_Read() throws Throwable {
		File f = new File("C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Maven_Project\\Excel\\Mavenproject.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook b = new XSSFWorkbook(f1);
		Sheet sheetAt = b.getSheetAt(0);
		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
			Row row = sheetAt.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {

					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				} else if (cellType.equals(CellType.NUMERIC)) {
					double ncv1 = cell.getNumericCellValue();
					int va = (int) ncv1;
					System.out.println(va);

				}

			}

		}

	}

	public static void main(String[] args) throws Throwable {
		Read();
		Multiple_Read();
	}
}
