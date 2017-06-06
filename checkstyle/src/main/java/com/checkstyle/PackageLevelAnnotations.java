package com.checkstyle;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * My <b>interface</b>.
 * @see PackageLevelAnnotations
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PACKAGE)
public @interface PackageLevelAnnotations {
  // stuff as required.
}
