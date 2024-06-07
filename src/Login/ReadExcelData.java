package Login;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelData {
    public static void main(String[] args) throws IOException {

        String excelFilePath=".\\src\\myData\\countries.xlsx";
        FileInputStream inputstream=new FileInputStream(excelFilePath);

        XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
        XSSFSheet sheet=workbook.getSheetAt(0);

        //using for loop

        int rows=sheet.getLastRowNum();
        int cols=sheet.getRow(0).getLastCellNum();

        for(int r=0;r<rows;r++) {


            XSSFRow row=sheet.getRow(r);

            for(int c=0;c<cols;c++) {
                XSSFCell cell=row.getCell(c);
                switch(cell.getCellType()) {
                    case STRING:System.out.print(cell.getStringCellValue()); break;
                    case NUMERIC:System.out.print(cell.getNumericCellValue()); break;
                    case BOOLEAN:System.out.print(cell.getBooleanCellValue()); break;
                }
                System.out.print(" | ");

            }
            System.out.println();

        }

    }
}
