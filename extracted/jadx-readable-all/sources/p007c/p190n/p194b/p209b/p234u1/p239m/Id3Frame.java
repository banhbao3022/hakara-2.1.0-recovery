package p007c.p190n.p194b.p209b.p234u1.p239m;

import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.Metadata2;

/* JADX INFO: renamed from: c.n.b.b.u1.m.i, reason: use source file name */
/* JADX INFO: compiled from: Id3Frame.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Id3Frame implements Metadata.b {

    /* JADX INFO: renamed from: f */
    public final String f8739f;

    public Id3Frame(String str) {
        this.f8739f = str;
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

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Format mo4011q() {
        return Metadata2.m4013b(this);
    }

    public String toString() {
        return this.f8739f;
    }
}
