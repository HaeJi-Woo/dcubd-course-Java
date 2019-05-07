
public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Calculator2 calculator2 = new Calculator2();
		System.out.println("원면적 : " + calculator2.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));
  
	}

}
