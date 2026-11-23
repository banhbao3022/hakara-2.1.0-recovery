package p007c.p190n.p194b.p209b.p234u1.p239m;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.u1.m.b, reason: use source file name */
/* JADX INFO: compiled from: ApicFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g */
    public final String f8711g;

    /* JADX INFO: renamed from: h */
    public final String f8712h;

    /* JADX INFO: renamed from: i */
    public final int f8713i;

    /* JADX INFO: renamed from: j */
    public final byte[] f8714j;

    /* JADX INFO: renamed from: c.n.b.b.u1.m.b$a */
    /* JADX INFO: compiled from: ApicFrame.java */
    public class a implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f8711g = str;
        this.f8712h = str2;
        this.f8713i = i;
        this.f8714j = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f8713i == apicFrame.f8713i && Util6.m3113a(this.f8711g, apicFrame.f8711g) && Util6.m3113a(this.f8712h, apicFrame.f8712h) && Arrays.equals(this.f8714j, apicFrame.f8714j);
    }

    public int hashCode() {
        int i = (527 + this.f8713i) * 31;
        String str = this.f8711g;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8712h;
        return Arrays.hashCode(this.f8714j) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.p239m.Id3Frame
    public String toString() {
        return this.f8739f + ": mimeType=" + this.f8711g + ", description=" + this.f8712h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8711g);
        parcel.writeString(this.f8712h);
        parcel.writeInt(this.f8713i);
        parcel.writeByteArray(this.f8714j);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = Util6.f6307a;
        this.f8711g = string;
        this.f8712h = parcel.readString();
        this.f8713i = parcel.readInt();
        this.f8714j = parcel.createByteArray();
    }
}
