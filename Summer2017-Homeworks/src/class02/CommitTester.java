package class02;

public class CommitTester {

	//This file has nothing to do with any sort of programming.
	/*	This file is used to test commits to see how they work
	 *	any changes made to this file have no effect on anything 
	 * 	else in my workspace.
	 * 				-Jesse (5/31/2017)
	 */
	
	private String testVariable = "This is a test!";
	
	
	public CommitTester() {
		System.out.println("This is a test object.");
		testVariable = "Changed by creating object.";
	}
	
	public void TestCommit(int x) {
		if (testVariable == "This is a test!") {
			System.out.println("Something went wrong.");
		} else {
			System.out.println("Something went right.");
		}
		System.out.println("You printed: " + x);
	}
	
	public void NewMethod() {
		System.out.println("Testing new method added in commit.");
	}
}
