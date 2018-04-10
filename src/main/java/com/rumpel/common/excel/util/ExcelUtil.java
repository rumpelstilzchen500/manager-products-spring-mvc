package com.rumpel.common.excel.util;


import com.rumpel.common.excel.path.ExcelPath;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtil {

    private static Workbook book;
    private static CellStyle dateStyle = null;
    private static HSSFWorkbook readExcelBook= null;
    private static FileOutputStream outputFile = null;


    static{
        book = new HSSFWorkbook();
        dateStyle = book.createCellStyle();
    }

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream(ExcelPath._READ_FILE);
            readExcelBook = new HSSFWorkbook(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static {
        try {
            outputFile = new FileOutputStream(ExcelPath._WRITE_FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void bookClose() throws IOException {
        book.write(outputFile);
        book.close();
    }
}
