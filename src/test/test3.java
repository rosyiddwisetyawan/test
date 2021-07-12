package test;

public class test3 {
	
	public static void main(String[] args) {
		int a=2;
		int b=4;
		
		String ax = "aaa";
		String bx = "bbb";
		String cx = "";
		int n=a+b;
		for (int i=0;i<n;i++) {
			cx=cx+cx;
			if(i==2) {
				cx=cx+ax+bx;
				
			}

			if(cx.length()==1) {
				break;
			}
			
        }
		cx=cx.substring(0,n);
		System.out.println(cx);
	}

}
