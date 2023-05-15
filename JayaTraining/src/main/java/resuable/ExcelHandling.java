package resuable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelHandling {

    public static String handleExcelSheet(String sheetName, int rowIndex, int columnIndex) throws FileNotFoundException {

        String path =System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(new File(path+"/src/main/resources/datasheet/JayaData.xlsx"));

        String cellValue = null;
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet =workbook.getSheet(sheetName);
            cellValue=   sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();

        } catch (IOException e) {

            throw new RuntimeException(e);
        }

        return cellValue;

    }
}
