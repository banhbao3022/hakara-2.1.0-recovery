package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.h */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2392h extends AbstractC2767a {

    /* JADX INFO: renamed from: g */
    public final long f11038g;

    /* JADX INFO: renamed from: h */
    public final long f11039h;

    /* JADX INFO: renamed from: i */
    public final boolean f11040i;

    /* JADX INFO: renamed from: j */
    public final boolean f11041j;

    /* JADX INFO: renamed from: f */
    public static final C2518b f11037f = new C2518b("MediaLiveSeekableRange");
    public static final Parcelable.Creator<C2392h> CREATOR = new C2568y0();

    public C2392h(long j2, long j3, boolean z, boolean z2) {
        this.f11038g = Math.max(j2, 0L);
        this.f11039h = Math.max(j3, 0L);
        this.f11040i = z;
        this.f11041j = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2392h)) {
            return false;
        }
        C2392h c2392h = (C2392h) obj;
        return this.f11038g == c2392h.f11038g && this.f11039h == c2392h.f11039h && this.f11040i == c2392h.f11040i && this.f11041j == c2392h.f11041j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11038g), Long.valueOf(this.f11039h), Boolean.valueOf(this.f11040i), Boolean.valueOf(this.f11041j)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        long j2 = this.f11038g;
        parcel.writeInt(524290);
        parcel.writeLong(j2);
        long j3 = this.f11039h;
        parcel.writeInt(524291);
        parcel.writeLong(j3);
        boolean z = this.f11040i;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f11041j;
        parcel.writeInt(262149);
        parcel.writeInt(z2 ? 1 : 0);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
