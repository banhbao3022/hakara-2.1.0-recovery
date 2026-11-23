package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.k.b.o */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4613o extends AbstractC2767a implements Iterable<String> {
    public static final Parcelable.Creator<C4613o> CREATOR = new C4636q();

    /* JADX INFO: renamed from: f */
    public final Bundle f24221f;

    public C4613o(Bundle bundle) {
        this.f24221f = bundle;
    }

    /* JADX INFO: renamed from: H */
    public final Object m10701H(String str) {
        return this.f24221f.get(str);
    }

    /* JADX INFO: renamed from: K */
    public final Bundle m10702K() {
        return new Bundle(this.f24221f);
    }

    /* JADX INFO: renamed from: L */
    public final Long m10703L(String str) {
        return Long.valueOf(this.f24221f.getLong(str));
    }

    /* JADX INFO: renamed from: M */
    public final Double m10704M(String str) {
        return Double.valueOf(this.f24221f.getDouble(str));
    }

    /* JADX INFO: renamed from: N */
    public final String m10705N(String str) {
        return this.f24221f.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C4601n(this);
    }

    public final String toString() {
        return this.f24221f.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5295P(parcel, 2, m10702K(), false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
