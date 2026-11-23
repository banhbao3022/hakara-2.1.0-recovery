package p007c.p190n.p194b.p266d.p298f;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.p302q.C2753q;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: renamed from: c.n.b.d.f.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2606d extends AbstractC2767a {

    @RecentlyNonNull
    public static final Parcelable.Creator<C2606d> CREATOR = new C2796x();

    /* JADX INFO: renamed from: f */
    public final String f11558f;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public final int f11559g;

    /* JADX INFO: renamed from: h */
    public final long f11560h;

    public C2606d(@RecentlyNonNull String str, int i, long j2) {
        this.f11558f = str;
        this.f11559g = i;
        this.f11560h = j2;
    }

    public C2606d(@RecentlyNonNull String str, long j2) {
        this.f11558f = str;
        this.f11560h = j2;
        this.f11559g = -1;
    }

    /* JADX INFO: renamed from: H */
    public long m5198H() {
        long j2 = this.f11560h;
        return j2 == -1 ? this.f11559g : j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2606d) {
            C2606d c2606d = (C2606d) obj;
            String str = this.f11558f;
            if (((str != null && str.equals(c2606d.f11558f)) || (this.f11558f == null && c2606d.f11558f == null)) && m5198H() == c2606d.m5198H()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11558f, Long.valueOf(m5198H())});
    }

    @RecentlyNonNull
    public final String toString() {
        C2753q c2753q = new C2753q(this);
        c2753q.m5608a("name", this.f11558f);
        c2753q.m5608a("version", Long.valueOf(m5198H()));
        return c2753q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 1, this.f11558f, false);
        int i2 = this.f11559g;
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        long jM5198H = m5198H();
        parcel.writeInt(524291);
        parcel.writeLong(jM5198H);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
