package com.xf.aaa;
/***
 * @author	wenxiang.fei
 * @Description	责任链模式-请假肯定例子
 * @time	2019-10-29 14:14:10
 */
public class LeaveApproval {

}
abstract class Leader{
	
	private Leader next;

	public Leader getNext() {
		return next;
	}

	public void setNext(Leader next) {
		this.next = next;
	}
	//处理请假
	public abstract void handleRequest(int leaveDays);
}
/***
 * @author	wenxiang.fei
 * @Description	任课老师类
 * @time	2019-10-31 09:26:53
 */
class Xteacher extends Leader{

	@Override
	public void handleRequest(int leaveDays) {
		//请假天数
		if(leaveDays>0&&leaveDays<=3) {
			System.out.println("Xteacher给批"+leaveDays);
		}else {//Xteacher 处理不了，交给上级
			
		}
	}
	
}
class Bteacher extends Leader{

	@Override
	public void handleRequest(int leaveDays) {
		//请假天数
		if(leaveDays>3&&leaveDays<=5) {
			System.out.println("Bteacher给批"+leaveDays);
		}else {//Bteacher 处理不了，交给上级
			
		}
	}
	
}