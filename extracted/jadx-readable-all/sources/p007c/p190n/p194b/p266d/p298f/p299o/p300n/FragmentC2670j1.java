package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.app.Activity;
import android.app.Fragment;
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

/* JADX INFO: renamed from: c.n.b.d.f.o.n.j1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentC2670j1 extends Fragment implements InterfaceC2668j {

    /* JADX INFO: renamed from: f */
    public static final WeakHashMap<Activity, WeakReference<FragmentC2670j1>> f11712f = new WeakHashMap<>();

    /* JADX INFO: renamed from: g */
    public final Map<String, LifecycleCallback> f11713g = Collections.synchronizedMap(new ArrayMap());

    /* JADX INFO: renamed from: h */
    public int f11714h = 0;

    /* JADX INFO: renamed from: i */
    public Bundle f11715i;

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2668j
    /* JADX INFO: renamed from: a */
    public final void mo5540a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f11713g.containsKey(str)) {
            throw new IllegalArgumentException(outline.m1552C(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        this.f11713g.put(str, lifecycleCallback);
        if (this.f11714h > 0) {
            new HandlerC4065d(Looper.getMainLooper()).post(new RunnableC2667i1(this, lifecycleCallback, str));
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f11713g.values().iterator();
        while (it.hasNext()) {
            it.next().m12662a();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2668j
    /* JADX INFO: renamed from: e */
    public final <T extends LifecycleCallback> T mo5541e(String str, Class<T> cls) {
        return cls.cast(this.f11713g.get(str));
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2668j
    /* JADX INFO: renamed from: f */
    public final Activity mo5542f() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator<LifecycleCallback> it = this.f11713g.values().iterator();
        while (it.hasNext()) {
            it.next().mo5504c(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11714h = 1;
        this.f11715i = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f11713g.entrySet()) {
            entry.getValue().mo5505d(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f11714h = 5;
        Iterator<LifecycleCallback> it = this.f11713g.values().iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f11714h = 3;
        Iterator<LifecycleCallback> it = this.f11713g.values().iterator();
        while (it.hasNext()) {
            it.next().mo5554e();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f11713g.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo5506f(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f11714h = 2;
        Iterator<LifecycleCallback> it = this.f11713g.values().iterator();
        while (it.hasNext()) {
            it.next().mo5555g();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f11714h = 4;
        Iterator<LifecycleCallback> it = this.f11713g.values().iterator();
        while (it.hasNext()) {
            it.next().mo5556h();
        }
    }
}
