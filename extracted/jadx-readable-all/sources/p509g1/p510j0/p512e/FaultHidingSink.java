package p509g1.p510j0.p512e;

import java.io.EOFException;
import java.io.IOException;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p524h1.Buffer3;
import p524h1.ForwardingSink;
import p524h1.Sink;

/* JADX INFO: renamed from: g1.j0.e.g, reason: use source file name */
/* JADX INFO: compiled from: FaultHidingSink.kt */
/* JADX INFO: loaded from: classes2.dex */
public class FaultHidingSink extends ForwardingSink {

    /* JADX INFO: renamed from: g */
    public boolean f30156g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC6164l<IOException, Unit> f30157h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(Sink sink, InterfaceC6164l<? super IOException, Unit> interfaceC6164l) {
        super(sink);
        Intrinsics2.m13090f(sink, "delegate");
        Intrinsics2.m13090f(interfaceC6164l, "onException");
        this.f30157h = interfaceC6164l;
    }

    @Override // p524h1.ForwardingSink, p524h1.Sink
    /* JADX INFO: renamed from: U */
    public void mo13415U(Buffer3 buffer3, long j2) throws EOFException {
        Intrinsics2.m13090f(buffer3, "source");
        if (this.f30156g) {
            buffer3.skip(j2);
            return;
        }
        try {
            Intrinsics2.m13090f(buffer3, "source");
            this.f30716f.mo13415U(buffer3, j2);
        } catch (IOException e) {
            this.f30156g = true;
            this.f30157h.mo3b(e);
        }
    }

    @Override // p524h1.ForwardingSink, p524h1.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f30156g) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.f30156g = true;
            this.f30157h.mo3b(e);
        }
    }

    @Override // p524h1.ForwardingSink, p524h1.Sink, java.io.Flushable
    public void flush() {
        if (this.f30156g) {
            return;
        }
        try {
            this.f30716f.flush();
        } catch (IOException e) {
            this.f30156g = true;
            this.f30157h.mo3b(e);
        }
    }
}
