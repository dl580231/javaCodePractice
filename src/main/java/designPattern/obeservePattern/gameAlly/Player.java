package designPattern.obeservePattern.gameAlly;

public class Player implements Obeserver {
	private String name;
	public Player(String name) {
		this.name=name;
	}
	@Override
	public void help() {
		System.out.println(this.name+"前来支援");
	}

	@Override
	public void beAttacked(AllyControlCenter acc) {
		System.out.println(this.name+"受到攻击，请求支援");
		acc.notifyObserver(this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
