package Q_1_demo;

public class
Q_1_cla {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("no arguments provided");
			return;
		}
		
		System.out.println("Total arguments: " + args.length);
		for(int i = 0;i<args.length;i++) {
			System.out.println("Argument " + i+ ":" + args[i]);
		}
		
	}
}
