package ebooksstore;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
*
* @author Lizuca
*/
public class BookStoreConsole {
	
	BookStore bookStore;
	
	public BookStoreConsole(BookStore bookStore) {
		this.bookStore = bookStore;
	}

	public static void main(String[] args) {
		
		BookStore bookStore = new BookStore();
		
		BookStoreConsole bookStoreConsole = new BookStoreConsole(bookStore);		
		bookStoreConsole.mainMenu();
	}
	
	public void mainMenu() {
		Scanner enteredLine;		
		do {
			enteredLine = new Scanner(System.in);
			
			System.out.println("Enter what you want to do (use the indicated number):");
			System.out.println("1. Add a book");
			System.out.println("2. List all books");
			System.out.println("3. Sell a book");
			System.out.println("4. List sold books");
			System.out.println("0. Exit");			
			
			if(!enteredLine.hasNextInt()) {
				continue;
			}
			
			switch (enteredLine.nextInt()) {
			case 1:
				addBook();
				// after adding a book we continue by redisplaying the main menu
				continue;
			case 2:
				listBooks();
				continue;
			case 3:
				sellBook();
				continue;
			case 4:
				listSoldBooks();
				continue;		
			default:
				return;			
			}
		} while(true);
	}

	enum Types { NOVEL, ARTALBUM, TECHNICAL };
	
	class BookFactory {
		Types type;
		
		public void setType(Types type) {
			this.type = type;
		}
		
		public Book createBook() {
			switch(type) {
			case NOVEL:
				return new Novel();
			case ARTALBUM:
				return new ArtAlbum();
			case TECHNICAL:
				return new Technical();
			}
			return null;		
		}
	}
	
	private void addBook() {
		
		final BookFactory bookFactory = new BookFactory();
		
		readFromConsoleUntilSuccess(
			new InputProcessor() {
				public boolean process(Scanner enteredLine, InputValidator validator) {
					System.out.println("Enter type of the book");
					String type = enteredLine.nextLine();
					if(!validator.isValid(type)) {
						System.out.println(validator.getError());
						return false;
					}
					bookFactory.setType(Types.valueOf(type.toUpperCase()));
					return true;
				}
			}, new InputValidator() {
				@Override
				public boolean isValid(Object input) {
					String type = (String) input;
					try {
						Types.valueOf(type.toUpperCase());
					} catch(IllegalArgumentException e) {
						error = "Type must be one of " + Arrays.toString(Types.values());
						return false;
					}
					return true;
				}
			});
		
		final Book book = bookFactory.createBook();
		
		readFromConsoleUntilSuccess(
                new InputProcessor() {			
			public boolean process(Scanner enteredLine, InputValidator validator) {
				System.out.println("Enter ISBN of the book");
				String isbn = enteredLine.nextLine();
				if (!validator.isValid(isbn)) {
					System.out.println(validator.getError());
					return false;
				}
				book.setIsbn(isbn);
				return true;
			}
		}, new InputValidator() {
			@Override
			public boolean isValid(Object input) {
				String isbn = (String) input;
				if (bookStore.lookupBook(isbn) != null) {
					error = "A book with that ISBN already exists in the library";
					return false;
				}
				return true;
			}
		});
		
		readFromConsoleUntilSuccess(new InputProcessor() {			
			public boolean process(Scanner enteredLine, InputValidator validator) {
				System.out.println("Enter the title of the book");
				String title = enteredLine.nextLine();                                
				book.setTitle(title);
				return true;
			}
		}, null);		
				
		readFromConsoleUntilSuccess(new InputProcessor() {			
			public boolean process(Scanner enteredLine, InputValidator validator) {
				System.out.println("Enter number of pages of the book");
				if (!enteredLine.hasNextInt()) {
					System.out.println("Page number must be an integer!");
					return false;
				}
				int numberOfPages = enteredLine.nextInt();
				book.setNumberOfPages(numberOfPages);
				return true;
			}
		}, null);
		
		readFromConsoleUntilSuccess(new InputProcessor() {			
			public boolean process(Scanner enteredLine, InputValidator validator) {
				System.out.println("Enter number of authors of the book");
				if (!enteredLine.hasNextInt()) {
					System.out.println("Number of authors must be an integer!");
					return false;
				}				
				int numberOfAuthors = enteredLine.nextInt();
				if (numberOfAuthors < 1) {
					System.out.println("A book must have at least one author!");
					return false;
				}
				for (int a = 0; a < numberOfAuthors; a++) {					
					Scanner authorScanner;
					System.out.println("Enter the author's name");
					authorScanner = new Scanner(System.in);
					String name = authorScanner.nextLine();
					System.out.println("Enter the author's surname");
					authorScanner = new Scanner(System.in);
					String surname = authorScanner.nextLine();
					Author author = bookStore.lookupAuthor(name, surname);
					if (author == null) {
						author = new Author(name, surname);
						bookStore.addAuthor(author);
						System.out.println("Creating author");
					} else {
						System.out.println("Using existing author found in the system");
					}
					book.addAuthor(author);
				}
				return true;
			}
		}, null);		

		readFromConsoleUntilSuccess(
			new InputProcessor() {
				@Override
				public boolean process(Scanner enteredLine, InputValidator validator) {
					System.out.println("Enter the price of the book");
					if (!enteredLine.hasNextFloat()) {
						System.out.println("Price must be a number!");
						return false;
					}
					BigDecimal price = enteredLine.nextBigDecimal();
					if (!validator.isValid(price)) {
						System.out.println(validator.getError());
						return false;
					}
					book.setPrice(price);
					return true;
				}
			},
			new InputValidator() {
				@Override
				public boolean isValid(Object input) {
					BigDecimal price = (BigDecimal) input;	
					// we could check price * 100 == (int) price * 100, but does not work if price is float
					if (price.scale() <= 2) {
						return true;
					} else {
						error = "Price must have at most 2 decimals!";
						return false;
					}
				}
			});
		
		readFromConsoleUntilSuccess(
			new InputProcessor() {
				@Override
				public boolean process(Scanner enteredLine, InputValidator validator) {
					System.out.println("Enter the rating of the book");
					if (!enteredLine.hasNextFloat()) {
						System.out.println("Rating must be a number!");
						return false;
					}
					BigDecimal rating = enteredLine.nextBigDecimal();
					if (!validator.isValid(rating)) {
						System.out.println(validator.getError());
						return false;
					}
					book.setRating(rating);
					return true;
				}
			}, ratingValidator);	
		
		bookStore.add(book);
	}
	
	InputValidator ratingValidator = new InputValidator() {
		@Override
		public boolean isValid(Object input) {
			BigDecimal rating = (BigDecimal) input;
			BigDecimal fractionalPart = rating.remainder(BigDecimal.ONE);					
			if (
					// check if value is between 1 and 5
					rating.compareTo(new BigDecimal(1)) >= 0 && rating.compareTo(new BigDecimal(5)) <= 0 &&
					// check if decimal is of one digit 
					rating.scale() <= 1 && 
					// check if fractional part is 0 or 0.5
					(fractionalPart.equals(new BigDecimal(0.5)) || fractionalPart.equals(BigDecimal.ZERO))) {											
				return true;
			} else {
				error = "Rating must be between 1 and 5, it must have at most 1 decimal and that should be 0.5!";
				return false;
			}
		}
	};
	
	private void listBooks() {
		bookStore.list();
	}

	class SoldBookInfo {
		Book book;
		Rating rating = new Rating();
	}
	
	private void sellBook() {
	
		// we use this to store the data read from the user in the anonymous InputProcessor classes
		final SoldBookInfo soldBookInfo = new SoldBookInfo();
		
		readFromConsoleUntilSuccess(new InputProcessor() {			
			public boolean process(Scanner enteredLine, InputValidator validator) {
				System.out.println("Enter ISBN of the sold book");
				String isbn = enteredLine.nextLine();
				
				Book book = bookStore.lookupBook(isbn);
				if (book != null) {
					soldBookInfo.book = book;
					return true;
				} else {
					System.out.println("No book with that ISBN was found");
					return false;
				}
			}
		}, null);
		
		readFromConsoleUntilSuccess(
			new InputProcessor() {
				@Override
				public boolean process(Scanner enteredLine, InputValidator validator) {
					System.out.println("Enter the stars for the sold book");
					if (!enteredLine.hasNextFloat()) {
						System.out.println("Stars must be a number!");
						return false;
					}
					BigDecimal stars = enteredLine.nextBigDecimal();
					if (!validator.isValid(stars)) {
						System.out.println(validator.getError());
						return false;
					}					
					soldBookInfo.rating.setStars(stars);					
					return true;
				}
			}, ratingValidator);
		
		readFromConsoleUntilSuccess(new InputProcessor() {			
			public boolean process(Scanner enteredLine, InputValidator validator) {
				System.out.println("Enter user id of the buyer");
				if (!enteredLine.hasNextInt()) {
					System.out.println("The user id be an integer!");
					return false;
				}
				int userId = enteredLine.nextInt();
				soldBookInfo.rating.setUserId(userId);
				return true;
			}
		}, null);
		
		readFromConsoleUntilSuccess(new InputProcessor() {			
			public boolean process(Scanner enteredLine, InputValidator validator) {
				System.out.println("Enter the description");
				String description = enteredLine.nextLine();
				if (!validator.isValid(description)) {
					System.out.println(validator.getError());
					return false;
				}
				soldBookInfo.rating.setDescription(description);
				return true;
			}
		}, 
		new InputValidator() {
			@Override
			public boolean isValid(Object input) {
				String description = (String) input; 	
				if (description.length() < 255) {
					return true;
				} else {
					error = "The description must be at most 255 characters!";
					return false;
				}
			}
		});	
		
		bookStore.sell(soldBookInfo.rating, soldBookInfo.book);
	}
	
	private void listSoldBooks() {
		bookStore.listSoldBooks();
	}

	private void readFromConsoleUntilSuccess(InputProcessor inputProcessor, InputValidator validator) {
		boolean success;
		do {
			Scanner enteredLine = new Scanner(System.in);			
			success = inputProcessor.process(enteredLine, validator);
		} while (!success);
	}
	
	private interface InputProcessor {
		boolean process(Scanner enteredLine, InputValidator validator);
	}
	
	private abstract class InputValidator {
		String error;
		
		abstract boolean isValid(Object input);
		
		public String getError() {
			return error;
		}
	}
}
