package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xi2 implements Parcelable {
    public static final Parcelable.Creator<xi2> CREATOR = new wi2();

    /* JADX INFO: renamed from: f */
    public int f21552f;

    /* JADX INFO: renamed from: g */
    public final UUID f21553g;

    /* JADX INFO: renamed from: h */
    public final String f21554h;

    /* JADX INFO: renamed from: i */
    public final byte[] f21555i;

    /* JADX INFO: renamed from: j */
    public final boolean f21556j;

    public xi2(Parcel parcel) {
        this.f21553g = new UUID(parcel.readLong(), parcel.readLong());
        this.f21554h = parcel.readString();
        this.f21555i = parcel.createByteArray();
        this.f21556j = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xi2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        xi2 xi2Var = (xi2) obj;
        return this.f21554h.equals(xi2Var.f21554h) && jo2.m7369a(this.f21553g, xi2Var.f21553g) && Arrays.equals(this.f21555i, xi2Var.f21555i);
    }

    public final int hashCode() {
        int i = this.f21552f;
        if (i != 0) {
            return i;
        }
        int iM1569T = outline.m1569T(this.f21554h, this.f21553g.hashCode() * 31, 31) + Arrays.hashCode(this.f21555i);
        this.f21552f = iM1569T;
        return iM1569T;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f21553g.getMostSignificantBits());
        parcel.writeLong(this.f21553g.getLeastSignificantBits());
        parcel.writeString(this.f21554h);
        parcel.writeByteArray(this.f21555i);
        parcel.writeByte(this.f21556j ? (byte) 1 : (byte) 0);
    }

    public xi2(UUID uuid, String str, byte[] bArr, boolean z) {
        Objects.requireNonNull(uuid);
        this.f21553g = uuid;
        this.f21554h = str;
        Objects.requireNonNull(bArr);
        this.f21555i = bArr;
        this.f21556j = false;
    }
}
