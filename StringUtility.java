package com.string.reverse;

public class StringUtility {

	public static boolean isEmpty(final CharSequence charSequence) {
		return charSequence == null || charSequence.length() == 0;
	}

	public static boolean isNotEmpty(final CharSequence charSequence) {
		return !isEmpty(charSequence);
	}

	public static boolean isAnyEmpty(final CharSequence... css) {
		if (css == null) {
			return true;
		}
		for (CharSequence charSequence : css) {
			if (isEmpty(charSequence)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isNoneEmpty(final CharSequence... css) {
		return !isAnyEmpty(css);
	}

	public static boolean isAllEmpty(final CharSequence... css) {
		if (css == null)
			return true;
		for (CharSequence charSequence : css) {
			if (isNotEmpty(charSequence))
				return false;
		}
		return true;
	}

	public static boolean isBlank(final CharSequence cs) {
		if (isEmpty(cs))
			return true;
		int strlen = cs.length();
		for (int i = 0; i < strlen; i++) {
			if (Character.isWhitespace(cs.charAt(i)))
				return false;
		}
		return true;
	}

	public static boolean isNotBlank(final CharSequence cs) {
		return !isBlank(cs);
	}

	public static boolean isAnyBlank(final CharSequence... css) {
		if (css == null)
			return true;
		for (CharSequence charSequence : css) {
			if (isBlank(charSequence))
				return true;
		}
		return false;
	}

	public static boolean isNoneBlank(final CharSequence... css) {
		return !isAnyBlank(css);
	}

	public static boolean isAllBlank(final CharSequence... css) {
		if (css == null)
			return true;
		for (CharSequence charSequence : css) {
			if (!isBlank(charSequence))
				return false;
		}
		return true;
	}

	public static String trim(final String str) {
		return str == null ? null : str.trim();
	}

	public static String trimToNull(final String str) {
		return trim(str);
	}

	public static String trimToEmpty(final String str) {
		return str == null ? "" : str.trim();
	}

	public static String truncate(final String str, final int offset, final int maxWidth) {
		if (offset < 0)
			throw new IllegalArgumentException("offset cannot be negative");
		if (maxWidth < 0)
			throw new IllegalArgumentException("maxWidth cannot be negative");
		if (str == null)
			return "";
		if (str.length() > maxWidth) {
			final int ind = offset + maxWidth > str.length() ? str.length() : offset + maxWidth;
			return str.substring(offset, ind);
		}
		return str.substring(offset);
	}
}
