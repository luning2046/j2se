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
	 * ��ȡExcel�ļ�������
	 * @param file ����ȡ���ļ�
	 * @return
	 */
	public static String readExcel(File file) {
		StringBuffer sb = new StringBuffer();

		Workbook wb = null;
		try {
			// ����Workbook��������������
			wb = Workbook.getWorkbook(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (wb == null)
			return null;
		// �����Workbook����֮�󣬾Ϳ���ͨ�����õ�Sheet��������������
		Sheet[] sheet = wb.getSheets();
		// �õ���ǰ�����������
//		int rowNum = sheet[3].getRows();
		
			// �õ���ǰ�е����е�Ԫ��
			Cell[] cells = sheet[0].getRow(0);//ȡ��һ��
			System.out.println(sheet[0].getRows());
			if (cells != null && cells.length > 0) {//ȡ��һ���е�ĳ��
				// ��ÿ����Ԫ�����ѭ��
				for (int k = 0; k < cells.length; k++) {
					// ��ȡ��ǰ��Ԫ���ֵ
					String cellValue = cells[k].getContents();
					
					sb.append(cellValue + "\t");
				}
			}
			sb.append("\r\n");
		
		sb.append("\r\n");

		// ���ر���Դ���ͷ��ڴ�
		wb.close();
		return sb.toString();
	}

}
