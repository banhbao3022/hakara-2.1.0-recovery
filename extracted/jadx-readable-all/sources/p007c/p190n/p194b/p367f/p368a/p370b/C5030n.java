package p007c.p190n.p194b.p367f.p368a.p370b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;
import p007c.p190n.p194b.p367f.p368a.p373d.C5109p;
import p007c.p190n.p194b.p367f.p368a.p373d.C5115s;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0;
import p007c.p190n.p194b.p367f.p368a.p377h.AbstractC5141e;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;
import p007c.p190n.p194b.p367f.p368a.p377h.C5155s;

/* JADX INFO: renamed from: c.n.b.f.a.b.n */
/* JADX INFO: loaded from: classes.dex */
public final class C5030n implements InterfaceC5037o2 {

    /* JADX INFO: renamed from: a */
    public static final C5089f f25877a = new C5089f("AssetPackServiceImpl");

    /* JADX INFO: renamed from: b */
    public static final Intent f25878b = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: c */
    public final String f25879c;

    /* JADX INFO: renamed from: d */
    public final C5027m0 f25880d;

    /* JADX INFO: renamed from: e */
    public C5109p<InterfaceC5106n0> f25881e;

    /* JADX INFO: renamed from: f */
    public C5109p<InterfaceC5106n0> f25882f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f25883g = new AtomicBoolean();

    public C5030n(Context context, C5027m0 c5027m0) {
        this.f25879c = context.getPackageName();
        this.f25880d = c5027m0;
        if (C5115s.m11555a(context)) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = applicationContext != null ? applicationContext : context;
            C5089f c5089f = f25877a;
            Intent intent = f25878b;
            this.f25881e = new C5109p<>(context2, c5089f, "AssetPackService", intent, C5041p2.f25915b);
            Context applicationContext2 = context.getApplicationContext();
            this.f25882f = new C5109p<>(applicationContext2 != null ? applicationContext2 : context, c5089f, "AssetPackService-keepAlive", intent, C5041p2.f25914a);
        }
        f25877a.m11533b(3, "AssetPackService initiated.", new Object[0]);
    }

    /* JADX INFO: renamed from: h */
    public static Bundle m11460h() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11000);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Bundle m11461i(Map map) {
        Bundle bundleM11460h = m11460h();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        bundleM11460h.putParcelableArrayList("installed_asset_module", arrayList);
        return bundleM11460h;
    }

    /* JADX INFO: renamed from: j */
    public static Bundle m11462j(int i, String str, String str2, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        bundle.putString("module_name", str);
        bundle.putString("slice_id", str2);
        bundle.putInt("chunk_number", i2);
        return bundle;
    }

    /* JADX INFO: renamed from: l */
    public static <T> AbstractC5141e<T> m11463l() {
        f25877a.m11533b(6, "onError(%d)", new Object[]{-11});
        C4978a c4978a = new C4978a(-11);
        C5155s c5155s = new C5155s();
        c5155s.m11575h(c4978a);
        return c5155s;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5037o2
    /* JADX INFO: renamed from: a */
    public final synchronized void mo11433a() {
        if (this.f25882f == null) {
            f25877a.m11533b(5, "Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        C5089f c5089f = f25877a;
        c5089f.m11533b(4, "keepAlive", new Object[0]);
        if (!this.f25883g.compareAndSet(false, true)) {
            c5089f.m11533b(4, "Service is already kept alive.", new Object[0]);
        } else {
            C5151o c5151o = new C5151o();
            this.f25882f.m11548a(new C5006h(this, c5151o, c5151o));
        }
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5037o2
    /* JADX INFO: renamed from: b */
    public final void mo11434b(int i) {
        if (this.f25881e == null) {
            throw new C5011i0("The Play Store app is not installed or is an unofficial version.", i);
        }
        f25877a.m11533b(4, "notifySessionFailed", new Object[0]);
        C5151o c5151o = new C5151o();
        this.f25881e.m11548a(new C4998f(this, c5151o, i, c5151o));
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5037o2
    /* JADX INFO: renamed from: c */
    public final void mo11435c(int i, String str, String str2, int i2) {
        if (this.f25881e == null) {
            throw new C5011i0("The Play Store app is not installed or is an unofficial version.", i);
        }
        f25877a.m11533b(4, "notifyChunkTransferred", new Object[0]);
        C5151o c5151o = new C5151o();
        this.f25881e.m11548a(new C4990d(this, c5151o, i, str, str2, i2, c5151o));
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5037o2
    /* JADX INFO: renamed from: d */
    public final void mo11436d(int i, String str) {
        m11464k(i, str, 10);
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5037o2
    /* JADX INFO: renamed from: e */
    public final AbstractC5141e<ParcelFileDescriptor> mo11437e(int i, String str, String str2, int i2) {
        if (this.f25881e == null) {
            return m11463l();
        }
        f25877a.m11533b(4, "getChunkFileDescriptor(%s, %s, %d, session=%d)", new Object[]{str, str2, Integer.valueOf(i2), Integer.valueOf(i)});
        C5151o c5151o = new C5151o();
        this.f25881e.m11548a(new C5002g(this, c5151o, i, str, str2, i2, c5151o));
        return c5151o.f26116a;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5037o2
    /* JADX INFO: renamed from: f */
    public final AbstractC5141e<List<String>> mo11438f(Map<String, Long> map) {
        if (this.f25881e == null) {
            return m11463l();
        }
        f25877a.m11533b(4, "syncPacks", new Object[0]);
        C5151o c5151o = new C5151o();
        this.f25881e.m11548a(new C5049r2(this, c5151o, map, c5151o));
        return c5151o.f26116a;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5037o2
    /* JADX INFO: renamed from: g */
    public final void mo11439g(List<String> list) {
        if (this.f25881e == null) {
            return;
        }
        f25877a.m11533b(4, "cancelDownloads(%s)", new Object[]{list});
        C5151o c5151o = new C5151o();
        this.f25881e.m11548a(new C5045q2(this, c5151o, list, c5151o));
    }

    /* JADX INFO: renamed from: k */
    public final void m11464k(int i, String str, int i2) {
        if (this.f25881e == null) {
            throw new C5011i0("The Play Store app is not installed or is an unofficial version.", i);
        }
        f25877a.m11533b(4, "notifyModuleCompleted", new Object[0]);
        C5151o c5151o = new C5151o();
        this.f25881e.m11548a(new C4994e(this, c5151o, i, str, c5151o, i2));
    }
}
