
public class Elset{
	public static void main(String[]args) {

		Elset e=new Elset();
		
	elset();
		Switch();
		}
	

	
	public static void elset() {
			int marks=60;
			if(marks>=90) {
				System.out.println("GRADE A");
			}
			else if(marks>=80) {
			System.out.println("GRADE B+");
			}

			else if(marks>70) {
				System.out.println("GRADE B");
				
				}
				else if(marks>60) {
					System.out.println("GRADE C");
					}
					else {
						System.out.println("GRADE D");

		}
}

public static void Switch() {
	int i=0;
	switch("a"){
		case "a":
		System.out.println("vowel");
		break;
		case "b":
			System.out.println("vowel");
			break;
		/*case 3:
			System.out.println("speed must be in between 60-70");
			break;
		case 4:
			System.out.println("speed must be in between 70-80");
			break;*/
		default:
			System.out.println("it is a consonent");
		
	}
}

}
