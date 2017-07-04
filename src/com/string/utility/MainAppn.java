package com.string.utility;

public class MainAppn {
	public static void main(String[] args) {
		
		boolean nullOrEmpty = StringsUtil.isNullOrEmpty("gg");
		System.out.println(nullOrEmpty);
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("pesala ");
		sb = StringsUtil.appendIfNotNull(sb, "somasekhar");
		System.out.println(sb);
		
		
		String str= "pesala soma";
		String lastChars = StringsUtil.getLastChars(str, 6);
		System.out.println(lastChars);
		
		String str1 = "kala bhirava";
		String firstchars = StringsUtil.getStartingChars(str1, 5);
		System.out.println(firstchars);
		
		String s1="abcd", s2="ABCD";
		boolean equalIgnoreCase = StringsUtil.isEqualIgnoreCase(s1, s2);
		System.out.println(equalIgnoreCase);
		
		
	}
	

}
