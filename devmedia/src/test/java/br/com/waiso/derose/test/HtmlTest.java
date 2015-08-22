package br.com.waiso.derose.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

public class HtmlTest {
	
	private StringBuilder sb;
	private Pattern pattern;
	private Matcher matcher;
	
	@Before
	public void palavra() {
		sb = new StringBuilder();
		sb.append("<p id=\"u8239-2\" data-i18n=\"desportiva.alta-performance\">alta performance</p>");
		sb.append("<p id=\"u8239-2\" data-i18n=\"desportiva-2.alta-performance\">alta performance</p>");
		sb.append("<p id=\"u8239-4\" data-i18n=\"desportiva.desportiva\">desportiva</p>");
	}

	@Test
	public void test() {
		pattern = Pattern.compile("data-i18n=\"([a-zA-Z_0-9]*|[a-zA-Z_0-9]*\\-[a-zA-Z_0-9]*)\\.([a-zA-Z_0-9]*|[a-zA-Z_0-9]*\\-[a-zA-Z_0-9]*)\"");
		// in case you would like to ignore case sensitivity,
		// you could use this statement:
		// Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(sb);
		// check all occurance
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	
	}

}
