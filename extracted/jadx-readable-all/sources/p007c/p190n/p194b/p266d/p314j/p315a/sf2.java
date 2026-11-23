package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sf2 extends xf2 {

    /* JADX INFO: renamed from: h */
    public static volatile Long f19549h;

    /* JADX INFO: renamed from: i */
    public static final Object f19550i = new Object();

    public sf2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2) {
        super(pe2Var, "w88K96a81QAqecEx1Be7xBZ71wBzgDzB2ncLUmmSbS5j5T72Nq0PXydpfnGU7CdX", "D/80jmR/TcKhAUNfNeJDLyFk2By/w+5wEIxKJGOZawI=", go0Var, i, 33);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        if (f19549h == null) {
            synchronized (f19550i) {
                if (f19549h == null) {
                    f19549h = (Long) this.f21526e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f21525d) {
            try {
                go0 go0Var = this.f21525d;
                long jLongValue = f19549h.longValue();
                if (go0Var.f13191h) {
                    go0Var.m6298m();
                    go0Var.f13191h = false;
                }
                f31.m6706A((f31) go0Var.f13190g, jLongValue);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
