package com.oogly.htmlentities;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * HTMLEntities - http://www.w3schools.com/tags/ref_entities.asp
 * TODO:
 *  Make extensible enum via commons
 *  Build in StringEscapeUtils functionality for escaping
 *  Move into super class for each entity
 * @author Jonathan Holloway
 */
public enum HTMLEnt {

	// Reserved Characters
	AMP("&", 38, "&amp;", "ampersand"), 
	QUOTE("\"", 34, "&quot;", "quotation mark"), 
	APOSTROPHE("\'", 39, "&apos;", "apostrophe"), 
	LESSTHAN("<", 60, "&lt;", "less-than"), 
	GREATERTHAN(">", 62, "&gt;", "greater-than"), 
	NONBREAKINGSPACE(" ", 160, "&nbsp;", "non-breaking space"), 
	INVERTED_EXCLAMATION_MARK("¡", 161, "&iexcl;", "inverted exclamation mark"),
	
	// ISO 8859-1 Symbols
	CENT("¢", 162, "&cent;", "cent"),
	POUND("£", 163, "&pound;", "pound"),
	CURRENCY("¤", 164, "&curren;", "currency"),
	YEN("¥", 165, 	"&yen;", "yen"),
	BROKEN_VERTICAL_BAR("¦", 166,	"&brvbar;", "broken vertical bar"),
	SECTION("§", 167, 	"&sect;", "section"),
	SPACING_DIAERESIS("¨", 168, "&uml;", "spacing diaeresis"),
	COPYRIGHT("©", 169,	"&copy;", "copyright"),
	FEMININE_ORDINAL_INDICATOR("ª", 170, "&ordf;", "feminine ordinal indicator"),
	LEFTANGLE_QUOTATIONMARK("«", 171, "&laquo;", "angle quotation mark (left)"),
	NEGATION("¬", 172, "&not;", "negation"),
	SOFTHYPHEN­(" ", 173, "&shy;", "soft hyphen"),
	REGISTERED_TRADEMARK("®", 174, "&reg;", "registered trademark"),
	SPACINGMACRON("¯", 175, "&macr;", "spacing macron"),
	DEGREE("°", 176, "&deg;","degree"),
	PLUSORMINUS("±", 177, "&plusmn;", "plus-or-minus"), 
	SUPERSCRIPT_2("²", 178, "&sup2;", "superscript 2"),
	SUPERSCRIPT_3("³", 179, "&sup3;", "superscript 3"),
	SPACING_ACUTE("´", 180, "&acute;", "spacing acute"),
	MICRO("µ", 181, "&micro;", "micro"),
	PARAGRAPH("¶", 182, "&para;", "paragraph"),
	MIDDLEDOT("·", 183, "&middot;", "middle dot"),
	SPACING_CEDILLA("¸", 184, "&cedil;", "spacing cedilla"),
	SUPERSCRIPT_1("¹", 185, "&sup1", "superscript 1"),
	MASCULINE_ORGINAL_INDICATOR("º", 186, 	"&ordm;", "masculine ordinal indicator"),
	RIGHTANGLE_QUOTATIONMARK("»", 187, 	"&raquo;", "angle quotation mark (right)"),
	FRACTION_QUARTER("¼", 188, 	"&frac14", "fraction 1/4"),
	FRACTION_HALF("½", 189, "&frac12;", "fraction 1/2"),
	FRACTION_THREEQUARTERS("¾", 190, "&frac34;", "fraction 3/4"),
	INVERETED_QUESTIONMARK("¿", 191, "&iquest;", "inverted question mark"),
	MULTIPLICATION("×", 215, 	"&times;", "multiplication"),
	DIVISION("÷", 247, 	"&divide;", "division"),

	// Character Symbols
	CAPITAL_A_GRAVE("À	", 192, "&Agrave;","capital a, grave accent"),
	CAPITAL_A_ACUTE("Á", 193, 	"&Aacute;","capital a, acute accent"),
	CAPITAL_A_CIRCUMFLEX("Â", 194, 	"&Acirc;","capital a, circumflex accent"),
	CAPITAL_A_TILDE("Ã", 195, 	"&Atilde;","capital a, tilde"),
	CAPITAL_A_UMLAUT("Ä", 196, 	"&Auml;","capital a, umlaut mark"),
	CAPITALA_RING("Å", 197, 	"&Aring;","capital a, ring"),
	CAPITAL_AE("Æ", 198, 	"&AElig;","capital ae"),
	CAPITAL_C_CEDILLA("Ç", 199, 	"&Ccedil;","capital c, cedilla"),
	CAPITAL_E_GRAVE("È", 200, 	"&Egrave;","capital e, grave accent"),
	CAPITAL_E_ACUTE("É", 201, 	"&Eacute;","capital e, acute accent"),
	CAPITAL_E_CIRCUMFLEX("Ê", 202, 	"&Ecirc;","capital e, circumflex accent"),
	CAPITAL_E_UMLAUT("Ë", 203, 	"&Euml;","capital e, umlaut mark"),
	CAPITAL_I_GRAVE("Ì", 204, 	"&Igrave;","capital i, grave accent"),
	CAPITAL_I_ACUTE("Í", 205, 	"&Iacute;","capital i, acute accent"),
	CAPITAL_I_CIRCUMFLEX("Î", 206, 	"&Icirc;","capital i, circumflex accent"),
	CAPITAL_I_UMLAUT("Ï", 207, 	"&Iuml;","capital i, umlaut mark"),
	CAPITAL_ETH_ICELANDIC("Ð", 208, 	"&ETH;","capital eth, Icelandic"),
	CAPITAL_N_TILDE("Ñ", 209, 	"&Ntilde;","capital n, tilde"),
	CAPITAL_O_GRAVE("Ò", 210, 	"&Ograve;","capital o, grave accent"),
	CAPITAL_O_ACUTE("Ó", 211, 	"&Oacute;","capital o, acute accent"),
	CAPITAL_O_CIRCUMFLEX("Ô", 212, 	"&Ocirc;","capital o, circumflex accent"),
	CAPITAL_O_TILDE("Õ", 213, 	"&Otilde;","capital o, tilde"),
	CAPITAL_O_UMLAUT("Ö", 214, 	"&Ouml;","capital o, umlaut mark"),
	CAPITAL_O_SLASH("Ø", 216, 	"&Oslash;"," 	capital o, slash"),
	CAPITAL_U_GRAVE("Ù", 217, 	"&Ugrave;"," 	capital u, grave accent"),
	CAPITAL_U_ACUTE	("Ú", 218, 	"&Uacute;"," 	capital u, acute accent"),
	CAPITAL_U_CIRCUMFLEX("Û", 219, 	"&Ucirc;"," 	capital u, circumflex accent"),
	CAPITAL_U_UMLAUT("Ü", 220, 	"&Uuml;"," 	capital u, umlaut mark"),
	CAPITAL_Y_ACUTE("Ý", 221, 	"&Yacute;"," 	capital y, acute accent"),
	CAPITAL_THORN_ICELANDIC("Þ", 222, 	"&THORN;"," 	capital THORN, Icelandic"),
	SMALL_SHARP_S_GERMAN("ß", 223, 	"&szlig;","small sharp s, German"),
	SMALL_A_GRAVE("à", 224, 	"&agrave;","small a, grave accent"),
	SMALL_A_ACUTE_ACCENT("á", 225, 	"&aacute;",	"small a, acute accent"),
	SMALL_A_CIRCUMFLEX("â", 226, 	"&acirc;", "small a, circumflex accent"),
	SMALL_A_TILDE("ã", 227, 	"&atilde;", "small a, tilde"),
	SMALL_A_UMLAUT("ä", 228, 	"&auml;", "small a, umlaut mark"),
	SMALL_A_RING("å", 229, 	"&aring;", "small a, ring"),
	SMALL_AE("æ", 230, 	"&aelig;", "small ae"),
	SMALL_C_CEDILLA("ç", 231, 	"&ccedil;", "small c, cedilla"),
	SMALL_E_GRAVE("è", 232, 	"&egrave;", "small e, grave accent"),
	SMALL_E_ACUTE("é", 233, 	"&eacute;", "small e, acute accent"),
	SMALL_E_CIRCUMFLEX("ê", 234, 	"&ecirc;", "small e, circumflex accent"),
	SMALL_E_UMLAUT	("ë", 235, 	"&euml;", "small e, umlaut mark"),
	SMALL_I_GRAVE("ì", 236, 	"&igrave;", "small i, grave accent"),
	SMALL_I_ACUTE("í", 237, 	"&iacute;","small i, acute accent"),
	SMALL_I_CIRCUMFLEX("î", 238, 	"&icirc;", "small i, circumflex accent"),
	SMALL_I_UMLAUT("ï", 239, 	"&iuml;", "small i, umlaut mark"),
	SMALL_I_ETH("ð", 240, 	"&eth;", "small eth, Icelandic"),
	SMALL_N_TILDE("ñ", 241, 	"&ntilde;","small n, tilde"),
	SMALL_O_GRAVE("ò", 242, 	"&ograve;","small o, grave accent"),
	SMALL_O_ACUTE("ó", 243, 	"&oacute;","small o, acute accent"),
	SMALL_O_CIRCUMFLEX("ô", 244, 	"&ocirc;", "small o, circumflex accent"),
	SMALL_O_TILDE("õ", 245, 	"&otilde;", "small o, tilde"),
	SMALL_O_UMLAUT("ö", 246, 	"&ouml;", "small o, umlaut mark"),
	SMALL_O_SLASH("ø", 248, 	"&oslash;",	"small o, slash"),
	SMALL_U_GRAVE("ù", 249, 	"&ugrave;",	"small u, grave accent"),
	SMALL_U_ACUTE("ú", 250, 	"&uacute;", "small u, acute accent"),
	SMALL_U_CIRCUMFLEX("û", 251, 	"&ucirc;", "small u, circumflex accent"),
	SMALL_U_UMLAUT("ü", 252, 	"&uuml;", "small u, umlaut mark"),
	SMALL_Y_ACUTE("ý", 253, 	"&yacute;", "small y, acute accent"),
	SMALL_THORN_ICELANDIC("þ", 254, 	"&thorn;", "small thorn, Icelandic"),
	SMALL_Y_UMLAUT("ÿ", 255, 	"&yuml;", "small y, umlaut mark"),
	
	// Math Symbols
	FORALL("∀", 8704,  	"&forall;", "for all"),
	PART("∂", 8706, 	"&part;", "part"),
	EXISTS("∃", 8707, 	"&exists;", "exists"),
	EMPTY("∅", 8709, 	"&empty;", "empty"),
	NABLA("∇", 8711, 	"&nabla;", "nabla"),
	ISIN("∈", 8712, 	"&isin;", "isin"),
	NOTIN("∉", 8713, 	"&notin;", "notin"),
	NI("∋", 8715, 	"&ni;", "ni"),
	PROD("∏", 8719, 	"&prod;", "prod"),
	SUM("∑", 8721, 	"&sum;", "sum"),
	MINUS("−", 8722, 	"&minus;", "minus"),
	LOWAST("∗", 8727, 	"&lowast;", "lowast"),
	SQUARE_ROOT("√", 8730, 	"&radic;", "square root"),
	PROPORTIONAL_TO("∝", 8733, 	"&prop;", "proportional to"),
	INFINITY("∞", 8734, 	"&infin;", "infinity"),
	ANGLE("∠", 8736, 	"&ang;", "angle"),
	AND("∧", 8743, 	"&and;", "and"),
	OR("∨", 8744, 	"&or;", "or"),
	CAP("∩", 8745, 	"&cap;", "cap"),
	CUP("∪", 8746, 	"&cup;", "cup"),
	INTEGRAL("∫", 8747, 	"&int;", "integral"),
	THEREFORE("∴", 8756, 	"&there4;", "therefore"),
	SIMILAR_TO("∼", 8764, 	"&sim;","similar to"),
	CONGRUENT_TO("≅", 8773, 	"&cong;","congruent to"),
	ALMOST_EQUAL("≈", 8776, 	"&asymp;", "almost equal"),
	NOT_EQUAL("≠", 8800, 	"&ne;", "not equal"),
	EQUIVALENT("≡", 8801, 	"&equiv;", "equivalent"),
	LESS_OR_EQUAL("≤", 8804, 	"&le;", "less or equal"),
	GREATER_OR_EQUAL("≥", 8805, 	"&ge;", "greater or equal"),
	SUBSET_OF("⊂", 8834, 	"&sub;", "subset of"),
	SUPERSET_OF("⊃", 8835, 	"&sup;", "superset of"),
	NOT_SUBSET_OF("⊄", 8836, 	"&nsub;", "not subset of"),
	SUBSET_OR_EQUAL("⊆", 8838, 	"&sube;", "subset or equal"),
	SUPERSET_OR_EQUAL("⊇", 8839, 	"&supe;", "superset or equal"),
	CIRCLED_PLUS("⊕", 8853, 	"&oplus;", "circled plus"),
	CIRCLED_TIMES("⊗", 8855, 	"&otimes;", "cirled times"),
	PERPENDICULAR("⊥", 8869, 	"&perp;", "perpendicular"),
	DOT_OPERATOR("⋅", 8901, 	"&sdot;", "dot operator"),
	
	ALPHA("Α", 913,  	"&Alpha;", "Alpha"),
	BETA("Β", 914, 	"&Beta;","Beta"),
	GAMMA("Γ", 915, 	"&Gamma;"," 	Gamma"),
	DELTA("Δ", 916, 	"&Delta;"," 	Delta"),
	EPSILON("Ε", 917, 	"&Epsilon;"," 	Epsilon"),
	ZETA("Ζ", 918, 	"&Zeta;"," 	Zeta"),
	ETA("Η", 919, 	"&Eta;"," 	Eta"),
	THETA("Θ", 920, 	"&Theta;"," 	Theta"),
	IOTA("Ι", 921, 	"&Iota;"," 	Iota"),
	KAPPA("Κ", 922, 	"&Kappa;"," 	Kappa"),
	LAMBDA("Λ", 923, 	"&Lambda;"," 	Lambda"),
	MU("Μ", 924, 	"&Mu;"," 	Mu"),
	NU("Ν", 925, 	"&Nu;"," 	Nu"),
	XI("Ξ", 926, 	"&Xi;"," 	Xi"),
	OMICRON("Ο", 927, 	"&Omicron;"," 	Omicron"),
	PI("Π", 928, 	"&Pi;"," 	Pi"),
	RHO("Ρ", 929, 	"&Rho;"," 	Rho"),	
	SIGMA_F("ς", 962, "&sigmaf;", "sigmaf"),	
	SIGMA("Σ", 931, 	"&Sigma;"," 	Sigma"),
	TAU("Τ", 932, 	"&Tau;"," 	Tau"),
	UPSILON("Υ", 933, 	"&Upsilon;"," 	Upsilon"),
	PHI("Φ", 934, 	"&Phi;"," 	Phi"),
	CHI("Χ", 935, 	"&Chi;"," 	Chi"),
	PSI("Ψ", 936, 	"&Psi;"," 	Psi"),
	OMEGA("Ω", 937, 	"&Omega;"," 	Omega"),  	  	 
	ALPHA_SYM("α", 945, 	"&alpha;"," 	alpha"),
	BETA_SYM("β", 946, 	"&beta;"," 	beta"),
	GAMMA_SYM("γ", 947, 	"&gamma;"," 	gamma"),
	DELTA_SYM("δ", 948, 	"&delta;"," 	delta"),
	EPSILON_SYM("ε", 949, 	"&epsilon;"," 	epsilon"),
	ZETA_SYM("ζ", 950, 	"&zeta;"," 	zeta"),
	ETA_SYM("η", 951, 	"&eta;"," 	eta"),
	THETA_SYM("θ", 952, 	"&theta;"," 	theta"),
	IOTA_SYM("ι", 953, 	"&iota;"," 	iota"),
	KAPPA_SYM("κ", 954, 	"&kappa;"," 	kappa"),
	LAMBDA_SYM("λ", 955, 	"&lambda;"," 	lambda"),
	MU_SYM("μ", 956, 	"&mu;"," 	mu"),
	BU_SYM("ν", 957, 	"&nu;"," 	nu"),
	XI_SYM("ξ", 958, 	"&xi;"," 	xi"),
	OMICRON_SYM("ο", 959, 	"&omicron;"," 	omicron"),
	PI_SYM("π", 960, 	"&pi;"," 	pi"),
	RHO_SYM("ρ", 961, 	"&rho;"," 	rho"),
	SIGMAF_SYM("ς", 962, 	"&sigmaf;"," 	sigmaf"),
	SIGMA_SYM("σ", 963, 	"&sigma;"," 	sigma"),
	TAU_SYM("τ", 964, 	"&tau;"," 	tau"),
	UPSILON_SYM("υ", 965, 	"&upsilon;"," 	upsilon"),
	PHI_SYM("φ", 966, 	"&phi;"," 	phi"),
	CHI_SYM("χ", 967, 	"&chi;"," 	chi"),
	PSI_SYM("ψ", 968, 	"&psi;"," 	psi"),
	OMEGA_SYM("ω", 969, 	"&omega;"," 	omega"), 	  	 
	THETA_SYMBOL("ϑ", 977, 	"&thetasym;"," 	theta symbol"),
	UPSILON_SYMBOL("ϒ", 978, 	"&upsih;"," 	upsilon symbol"),
	PI_SYMBOL("ϖ", 982, 	"&piv;"," 	pi symbol"),
	
	CAPITAL_LIGATURE_OE("Œ", 338,  	"&OElig;", "capital ligature OE"),
	SMALL_LIGATURE_OE("œ", 339, 	"&oelig;", "small ligature oe"),
	CAPITAL_S_WITH_CARON("Š", 352, 	"&Scaron;", "capital S with caron"),
	SMALL_S_WITH_CARON("š", 353, 	"&scaron;", "small S with caron"),
	CAPITAL_Y_WITH_DIARES("Ÿ", 376, 	"&Yuml;", "capital Y with diaeres"),
	F_WITH_HOOK("ƒ", 402, 	"&fnof;", "f with hook"),
	MODIFIER_LETTER_CIRCUMFLEX("ˆ", 710, 	"&circ;", "modifier letter circumflex accent"),
	TILDE_("˜", 732, 	"&tilde;", "small tilde"),
	EN_SPACE(" ", 8194, 	"&ensp;", "en space"),
	EM_SPACE(" ", 8195, 	"&emsp;", "em space"),
	THIN_SPACE(" ", 8201, 	"&thinsp;", "thin space"),
	ZERO_WIDTH_NONJOINER(" ", 8204,	"&zwnj;","zero width non-joiner"),
	
	// Non displayable character start
	ZERO_WIDTH_JOINER("‍", 8205, "&zwj;","zero width joiner"),
	LEFT_TO_RIGHT_MARK("‎", 8206, 	"&lrm;","left-to-right mark"),
	RIGHT_TO_LEFT_MARK("‏", 8206, 	"&lrm;","left-to-right mark"),
	// Non displayable character end
	
	EM_DASH("—", 8212, 	"&mdash;","em dash"),	
	LEFT_SINGLE_QUOTATION("‘", 8216, "&lsquo;","left single quotation mark"),
	RIGHT_SINGLE_QUOTATION("’", 8217, "&rsquo;","right single quotation mark"),
	SINGLE_LOW9_QUOTATION("‚", 8218, "&sbquo;","single low-9 quotation mark"),
	LEFT_DOUBLE_QUOTATION("“", 8220, 	"&ldquo;"," 	left double quotation mark"),
	RIGHT_DOUBLE_QUOTATION("”", 8221, 	"&rdquo;"," 	right double quotation mark"),
	DOUBLE_LOW9_QUOTATION("„", 8222, 	"&bdquo;"," 	double low-9 quotation mark"),
	DAGGAR("†", 8224, 	"&dagger;"," 	dagger"),
	DOUBLE_DAGGAR("‡", 8225, 	"&Dagger;"," 	double dagger"),
	BULLET("•", 8226, 	"&bull;"," 	bullet"),
	HORIZONTAL_ELLIPSIS("…", 8230, 	"&hellip;"," 	horizontal ellipsis"),
	PER_MILLE("‰", 8240, 	"&permil;"," 	per mille"), 
	MINUTES("′", 8242, 	"&prime;"," 	minutes"),
	SECONDS("″", 8243, 	"&Prime;"," 	seconds"),
	SINGLE_LEFTANGLE_QUOTATION("‹", 8249, 	"&lsaquo;"," 	single left angle quotation"),
	SINGLE_RIGHTANGLE_QUOTATION("›", 8250, 	"&rsaquo;"," 	single right angle quotation"),
	OVERLINE("‾", 8254, 	"&oline;"," 	overline"),
	EURO("€", 8364, 	"&euro;"," 	euro"),
	TRADEMARK("™", 8482, 	"&trade;"," 	trademark"),
	LEFT_ARROW("←", 8592, 	"&larr;"," 	left arrow"),
	UP_ARROW("↑", 8593, 	"&uarr;"," 	up arrow"),
	RIGHT_ARROW("→", 8594, 	"&rarr;"," 	right arrow"),
	DOWN_ARROW("↓", 8595, 	"&darr;"," 	down arrow"),
	LEFTRIGHT_ARROW("↔", 8596, 	"&harr;"," 	left right arrow"),
	CR_ARROW("↵", 8629, 	"&crarr;"," 	carriage return arrow"),
	LEFT_CEILING("⌈", 8968, 	"&lceil;"," 	left ceiling"),
	RIGHT_CEILING("⌉", 8969, 	"&rceil;"," 	right ceiling"),
	LEFT_FLOOR("⌊", 8970, 	"&lfloor;"," 	left floor"),
	RIGHT_FLOOR("⌋", 8971, 	"&rfloor;", "right floor"),
	LOZENGE("◊", 9674, 	"&loz;", "lozenge"),
	SPADE("♠", 9824, 	"&spades;", "spade"),
	CLUB("♣", 9827, 	"&clubs;", "club"),
	HEART("♥", 9829, 	"&hearts;", "heart"),
	DIAMOND("♦", 9830, 	"&diams;", "diamond");
			
	private static final Map<Integer, HTMLEnt> lookupByCode = new HashMap<Integer, HTMLEnt>();
	private static final Map<Character, HTMLEnt> lookupByChar = new HashMap<Character, HTMLEnt>();

	private final String character;
	private final int number;
	private final String name;
	private final String description;

	static {
		for (HTMLEnt e : EnumSet.allOf(HTMLEnt.class)) {
			lookupByCode.put(e.getNumber(), e);
			lookupByChar.put(e.getChar().charAt(0), e);
		}
	}

	/**
	 * HTMLEnt constructor.
	 * @param character
	 * @param number
	 * @param name
	 * @param description
	 */
	private HTMLEnt(String character, int number, String name, String description) {
		this.character = character;
		this.number = number;
		this.name = name;
		this.description = description;
	}

	public String getChar() {
		return character;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getDescription() {
		return description;
	}

	/**
	 * Retrieve HTML Entity by number
	 * @param number to lookup by
	 * @return the HTML entity
	 */
	public static HTMLEnt getEntity(int number) {
		return lookupByCode.get(number);
	}
	
	/**
	 * Retrieve HTML Entity by number
	 * @param number to lookup by
	 * @return the HTML entity
	 */
	public static HTMLEnt getEntity(char character) {
		return lookupByChar.get(character);
	}
	
	/**
	 * toString is the character itself.
	 */
	public String toString() {
		return this.getChar();
	}

}
