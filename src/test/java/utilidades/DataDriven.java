package utilidades;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataDriven {

	public static ArrayList<String> getData(String nombreCP) throws IOException  {
	
		ArrayList<String> a = new ArrayList<String>();
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Carlos\\eclipse-workspace\\POM1_firstStep\\src\\test\\resources\\data\\data.xlsx");

		
		
		XSSFWorkbook excel = new XSSFWorkbook(file);
		
		int sheets = excel.getNumberOfSheets();
		System.out.println("Cantidad de hojas: "+ sheets);
		
		for(int i=0; i < sheets; i++) {
			if(excel.getSheetName(i).equalsIgnoreCase("data")) {
				XSSFSheet hojaExcel = excel.getSheetAt(i);
				
				Iterator<Row> filas = hojaExcel.iterator();
				Row fila = filas.next();
				
				Iterator<Cell> celdas = fila.cellIterator();
				
				int k=0;
				int columna = 0;
				
				while(celdas.hasNext()) {
					Cell celdaSeleccionada = celdas.next();
					
					if(celdaSeleccionada.getStringCellValue().equalsIgnoreCase("CasosDePrueba")) {
					
						columna = k;
					}
					k++;
				}
				
				
				while(filas.hasNext()) {
					Row r = filas.next();
					
					if(r.getCell(columna).getStringCellValue().equalsIgnoreCase(nombreCP)) {
						
						Iterator<Cell> cv = r.cellIterator();
						
						while(cv.hasNext()) {
							Cell c = cv.next();
							
							if (c.getCellTypeEnum()== CellType.STRING) {
								a.add(c.getStringCellValue());
								
							}else {
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}
					}
		
				}
			}
		}
		return a;
	}
}