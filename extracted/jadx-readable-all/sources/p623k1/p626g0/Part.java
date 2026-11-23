package p623k1.p626g0;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: k1.g0.q, reason: use source file name */
/* JADX INFO: compiled from: Part.java */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Part {
    String encoding() default "binary";

    String value() default "";
}
