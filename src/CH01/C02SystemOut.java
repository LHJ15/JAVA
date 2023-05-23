package CH01;

public class C02SystemOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.out.print()
		
		//단축키
		// 복사 :ctrl + alt + 밑으로
        // 주석 :ctrl + /
		
		// System :OS
		// System.out : os가 과리하는 표준 출력 스트림
		
		
		//Systme.out.print()
		// ESCAPE 문자 :
		// \n:개행,줄바꿈
		// \b: 백스페이스
		// \t: 탭길이( 기본8칸) 만큼 커서이동
	       System.out.print("HELLOWORLD\n");
	       System.out.print("HELLOWORLD\n");
	       System.out.print("HELLOWORLD\n");
	       
	       System.out.print("HE\tLLOWORLD");
		
		
		//Systme.out.print()
	    //format : 형식,서식
	    //%d : 10진수 정수 서식문자
	    //%f : 10진수 실수 서식문자
	    //%c : 한문자 서식문자
	    //%s : 문자열 서식문자
	       
	       System.out.printf("%d %d %d \n" , 10,20,30);
	       System.out.printf("%f %f %f \n" , 10.1,20.1,30.1);
	       System.out.printf("%c %c %c\n" ,'A','B','C');
	       System.out.printf("%S %S %S\n" , "This is"," String ", "Test");
	       System.out.printf("%d. %S : %d\n", 1,"국어",100);
	     
		
		
		//Systme.out.print()
		

	}

}
