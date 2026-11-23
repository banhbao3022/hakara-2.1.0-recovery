package p007c.p190n.p194b.p209b.p234u1.p239m;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.u1.m.k, reason: use source file name */
/* JADX INFO: compiled from: MlltFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();

    /* JADX INFO: renamed from: g */
    public final int f8743g;

    /* JADX INFO: renamed from: h */
    public final int f8744h;

    /* JADX INFO: renamed from: i */
    public final int f8745i;

    /* JADX INFO: renamed from: j */
    public final int[] f8746j;

    /* JADX INFO: renamed from: k */
    public final int[] f8747k;

    /* JADX INFO: renamed from: c.n.b.b.u1.m.k$a */
    /* JADX INFO: compiled from: MlltFrame.java */
    public class a implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public MlltFrame[] newArray(int i) {
            return new MlltFrame[i];
        }
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f8743g = i;
        this.f8744h = i2;
        this.f8745i = i3;
        this.f8746j = iArr;
        this.f8747k = iArr2;
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.p239m.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f8743g == mlltFrame.f8743g && this.f8744h == mlltFrame.f8744h && this.f8745i == mlltFrame.f8745i && Arrays.equals(this.f8746j, mlltFrame.f8746j) && Arrays.equals(this.f8747k, mlltFrame.f8747k);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f8747k) + ((Arrays.hashCode(this.f8746j) + ((((((527 + this.f8743g) * 31) + this.f8744h) * 31) + this.f8745i) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8743g);
        parcel.writeInt(this.f8744h);
        parcel.writeInt(this.f8745i);
        parcel.writeIntArray(this.f8746j);
        parcel.writeIntArray(this.f8747k);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f8743g = parcel.readInt();
        this.f8744h = parcel.readInt();
        this.f8745i = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = Util6.f6307a;
        this.f8746j = iArrCreateIntArray;
        this.f8747k = parcel.createIntArray();
    }
}
