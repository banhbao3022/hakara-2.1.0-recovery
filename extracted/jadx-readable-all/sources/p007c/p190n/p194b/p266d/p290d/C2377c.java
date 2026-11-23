package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.d.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2377c extends AbstractC2767a {

    /* JADX INFO: renamed from: g */
    public final long f11001g;

    /* JADX INFO: renamed from: h */
    public final long f11002h;

    /* JADX INFO: renamed from: i */
    public final String f11003i;

    /* JADX INFO: renamed from: j */
    public final String f11004j;

    /* JADX INFO: renamed from: k */
    public final long f11005k;

    /* JADX INFO: renamed from: f */
    public static final C2518b f11000f = new C2518b("AdBreakStatus");
    public static final Parcelable.Creator<C2377c> CREATOR = new C2397i1();

    public C2377c(long j2, long j3, String str, String str2, long j4) {
        this.f11001g = j2;
        this.f11002h = j3;
        this.f11003i = str;
        this.f11004j = str2;
        this.f11005k = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2377c)) {
            return false;
        }
        C2377c c2377c = (C2377c) obj;
        return this.f11001g == c2377c.f11001g && this.f11002h == c2377c.f11002h && C2516a.m5114d(this.f11003i, c2377c.f11003i) && C2516a.m5114d(this.f11004j, c2377c.f11004j) && this.f11005k == c2377c.f11005k;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11001g), Long.valueOf(this.f11002h), this.f11003i, this.f11004j, Long.valueOf(this.f11005k)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        long j2 = this.f11001g;
        parcel.writeInt(524290);
        parcel.writeLong(j2);
        long j3 = this.f11002h;
        parcel.writeInt(524291);
        parcel.writeLong(j3);
        C2622l.m5315U(parcel, 4, this.f11003i, false);
        C2622l.m5315U(parcel, 5, this.f11004j, false);
        long j4 = this.f11005k;
        parcel.writeInt(524294);
        parcel.writeLong(j4);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
