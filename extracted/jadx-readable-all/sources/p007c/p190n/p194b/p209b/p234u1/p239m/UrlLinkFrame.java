package p007c.p190n.p194b.p209b.p234u1.p239m;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.u1.m.n, reason: use source file name */
/* JADX INFO: compiled from: UrlLinkFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g */
    public final String f8752g;

    /* JADX INFO: renamed from: h */
    public final String f8753h;

    /* JADX INFO: renamed from: c.n.b.b.u1.m.n$a */
    /* JADX INFO: compiled from: UrlLinkFrame.java */
    public class a implements Parcelable.Creator<UrlLinkFrame> {
        @Override // android.os.Parcelable.Creator
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public UrlLinkFrame[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f8752g = str2;
        this.f8753h = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f8739f.equals(urlLinkFrame.f8739f) && Util6.m3113a(this.f8752g, urlLinkFrame.f8752g) && Util6.m3113a(this.f8753h, urlLinkFrame.f8753h);
    }

    public int hashCode() {
        int iM1569T = outline.m1569T(this.f8739f, 527, 31);
        String str = this.f8752g;
        int iHashCode = (iM1569T + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8753h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.p239m.Id3Frame
    public String toString() {
        return this.f8739f + ": url=" + this.f8753h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8739f);
        parcel.writeString(this.f8752g);
        parcel.writeString(this.f8753h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UrlLinkFrame(Parcel parcel) {
        String string = parcel.readString();
        int i = Util6.f6307a;
        super(string);
        this.f8752g = parcel.readString();
        this.f8753h = parcel.readString();
    }
}
