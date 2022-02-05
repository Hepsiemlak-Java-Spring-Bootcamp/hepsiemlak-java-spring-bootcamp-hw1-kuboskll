
public class Class3 implements Class1,Class2  {
	public void döndür() {
		
		Class1.super.döndür();
		Class2.super.döndür();
		System.out.println("Class3 Çalýþtý");
	}

}
