package week1.day4;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class D4_003_JUnit_ReadExcel {
	static String ExcelTestDataFile = "C:\\SeleniumJAVATraining\\TestData\\ShoppingCartTestData.xls";
	static int xlNumOfRows;
	static int xlNumOfCols;

	static String DataFromXLInLocalArray[][];

	public static void main(String[] args) throws Exception {
		ReadXLTestData(ExcelTestDataFile);
	}

	// Helper Function to READ data from Excel

	public static void ReadXLTestData(String xlTestDataFile) throws Exception {

		File xlFile = new File(xlTestDataFile);

		FileInputStream testDataStream = new FileInputStream(xlTestDataFile);

		HSSFWorkbook xlWorkBook = new HSSFWorkbook(testDataStream);

		HSSFSheet xlSheet = xlWorkBook.getSheetAt(0);

		xlNumOfRows = xlSheet.getLastRowNum() + 1;
		xlNumOfCols = xlSheet.getRow(0).getLastCellNum();

		System.out.println("Total Number of Rows: " + xlNumOfRows);
		System.out.println("Total Number of Cols: " + xlNumOfCols);

		DataFromXLInLocalArray = new String[xlNumOfRows][xlNumOfCols];

		for (int i = 0; i < xlNumOfRows; i++) {

			HSSFRow row = xlSheet.getRow(i);
			for (int j = 0; j < xlNumOfCols; j++) {
				HSSFCell cell = row.getCell(j); // read values from each cell

				String value = cellToString(cell);

				DataFromXLInLocalArray[i][j] = value;
				System.out.println("Value read from XL: " + value);
			}
		}

	}

	public static String cellToString(HSSFCell cell) {
		// This function will convert an object of type excel cell to a string
		// value
		int type = cell.getCellType();
		Object result;
		switch (type) {
		case HSSFCell.CELL_TYPE_NUMERIC: // 0
			result = cell.getNumericCellValue();
			break;
		case HSSFCell.CELL_TYPE_STRING: // 1
			result = cell.getStringCellValue();
			break;
		case HSSFCell.CELL_TYPE_FORMULA: // 2
			throw new RuntimeException("We can't evaluate formulas in Java");
		case HSSFCell.CELL_TYPE_BLANK: // 3
			result = "-";
			break;
		case HSSFCell.CELL_TYPE_BOOLEAN: // 4
			result = cell.getBooleanCellValue();
			break;
		case HSSFCell.CELL_TYPE_ERROR: // 5
			throw new RuntimeException("This cell has an error");
		default:
			throw new RuntimeException("We don't support this cell type: " + type);
		}
		return result.toString();
	}

}
