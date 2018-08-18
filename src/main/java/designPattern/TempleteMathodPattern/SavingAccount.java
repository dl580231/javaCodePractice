package designPattern.TempleteMathodPattern;

public class SavingAccount extends Account{

	@Override
	public void calculate() {
		System.out.println("按定期计算利息");
	}
	
}
