package com.rumpel.common.excel.dao;


import com.rumpel.common.excel.util.WriteExcelUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class WriteExcelDAOImpl implements WriteExcelDAO {

    Sheet sheet = null;
    Row row = null;
    Cell cell = null;

    public Sheet createSheet(String sheetName) {
        sheet = WriteExcelUtil.createExcelDocument().createSheet(sheetName);
        return sheet;
    }

    public Row createRow(int i) {
        row = sheet.createRow(i);
        return row;
    }

    public Cell createCell(int i) {
        cell = row.createCell(i);
        return null;
    }

}
