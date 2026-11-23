package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.j.a.di */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2956di extends AbstractC2767a {
    public static final Parcelable.Creator<C2956di> CREATOR = new C2993ei();

    /* JADX INFO: renamed from: f */
    public final boolean f13277f;

    /* JADX INFO: renamed from: g */
    public final List<String> f13278g;

    public C2956di() {
        this(false, Collections.emptyList());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        boolean z = this.f13277f;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        C2622l.m5323W(parcel, 3, this.f13278g, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public C2956di(boolean z, List<String> list) {
        this.f13277f = z;
        this.f13278g = list;
    }
}
