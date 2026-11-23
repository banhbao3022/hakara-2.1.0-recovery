package p636z0.p759s;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: z0.s.v, reason: use source file name */
/* JADX INFO: compiled from: OnLifecycleEvent.java */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OnLifecycleEvent {
    Lifecycle3.a value();
}
