package p007c.p190n.p438f.p443k.p444b;

import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.f.k.b.m, reason: use source file name */
/* JADX INFO: compiled from: X12Encoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class X12Encoder extends C40Encoder {
    @Override // p007c.p190n.p438f.p443k.p444b.C40Encoder, p007c.p190n.p438f.p443k.p444b.Encoder4
    /* JADX INFO: renamed from: a */
    public void mo12358a(EncoderContext encoderContext) {
        StringBuilder sb = new StringBuilder();
        while (encoderContext.m12374d()) {
            char cM12372b = encoderContext.m12372b();
            encoderContext.f27704f++;
            mo12361c(cM12372b, sb);
            if (sb.length() % 3 == 0) {
                C40Encoder.m12359f(encoderContext, sb);
                if (C4799a.m10995j0(encoderContext.f27699a, encoderContext.f27704f, 3) != 3) {
                    encoderContext.f27705g = 0;
                    break;
                }
            }
        }
        mo12363e(encoderContext, sb);
    }

    @Override // p007c.p190n.p438f.p443k.p444b.C40Encoder
    /* JADX INFO: renamed from: c */
    public int mo12361c(char c2, StringBuilder sb) {
        if (c2 == '\r') {
            sb.append((char) 0);
        } else if (c2 == ' ') {
            sb.append((char) 3);
        } else if (c2 == '*') {
            sb.append((char) 1);
        } else if (c2 == '>') {
            sb.append((char) 2);
        } else if (c2 >= '0' && c2 <= '9') {
            sb.append((char) ((c2 - '0') + 4));
        } else {
            if (c2 < 'A' || c2 > 'Z') {
                C4799a.m10970U(c2);
                throw null;
            }
            sb.append((char) ((c2 - 'A') + 14));
        }
        return 1;
    }

    @Override // p007c.p190n.p438f.p443k.p444b.C40Encoder
    /* JADX INFO: renamed from: d */
    public int mo12362d() {
        return 3;
    }

    @Override // p007c.p190n.p438f.p443k.p444b.C40Encoder
    /* JADX INFO: renamed from: e */
    public void mo12363e(EncoderContext encoderContext, StringBuilder sb) {
        encoderContext.m12375e();
        int iM12371a = encoderContext.f27706h.f27714c - encoderContext.m12371a();
        encoderContext.f27704f -= sb.length();
        if (encoderContext.m12373c() > 1 || iM12371a > 1 || encoderContext.m12373c() != iM12371a) {
            encoderContext.f27703e.append((char) 254);
        }
        if (encoderContext.f27705g < 0) {
            encoderContext.f27705g = 0;
        }
    }
}
