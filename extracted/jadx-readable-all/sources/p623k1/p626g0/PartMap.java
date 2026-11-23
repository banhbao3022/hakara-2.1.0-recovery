package p623k1.p626g0;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: k1.g0.r, reason: use source file name */
/* JADX INFO: compiled from: PartMap.java */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface PartMap {
    String encoding() default "binary";
}
