package p623k1.p626g0;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: k1.g0.n, reason: use source file name */
/* JADX INFO: compiled from: PATCH.java */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface PATCH {
    String value() default "";
}
