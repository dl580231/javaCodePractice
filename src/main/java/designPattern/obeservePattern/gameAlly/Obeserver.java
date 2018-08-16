package designPattern.obeservePattern.gameAlly;

public interface Obeserver {
	public void setName(String name);
	public String getName();
	public void help(); //声明支援盟友方法
	public void beAttacked(AllyControlCenter acc); //声明遭受攻击方法
}
