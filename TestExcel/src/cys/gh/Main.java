package cys.gh;

import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Main {

	public static void main(String[] args) {
//		File file = new File("fruit.xls");
//		System.out.println(readExcel(file));
		createEXcel();
	}

	/**
	 * 读取Excel文件的内容
	 * @param file 待读取的文件
	 * @return
	 */
	public static String readExcel(File file) {
		StringBuffer sb = new StringBuffer();

		Workbook wb = null;
		try {
			// 构造Workbook（工作薄）对象
			wb = Workbook.getWorkbook(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (wb == null)
			return null;
		// 获得了Workbook对象之后，就可以通过它得到Sheet（工作表）对象了
		Sheet[] sheet = wb.getSheets();

		if (sheet != null && sheet.length > 0) {
			// 对每个工作表进行循环
			for (int i = 0; i < sheet.length; i++) {
				// 得到当前工作表的行数
				int rowNum = sheet[i].getRows();
				System.out.println(rowNum);
				for (int j = 0; j < rowNum; j++) {
					// 得到当前行的所有单元格
					Cell[] cells = sheet[i].getRow(j);
					if (cells != null && cells.length > 0) {
						// 对每个单元格进行循环
						for (int k = 0; k < cells.length; k++) {
							// 读取当前单元格的值
							String cellValue = cells[k].getContents();
							
							sb.append("========="+cellValue+"-------------" + "\t");
						}
					}
					sb.append("\r\n");
				}
				sb.append("\r\n");
			}
		}
		// 最后关闭资源，释放内存
		wb.close();
		return sb.toString();
	}
	
	public static void createEXcel(){
		try   {
            //  打开文件 
            WritableWorkbook book  =  Workbook.createWorkbook( new  File( " test.xls " ));
            //  生成名为“第一页”的工作表，参数0表示这是第一页 
            WritableSheet sheet  =  book.createSheet( " 第一页 " ,  0 );
            //  在Label对象的构造子中指名单元格位置是第一列第一行(0,0)
            //  以及单元格内容为test 
            Label labelName  =   new  Label( 0 ,  0 ,  "测试人姓名" );
            Label labelProgram  =   new  Label( 1 ,  0 ,  "测试项目名称" );
            Label labelResult  =   new  Label( 2 ,  0 ,  "测试项目结果" );
            //  将定义好的单元格添加到工作表中 
            sheet.addCell(labelName);
            sheet.addCell(labelProgram);
            sheet.addCell(labelResult);
            
            for(int i=1;i<5;i++){
	            Label labelName2  =   new  Label( 0 ,  i ,  "测试人姓名2" );
	            Label labelProgram2  =   new  Label( 1 ,  i ,  "测试项目名称2" );
	            Label labelResult2  =   new  Label( 2 ,  i ,  "测试项目结果2" );
	            //  将定义好的单元格添加到工作表中 
	            sheet.addCell(labelName2);
	            sheet.addCell(labelProgram2);
	            sheet.addCell(labelResult2);
            }
            /* 
            * 生成一个保存数字的单元格 必须使用Number的完整包路径，否则有语法歧义 单元格位置是第二列，第一行，值为789.123
             */ 
//           jxl.write.Number number  =   new  jxl.write.Number( 1 ,  0 ,  555.12541 );
//           sheet.addCell(number);

            //  写入数据并关闭文件 
            book.write();
           book.close();

       }   catch  (Exception e)  {
           System.out.println(e);
       } 
   } 

}
