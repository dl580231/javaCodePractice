package designPattern.TempleteMathodPattern;

public class CurrentAccount extends Account{

	@Override
	public void calculate() {
		System.out.println("按活期计算利息");
	}
}
