package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.k */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2401k extends AbstractC2767a {
    public static final Parcelable.Creator<C2401k> CREATOR = new C2382d1();

    /* JADX INFO: renamed from: f */
    public String f11061f;

    /* JADX INFO: renamed from: g */
    public String f11062g;

    /* JADX INFO: renamed from: h */
    public int f11063h;

    /* JADX INFO: renamed from: i */
    public String f11064i;

    /* JADX INFO: renamed from: j */
    public C2398j f11065j;

    /* JADX INFO: renamed from: k */
    public int f11066k;

    /* JADX INFO: renamed from: l */
    public List<C2404l> f11067l;

    /* JADX INFO: renamed from: m */
    public int f11068m;

    /* JADX INFO: renamed from: n */
    public long f11069n;

    /* JADX INFO: renamed from: c.n.b.d.d.k$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final C2401k f11070a = new C2401k(null);
    }

    public C2401k(String str, String str2, int i, String str3, C2398j c2398j, int i2, List<C2404l> list, int i3, long j2) {
        this.f11061f = str;
        this.f11062g = str2;
        this.f11063h = i;
        this.f11064i = str3;
        this.f11065j = c2398j;
        this.f11066k = i2;
        this.f11067l = list;
        this.f11068m = i3;
        this.f11069n = j2;
    }

    public final void clear() {
        this.f11061f = null;
        this.f11062g = null;
        this.f11063h = 0;
        this.f11064i = null;
        this.f11066k = 0;
        this.f11067l = null;
        this.f11068m = 0;
        this.f11069n = -1L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2401k)) {
            return false;
        }
        C2401k c2401k = (C2401k) obj;
        return TextUtils.equals(this.f11061f, c2401k.f11061f) && TextUtils.equals(this.f11062g, c2401k.f11062g) && this.f11063h == c2401k.f11063h && TextUtils.equals(this.f11064i, c2401k.f11064i) && C2622l.m5459y(this.f11065j, c2401k.f11065j) && this.f11066k == c2401k.f11066k && C2622l.m5459y(this.f11067l, c2401k.f11067l) && this.f11068m == c2401k.f11068m && this.f11069n == c2401k.f11069n;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11061f, this.f11062g, Integer.valueOf(this.f11063h), this.f11064i, this.f11065j, Integer.valueOf(this.f11066k), this.f11067l, Integer.valueOf(this.f11068m), Long.valueOf(this.f11069n)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f11061f, false);
        C2622l.m5315U(parcel, 3, this.f11062g, false);
        int i2 = this.f11063h;
        parcel.writeInt(262148);
        parcel.writeInt(i2);
        C2622l.m5315U(parcel, 5, this.f11064i, false);
        C2622l.m5311T(parcel, 6, this.f11065j, i, false);
        int i3 = this.f11066k;
        parcel.writeInt(262151);
        parcel.writeInt(i3);
        List<C2404l> list = this.f11067l;
        C2622l.m5331Y(parcel, 8, list == null ? null : Collections.unmodifiableList(list), false);
        int i4 = this.f11068m;
        parcel.writeInt(262153);
        parcel.writeInt(i4);
        long j2 = this.f11069n;
        parcel.writeInt(524298);
        parcel.writeLong(j2);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2401k() {
        clear();
    }

    public C2401k(C2379c1 c2379c1) {
        clear();
    }

    public C2401k(C2401k c2401k, C2379c1 c2379c1) {
        this.f11061f = c2401k.f11061f;
        this.f11062g = c2401k.f11062g;
        this.f11063h = c2401k.f11063h;
        this.f11064i = c2401k.f11064i;
        this.f11065j = c2401k.f11065j;
        this.f11066k = c2401k.f11066k;
        this.f11067l = c2401k.f11067l;
        this.f11068m = c2401k.f11068m;
        this.f11069n = c2401k.f11069n;
    }
}
