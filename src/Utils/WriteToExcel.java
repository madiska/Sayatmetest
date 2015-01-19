package Utils;


            import java.io.FileInputStream;
 
            import java.io.FileOutputStream;
 

            import org.apache.poi.xssf.usermodel.XSSFCell;
 
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
            import org.apache.poi.xssf.usermodel.XSSFRow;
 
            import org.apache.poi.xssf.usermodel.XSSFSheet;
 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
    public class WriteToExcel {
 
                private static XSSFSheet ExcelWSheet;
 
                private static XSSFWorkbook ExcelWBook;
 
                private static XSSFCell Cell;
 
                private static XSSFRow Row;

				private static String path1;
 
            //This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
 
            public static void setExcelFile(String Path,String SheetName) throws Exception {
 
                   try {
 
                       path1 = Path;
                    FileInputStream ExcelFile = new FileInputStream(Path);
 
                    // Access the required test data sheet
 
                    ExcelWBook = new XSSFWorkbook(ExcelFile);
 
                    ExcelWSheet = ExcelWBook.getSheet(SheetName);
 
                    } catch (Exception e){
 
                        throw (e);
 
                    }
 
            }
 
            //This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
 
         
            //This method is to write in the Excel cell, Row num and Col num are the parameters
 
            public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception    {
 
                   try{
 
                      Row  = ExcelWSheet.getRow(RowNum);
 
                    Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
 
                    if (Cell == null) {
 
                        Cell = Row.createCell(ColNum);
 
                        Cell.setCellValue(Result);
                        
 
                        } else {
 
                            Cell.setCellValue(Result);
                            XSSFFormulaEvaluator.evaluateAllFormulaCells(ExcelWBook);
                        }
 
        
 
                          FileOutputStream fileOut = new FileOutputStream(path1);
 
                          ExcelWBook.write(fileOut);
 
                          fileOut.flush();
 
                         fileOut.close();
 
                        }catch(Exception e){
 
                            throw (e);
 
                    }
 
                }
 
    }