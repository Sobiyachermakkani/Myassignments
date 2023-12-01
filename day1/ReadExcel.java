package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
		public static String[][] readExcelData(String filename) throws IOException{
			//open the workbook using filename
			XSSFWorkbook wb= new XSSFWorkbook("./data/RedHat.xlsx");
			//Go to the specific sheet
			XSSFSheet wsheet= wb.getSheetAt(0);
			//Go to the specific row
			XSSFRow row= wsheet.getRow(1); //Here we are directly going to the 1st data row ignoring the header row
			//Go to the specific column
			XSSFCell cell= row.getCell(0);
			String data=cell.getStringCellValue();
			//Print single data
			System.out.println("Single data is : "+data);
			//get row count
			 int rowCount=wsheet.getLastRowNum();
			 System.out.println("The row count is : "+rowCount);
			 
			 //get column count
			 
			 int columnCount=wsheet.getRow(0).getLastCellNum();
			 System.out.println("The columns count is : " +columnCount);
			 
			 //to get all the datas iterate through loop
			 String[][] data1=new String[rowCount][columnCount];
			 for(int i=1;i<=rowCount;i++) {
				 XSSFRow eachRow= wsheet.getRow(i);
				 for(int j=0;j<columnCount;j++) {
					 String allDatas=eachRow.getCell(j).getStringCellValue();
					 System.out.println(allDatas);
					 data1[i-1][j]=allDatas;
				 }
			 }wb.close();
			 return data1;
			
			
			
			
			
		}
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			//OPen the workbook  using filename and path
//			XSSFWorkbook wb = new XSSFWorkbook("./data/Sheet1.xlsx");
//			//Go to the specific sheet (by sheet name/index)
//			XSSFSheet wSheet = wb.getSheetAt(0);
//			//Go to the specific row (by index)
//			XSSFRow row = wSheet.getRow(2);
//			// Go to the specific cell(by index)
//			XSSFCell cell = row.getCell(0);
//			//Read the content
//			String cellData = cell.getStringCellValue();
//			//print the data
//			System.out.println("Single data:"+cellData);
//			//get rowCount
//			int rowCount = wSheet.getLastRowNum();
//			System.out.println("rowCount: "+rowCount);
//			//get columnCount
//			short columnCount = wSheet.getRow(0).getLastCellNum();
//			System.out.println("columnCount : "+columnCount);
//			
//			//To get all the data iterate through the loop
//			for (int i = 1; i <= rowCount; i++) {
//				XSSFRow eachRow = wSheet.getRow(i);
//				for (int j = 0; j < columnCount; j++) {
//					String allDatas = eachRow.getCell(j).getStringCellValue();
//					System.out.println(allDatas);
//				}
//			}
//			
//			wb.close();
//}
