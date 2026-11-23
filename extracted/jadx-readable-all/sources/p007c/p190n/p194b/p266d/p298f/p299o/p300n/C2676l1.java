package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p314j.p322h.HandlerC4065d;
import p636z0.p691g.ArrayMap;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.l1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2676l1 extends Fragment implements InterfaceC2668j {

    /* JADX INFO: renamed from: c0 */
    public static final WeakHashMap<FragmentActivity, WeakReference<C2676l1>> f11725c0 = new WeakHashMap<>();

    /* JADX INFO: renamed from: d0 */
    public final Map<String, LifecycleCallback> f11726d0 = Collections.synchronizedMap(new ArrayMap());

    /* JADX INFO: renamed from: e0 */
    public int f11727e0 = 0;

    /* JADX INFO: renamed from: f0 */
    public Bundle f11728f0;

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: X */
    public final void mo2588X(int i, int i2, Intent intent) {
        super.mo2588X(i, i2, intent);
        Iterator<LifecycleCallback> it = this.f11726d0.values().iterator();
        while (it.hasNext()) {
            it.next().mo5504c(i, i2, intent);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2668j
    /* JADX INFO: renamed from: a */
    public final void mo5540a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f11726d0.containsKey(str)) {
            throw new IllegalArgumentException(outline.m1552C(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        this.f11726d0.put(str, lifecycleCallback);
        if (this.f11727e0 > 0) {
            new HandlerC4065d(Looper.getMainLooper()).post(new RunnableC2673k1(this, lifecycleCallback, str));
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public final void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        this.f11727e0 = 1;
        this.f11728f0 = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f11726d0.entrySet()) {
            entry.getValue().mo5505d(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2668j
    /* JADX INFO: renamed from: e */
    public final <T extends LifecycleCallback> T mo5541e(String str, Class<T> cls) {
        return cls.cast(this.f11726d0.get(str));
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: g0 */
    public final void mo1956g0() {
        this.f38414K = true;
        this.f11727e0 = 5;
        Iterator<LifecycleCallback> it = this.f11726d0.values().iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: q */
    public final void mo5545q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo5545q(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f11726d0.values().iterator();
        while (it.hasNext()) {
            it.next().m12662a();
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: s0 */
    public final void mo2076s0() {
        this.f38414K = true;
        this.f11727e0 = 3;
        Iterator<LifecycleCallback> it = this.f11726d0.values().iterator();
        while (it.hasNext()) {
            it.next().mo5554e();
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: t0 */
    public final void mo470t0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f11726d0.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo5506f(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: u0 */
    public final void mo1958u0() {
        this.f38414K = true;
        this.f11727e0 = 2;
        Iterator<LifecycleCallback> it = this.f11726d0.values().iterator();
        while (it.hasNext()) {
            it.next().mo5555g();
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: v0 */
    public final void mo1959v0() {
        this.f38414K = true;
        this.f11727e0 = 4;
        Iterator<LifecycleCallback> it = this.f11726d0.values().iterator();
        while (it.hasNext()) {
            it.next().mo5556h();
        }
    }
}
