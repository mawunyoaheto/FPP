package exception_handling;

public class Book {

	private String name;
	private int iSBN;

	public Book() {
		super();
	}

	public Book(String name, int iSBN) {
		super();

		try {
			setName(name);
			setiSBN(iSBN);

//		} catch (InvalidNameException e) {
//			System.out.println(e.getMessage());
//		} catch (InvalidISBNException e) {
//			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InvalidNameException {

		if (name.length() < 8)
			throw new InvalidNameException("Wrong name");
	}

	public int getiSBN() {
		return iSBN;
	}

	public void setiSBN(int iSBN) throws InvalidISBNException {

		if (iSBN < 0)
			throw new InvalidISBNException("ISBN cannot be a negative number");

		if (iSBN == 0)
			throw new InvalidISBNException("ISBN cannot be zero");
		this.iSBN = iSBN;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+getName()+" isbn: "+getiSBN();

	}
	
}
