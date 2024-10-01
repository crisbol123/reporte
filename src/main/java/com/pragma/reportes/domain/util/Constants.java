package com.pragma.reportes.domain.util;

public class Constants {
    private Constants() {
    }
    public static final String EMAIL = "EMAIL";
    public static final String ARTICLE_ID = "ARTICLE ID";

    public static final String NO_NEGATIVE_STOCK = "NO NEGATIVE STOCK ALLOWED";

    public static final String ELEMENT_NOT_FOUND_EXCEPTION_MESSAGE = "The %s does not exist";

    public static final int HTTP_STATUS_NO_NEGATIVE_STOCK = 409;

    public static final int HTTP_STATUS_ELEMENT_NOT_FOUND = 404;
}
