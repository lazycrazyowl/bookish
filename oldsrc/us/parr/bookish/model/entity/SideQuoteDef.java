package us.parr.bookish.entity;

import org.antlr.v4.runtime.Token;
import us.parr.bookish.translate.Translator;

public class SideQuoteDef extends EntityDef {
	public String quote;
	public String author;

	public SideQuoteDef(int index, Token startToken, String quote, String author) {
		super(index, startToken);
		this.quote = Translator.stripCurlies(quote);
		this.author = Translator.stripCurlies(author);
	}

	public boolean isSideItem() { return true; }
}
