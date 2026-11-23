package p007c.p085g.p086a.p089m.p098v.p100e;

import java.io.IOException;
import java.nio.ByteBuffer;
import p007c.p085g.p086a.p089m.p090s.DataRewinder;

/* JADX INFO: renamed from: c.g.a.m.v.e.a, reason: use source file name */
/* JADX INFO: compiled from: ByteBufferRewinder.java */
/* JADX INFO: loaded from: classes.dex */
public class ByteBufferRewinder implements DataRewinder<ByteBuffer> {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f3603a;

    /* JADX INFO: renamed from: c.g.a.m.v.e.a$a */
    /* JADX INFO: compiled from: ByteBufferRewinder.java */
    public static class a implements DataRewinder.a<ByteBuffer> {
        @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder.a
        /* JADX INFO: renamed from: a */
        public Class<ByteBuffer> mo1724a() {
            return ByteBuffer.class;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder.a
        /* JADX INFO: renamed from: b */
        public DataRewinder<ByteBuffer> mo1725b(ByteBuffer byteBuffer) {
            return new ByteBufferRewinder(byteBuffer);
        }
    }

    public ByteBufferRewinder(ByteBuffer byteBuffer) {
        this.f3603a = byteBuffer;
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo1722a() throws IOException {
        this.f3603a.position(0);
        return this.f3603a;
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder
    /* JADX INFO: renamed from: b */
    public void mo1723b() {
    }
}
