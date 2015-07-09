package cys.gh.p1_array;
/*
 * �������װ��һ��������ʹ��
 */
public class _1_ArrayObject {
	
	private int[] a;
	private int nElems;//�����еĳ���
	
	public _1_ArrayObject(int max){
		a = new int[max];
		nElems=0;
	}
	
	//����Ԫ��
	public boolean find(int searchKey){
		int i;
		for(i=0;i<nElems;i++){
			if(a[i]==searchKey){
				break;
			}
		}
		if(i==nElems){
			return false;
		}else{
			return true;
		}
	}
	//����Ԫ��
	public void insert(int value){
		a[nElems]=value;
		nElems++;
	}
	//ɾ��Ԫ��  ����true��ʾɾ���ɹ�  false ɾ��ʧ��
	public boolean delete(int value){
		int i;
		for(i=0;i<nElems;i++){
			if(a[i]==value)
				break;
		}
		if(i==nElems){
			return false;
		}else{
			for(int j=i;j<nElems;j++){
				a[j]=a[j+1];
			}
			return true;
		}
		
	}
	//��ʾ�����е�����Ԫ��
	public void display(){
		for(int i=0;i<nElems;i++){
			System.out.print(a[i]+", ");
		}
	}
	//����Ԫ�صĸ���
	public int getlength(){
		return nElems;
	}
	//�õ�������������
	public int getMaxEle(){
		if(nElems==0){
			return -1;//����Ϊ��ʱ  ����-1
		}
		int max = a[0];
		for(int i=1;i<nElems;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		return max;
	}
	//ɾ�������е�������
	public void removeMax(){
		int max_i=0;//��������±�
		for(int i=0;i<nElems;i++){
			if(a[max_i]<a[i]){
				max_i=i;
			}
		}
		for(int j=max_i;j<nElems;j++){
			a[j]=a[j+1];
		}
	}
}
