
package one.microstream.demo.bookstore.data;

import static java.util.Objects.requireNonNull;

import java.util.Locale;

public class Language
{
	private final Locale locale;
	
	public Language(
		final Locale locale
	)
	{
		super();
		this.locale = requireNonNull(locale, () -> "Locale cannot be null");
	}
	
	public Locale locale()
	{
		return this.locale;
	}

	public String name()
	{
		return this.locale.getDisplayName();
	}

	@Override
	public String toString()
	{
		return "Language [locale=" + this.locale + "]";
	}

}
