package p007c.p190n.p430e.p432e0.p435b0;

import java.lang.reflect.AccessibleObject;
import p007c.p190n.p430e.p432e0.JavaVersion;

/* JADX INFO: renamed from: c.n.e.e0.b0.b, reason: use source file name */
/* JADX INFO: compiled from: ReflectionAccessor.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ReflectionAccessor {

    /* JADX INFO: renamed from: a */
    public static final ReflectionAccessor f27456a;

    static {
        f27456a = JavaVersion.f27483a < 9 ? new PreJava9ReflectionAccessor() : new UnsafeReflectionAccessor();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo12273a(AccessibleObject accessibleObject);
}
