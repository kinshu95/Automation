package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("./testdata/testdataspecification.xlsx");
		Workbook workBook = WorkbookFactory.create(file);
		Sheet sheet = workBook.getSheet("candidateData");
		Row row=sheet.getRow(2);
		Cell cell=row.getCell(0);
		String candidateName = cell.getStringCellValue();
		System.out.println("Candidate Name : "+candidateName);
		workBook.close();
		}

}
