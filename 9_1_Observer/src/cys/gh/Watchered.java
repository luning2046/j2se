package cys.gh;

/**
 * ���������ɫ  Ҳ���Ǳ��۲���   �൱�� һ��button  Ҳ���ǡ��¼�Դ��
 *
 */
public interface Watchered {

	public void addWatcher(Watcher watcher);//�൱��button��setOnClickListener�ķ���  Ҳ����ע��һ���¼�������
	public void removeWatcher(Watcher watcher);
	
	
	public void nofifyWatcher(String str);//�൱��  һ��button�ĵ����¼�   Ҳ����һ�����¼���   ����str�൱����һ���¼�����
}
