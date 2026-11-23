package p007c.p190n.p194b.p209b.p234u1.p241o;

import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.Metadata2;

/* JADX INFO: renamed from: c.n.b.b.u1.o.b, reason: use source file name */
/* JADX INFO: compiled from: SpliceCommand.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class SpliceCommand implements Metadata.b {
    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: F */
    public /* synthetic */ byte[] mo4010F() {
        return Metadata2.m4012a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Format mo4011q() {
        return Metadata2.m4013b(this);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("SCTE-35 splice command: type=");
        sbM1556G.append(getClass().getSimpleName());
        return sbM1556G.toString();
    }
}
