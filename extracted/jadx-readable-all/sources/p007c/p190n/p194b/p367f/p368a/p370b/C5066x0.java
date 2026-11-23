package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5086d0;

/* JADX INFO: renamed from: c.n.b.f.a.b.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5066x0 {

    /* JADX INFO: renamed from: a */
    public static final C5089f f25999a = new C5089f("ExtractorSessionStoreView");

    /* JADX INFO: renamed from: b */
    public final C5056u f26000b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5086d0<InterfaceC5037o2> f26001c;

    /* JADX INFO: renamed from: d */
    public final C5027m0 f26002d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5086d0<Executor> f26003e;

    /* JADX INFO: renamed from: f */
    public final Map<Integer, C5057u0> f26004f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final ReentrantLock f26005g = new ReentrantLock();

    public C5066x0(C5056u c5056u, InterfaceC5086d0<InterfaceC5037o2> interfaceC5086d0, C5027m0 c5027m0, InterfaceC5086d0<Executor> interfaceC5086d1) {
        this.f26000b = c5056u;
        this.f26001c = interfaceC5086d0;
        this.f26002d = c5027m0;
        this.f26003e = interfaceC5086d1;
    }

    /* JADX INFO: renamed from: d */
    public static String m11509d(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new C5011i0("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m11510a(int i) {
        m11511b(new C5043q0(this, i));
    }

    /* JADX INFO: renamed from: b */
    public final <T> T m11511b(InterfaceC5063w0<T> interfaceC5063w0) {
        try {
            this.f26005g.lock();
            return interfaceC5063w0.mo11466a();
        } finally {
            this.f26005g.unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public final C5057u0 m11512c(int i) {
        Map<Integer, C5057u0> map = this.f26004f;
        Integer numValueOf = Integer.valueOf(i);
        C5057u0 c5057u0 = map.get(numValueOf);
        if (c5057u0 != null) {
            return c5057u0;
        }
        throw new C5011i0(String.format("Could not find session %d while trying to get it", numValueOf), i);
    }
}
