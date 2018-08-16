package designPattern.obeservePattern.gameAlly;

public class Client {

	public static void main(String []args){
		ConcreteAllyControlCenter cac = new ConcreteAllyControlCenter("金庸联盟");
		Player player1 = new Player("小龙女");
		cac.join(player1);
		Player player2 = new Player("杨过");
		cac.join(player2);
		Player player3 = new Player("郭靖");
		cac.join(player3);
		Player player4 = new Player("黄蓉");
		cac.join(player4);
		player1.beAttacked(cac);
	}
}
