package p007c.p190n.p194b.p209b.p234u1.p240n;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.Metadata2;

/* JADX INFO: renamed from: c.n.b.b.u1.n.a, reason: use source file name */
/* JADX INFO: compiled from: MdtaMetadataEntry.java */
/* JADX INFO: loaded from: classes.dex */
public final class MdtaMetadataEntry implements Metadata.b {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final String f8754f;

    /* JADX INFO: renamed from: g */
    public final byte[] f8755g;

    /* JADX INFO: renamed from: h */
    public final int f8756h;

    /* JADX INFO: renamed from: i */
    public final int f8757i;

    /* JADX INFO: renamed from: c.n.b.b.u1.n.a$a */
    /* JADX INFO: compiled from: MdtaMetadataEntry.java */
    public class a implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public MdtaMetadataEntry[] newArray(int i) {
            return new MdtaMetadataEntry[i];
        }
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.f8754f = str;
        this.f8755g = bArr;
        this.f8756h = i;
        this.f8757i = i2;
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: F */
    public /* synthetic */ byte[] mo4010F() {
        return Metadata2.m4012a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f8754f.equals(mdtaMetadataEntry.f8754f) && Arrays.equals(this.f8755g, mdtaMetadataEntry.f8755g) && this.f8756h == mdtaMetadataEntry.f8756h && this.f8757i == mdtaMetadataEntry.f8757i;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.f8755g) + outline.m1569T(this.f8754f, 527, 31)) * 31) + this.f8756h) * 31) + this.f8757i;
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Format mo4011q() {
        return Metadata2.m4013b(this);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("mdta: key=");
        sbM1556G.append(this.f8754f);
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8754f);
        parcel.writeByteArray(this.f8755g);
        parcel.writeInt(this.f8756h);
        parcel.writeInt(this.f8757i);
    }

    public MdtaMetadataEntry(Parcel parcel, a aVar) {
        String string = parcel.readString();
        int i = Util6.f6307a;
        this.f8754f = string;
        this.f8755g = parcel.createByteArray();
        this.f8756h = parcel.readInt();
        this.f8757i = parcel.readInt();
    }
}
