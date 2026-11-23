package p007c.p190n.p194b.p209b.p234u1.p239m;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.u1.m.e, reason: use source file name */
/* JADX INFO: compiled from: ChapterTocFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g */
    public final String f8722g;

    /* JADX INFO: renamed from: h */
    public final boolean f8723h;

    /* JADX INFO: renamed from: i */
    public final boolean f8724i;

    /* JADX INFO: renamed from: j */
    public final String[] f8725j;

    /* JADX INFO: renamed from: k */
    public final Id3Frame[] f8726k;

    /* JADX INFO: renamed from: c.n.b.b.u1.m.e$a */
    /* JADX INFO: compiled from: ChapterTocFrame.java */
    public class a implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ChapterTocFrame[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f8722g = str;
        this.f8723h = z;
        this.f8724i = z2;
        this.f8725j = strArr;
        this.f8726k = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f8723h == chapterTocFrame.f8723h && this.f8724i == chapterTocFrame.f8724i && Util6.m3113a(this.f8722g, chapterTocFrame.f8722g) && Arrays.equals(this.f8725j, chapterTocFrame.f8725j) && Arrays.equals(this.f8726k, chapterTocFrame.f8726k);
    }

    public int hashCode() {
        int i = (((527 + (this.f8723h ? 1 : 0)) * 31) + (this.f8724i ? 1 : 0)) * 31;
        String str = this.f8722g;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8722g);
        parcel.writeByte(this.f8723h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8724i ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f8725j);
        parcel.writeInt(this.f8726k.length);
        for (Id3Frame id3Frame : this.f8726k) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = Util6.f6307a;
        this.f8722g = string;
        this.f8723h = parcel.readByte() != 0;
        this.f8724i = parcel.readByte() != 0;
        this.f8725j = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.f8726k = new Id3Frame[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f8726k[i3] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
