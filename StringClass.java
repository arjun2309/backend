package practice1;

public class StringClass {

	public static void main(String[] args) {
		StringBuilder build=new StringBuilder();
		build.append("Arjun");
		build.append(15);
		System.out.println(build);
		build.replace(2, 4, "harish");
		System.out.println(build);
	}
}
