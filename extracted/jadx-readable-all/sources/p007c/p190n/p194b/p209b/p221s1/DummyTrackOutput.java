package p007c.p190n.p194b.p209b.p221s1;

import java.io.EOFException;
import java.io.IOException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.DataReader;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;

/* JADX INFO: renamed from: c.n.b.b.s1.g, reason: use source file name */
/* JADX INFO: compiled from: DummyTrackOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class DummyTrackOutput implements TrackOutput2 {

    /* JADX INFO: renamed from: a */
    public final byte[] f7621a = new byte[4096];

    @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
    /* JADX INFO: renamed from: a */
    public int mo3756a(DataReader dataReader, int i, boolean z, int i2) throws IOException {
        int i3 = dataReader.read(this.f7621a, 0, Math.min(this.f7621a.length, i));
        if (i3 != -1) {
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
    /* JADX INFO: renamed from: b */
    public /* synthetic */ int mo3757b(DataReader dataReader, int i, boolean z) {
        return TrackOutput.m3926a(this, dataReader, i, z);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void mo3758c(ParsableByteArray parsableByteArray, int i) {
        TrackOutput.m3927b(this, parsableByteArray, i);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
    /* JADX INFO: renamed from: d */
    public void mo3759d(long j2, int i, int i2, int i3, TrackOutput2.a aVar) {
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
    /* JADX INFO: renamed from: e */
    public void mo3760e(Format format) {
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
    /* JADX INFO: renamed from: f */
    public void mo3761f(ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.m3194D(parsableByteArray.f6393b + i);
    }
}
