package p007c.p190n.p194b.p209b.p234u1.p239m;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.u1.m.c, reason: use source file name */
/* JADX INFO: compiled from: BinaryFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g */
    public final byte[] f8715g;

    /* JADX INFO: renamed from: c.n.b.b.u1.m.c$a */
    /* JADX INFO: compiled from: BinaryFrame.java */
    public class a implements Parcelable.Creator<BinaryFrame> {
        @Override // android.os.Parcelable.Creator
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BinaryFrame[] newArray(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f8715g = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f8739f.equals(binaryFrame.f8739f) && Arrays.equals(this.f8715g, binaryFrame.f8715g);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f8715g) + outline.m1569T(this.f8739f, 527, 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8739f);
        parcel.writeByteArray(this.f8715g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BinaryFrame(Parcel parcel) {
        String string = parcel.readString();
        int i = Util6.f6307a;
        super(string);
        this.f8715g = parcel.createByteArray();
    }
}
