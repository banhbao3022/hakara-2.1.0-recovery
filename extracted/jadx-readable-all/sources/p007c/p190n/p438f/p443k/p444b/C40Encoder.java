package p007c.p190n.p438f.p443k.p444b;

import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.f.k.b.c, reason: use source file name */
/* JADX INFO: compiled from: C40Encoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C40Encoder implements Encoder4 {
    /* JADX INFO: renamed from: f */
    public static void m12359f(EncoderContext encoderContext, StringBuilder sb) {
        int iCharAt = (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + sb.charAt(2) + 1;
        encoderContext.f27703e.append(new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)}));
        sb.delete(0, 3);
    }

    @Override // p007c.p190n.p438f.p443k.p444b.Encoder4
    /* JADX INFO: renamed from: a */
    public void mo12358a(EncoderContext encoderContext) {
        StringBuilder sb = new StringBuilder();
        while (encoderContext.m12374d()) {
            char cM12372b = encoderContext.m12372b();
            encoderContext.f27704f++;
            int iMo12361c = mo12361c(cM12372b, sb);
            int iM12371a = encoderContext.m12371a() + ((sb.length() / 3) << 1);
            encoderContext.m12376f(iM12371a);
            int i = encoderContext.f27706h.f27714c - iM12371a;
            if (!encoderContext.m12374d()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    iMo12361c = m12360b(encoderContext, sb, sb2, iMo12361c);
                }
                while (sb.length() % 3 == 1 && ((iMo12361c <= 3 && i != 1) || iMo12361c > 3)) {
                    iMo12361c = m12360b(encoderContext, sb, sb2, iMo12361c);
                }
                break;
            }
            if (sb.length() % 3 == 0 && C4799a.m10995j0(encoderContext.f27699a, encoderContext.f27704f, mo12362d()) != mo12362d()) {
                encoderContext.f27705g = 0;
                break;
            }
        }
        mo12363e(encoderContext, sb);
    }

    /* JADX INFO: renamed from: b */
    public final int m12360b(EncoderContext encoderContext, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        encoderContext.f27704f--;
        int iMo12361c = mo12361c(encoderContext.m12372b(), sb2);
        encoderContext.f27706h = null;
        return iMo12361c;
    }

    /* JADX INFO: renamed from: c */
    public int mo12361c(char c2, StringBuilder sb) {
        if (c2 == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c2 >= '0' && c2 <= '9') {
            sb.append((char) ((c2 - '0') + 4));
            return 1;
        }
        if (c2 >= 'A' && c2 <= 'Z') {
            sb.append((char) ((c2 - 'A') + 14));
            return 1;
        }
        if (c2 < ' ') {
            sb.append((char) 0);
            sb.append(c2);
            return 2;
        }
        if (c2 >= '!' && c2 <= '/') {
            sb.append((char) 1);
            sb.append((char) (c2 - '!'));
            return 2;
        }
        if (c2 >= ':' && c2 <= '@') {
            sb.append((char) 1);
            sb.append((char) ((c2 - ':') + 15));
            return 2;
        }
        if (c2 >= '[' && c2 <= '_') {
            sb.append((char) 1);
            sb.append((char) ((c2 - '[') + 22));
            return 2;
        }
        if (c2 < '`' || c2 > 127) {
            sb.append("\u0001\u001e");
            return mo12361c((char) (c2 - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c2 - '`'));
        return 2;
    }

    /* JADX INFO: renamed from: d */
    public int mo12362d() {
        return 1;
    }

    /* JADX INFO: renamed from: e */
    public void mo12363e(EncoderContext encoderContext, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int iM12371a = encoderContext.m12371a() + length;
        encoderContext.m12376f(iM12371a);
        int i = encoderContext.f27706h.f27714c - iM12371a;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                m12359f(encoderContext, sb);
            }
            if (encoderContext.m12374d()) {
                encoderContext.f27703e.append((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                m12359f(encoderContext, sb);
            }
            if (encoderContext.m12374d()) {
                encoderContext.f27703e.append((char) 254);
            }
            encoderContext.f27704f--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb.length() >= 3) {
                m12359f(encoderContext, sb);
            }
            if (i > 0 || encoderContext.m12374d()) {
                encoderContext.f27703e.append((char) 254);
            }
        }
        encoderContext.f27705g = 0;
    }
}
