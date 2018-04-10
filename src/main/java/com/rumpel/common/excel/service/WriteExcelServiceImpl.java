package com.rumpel.common.excel.service;


import com.rumpel.common.excel.dao.WriteExcelDAOImpl;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class WriteExcelServiceImpl implements WriteExcelService{

    Map<Row, Cell> mapRowCell = null;

    @Autowired
    WriteExcelDAOImpl writeExcelDAO;

    public Sheet createSheet() {
        return writeExcelDAO.createSheet("Sheet Name");
    }

    public Map<Row, Cell> createRowCell(int i) {
        Map<Row, Cell> mapRowCell = new HashMap<Row, Cell>();
        mapRowCell.put(writeExcelDAO.createRow(i), writeExcelDAO.createCell(i));
        return mapRowCell;
    }

    public String createCellValue(Map<Row, Cell> mapRowCell) {
       return "mapRowCell";
    }
}
