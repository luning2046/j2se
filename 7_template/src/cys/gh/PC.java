package cys.gh;

public class PC extends Template{

	public PC(String pcType) {
		super(pcType);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void makeCPU(String pcType) {
		// TODO Auto-generated method stub
		System.out.println(pcType+"��CPU�����");
		
	}

	@Override
	protected void makeHD(String pcType) {
		// TODO Auto-generated method stub
		System.out.println(pcType+"��Ӳ�������");
	}

	@Override
	protected void makeMainBorad(String pcType) {
		// TODO Auto-generated method stub
		System.out.println(pcType+"�����������");
	}

}
