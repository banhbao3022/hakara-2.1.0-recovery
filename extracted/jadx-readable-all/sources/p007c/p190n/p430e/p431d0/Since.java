package p007c.p190n.p430e.p431d0;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: c.n.e.d0.c, reason: use source file name */
/* JADX INFO: compiled from: Since.java */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.FIELD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Since {
    double value();
}
