package com.xf.command;
/***
 * @author	wenxiang.fei
 * @Description	命令模式案例
 * @time	2019-10-26 10:23:55
 */
public class CommandPattern {

	public static void main(String[] args) {
		Command command=new RightPattern();
//		Invoker invoker=new Invoker(command);
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.call();
	}
}
/***
 * @author	wenxiang.fei
 * @Description	调用者
 * @time	2019-10-26 10:37:15
 */
class Invoker{
	private Command command;
	
	public Invoker(Command command) {
		this.command=command;
	}
	public Invoker() {
	}
	public void setCommand(Command command) {
		this.command=command;
	}
	public void call() {
		System.out.println("调用者call...");
		command.execute();
	}
}

interface Command{
	abstract void execute();
}
class RightPattern implements Command{

	private Receiver receiver;
	
	public RightPattern(){
		receiver=new Receiver();
	}
	@Override
	public void execute() {
		receiver.action();
	}
	
}
/***
 * @author	wenxiang.fei
 * @Description	接受者
 * @time	2019-10-26 10:37:45
 */
class Receiver{
	public void action() {
		System.out.println("接受者action...");
	}
}