package cys.gh;

public class Client {

	public static void main(String[] args) {
		Watchered watchered = new ConcreteWatched();//����һ��  �¼�Դ    �紴����һ��Button
		
		Watcher watcher1 = new ConcreteWatcher();//������һ��  �¼� ������   ��OnClickLisener
		Watcher watcher2 = new ConcreteWatcher();
		Watcher watcher3 = new ConcreteWatcher();
		
		watchered.addWatcher(watcher1);//ע��һ���¼�������    ��setOnClickLisener
		watchered.addWatcher(watcher2);
		watchered.addWatcher(watcher3);
		
		watchered.nofifyWatcher("�Ҹ������ǣ��ұ�ִ���� ��");//�¼�������    ��button��������
		
	}
}
