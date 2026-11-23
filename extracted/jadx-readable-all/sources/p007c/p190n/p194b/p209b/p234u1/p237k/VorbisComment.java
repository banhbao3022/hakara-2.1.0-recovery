package p007c.p190n.p194b.p209b.p234u1.p237k;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.Metadata2;

/* JADX INFO: renamed from: c.n.b.b.u1.k.b, reason: use source file name */
/* JADX INFO: compiled from: VorbisComment.java */
/* JADX INFO: loaded from: classes.dex */
public final class VorbisComment implements Metadata.b {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final String f8696f;

    /* JADX INFO: renamed from: g */
    public final String f8697g;

    /* JADX INFO: renamed from: c.n.b.b.u1.k.b$a */
    /* JADX INFO: compiled from: VorbisComment.java */
    public class a implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f8696f = str;
        this.f8697g = str2;
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
        if (obj == null || VorbisComment.class != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f8696f.equals(vorbisComment.f8696f) && this.f8697g.equals(vorbisComment.f8697g);
    }

    public int hashCode() {
        return this.f8697g.hashCode() + outline.m1569T(this.f8696f, 527, 31);
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Format mo4011q() {
        return Metadata2.m4013b(this);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("VC: ");
        sbM1556G.append(this.f8696f);
        sbM1556G.append("=");
        sbM1556G.append(this.f8697g);
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8696f);
        parcel.writeString(this.f8697g);
    }

    public VorbisComment(Parcel parcel) {
        String string = parcel.readString();
        int i = Util6.f6307a;
        this.f8696f = string;
        this.f8697g = parcel.readString();
    }
}
