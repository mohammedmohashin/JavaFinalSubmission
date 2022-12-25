package javaFinal;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Final_Q_Three_Exel_Read {

    /*
   Use Reader.java to read an excel file with multiple column and row of
   data and output the result in the console using loop.
   */
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\tezir\\Turgut.xlsx";

        FileInputStream myFile = new FileInputStream(path);

        XSSFWorkbook myWorkbook = new XSSFWorkbook(myFile);
        XSSFSheet mySheet = myWorkbook.getSheet("Sheet1");

        int row = mySheet.getLastRowNum() + 1;
        int column = mySheet.getRow(0).getLastCellNum();

        for (int a = 0; a < row; a++){
            XSSFRow myRow = mySheet.getRow(a);

            for (int b = 0; b < column; b++) {
                String value = myRow.getCell(b).toString();

                System.out.print(value + "\t\t");
            }
            System.out.println();
        }
    }
}
