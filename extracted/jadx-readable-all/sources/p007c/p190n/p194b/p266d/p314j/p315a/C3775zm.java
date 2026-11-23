package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: renamed from: c.n.b.d.j.a.zm */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3775zm {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2782b f22335a;

    /* JADX INFO: renamed from: b */
    public final C3146in f22336b;

    /* JADX INFO: renamed from: e */
    public final String f22339e;

    /* JADX INFO: renamed from: f */
    public final String f22340f;

    /* JADX INFO: renamed from: d */
    public final Object f22338d = new Object();

    /* JADX INFO: renamed from: g */
    public long f22341g = -1;

    /* JADX INFO: renamed from: h */
    public long f22342h = -1;

    /* JADX INFO: renamed from: i */
    public long f22343i = 0;

    /* JADX INFO: renamed from: j */
    public long f22344j = -1;

    /* JADX INFO: renamed from: k */
    public long f22345k = -1;

    /* JADX INFO: renamed from: c */
    public final LinkedList<C3738ym> f22337c = new LinkedList<>();

    public C3775zm(InterfaceC2782b interfaceC2782b, C3146in c3146in, String str, String str2) {
        this.f22335a = interfaceC2782b;
        this.f22336b = c3146in;
        this.f22339e = str;
        this.f22340f = str2;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m8892a() {
        Bundle bundle;
        synchronized (this.f22338d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.f22339e);
                bundle.putString("slotid", this.f22340f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.f22344j);
                bundle.putLong("tresponse", this.f22345k);
                bundle.putLong("timp", this.f22341g);
                bundle.putLong("tload", this.f22342h);
                bundle.putLong("pcc", this.f22343i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (C3738ym c3738ym : this.f22337c) {
                    Objects.requireNonNull(c3738ym);
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("topen", c3738ym.f21916a);
                    bundle2.putLong("tclose", c3738ym.f21917b);
                    arrayList.add(bundle2);
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }
}
