package p007c.p190n.p430e.p431d0;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: c.n.e.d0.b, reason: use source file name */
/* JADX INFO: compiled from: SerializedName.java */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface SerializedName {
    String[] alternate() default {};

    String value();
}
