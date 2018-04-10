package com.rumpel.common.excel.util;


import com.rumpel.common.excel.path.ExcelPath;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelUtil {

    private static Workbook book = new HSSFWorkbook();
    private static FileOutputStream outputFile = null;

    public static Workbook createExcelDocument(){
        return book;
    }

    public static Workbook writeAndCloseExcelDocument() throws IOException {
        outputFile = new FileOutputStream(ExcelPath._WRITE_FILE);
        book.write(outputFile);
        book.close();
        return book;
    }
}
