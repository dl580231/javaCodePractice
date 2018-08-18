package designPattern.TempleteMathodPattern;

/**
 * 模板方法模式的抽象类
 * @author lenovo
 *
 */
public abstract class Account {
	/**
	 * 基本方法（钩子方法，在模板方法中来判断某些方法是否执行）
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean vaildate(String username,String password) {
		if(username.equals("董磊")&&password.equals("580231")) {
			return true;
		}
		return false;
	}
	
	/**
	 * 基本方法（抽象方法）
	 */
	public abstract void calculate();
	
	/**
	 * 基本方法（实现类）
	 */
	public void display() {
		System.out.println("显示利息");
	}
	
	public void handle(String username,String password) {
		if(vaildate(username, password)) {
			calculate();
			display();
		}
		else {
			System.out.println("用户信息错误");
		}
	}
}
