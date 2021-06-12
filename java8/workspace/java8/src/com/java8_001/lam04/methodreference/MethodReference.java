package com.java8_001.lam04.methodreference;

interface Parser {
	public String parser(String s);
}

class StringParser {
	public static String convert(String s) {
		if (s == null) {

		} else if (s.length() <= 3) {
			s = s.toUpperCase();
		} else {
			s = s.toLowerCase();
		}
		return s;
	}
}


public class MethodReference {
	
	public void print(String s, Parser p) {
		s = p.parser(s);
		System.out.println(s);
	}

	public static void main(String[] args) {
		Parser p = new Parser() {
			@Override
			public String parser(String s) {
				return StringParser.convert(s);
			}

		};

		MethodReference mp = new MethodReference();
		mp.print("He", p);
		
		MethodReference mp2 = new MethodReference();
		mp2.print("He", new Parser() {
			@Override
			public String parser(String s) {
				return StringParser.convert(s);
			}

		});
		
		MethodReference mp3 = new MethodReference();
		mp3.print("He",s->StringParser.convert(s));
		
		mp3.print("Hello",StringParser::convert);
		

	}

}
