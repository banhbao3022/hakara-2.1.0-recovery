package p007c.p085g.p086a.p089m.p090s;

import java.io.IOException;
import java.io.InputStream;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p007c.p085g.p086a.p089m.p098v.p099d.RecyclableBufferedInputStream;

/* JADX INFO: renamed from: c.g.a.m.s.k, reason: use source file name */
/* JADX INFO: compiled from: InputStreamRewinder.java */
/* JADX INFO: loaded from: classes.dex */
public final class InputStreamRewinder implements DataRewinder<InputStream> {

    /* JADX INFO: renamed from: a */
    public final RecyclableBufferedInputStream f3065a;

    /* JADX INFO: renamed from: c.g.a.m.s.k$a */
    /* JADX INFO: compiled from: InputStreamRewinder.java */
    public static final class a implements DataRewinder.a<InputStream> {

        /* JADX INFO: renamed from: a */
        public final ArrayPool f3066a;

        public a(ArrayPool arrayPool) {
            this.f3066a = arrayPool;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder.a
        /* JADX INFO: renamed from: a */
        public Class<InputStream> mo1724a() {
            return InputStream.class;
        }

        @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder.a
        /* JADX INFO: renamed from: b */
        public DataRewinder<InputStream> mo1725b(InputStream inputStream) {
            return new InputStreamRewinder(inputStream, this.f3066a);
        }
    }

    public InputStreamRewinder(InputStream inputStream, ArrayPool arrayPool) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        this.f3065a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder
    /* JADX INFO: renamed from: b */
    public void mo1723b() {
        this.f3065a.m1917c();
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataRewinder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream mo1722a() throws IOException {
        this.f3065a.reset();
        return this.f3065a;
    }
}
