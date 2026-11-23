package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ye2 extends xf2 {

    /* JADX INFO: renamed from: h */
    public static final yf2<String> f21862h = new yf2<>();

    /* JADX INFO: renamed from: i */
    public final Context f21863i;

    public ye2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2, Context context) {
        super(pe2Var, "V7RbzNcQH9mmO13CLejXnEeLBww1fCswCmEYgCbR7fg0aaDM8vr+ky2aLbvCnh+x", "DtfbH9Wfu3mjs65hNYuog0nW6dBYb/642xmI9hs2Qf0=", go0Var, i, 29);
        this.f21863i = context;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        go0 go0Var = this.f21525d;
        if (go0Var.f13191h) {
            go0Var.m6298m();
            go0Var.f13191h = false;
        }
        f31.m6757x((f31) go0Var.f13190g, "E");
        AtomicReference<String> atomicReferenceM8794a = f21862h.m8794a(this.f21863i.getPackageName());
        if (atomicReferenceM8794a.get() == null) {
            synchronized (atomicReferenceM8794a) {
                if (atomicReferenceM8794a.get() == null) {
                    atomicReferenceM8794a.set((String) this.f21526e.invoke(null, this.f21863i));
                }
            }
        }
        String str = atomicReferenceM8794a.get();
        synchronized (this.f21525d) {
            go0 go0Var2 = this.f21525d;
            String strM5292O0 = C2622l.m5292O0(str.getBytes(), true);
            if (go0Var2.f13191h) {
                go0Var2.m6298m();
                go0Var2.f13191h = false;
            }
            f31.m6757x((f31) go0Var2.f13190g, strM5292O0);
        }
    }
}
