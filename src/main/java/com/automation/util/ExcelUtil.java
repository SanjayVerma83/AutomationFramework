package com.automation.util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static String getCellData(
			String sheetName,
			int rowNum,
			int colNum) {

		String value = "";

		try {

			FileInputStream fis =
					new FileInputStream(
					"src/test/resources/TestData.xlsx");

			XSSFWorkbook workbook =
					new XSSFWorkbook(fis);

			XSSFSheet sheet =
					workbook.getSheet(sheetName);

			Row row =
					sheet.getRow(rowNum);

			Cell cell =
					row.getCell(colNum);

			value =
					cell.toString();

			workbook.close();

		} catch (Exception e) {

			e.printStackTrace();
		}

		return value;
	}
}