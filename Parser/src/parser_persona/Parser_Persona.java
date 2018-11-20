package parser_persona;


public class Parser_Persona {

	public static void main(String[] args) {
				
		Parser parser= new Parser();
		parser.parseFicheroXml("examen.xml");
		parser.parseDocument();
		parser.print();
		
		
		
		
		

	}

}