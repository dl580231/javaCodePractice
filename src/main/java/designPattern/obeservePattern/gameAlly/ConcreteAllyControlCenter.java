package designPattern.obeservePattern.gameAlly;

public class ConcreteAllyControlCenter extends AllyControlCenter {
	public ConcreteAllyControlCenter(String allyName) {
		this.allyName=allyName;
		System.out.println(this.allyName+"创建成功");
	}
	@Override
	public void notifyObserver(String name) {
	for(Obeserver player:players){
		if(!player.getName().equalsIgnoreCase(name)){
			player.help();
		}
	}
	}

}
