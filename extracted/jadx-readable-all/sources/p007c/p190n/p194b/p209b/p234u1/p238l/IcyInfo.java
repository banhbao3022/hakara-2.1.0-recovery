package p007c.p190n.p194b.p209b.p234u1.p238l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.Metadata2;

/* JADX INFO: renamed from: c.n.b.b.u1.l.c, reason: use source file name */
/* JADX INFO: compiled from: IcyInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class IcyInfo implements Metadata.b {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final byte[] f8707f;

    /* JADX INFO: renamed from: g */
    public final String f8708g;

    /* JADX INFO: renamed from: h */
    public final String f8709h;

    /* JADX INFO: renamed from: c.n.b.b.u1.l.c$a */
    /* JADX INFO: compiled from: IcyInfo.java */
    public class a implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IcyInfo[] newArray(int i) {
            return new IcyInfo[i];
        }
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f8707f = bArr;
        this.f8708g = str;
        this.f8709h = str2;
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
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8707f, ((IcyInfo) obj).f8707f);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f8707f);
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Format mo4011q() {
        return Metadata2.m4013b(this);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f8708g, this.f8709h, Integer.valueOf(this.f8707f.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f8707f);
        parcel.writeString(this.f8708g);
        parcel.writeString(this.f8709h);
    }

    public IcyInfo(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        Objects.requireNonNull(bArrCreateByteArray);
        this.f8707f = bArrCreateByteArray;
        this.f8708g = parcel.readString();
        this.f8709h = parcel.readString();
    }
}
