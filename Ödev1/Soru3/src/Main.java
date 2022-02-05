import java.util.ArrayList;
import java.util.List;

//import com.sun.tools.classfile.Opcode.Set;
public class Main {

	public static void main(String[] args) {
		Kullanici kullanici1 = new Kullanici("Bireysel", "Cem", "cemdrman@gmailc.om");
		kullanici1.mesajKutusu = prepareMesajKutusu();
		

		Kullanici kullanici2 = new Kullanici("Bireysel", "Kadir", "cilgin.kadir@gmail.com");
		kullanici2.mesajKutusu = prepareMesajKutusu();
		

		Kullanici kullanici3 = new Kullanici("Bireysel", "Hatice", "hatice.dev@gmail.com");
		kullanici3.mesajKutusu = prepareMesajKutusu();
		
		Gayrimenkul gayrimenkul1=new Gayrimenkul();
		gayrimenkul1.il="Ýstanbul";
		gayrimenkul1.ilce="Beykoz";
		gayrimenkul1.odaSayisi="3+1";
		gayrimenkul1.alan=150;
		gayrimenkul1.bulunduguKat=2;
		gayrimenkul1.fiyat=3200;
		gayrimenkul1.konutTipi="Daire";
		
		Gayrimenkul gayrimenkul2=new Gayrimenkul();
		gayrimenkul2.il="Ýstanbul";
		gayrimenkul2.ilce="Üsküdar";
		gayrimenkul2.odaSayisi="2+1";
		gayrimenkul2.alan=120;
		gayrimenkul2.bulunduguKat=5;
		gayrimenkul2.fiyat=2700;
		gayrimenkul2.konutTipi="Daire";
		
		Gayrimenkul gayrimenkul3=new Gayrimenkul();
		gayrimenkul3.il="Ýstanbul";
		gayrimenkul3.ilce="Çengelköy";
		gayrimenkul3.odaSayisi="2+1";
		gayrimenkul3.alan=140;
		gayrimenkul3.bulunduguKat=4;
		gayrimenkul3.fiyat=3000;
		gayrimenkul3.konutTipi="Daire";
		
		

		List<Ilan> ilanListesi = new ArrayList<>();
		ilanListesi.add(prepareIlan("Sahibinden Acil Satýlýk", kullanici1));
		ilanListesi.add(prepareIlan("Acil Kiralýk", kullanici2));
		ilanListesi.add(prepareIlan("Metroya koþarak 5 dk", kullanici3));
		ilanListesi.add(prepareIlan("Öðrenciye ve Bekar uygun", kullanici3));
		
		

	}

	private static List<Mesaj> prepareMesajKutusu() {
		List<Mesaj> mesajKutusu = new ArrayList<>();
		mesajKutusu.add(new Mesaj("Bu benim ilk mesajým.."));
		mesajKutusu.add(new Mesaj("Bu benim ikinci mesajým.."));
		mesajKutusu.add(new Mesaj("Bu benim üçüncü mesajým.."));
		return mesajKutusu;
	}
	


	private static Ilan prepareIlan(String baslik, Kullanici kullanici) {
		Ilan ilan = new Ilan();
		ilan.setBaslik(baslik);
		ilan.setGayrimenkul(makeGayrimenkul());

		//kullanici.mesajKutusu.add(new Mesaj("acil dÃ¶nÃ¼ÅŸ")); // NPE

		ilan.setKullanici(kullanici);

		ilan.setAktifMi(true);

		ilan.setResimList(makeResimList());
		
		for (Mesaj mesaj : kullanici.mesajKutusu) {
			System.out.println(kullanici.isim+" "+ mesaj.baslik);
		}

		return ilan;
	}

	private static String[] makeResimList() {
		String[] resimList = new String[5];
		resimList[0] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
		resimList[1] = "https://hecdnw01.hemlak.com/ds01/4/4/9/0/2/3/8/3/81d2e088-a551-485d-b2e9-664cc9200cdc.jpg";
		return resimList;
	}

	private static Gayrimenkul makeGayrimenkul() {
		return new Gayrimenkul();
	}

	

}
