package testDataReadingUtilities001;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {

	public String readingDataFromPropertyFile(String path001, String key001) throws IOException {

		File file001 = new File(path001);
		FileInputStream fis001 = new FileInputStream(file001);

		Properties prop001 = new Properties();
		prop001.load(fis001);

		String keyVal001 = (String) prop001.get(key001);

		return (keyVal001);
	}

	public String readingOnePerticularCellDataFromExcel(String path001, String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException {
		File file001 = new File(path001);
		FileInputStream fis001 = new FileInputStream(file001);
		Workbook wb001 = WorkbookFactory.create(fis001);

		Sheet sheet001 = wb001.getSheet(sheetName);
		String celldata = sheet001.getRow(rowNo).getCell(cellNo).toString();
		return celldata;

	}

	public String[] readingOnePerticularRowDataFromExcel(String path, String sheetName, int rowNum)
			throws EncryptedDocumentException, IOException {

		File file001 = new File(path);
		FileInputStream fis = new FileInputStream(file001);
		Workbook wb001 = WorkbookFactory.create(fis);
		Sheet sheet001 = wb001.getSheet(sheetName);

		int colNum = sheet001.getRow(0).getPhysicalNumberOfCells();
		String rowArray[] = new String[colNum];

		for (int i = 0; i < colNum; i++) {

			String val = sheet001.getRow(rowNum).getCell(i).toString();
			rowArray[i] = val;
		}

		return rowArray;
	}
	
	public String[] readingOnePerticularColumnDataFromExcel(String path, String sheetName, int colmNum) throws EncryptedDocumentException, IOException {
		File file001 = new File(path);
		FileInputStream fis = new FileInputStream(file001);
		Workbook wb001 = WorkbookFactory.create(fis);
		Sheet sheet001 = wb001.getSheet(sheetName);
		
		int rowNum=sheet001.getPhysicalNumberOfRows();
		String colmArray[]=new String[rowNum-1];
		
		for(int i=1;i<rowNum;i++) {
			String val=sheet001.getRow(i).getCell(colmNum).toString();
			colmArray[i-1]=val;
		}
		return colmArray;
	}

	public String[][] readingRowAndColumnDataFromExcelFile(String path, String sheetName)
			throws EncryptedDocumentException, IOException {

		File file001 = new File(path);
		FileInputStream fis = new FileInputStream(file001);
		Workbook wb001 = WorkbookFactory.create(fis);
		Sheet sheet001 = wb001.getSheet(sheetName);

		int rowNum = sheet001.getPhysicalNumberOfRows();
		int colNum = sheet001.getRow(0).getPhysicalNumberOfCells();

		String mulDataArray[][] = new String[rowNum - 1][colNum];

		for (int i = 1; i < rowNum; i++) {

			for (int j = 0; j < colNum; j++) {
				String data = sheet001.getRow(i).getCell(j).toString();
				mulDataArray[i - 1][j] = data;
			}
		}
		return mulDataArray;

	}
}
