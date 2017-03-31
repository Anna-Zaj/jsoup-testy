
import java.io.IOException;

import org.jsoup.Jsoup; 
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements; 

public class Scrap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Document doc = Jsoup.connect("http://www.smv.gob.pe/Frm_BuscarEmpresa.aspx?ID=0&men=09000000").get();

		Elements data = doc.select("a");  
		System.out.println(data); 
		
		Elements data2 = doc.getElementsByClass("grid_contenido_texto"); 
		System.out.println(data2); 
		
	}

}
