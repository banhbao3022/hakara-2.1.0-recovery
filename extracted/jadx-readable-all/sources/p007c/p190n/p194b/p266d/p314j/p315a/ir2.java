package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ir2 extends AbstractC2767a {
    public static final Parcelable.Creator<ir2> CREATOR = new jr2();

    /* JADX INFO: renamed from: f */
    public ParcelFileDescriptor f15367f;

    /* JADX INFO: renamed from: g */
    public final boolean f15368g;

    /* JADX INFO: renamed from: h */
    public final boolean f15369h;

    /* JADX INFO: renamed from: i */
    public final long f15370i;

    /* JADX INFO: renamed from: j */
    public final boolean f15371j;

    public ir2() {
        this(null, false, false, 0L, false);
    }

    /* JADX INFO: renamed from: H */
    public final synchronized InputStream m7293H() {
        ParcelFileDescriptor parcelFileDescriptor = this.f15367f;
        if (parcelFileDescriptor == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.f15367f = null;
        return autoCloseInputStream;
    }

    /* JADX INFO: renamed from: K */
    public final synchronized boolean m7294K() {
        return this.f15368g;
    }

    /* JADX INFO: renamed from: L */
    public final synchronized boolean m7295L() {
        return this.f15369h;
    }

    /* JADX INFO: renamed from: M */
    public final synchronized long m7296M() {
        return this.f15370i;
    }

    /* JADX INFO: renamed from: N */
    public final synchronized boolean m7297N() {
        return this.f15371j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f15367f;
        }
        C2622l.m5311T(parcel, 2, parcelFileDescriptor, i, false);
        boolean zM7294K = m7294K();
        parcel.writeInt(262147);
        parcel.writeInt(zM7294K ? 1 : 0);
        boolean zM7295L = m7295L();
        parcel.writeInt(262148);
        parcel.writeInt(zM7295L ? 1 : 0);
        long jM7296M = m7296M();
        parcel.writeInt(524293);
        parcel.writeLong(jM7296M);
        boolean zM7297N = m7297N();
        parcel.writeInt(262150);
        parcel.writeInt(zM7297N ? 1 : 0);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public final synchronized boolean zza() {
        return this.f15367f != null;
    }

    public ir2(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j2, boolean z3) {
        this.f15367f = parcelFileDescriptor;
        this.f15368g = z;
        this.f15369h = z2;
        this.f15370i = j2;
        this.f15371j = z3;
    }
}
