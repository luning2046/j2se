package cys.gh.p1_array;
/*
 * 将数组封装成一个对象来使用
 */
public class _1_ArrayObject {
	
	private int[] a;
	private int nElems;//数组中的长度
	
	public _1_ArrayObject(int max){
		a = new int[max];
		nElems=0;
	}
	
	//查找元素
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
	//插入元素
	public void insert(int value){
		a[nElems]=value;
		nElems++;
	}
	//删除元素  返回true表示删除成功  false 删除失败
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
	//显示数组中的所有元素
	public void display(){
		for(int i=0;i<nElems;i++){
			System.out.print(a[i]+", ");
		}
	}
	//数组元素的个数
	public int getlength(){
		return nElems;
	}
	//得到数组中最大的数
	public int getMaxEle(){
		if(nElems==0){
			return -1;//数组为空时  返回-1
		}
		int max = a[0];
		for(int i=1;i<nElems;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		return max;
	}
	//删除数组中的最大的数
	public void removeMax(){
		int max_i=0;//最大数的下标
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
