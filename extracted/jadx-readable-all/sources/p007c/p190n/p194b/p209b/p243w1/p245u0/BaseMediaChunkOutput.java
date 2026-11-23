package p007c.p190n.p194b.p209b.p243w1.p245u0;

import android.util.Log;
import p007c.p190n.p194b.p209b.p221s1.DummyTrackOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p243w1.SampleQueue;

/* JADX INFO: renamed from: c.n.b.b.w1.u0.c, reason: use source file name */
/* JADX INFO: compiled from: BaseMediaChunkOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class BaseMediaChunkOutput implements ChunkExtractor.a {

    /* JADX INFO: renamed from: a */
    public final int[] f9090a;

    /* JADX INFO: renamed from: b */
    public final SampleQueue[] f9091b;

    public BaseMediaChunkOutput(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.f9090a = iArr;
        this.f9091b = sampleQueueArr;
    }

    /* JADX INFO: renamed from: a */
    public void m4197a(long j2) {
        for (SampleQueue sampleQueue : this.f9091b) {
            if (sampleQueue.f8993H != j2) {
                sampleQueue.f8993H = j2;
                sampleQueue.f8986A = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public TrackOutput2 m4198b(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f9090a;
            if (i3 >= iArr.length) {
                Log.e("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new DummyTrackOutput();
            }
            if (i2 == iArr[i3]) {
                return this.f9091b[i3];
            }
            i3++;
        }
    }
}
