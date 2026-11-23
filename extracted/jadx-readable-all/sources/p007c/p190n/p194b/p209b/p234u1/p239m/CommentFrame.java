package p007c.p190n.p194b.p209b.p234u1.p239m;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.u1.m.f, reason: use source file name */
/* JADX INFO: compiled from: CommentFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g */
    public final String f8727g;

    /* JADX INFO: renamed from: h */
    public final String f8728h;

    /* JADX INFO: renamed from: i */
    public final String f8729i;

    /* JADX INFO: renamed from: c.n.b.b.u1.m.f$a */
    /* JADX INFO: compiled from: CommentFrame.java */
    public class a implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f8727g = str;
        this.f8728h = str2;
        this.f8729i = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return Util6.m3113a(this.f8728h, commentFrame.f8728h) && Util6.m3113a(this.f8727g, commentFrame.f8727g) && Util6.m3113a(this.f8729i, commentFrame.f8729i);
    }

    public int hashCode() {
        String str = this.f8727g;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8728h;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8729i;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.p239m.Id3Frame
    public String toString() {
        return this.f8739f + ": language=" + this.f8727g + ", description=" + this.f8728h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8739f);
        parcel.writeString(this.f8727g);
        parcel.writeString(this.f8729i);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = Util6.f6307a;
        this.f8727g = string;
        this.f8728h = parcel.readString();
        this.f8729i = parcel.readString();
    }
}
