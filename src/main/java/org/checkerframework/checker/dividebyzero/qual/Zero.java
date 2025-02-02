package org.checkerframework.checker.dividebyzero.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/**
 * Qualifier for @Zero, to express integer values known to be zero
 */
@SubtypeOf({Top.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface Zero {}
