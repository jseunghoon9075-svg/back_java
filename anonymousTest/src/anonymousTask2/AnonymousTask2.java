package anonymousTask2;

public class AnonymousTask2 {
	public static void main(String[] args) {
		MyInter myInter = new MyInter() {
			
			String str;
			@Override
			public void getString(String content) {
//				ABCD
//				반복돌고 인덱스가 같으면 + 1 
				int result = 0; 
				for(int i = 0; i < content.length(); i++) {
					result = content.charAt(i) > 66 ? content.charAt(i + 1) : content.charAt(i);
							System.out.println((char)result);
				}
			}
			
			@Override
			public String changeUpperOrLower(String content) {
				
				return null;
			}
		};
		myInter.getString("ABCD");
		
	}
}
