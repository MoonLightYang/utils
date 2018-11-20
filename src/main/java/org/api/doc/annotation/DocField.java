package org.api.doc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
public @interface DocField {

	String name() default ""; // 字段名称

	String sample() default ""; // 示例

	String remark() default ""; // 备注

	String range() default ""; // 长度范围限制

}
