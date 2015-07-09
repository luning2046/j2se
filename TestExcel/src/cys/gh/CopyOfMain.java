package cys.gh;

import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class CopyOfMain {

	public static void main(String[] args) {
		File file = new File("fruit.xls");
		System.out.println(readExcel(file));
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
		// 得到当前工作表的行数
//		int rowNum = sheet[3].getRows();
		
			// 得到当前行的所有单元格
			Cell[] cells = sheet[0].getRow(0);//取得一行
			System.out.println(sheet[0].getRows());
			if (cells != null && cells.length > 0) {//取得一行中的某列
				// 对每个单元格进行循环
				for (int k = 0; k < cells.length; k++) {
					// 读取当前单元格的值
					String cellValue = cells[k].getContents();
					
					sb.append(cellValue + "\t");
				}
			}
			sb.append("\r\n");
		
		sb.append("\r\n");

		// 最后关闭资源，释放内存
		wb.close();
		return sb.toString();
	}

}
