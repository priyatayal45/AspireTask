package Excels;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelread {

	public static void main(String args[]) throws IOException {
		Object[][] obj = read();
		for (int i = 1; i <= 3; i++) {
					URL url = new URL(obj[i][1].toString());
					HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
					con.connect();
					if(con.getResponseCode()==200)
					{
						System.out.println("Site is up");
					}
		}
	}

	public static Object[][] read() throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\manik\\eclipse-workspace\\Framework2\\src\\test\\resources\\TestData\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum() + 1;
		XSSFRow row = sheet.getRow(1);
		int colcount = row.getLastCellNum() + 1;
		Object[][] obj = new Object[rowcount][colcount];
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				try {
					obj[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
					// System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				} catch (Exception e) {
					e.getMessage();
				}
			}
		}
		return obj;

	}

}
