package p007c.p190n.p430e.p431d0;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: c.n.e.d0.a, reason: use source file name */
/* JADX INFO: compiled from: JsonAdapter.java */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAdapter {
    boolean nullSafe() default true;

    Class<?> value();
}
