package com.rumpel.common.excel.dao;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public interface WriteExcelDAO {

    Sheet createSheet(String sheetName);
    Row createRow (int i);
    Cell createCell (int i);

}
