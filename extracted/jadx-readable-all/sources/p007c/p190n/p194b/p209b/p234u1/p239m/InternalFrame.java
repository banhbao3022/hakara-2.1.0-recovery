package p007c.p190n.p194b.p209b.p234u1.p239m;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.u1.m.j, reason: use source file name */
/* JADX INFO: compiled from: InternalFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g */
    public final String f8740g;

    /* JADX INFO: renamed from: h */
    public final String f8741h;

    /* JADX INFO: renamed from: i */
    public final String f8742i;

    /* JADX INFO: renamed from: c.n.b.b.u1.m.j$a */
    /* JADX INFO: compiled from: InternalFrame.java */
    public class a implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public InternalFrame[] newArray(int i) {
            return new InternalFrame[i];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f8740g = str;
        this.f8741h = str2;
        this.f8742i = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return Util6.m3113a(this.f8741h, internalFrame.f8741h) && Util6.m3113a(this.f8740g, internalFrame.f8740g) && Util6.m3113a(this.f8742i, internalFrame.f8742i);
    }

    public int hashCode() {
        String str = this.f8740g;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8741h;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8742i;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.p239m.Id3Frame
    public String toString() {
        return this.f8739f + ": domain=" + this.f8740g + ", description=" + this.f8741h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8739f);
        parcel.writeString(this.f8740g);
        parcel.writeString(this.f8742i);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i = Util6.f6307a;
        this.f8740g = string;
        this.f8741h = parcel.readString();
        this.f8742i = parcel.readString();
    }
}
