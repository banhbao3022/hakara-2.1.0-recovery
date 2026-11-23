package p007c.p190n.p194b.p209b.p218q1;

import java.util.UUID;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.q1.d0, reason: use source file name */
/* JADX INFO: compiled from: FrameworkMediaCrypto.java */
/* JADX INFO: loaded from: classes.dex */
public final class FrameworkMediaCrypto implements ExoMediaCrypto {

    /* JADX INFO: renamed from: a */
    public static final boolean f7324a;

    /* JADX INFO: renamed from: b */
    public final UUID f7325b;

    /* JADX INFO: renamed from: c */
    public final byte[] f7326c;

    /* JADX INFO: renamed from: d */
    public final boolean f7327d;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(Util6.f6309c)) {
            String str = Util6.f6310d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        f7324a = z;
    }

    public FrameworkMediaCrypto(UUID uuid, byte[] bArr, boolean z) {
        this.f7325b = uuid;
        this.f7326c = bArr;
        this.f7327d = z;
    }
}
