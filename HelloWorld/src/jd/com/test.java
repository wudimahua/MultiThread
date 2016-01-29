package jd.com;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "860582030865279-98e7f5e48c85";
		String string2 = "hjudwgohxzVu96krv/T6Hg==";
		System.out.println(HashUtil.hash(string));
		System.out.println(HashUtil.hash(string2));
		System.out.println("----------------------");
		System.out.println(HashUtil.hash64(string));
		System.out.println(HashUtil.hash64(string2));
	}
}