package FolderOfBooks;

public class BookRunner {

	public static void main(String[] args) {
		Book ArtofcomputerPrograming = new Book();
		Book EffectiveJava =new Book();
		Book CleanCode =new Book();
		ArtofcomputerPrograming.openBook();
		EffectiveJava.openBook();
		CleanCode.openBook();
		ArtofcomputerPrograming.pageno();
		EffectiveJava.pageno();
		CleanCode.pageno();
		ArtofcomputerPrograming.closebook();
		EffectiveJava.closebook();
		CleanCode.closebook();
		ArtofcomputerPrograming.setnoOfCopies(50);
		EffectiveJava.setnoOfCopies(12);
		CleanCode.setnoOfCopies(70);
		EffectiveJava.increaseNoOfCopys(10);
		CleanCode.decreaseNoOfCopys(69);
		System.out.println(ArtofcomputerPrograming.getnoOfCopies());
		System.out.println(EffectiveJava.getnoOfCopies());
		System.out.println(CleanCode.getnoOfCopies());
		
	}

}
