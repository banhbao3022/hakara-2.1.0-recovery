package p007c.p190n.p194b.p209b.p234u1.p241o;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.u1.o.a, reason: use source file name */
/* JADX INFO: compiled from: PrivateCommand.java */
/* JADX INFO: loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final long f8769f;

    /* JADX INFO: renamed from: g */
    public final long f8770g;

    /* JADX INFO: renamed from: h */
    public final byte[] f8771h;

    /* JADX INFO: renamed from: c.n.b.b.u1.o.a$a */
    /* JADX INFO: compiled from: PrivateCommand.java */
    public class a implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    public PrivateCommand(long j2, byte[] bArr, long j3) {
        this.f8769f = j3;
        this.f8770g = j2;
        this.f8771h = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8769f);
        parcel.writeLong(this.f8770g);
        parcel.writeByteArray(this.f8771h);
    }

    public PrivateCommand(Parcel parcel, a aVar) {
        this.f8769f = parcel.readLong();
        this.f8770g = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = Util6.f6307a;
        this.f8771h = bArrCreateByteArray;
    }
}
