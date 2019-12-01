package com.xf.command;

public class CommandPatternCopy {
	
	public static void main(String[] args) {
		CommandCopy commandCopy = new CommandCopyImpl();
		CommandUser commandUser = new CommandUser(commandCopy);
		commandUser.call();
	}
}
/***
 * @author	wenxiang.fei
 * @Description	调用者
 * @time	2019-10-26 13:13:40
 */
class CommandUser{
	
	private CommandCopy commandCopy;
	
	public CommandUser(CommandCopy commandCopy) {
		this.commandCopy=commandCopy;
	}
	//类似注解的使用
	public void setCommandCopy(CommandCopy commandCopy) {
		this.commandCopy=commandCopy;
	}
	void call() {
		System.out.println("调用者---call");
		commandCopy.execute();
	}
}
/***
 * @author wenxiang.fei
 * @Description 抽象命令接口
 * @time 2019-10-26 10:56:22
 */
interface CommandCopy {
	void execute();
}

class CommandCopyImpl implements CommandCopy {
	private Inver inver;

	public CommandCopyImpl() {
		inver = new Inver();
	}

	@Override
	public void execute() {
		inver.action();
	}

}

/***
 * @author wenxiang.fei
 * @Description 提供者
 * @time 2019-10-26 10:51:59
 */
class Inver {

	public void action() {
		System.out.println("提供者-action");
	}
}