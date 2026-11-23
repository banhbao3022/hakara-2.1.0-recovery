package p007c.p190n.p385d.p391l.p392e.p396l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: c.n.d.l.e.l.d, reason: use source file name */
/* JADX INFO: compiled from: QueueFileLogStore.java */
/* JADX INFO: loaded from: classes.dex */
public class QueueFileLogStore implements QueueFile.d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte[] f26668a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int[] f26669b;

    public QueueFileLogStore(QueueFileLogStore2 queueFileLogStore2, byte[] bArr, int[] iArr) {
        this.f26668a = bArr;
        this.f26669b = iArr;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p396l.QueueFile.d
    /* JADX INFO: renamed from: a */
    public void mo11833a(InputStream inputStream, int i) throws IOException {
        try {
            inputStream.read(this.f26668a, this.f26669b[0], i);
            int[] iArr = this.f26669b;
            iArr[0] = iArr[0] + i;
        } finally {
            inputStream.close();
        }
    }
}
