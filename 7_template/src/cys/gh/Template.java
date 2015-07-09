package cys.gh;

public abstract class Template {
	
	protected String pcType;
	
	public Template(String pcType){
		this.pcType=pcType;
	}
	
	//��������ȥʵ�ֵĻ�������1
	abstract protected void makeCPU(String pcType);
	//��������ȥʵ�ֵĻ�������2
	abstract protected void makeMainBorad(String pcType);
	//��������ȥʵ�ֵĻ�������3
	abstract protected void makeHD(String pcType);
	
	//�����������Ѿ�ʵ�ֺ���
	public final void makeOver(String pcType){
		System.out.println(pcType+"�����");
	}
	
	//ģ�巽���������
	public final void makePC(){
		makeCPU(pcType);
		makeMainBorad(pcType);
		makeHD(pcType);
		makeOver(pcType);
	}
}
