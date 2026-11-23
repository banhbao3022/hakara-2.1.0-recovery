package p007c.p190n.p194b.p209b.p234u1.p239m;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.u1.m.d, reason: use source file name */
/* JADX INFO: compiled from: ChapterFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g */
    public final String f8716g;

    /* JADX INFO: renamed from: h */
    public final int f8717h;

    /* JADX INFO: renamed from: i */
    public final int f8718i;

    /* JADX INFO: renamed from: j */
    public final long f8719j;

    /* JADX INFO: renamed from: k */
    public final long f8720k;

    /* JADX INFO: renamed from: l */
    public final Id3Frame[] f8721l;

    /* JADX INFO: renamed from: c.n.b.b.u1.m.d$a */
    /* JADX INFO: compiled from: ChapterFrame.java */
    public class a implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }
    }

    public ChapterFrame(String str, int i, int i2, long j2, long j3, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f8716g = str;
        this.f8717h = i;
        this.f8718i = i2;
        this.f8719j = j2;
        this.f8720k = j3;
        this.f8721l = id3FrameArr;
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.p239m.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f8717h == chapterFrame.f8717h && this.f8718i == chapterFrame.f8718i && this.f8719j == chapterFrame.f8719j && this.f8720k == chapterFrame.f8720k && Util6.m3113a(this.f8716g, chapterFrame.f8716g) && Arrays.equals(this.f8721l, chapterFrame.f8721l);
    }

    public int hashCode() {
        int i = (((((((527 + this.f8717h) * 31) + this.f8718i) * 31) + ((int) this.f8719j)) * 31) + ((int) this.f8720k)) * 31;
        String str = this.f8716g;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8716g);
        parcel.writeInt(this.f8717h);
        parcel.writeInt(this.f8718i);
        parcel.writeLong(this.f8719j);
        parcel.writeLong(this.f8720k);
        parcel.writeInt(this.f8721l.length);
        for (Id3Frame id3Frame : this.f8721l) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = Util6.f6307a;
        this.f8716g = string;
        this.f8717h = parcel.readInt();
        this.f8718i = parcel.readInt();
        this.f8719j = parcel.readLong();
        this.f8720k = parcel.readLong();
        int i2 = parcel.readInt();
        this.f8721l = new Id3Frame[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f8721l[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
