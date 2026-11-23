package p007c.p190n.p438f.p443k.p444b;

import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.f.k.b.b, reason: use source file name */
/* JADX INFO: compiled from: Base256Encoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class Base256Encoder implements Encoder4 {
    @Override // p007c.p190n.p438f.p443k.p444b.Encoder4
    /* JADX INFO: renamed from: a */
    public void mo12358a(EncoderContext encoderContext) {
        StringBuilder sbM1555F = outline.m1555F((char) 0);
        while (encoderContext.m12374d()) {
            sbM1555F.append(encoderContext.m12372b());
            int i = encoderContext.f27704f + 1;
            encoderContext.f27704f = i;
            if (C4799a.m10995j0(encoderContext.f27699a, i, 5) != 5) {
                encoderContext.f27705g = 0;
                break;
            }
        }
        int length = sbM1555F.length() - 1;
        int iM12371a = encoderContext.m12371a() + length + 1;
        encoderContext.m12376f(iM12371a);
        boolean z = encoderContext.f27706h.f27714c - iM12371a > 0;
        if (encoderContext.m12374d() || z) {
            if (length <= 249) {
                sbM1555F.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sbM1555F.setCharAt(0, (char) ((length / 250) + 249));
                sbM1555F.insert(1, (char) (length % 250));
            }
        }
        int length2 = sbM1555F.length();
        for (int i2 = 0; i2 < length2; i2++) {
            int iM12371a2 = (((encoderContext.m12371a() + 1) * 149) % 255) + 1 + sbM1555F.charAt(i2);
            if (iM12371a2 > 255) {
                iM12371a2 -= 256;
            }
            encoderContext.f27703e.append((char) iM12371a2);
        }
    }
}
