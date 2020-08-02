package designPatternBuilder;

public class Shop {
	public static void main(String args[]) {
//		MobilePhone myPhone = new MobilePhone("android", 8, 30000, 10.5, 12.5);
//		System.out.println(myPhone.getPhone());

//		Not required all specifications
		
		MobilePhone myPhone = new MobilePhoneBuilder().setOs("android").setRam(16).getBuiltPhone();
		
		System.out.println(myPhone.getPhone());
	}
}
