package p007c.p190n.p194b.p209b.p234u1.p239m;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.u1.m.g, reason: use source file name */
/* JADX INFO: compiled from: GeobFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g */
    public final String f8730g;

    /* JADX INFO: renamed from: h */
    public final String f8731h;

    /* JADX INFO: renamed from: i */
    public final String f8732i;

    /* JADX INFO: renamed from: j */
    public final byte[] f8733j;

    /* JADX INFO: renamed from: c.n.b.b.u1.m.g$a */
    /* JADX INFO: compiled from: GeobFrame.java */
    public class a implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public GeobFrame[] newArray(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f8730g = str;
        this.f8731h = str2;
        this.f8732i = str3;
        this.f8733j = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return Util6.m3113a(this.f8730g, geobFrame.f8730g) && Util6.m3113a(this.f8731h, geobFrame.f8731h) && Util6.m3113a(this.f8732i, geobFrame.f8732i) && Arrays.equals(this.f8733j, geobFrame.f8733j);
    }

    public int hashCode() {
        String str = this.f8730g;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8731h;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8732i;
        return Arrays.hashCode(this.f8733j) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.p239m.Id3Frame
    public String toString() {
        return this.f8739f + ": mimeType=" + this.f8730g + ", filename=" + this.f8731h + ", description=" + this.f8732i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8730g);
        parcel.writeString(this.f8731h);
        parcel.writeString(this.f8732i);
        parcel.writeByteArray(this.f8733j);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = Util6.f6307a;
        this.f8730g = string;
        this.f8731h = parcel.readString();
        this.f8732i = parcel.readString();
        this.f8733j = parcel.createByteArray();
    }
}
