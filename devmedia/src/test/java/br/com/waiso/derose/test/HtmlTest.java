package br.com.waiso.derose.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

public class HtmlTest {
	
	private StringBuilder palavra;
	private StringBuilder padrao;
	
	private Pattern pattern;
	private Matcher matcher;
	
	@Before
	public void palavra() {
		palavra = new StringBuilder();
		palavra.append("<p id=\"u8239-2\" data-i18n=\"desportASDFiva.alta-perfoASFDrmance\">alta performance</p>");
		palavra.append("<p id=\"u8239-2\" data-i18n=\"desportiva-2.alta-performance\">alta performance</p>");
		palavra.append("<p id=\"u8239-4\" data-i18n=\"desportiva.desportiva\">desportiva</p>");
	}
	
	@Before
	public void padrao() {
		padrao = new StringBuilder();
		padrao.append("data-i18n=\"");
//		padrao.append("([a-zA-Z_0-9]*|[a-zA-Z_0-9]*\\-[a-zA-Z_0-9]*|[a-zA-Z_0-9]*\\-[a-zA-Z_0-9]*\\-[a-zA-Z_0-9]*)");
		padrao.append("([a-z_0-9]*|[a-z_0-9]*\\-[a-z_0-9]*|[a-z_0-9]*\\-[a-z_0-9]*\\-[a-z_0-9]*)");
		padrao.append("\\.");
		padrao.append("([a-z_0-9]*|[a-z_0-9]*\\-[a-z_0-9]*|[a-z_0-9]*\\-[a-z_0-9]*\\-[a-z_0-9]*)");
		padrao.append("\"");
	}

	@Test
	public void test() {
		pattern = Pattern.compile(padrao.toString(), Pattern.CASE_INSENSITIVE);
		// in case you would like to ignore case sensitivity,
		// you could use this statement:
		// Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(palavra);
		// check all occurance
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	
	}

}
