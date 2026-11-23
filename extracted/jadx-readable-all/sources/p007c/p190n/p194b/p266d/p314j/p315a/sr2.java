package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sr2 extends PushbackInputStream {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ur2 f19688f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr2(ur2 ur2Var, InputStream inputStream) {
        super(inputStream, 1);
        this.f19688f = ur2Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        wr2.m8670a(this.f19688f.f20418c);
        super.close();
    }
}
