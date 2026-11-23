package p007c.p190n.p438f.p443k.p444b;

import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.f.k.b.a, reason: use source file name */
/* JADX INFO: compiled from: ASCIIEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class ASCIIEncoder implements Encoder4 {
    @Override // p007c.p190n.p438f.p443k.p444b.Encoder4
    /* JADX INFO: renamed from: a */
    public void mo12358a(EncoderContext encoderContext) {
        int i;
        String str = encoderContext.f27699a;
        int i2 = encoderContext.f27704f;
        int length = str.length();
        if (i2 < length) {
            char cCharAt = str.charAt(i2);
            i = 0;
            while (C4799a.m10971V(cCharAt) && i2 < length) {
                i++;
                i2++;
                if (i2 < length) {
                    cCharAt = str.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char cCharAt2 = encoderContext.f27699a.charAt(encoderContext.f27704f);
            char cCharAt3 = encoderContext.f27699a.charAt(encoderContext.f27704f + 1);
            if (C4799a.m10971V(cCharAt2) && C4799a.m10971V(cCharAt3)) {
                encoderContext.f27703e.append((char) outline.m1578b(cCharAt3, -48, (cCharAt2 - '0') * 10, 130));
                encoderContext.f27704f += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
            }
        }
        char cM12372b = encoderContext.m12372b();
        int iM10995j0 = C4799a.m10995j0(encoderContext.f27699a, encoderContext.f27704f, 0);
        if (iM10995j0 == 0) {
            if (!C4799a.m10972W(cM12372b)) {
                encoderContext.f27703e.append((char) (cM12372b + 1));
                encoderContext.f27704f++;
                return;
            } else {
                encoderContext.f27703e.append((char) 235);
                encoderContext.f27703e.append((char) ((cM12372b - 128) + 1));
                encoderContext.f27704f++;
                return;
            }
        }
        if (iM10995j0 == 1) {
            encoderContext.f27703e.append((char) 230);
            encoderContext.f27705g = 1;
            return;
        }
        if (iM10995j0 == 2) {
            encoderContext.f27703e.append((char) 239);
            encoderContext.f27705g = 2;
            return;
        }
        if (iM10995j0 == 3) {
            encoderContext.f27703e.append((char) 238);
            encoderContext.f27705g = 3;
        } else if (iM10995j0 == 4) {
            encoderContext.f27703e.append((char) 240);
            encoderContext.f27705g = 4;
        } else {
            if (iM10995j0 != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iM10995j0)));
            }
            encoderContext.f27703e.append((char) 231);
            encoderContext.f27705g = 5;
        }
    }
}
