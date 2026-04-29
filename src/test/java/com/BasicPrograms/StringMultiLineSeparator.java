package com.BasicPrograms;

public class StringMultiLineSeparator {

	public static void main(String[] args) {
//		Approach - 1
/*		String sample = "ABCD";
		int cnt = 0;
		char[] chArr = sample.toCharArray();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < chArr.length; i++) {
			for (int j = 0; j < chArr.length; j++) {

				if (j != cnt) {
					sb.append(chArr[j]);
				}
			}
			cnt++;
		}

//        System.out.println("Initial Sequence:: " + sb.toString());
		String modSample = sb.toString();

		for (int k = 0; k < modSample.length(); k += 3) {
			System.out.println(modSample.substring(k, (k + 3)));

		}
*/
		
//		Approach - 2
        String input = "ABCD";
        generateCombinations(input);
    }

    public static void generateCombinations(String str) {
        for (int i = 0; i < str.length(); i++) {
            // Remove the character at index i and print the modified string
            String result = str.substring(0, i) + str.substring(i + 1);
            System.out.println(result);
        }
    }


}


