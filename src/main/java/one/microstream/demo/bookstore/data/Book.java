
package one.microstream.demo.bookstore.data;

import static java.util.Objects.requireNonNull;
import static one.microstream.demo.bookstore.util.ValidationUtils.requireNonBlank;
import static one.microstream.demo.bookstore.util.ValidationUtils.requirePositive;
import static one.microstream.demo.bookstore.util.ValidationUtils.validateIsbn13;

import javax.money.MonetaryAmount;

public class Book
{
	private final String         isbn13;
	private final String         title;
	private final Author         author;
	private final Genre          genre;
	private final Publisher      publisher;
	private final Language       language;
	private final MonetaryAmount purchasePrice;
	private final MonetaryAmount retailPrice;

	public Book(
		final String isbn13,
		final String title,
		final Author author,
		final Genre genre,
		final Publisher publisher,
		final Language language,
		final MonetaryAmount purchasePrice,
		final MonetaryAmount retailPrice
	)
	{
		super();
		this.isbn13        = validateIsbn13(isbn13);
		this.title         = requireNonBlank(title,         () -> "Title cannot be empty"                );
		this.author        = requireNonNull(author,         () -> "Author cannot be null"                );
		this.genre         = requireNonNull(genre,          () -> "Genre cannot be null"                 );
		this.publisher     = requireNonNull(publisher,      () -> "Publisher cannot be null"             );
		this.language      = requireNonNull(language,       () -> "Language cannot be null"              );
		this.purchasePrice = requirePositive(purchasePrice, () -> "Purchase price must be greater than 0");
		this.retailPrice   = requirePositive(retailPrice,   () -> "Retail price must be greater than 0"  );
	}

	public String isbn13()
	{
		return this.isbn13;
	}

	public String title()
	{
		return this.title;
	}

	public Author author()
	{
		return this.author;
	}

	public Genre genre()
	{
		return this.genre;
	}

	public Publisher publisher()
	{
		return this.publisher;
	}

	public Language language()
	{
		return this.language;
	}

	public MonetaryAmount purchasePrice()
	{
		return this.purchasePrice;
	}

	public MonetaryAmount retailPrice()
	{
		return this.retailPrice;
	}

	@Override
	public String toString()
	{
		return "Book [isbn13="
			+ this.isbn13
			+ ", title="
			+ this.title
			+ ", author="
			+ this.author
			+ ", genre="
			+ this.genre
			+ ", publisher="
			+ this.publisher
			+ ", language="
			+ this.language
			+ ", purchasePrice="
			+ this.purchasePrice
			+ ", retailPrice="
			+ this.retailPrice
			+ "]";
	}

}
