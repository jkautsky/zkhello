package sample;

import java.util.Map;

import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.util.Initiator;

public class InitSample implements Initiator {

	public void doInit(Page page, Map map)
		throws Exception{
		System.out.println("doInit");
	}
	
	public void doAfterCompose(Page page)
		throws Exception{
		System.out.println("doAfterCompose");
	}
	
	public boolean doCatch(Throwable throwable){
		return true;
	}
	
	public void doFinally(){
	}
}