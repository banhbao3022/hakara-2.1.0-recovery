package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ya2 {

    /* JADX INFO: renamed from: a */
    public final Unsafe f21833a;

    public ya2(Unsafe unsafe) {
        this.f21833a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo8616a(Object obj, long j2, byte b);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo8617b(Object obj, long j2);

    /* JADX INFO: renamed from: c */
    public abstract void mo8618c(Object obj, long j2, boolean z);

    /* JADX INFO: renamed from: d */
    public abstract float mo8619d(Object obj, long j2);

    /* JADX INFO: renamed from: e */
    public abstract void mo8620e(Object obj, long j2, float f);

    /* JADX INFO: renamed from: f */
    public abstract double mo8621f(Object obj, long j2);

    /* JADX INFO: renamed from: g */
    public abstract void mo8622g(Object obj, long j2, double d);

    /* JADX INFO: renamed from: h */
    public final long m8781h(Field field) {
        return this.f21833a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: i */
    public final int m8782i(Class<?> cls) {
        return this.f21833a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: j */
    public final int m8783j(Class<?> cls) {
        return this.f21833a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: k */
    public final int m8784k(Object obj, long j2) {
        return this.f21833a.getInt(obj, j2);
    }

    /* JADX INFO: renamed from: l */
    public final void m8785l(Object obj, long j2, int i) {
        this.f21833a.putInt(obj, j2, i);
    }

    /* JADX INFO: renamed from: m */
    public final long m8786m(Object obj, long j2) {
        return this.f21833a.getLong(obj, j2);
    }

    /* JADX INFO: renamed from: n */
    public final void m8787n(Object obj, long j2, long j3) {
        this.f21833a.putLong(obj, j2, j3);
    }

    /* JADX INFO: renamed from: o */
    public final Object m8788o(Object obj, long j2) {
        return this.f21833a.getObject(obj, j2);
    }

    /* JADX INFO: renamed from: p */
    public final void m8789p(Object obj, long j2, Object obj2) {
        this.f21833a.putObject(obj, j2, obj2);
    }
}
