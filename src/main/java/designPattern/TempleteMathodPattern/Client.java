package designPattern.TempleteMathodPattern;

import designPattern.XMLUtils;

public class Client {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String type = XMLUtils.getChartType();
		/*System.out.println(new CurrentAccount().getClass().getName());*/
		Class<?> class1 = Class.forName(type);
		Account account = (Account) class1.newInstance();
		account.handle("董磊", "580231");
	}
}