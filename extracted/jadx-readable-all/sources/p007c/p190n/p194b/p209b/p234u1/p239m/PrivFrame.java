package p007c.p190n.p194b.p209b.p234u1.p239m;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.u1.m.l, reason: use source file name */
/* JADX INFO: compiled from: PrivFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g */
    public final String f8748g;

    /* JADX INFO: renamed from: h */
    public final byte[] f8749h;

    /* JADX INFO: renamed from: c.n.b.b.u1.m.l$a */
    /* JADX INFO: compiled from: PrivFrame.java */
    public class a implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f8748g = str;
        this.f8749h = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return Util6.m3113a(this.f8748g, privFrame.f8748g) && Arrays.equals(this.f8749h, privFrame.f8749h);
    }

    public int hashCode() {
        String str = this.f8748g;
        return Arrays.hashCode(this.f8749h) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.p239m.Id3Frame
    public String toString() {
        return this.f8739f + ": owner=" + this.f8748g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8748g);
        parcel.writeByteArray(this.f8749h);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = Util6.f6307a;
        this.f8748g = string;
        this.f8749h = parcel.createByteArray();
    }
}
