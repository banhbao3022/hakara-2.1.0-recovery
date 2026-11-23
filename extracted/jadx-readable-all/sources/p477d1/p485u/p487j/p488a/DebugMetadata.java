package p477d1.p485u.p487j.p488a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: i */
/* JADX WARN: Method from annotation default annotation not found: n */
/* JADX WARN: Method from annotation default annotation not found: s */
/* JADX INFO: renamed from: d1.u.j.a.e, reason: use source file name */
/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DebugMetadata {
    /* JADX INFO: renamed from: c */
    String m13068c() default "";

    /* JADX INFO: renamed from: f */
    String m13069f() default "";

    /* JADX INFO: renamed from: l */
    int[] m13070l() default {};

    /* JADX INFO: renamed from: m */
    String m13071m() default "";

    /* JADX INFO: renamed from: v */
    int m13072v() default 1;
}
