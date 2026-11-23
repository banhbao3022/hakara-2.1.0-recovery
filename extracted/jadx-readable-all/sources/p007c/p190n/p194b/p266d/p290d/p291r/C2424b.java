package p007c.p190n.p194b.p266d.p290d.p291r;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p266d.p290d.C2389g;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2444a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.r.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2424b extends AbstractC2767a {
    public static final Parcelable.Creator<C2424b> CREATOR = new C2508t();

    /* JADX INFO: renamed from: f */
    public String f11152f;

    /* JADX INFO: renamed from: g */
    public final List<String> f11153g;

    /* JADX INFO: renamed from: h */
    public boolean f11154h;

    /* JADX INFO: renamed from: i */
    public final C2389g f11155i;

    /* JADX INFO: renamed from: j */
    public final boolean f11156j;

    /* JADX INFO: renamed from: k */
    public final C2444a f11157k;

    /* JADX INFO: renamed from: l */
    public final boolean f11158l;

    /* JADX INFO: renamed from: m */
    public final double f11159m;

    /* JADX INFO: renamed from: n */
    public final boolean f11160n;

    /* JADX INFO: renamed from: c.n.b.d.d.r.b$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f11161a;

        /* JADX INFO: renamed from: c */
        public boolean f11163c;

        /* JADX INFO: renamed from: b */
        public List<String> f11162b = new ArrayList();

        /* JADX INFO: renamed from: d */
        public C2389g f11164d = new C2389g();

        /* JADX INFO: renamed from: e */
        public boolean f11165e = true;

        /* JADX INFO: renamed from: f */
        public boolean f11166f = true;

        /* JADX INFO: renamed from: g */
        public double f11167g = 0.05000000074505806d;
    }

    public C2424b(String str, List<String> list, boolean z, C2389g c2389g, boolean z2, C2444a c2444a, boolean z3, double d, boolean z4) {
        this.f11152f = TextUtils.isEmpty(str) ? "" : str;
        int size = list == null ? 0 : list.size();
        ArrayList arrayList = new ArrayList(size);
        this.f11153g = arrayList;
        if (size > 0) {
            arrayList.addAll(list);
        }
        this.f11154h = z;
        this.f11155i = c2389g == null ? new C2389g() : c2389g;
        this.f11156j = z2;
        this.f11157k = c2444a;
        this.f11158l = z3;
        this.f11159m = d;
        this.f11160n = z4;
    }

    /* JADX INFO: renamed from: H */
    public List<String> m5002H() {
        return Collections.unmodifiableList(this.f11153g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f11152f, false);
        C2622l.m5323W(parcel, 3, m5002H(), false);
        boolean z = this.f11154h;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        C2622l.m5311T(parcel, 5, this.f11155i, i, false);
        boolean z2 = this.f11156j;
        parcel.writeInt(262150);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5311T(parcel, 7, this.f11157k, i, false);
        boolean z3 = this.f11158l;
        parcel.writeInt(262152);
        parcel.writeInt(z3 ? 1 : 0);
        double d = this.f11159m;
        parcel.writeInt(524297);
        parcel.writeDouble(d);
        boolean z4 = this.f11160n;
        parcel.writeInt(262154);
        parcel.writeInt(z4 ? 1 : 0);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
