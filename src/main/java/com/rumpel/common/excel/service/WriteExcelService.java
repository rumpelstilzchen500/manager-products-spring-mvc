package com.rumpel.common.excel.service;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.Map;

public interface WriteExcelService {

    Sheet createSheet();
    Map<Row, Cell> createRowCell(int i);
    String createCellValue(Map<Row, Cell> mapRowCell);
}
