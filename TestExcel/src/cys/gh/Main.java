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

		if (sheet != null && sheet.length > 0) {
			// ��ÿ�����������ѭ��
			for (int i = 0; i < sheet.length; i++) {
				// �õ���ǰ�����������
				int rowNum = sheet[i].getRows();
				System.out.println(rowNum);
				for (int j = 0; j < rowNum; j++) {
					// �õ���ǰ�е����е�Ԫ��
					Cell[] cells = sheet[i].getRow(j);
					if (cells != null && cells.length > 0) {
						// ��ÿ����Ԫ�����ѭ��
						for (int k = 0; k < cells.length; k++) {
							// ��ȡ��ǰ��Ԫ���ֵ
							String cellValue = cells[k].getContents();
							
							sb.append("========="+cellValue+"-------------" + "\t");
						}
					}
					sb.append("\r\n");
				}
				sb.append("\r\n");
			}
		}
		// ���ر���Դ���ͷ��ڴ�
		wb.close();
		return sb.toString();
	}
	
	public static void createEXcel(){
		try   {
            //  ���ļ� 
            WritableWorkbook book  =  Workbook.createWorkbook( new  File( " test.xls " ));
            //  ������Ϊ����һҳ���Ĺ���������0��ʾ���ǵ�һҳ 
            WritableSheet sheet  =  book.createSheet( " ��һҳ " ,  0 );
            //  ��Label����Ĺ�������ָ����Ԫ��λ���ǵ�һ�е�һ��(0,0)
            //  �Լ���Ԫ������Ϊtest 
            Label labelName  =   new  Label( 0 ,  0 ,  "����������" );
            Label labelProgram  =   new  Label( 1 ,  0 ,  "������Ŀ����" );
            Label labelResult  =   new  Label( 2 ,  0 ,  "������Ŀ���" );
            //  ������õĵ�Ԫ����ӵ��������� 
            sheet.addCell(labelName);
            sheet.addCell(labelProgram);
            sheet.addCell(labelResult);
            
            for(int i=1;i<5;i++){
	            Label labelName2  =   new  Label( 0 ,  i ,  "����������2" );
	            Label labelProgram2  =   new  Label( 1 ,  i ,  "������Ŀ����2" );
	            Label labelResult2  =   new  Label( 2 ,  i ,  "������Ŀ���2" );
	            //  ������õĵ�Ԫ����ӵ��������� 
	            sheet.addCell(labelName2);
	            sheet.addCell(labelProgram2);
	            sheet.addCell(labelResult2);
            }
            /* 
            * ����һ���������ֵĵ�Ԫ�� ����ʹ��Number��������·�����������﷨���� ��Ԫ��λ���ǵڶ��У���һ�У�ֵΪ789.123
             */ 
//           jxl.write.Number number  =   new  jxl.write.Number( 1 ,  0 ,  555.12541 );
//           sheet.addCell(number);

            //  д�����ݲ��ر��ļ� 
            book.write();
           book.close();

       }   catch  (Exception e)  {
           System.out.println(e);
       } 
   } 

}
