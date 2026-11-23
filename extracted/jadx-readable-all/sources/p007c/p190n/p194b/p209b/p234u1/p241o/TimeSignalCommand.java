package p007c.p190n.p194b.p209b.p234u1.p241o;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;

/* JADX INFO: renamed from: c.n.b.b.u1.o.g, reason: use source file name */
/* JADX INFO: compiled from: TimeSignalCommand.java */
/* JADX INFO: loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final long f8805f;

    /* JADX INFO: renamed from: g */
    public final long f8806g;

    /* JADX INFO: renamed from: c.n.b.b.u1.o.g$a */
    /* JADX INFO: compiled from: TimeSignalCommand.java */
    public class a implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    public TimeSignalCommand(long j2, long j3) {
        this.f8805f = j2;
        this.f8806g = j3;
    }

    /* JADX INFO: renamed from: a */
    public static long m4046a(ParsableByteArray parsableByteArray, long j2) {
        long jM3214s = parsableByteArray.m3214s();
        if ((128 & jM3214s) != 0) {
            return 8589934591L & ((((jM3214s & 1) << 32) | parsableByteArray.m3215t()) + j2);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8805f);
        parcel.writeLong(this.f8806g);
    }

    public TimeSignalCommand(long j2, long j3, a aVar) {
        this.f8805f = j2;
        this.f8806g = j3;
    }
}
