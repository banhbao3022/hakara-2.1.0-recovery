package p007c.p190n.p194b.p209b.p234u1.p239m;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.u1.m.m, reason: use source file name */
/* JADX INFO: compiled from: TextInformationFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g */
    public final String f8750g;

    /* JADX INFO: renamed from: h */
    public final String f8751h;

    /* JADX INFO: renamed from: c.n.b.b.u1.m.m$a */
    /* JADX INFO: compiled from: TextInformationFrame.java */
    public class a implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f8750g = str2;
        this.f8751h = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return this.f8739f.equals(textInformationFrame.f8739f) && Util6.m3113a(this.f8750g, textInformationFrame.f8750g) && Util6.m3113a(this.f8751h, textInformationFrame.f8751h);
    }

    public int hashCode() {
        int iM1569T = outline.m1569T(this.f8739f, 527, 31);
        String str = this.f8750g;
        int iHashCode = (iM1569T + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8751h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.p239m.Id3Frame
    public String toString() {
        return this.f8739f + ": description=" + this.f8750g + ": value=" + this.f8751h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8739f);
        parcel.writeString(this.f8750g);
        parcel.writeString(this.f8751h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInformationFrame(Parcel parcel) {
        String string = parcel.readString();
        int i = Util6.f6307a;
        super(string);
        this.f8750g = parcel.readString();
        this.f8751h = parcel.readString();
    }
}
