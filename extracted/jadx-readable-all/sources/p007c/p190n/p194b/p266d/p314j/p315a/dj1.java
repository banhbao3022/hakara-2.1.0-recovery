package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dj1 implements l60 {

    /* JADX INFO: renamed from: f */
    public final HashSet<C3775zm> f13286f = new HashSet<>();

    /* JADX INFO: renamed from: g */
    public final Context f13287g;

    /* JADX INFO: renamed from: h */
    public final C3146in f13288h;

    public dj1(Context context, C3146in c3146in) {
        this.f13287g = context;
        this.f13288h = c3146in;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m6359a() {
        String str;
        Bundle bundle;
        C3146in c3146in = this.f13288h;
        Context context = this.f13287g;
        Objects.requireNonNull(c3146in);
        HashSet hashSet = new HashSet();
        synchronized (c3146in.f15319a) {
            hashSet.addAll(c3146in.f15323e);
            c3146in.f15323e.clear();
        }
        Bundle bundle2 = new Bundle();
        C3035fn c3035fn = c3146in.f15322d;
        C3072gn c3072gn = c3146in.f15321c;
        synchronized (c3072gn) {
            str = c3072gn.f14625b;
        }
        synchronized (c3035fn.f14071f) {
            bundle = new Bundle();
            bundle.putString("session_id", c3035fn.f14073h.mo4811O() ? "" : c3035fn.f14072g);
            bundle.putLong("basets", c3035fn.f14067b);
            bundle.putLong("currts", c3035fn.f14066a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", c3035fn.f14068c);
            bundle.putInt("preqs_in_session", c3035fn.f14069d);
            bundle.putLong("time_in_session", c3035fn.f14070e);
            bundle.putInt("pclick", c3035fn.f14074i);
            bundle.putInt("pimp", c3035fn.f14075j);
            Context contextM6634a = C2994ej.m6634a(context);
            int identifier = contextM6634a.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z = false;
            if (identifier == 0) {
                C2622l.m5458x3("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == contextM6634a.getPackageManager().getActivityInfo(new ComponentName(contextM6634a.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                        z = true;
                    } else {
                        C2622l.m5458x3("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    C2622l.m5226A3("Fail to fetch AdActivity theme");
                    C2622l.m5458x3("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
        }
        bundle2.putBundle("app", bundle);
        Bundle bundle3 = new Bundle();
        Iterator<C3109hn> it = c3146in.f15324f.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
        bundle2.putBundle("slots", bundle3);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C3775zm) it2.next()).m8892a());
        }
        bundle2.putParcelableArrayList("ads", arrayList);
        synchronized (this) {
            this.f13286f.clear();
            this.f13286f.addAll(hashSet);
        }
        return bundle2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l60
    /* JADX INFO: renamed from: o0 */
    public final synchronized void mo6216o0(yv2 yv2Var) {
        if (yv2Var.f22116f != 3) {
            C3146in c3146in = this.f13288h;
            HashSet<C3775zm> hashSet = this.f13286f;
            synchronized (c3146in.f15319a) {
                c3146in.f15323e.addAll(hashSet);
            }
        }
    }
}
