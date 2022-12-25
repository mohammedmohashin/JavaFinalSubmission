package javaFinal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Final_Q_Four_Exel_Write {

    /*
    Write three columns and four rows inside an excel file with any
    values/data of your choice using multi dimensional array.
     */
    public static void main(String[] args) throws IOException {

        XSSFWorkbook myWorkbook = new XSSFWorkbook();
        XSSFSheet mySheet = myWorkbook.createSheet("Data");
        Map<String, Object[]> data = new TreeMap<>();

        data.put("1", new Object[]{"Emp_ID", "F_Name", "L_Name"});
        data.put("2", new Object[]{"12255489", "Turgut", "Tezir"});
        data.put("3", new Object[]{"32658965", "Masud", "Uzzaman"});
        data.put("4", new Object[]{"32655689", "Forida", "Chowdhury"});
        data.put("5", new Object[]{"326514144", "Mohanned", "Mohshin"});

        Set<String> write = data.keySet();

        int tez = 0;

        for (String key:write){
            XSSFRow row = mySheet.createRow(tez++);

            Object[] objectsArr = data.get(key);

            int celNum = 0;

            for (Object obj : objectsArr){

                Cell cell = row.createCell(celNum++);
                cell.setCellValue((String) (obj));
            }
        }
        FileOutputStream out = new FileOutputStream("C:\\Users\\tezir\\TurTex.xlsx");

        myWorkbook.write(out);
        out.close();
    }

}
