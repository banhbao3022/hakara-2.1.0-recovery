package p007c.p190n.p194b.p209b.p234u1.p241o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.n.b.b.u1.o.e, reason: use source file name */
/* JADX INFO: compiled from: SpliceNullCommand.java */
/* JADX INFO: loaded from: classes.dex */
public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new a();

    /* JADX INFO: renamed from: c.n.b.b.u1.o.e$a */
    /* JADX INFO: compiled from: SpliceNullCommand.java */
    public class a implements Parcelable.Creator<SpliceNullCommand> {
        @Override // android.os.Parcelable.Creator
        public SpliceNullCommand createFromParcel(Parcel parcel) {
            return new SpliceNullCommand();
        }

        @Override // android.os.Parcelable.Creator
        public SpliceNullCommand[] newArray(int i) {
            return new SpliceNullCommand[i];
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
