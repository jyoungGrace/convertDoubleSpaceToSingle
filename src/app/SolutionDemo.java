package app;

//  두 칸의 공백을 모두 한 칸의 공백으로 바꾼 문자열 리턴
public class SolutionDemo {
	public static void main(String[] args) {
		String str = "string  with  double  spaces";
		String word = str.replace("  "," ");
		System.out.println(word);

		String[] words = str.split("  ");
		System.out.println(String.join(" ", words));
	}
}

