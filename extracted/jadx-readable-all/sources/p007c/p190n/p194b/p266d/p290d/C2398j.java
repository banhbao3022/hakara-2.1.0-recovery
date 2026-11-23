package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p301p.C2708a;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.j */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2398j extends AbstractC2767a {
    public static final Parcelable.Creator<C2398j> CREATOR = new C2376b1();

    /* JADX INFO: renamed from: f */
    public int f11053f;

    /* JADX INFO: renamed from: g */
    public String f11054g;

    /* JADX INFO: renamed from: h */
    public List<C2395i> f11055h;

    /* JADX INFO: renamed from: i */
    public List<C2708a> f11056i;

    /* JADX INFO: renamed from: j */
    public double f11057j;

    /* JADX INFO: renamed from: c.n.b.d.d.j$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final C2398j f11058a = new C2398j(null);
    }

    public C2398j(int i, String str, List<C2395i> list, List<C2708a> list2, double d) {
        this.f11053f = i;
        this.f11054g = str;
        this.f11055h = list;
        this.f11056i = list2;
        this.f11057j = d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2398j)) {
            return false;
        }
        C2398j c2398j = (C2398j) obj;
        return this.f11053f == c2398j.f11053f && TextUtils.equals(this.f11054g, c2398j.f11054g) && C2622l.m5459y(this.f11055h, c2398j.f11055h) && C2622l.m5459y(this.f11056i, c2398j.f11056i) && this.f11057j == c2398j.f11057j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11053f), this.f11054g, this.f11055h, this.f11056i, Double.valueOf(this.f11057j)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f11053f;
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        C2622l.m5315U(parcel, 3, this.f11054g, false);
        List<C2395i> list = this.f11055h;
        C2622l.m5331Y(parcel, 4, list == null ? null : Collections.unmodifiableList(list), false);
        List<C2708a> list2 = this.f11056i;
        C2622l.m5331Y(parcel, 5, list2 != null ? Collections.unmodifiableList(list2) : null, false);
        double d = this.f11057j;
        parcel.writeInt(524294);
        parcel.writeDouble(d);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2398j() {
        this.f11053f = 0;
        this.f11054g = null;
        this.f11055h = null;
        this.f11056i = null;
        this.f11057j = 0.0d;
    }

    public C2398j(C2373a1 c2373a1) {
        this.f11053f = 0;
        this.f11054g = null;
        this.f11055h = null;
        this.f11056i = null;
        this.f11057j = 0.0d;
    }

    public C2398j(C2398j c2398j, C2373a1 c2373a1) {
        this.f11053f = c2398j.f11053f;
        this.f11054g = c2398j.f11054g;
        this.f11055h = c2398j.f11055h;
        this.f11056i = c2398j.f11056i;
        this.f11057j = c2398j.f11057j;
    }
}
