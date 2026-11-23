package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p190n.p194b.p266d.p267a.p280x.C2211a;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class df2 extends xf2 {
    public df2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2) {
        super(pe2Var, "HDBr8nc5ubdBn1y5M6IpuatOFh1+XK9blifaQQrU1HNvfw3hhdVJEUnkWE7sod57", "A6vbZ9nEwiHcLSfXI6B1ZE45FocqpxNzrogO6LWG5xM=", go0Var, i, 24);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        if (this.f21522a.f17959n) {
            m6357c();
            return;
        }
        synchronized (this.f21525d) {
            this.f21525d.m7008s((String) this.f21526e.invoke(null, this.f21522a.f17947b));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: b */
    public final Void mo6356b() throws Exception {
        pe2 pe2Var = this.f21522a;
        if (pe2Var.f17962q) {
            super.mo6356b();
            return null;
        }
        if (pe2Var.f17959n) {
            m6357c();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m6357c() {
        Future future;
        pe2 pe2Var = this.f21522a;
        C2211a c2211a = null;
        if (pe2Var.f17953h) {
            if (pe2Var.f17952g == null && (future = pe2Var.f17954i) != null) {
                try {
                    future.get(2000L, TimeUnit.MILLISECONDS);
                    pe2Var.f17954i = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    pe2Var.f17954i.cancel(true);
                }
            }
            c2211a = pe2Var.f17952g;
        }
        if (c2211a == null) {
            return;
        }
        try {
            C2211a.a aVarM4661c = c2211a.m4661c();
            String strM5292O0 = aVarM4661c.f10624a;
            int i = re2.f18761a;
            if (strM5292O0 != null && strM5292O0.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(strM5292O0);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                strM5292O0 = C2622l.m5292O0(bArr, true);
            }
            if (strM5292O0 != null) {
                synchronized (this.f21525d) {
                    this.f21525d.m7008s(strM5292O0);
                    go0 go0Var = this.f21525d;
                    boolean z = aVarM4661c.f10625b;
                    if (go0Var.f13191h) {
                        go0Var.m6298m();
                        go0Var.f13191h = false;
                    }
                    f31.m6747i0((f31) go0Var.f13190g, z);
                    go0 go0Var2 = this.f21525d;
                    eu0 eu0Var = eu0.DEVICE_IDENTIFIER_ANDROID_AD_ID;
                    if (go0Var2.f13191h) {
                        go0Var2.m6298m();
                        go0Var2.f13191h = false;
                    }
                    f31.m6746h0((f31) go0Var2.f13190g, eu0Var);
                }
            }
        } catch (IOException unused3) {
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2, java.util.concurrent.Callable
    public final Object call() throws Exception {
        pe2 pe2Var = this.f21522a;
        if (pe2Var.f17962q) {
            super.mo6356b();
            return null;
        }
        if (!pe2Var.f17959n) {
            return null;
        }
        m6357c();
        return null;
    }
}
