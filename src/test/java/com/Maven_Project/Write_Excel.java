package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
	public static void Data() throws IOException  {
        File f =new File("C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Maven_Project\\Excel\\Mavenproject.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wbs =new XSSFWorkbook(fis);
		wbs.createSheet("karthikm").createRow(0).createCell(0).setCellValue("username");
		wbs.getSheet("karthikm").getRow(0).createCell(1).setCellValue("password");
		wbs.getSheet("karthikm").createRow(1).createCell(0).setCellValue("java");
		wbs.getSheet("karthikm").getRow(1).createCell(1).setCellValue("123654");
		wbs.getSheet("karthikm").createRow(2).createCell(0).setCellValue("selenium");
		wbs.getSheet("karthikm").getRow(2).createCell(1).setCellValue("98745");
		wbs.getSheet("karthikm").createRow(3).createCell(0).setCellValue("Testing");
		wbs.getSheet("karthikm").getRow(3).createCell(1).setCellValue("54321");
		FileOutputStream fos =new FileOutputStream(f);
		wbs.write(fos);
		System.out.println("Write data sucessfully");
	}
	public static void main(String[] args) throws IOException {
		Data();
	}

}
