package p007c.p190n.p438f.p443k.p444b;

import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.f.k.b.f, reason: use source file name */
/* JADX INFO: compiled from: EdifactEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class EdifactEncoder implements Encoder4 {
    /* JADX INFO: renamed from: b */
    public static String m12370b(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (charSequence.charAt(i) << 18) + ((length >= 2 ? charSequence.charAt(i + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i + 3) : (char) 0);
        char c2 = (char) ((iCharAt >> 16) & 255);
        char c3 = (char) ((iCharAt >> 8) & 255);
        char c4 = (char) (iCharAt & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c2);
        if (length >= 2) {
            sb.append(c3);
        }
        if (length >= 3) {
            sb.append(c4);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008f A[Catch: all -> 0x00dc, TryCatch #0 {all -> 0x00dc, blocks: (B:23:0x005a, B:28:0x0065, B:30:0x0077, B:35:0x008f, B:41:0x00a1, B:43:0x00b5, B:45:0x00c4, B:46:0x00cc, B:49:0x00d4, B:50:0x00db), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1 A[Catch: all -> 0x00dc, TryCatch #0 {all -> 0x00dc, blocks: (B:23:0x005a, B:28:0x0065, B:30:0x0077, B:35:0x008f, B:41:0x00a1, B:43:0x00b5, B:45:0x00c4, B:46:0x00cc, B:49:0x00d4, B:50:0x00db), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5 A[Catch: all -> 0x00dc, TryCatch #0 {all -> 0x00dc, blocks: (B:23:0x005a, B:28:0x0065, B:30:0x0077, B:35:0x008f, B:41:0x00a1, B:43:0x00b5, B:45:0x00c4, B:46:0x00cc, B:49:0x00d4, B:50:0x00db), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4 A[Catch: all -> 0x00dc, TryCatch #0 {all -> 0x00dc, blocks: (B:23:0x005a, B:28:0x0065, B:30:0x0077, B:35:0x008f, B:41:0x00a1, B:43:0x00b5, B:45:0x00c4, B:46:0x00cc, B:49:0x00d4, B:50:0x00db), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc A[Catch: all -> 0x00dc, TRY_LEAVE, TryCatch #0 {all -> 0x00dc, blocks: (B:23:0x005a, B:28:0x0065, B:30:0x0077, B:35:0x008f, B:41:0x00a1, B:43:0x00b5, B:45:0x00c4, B:46:0x00cc, B:49:0x00d4, B:50:0x00db), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4 A[Catch: all -> 0x00dc, TRY_ENTER, TryCatch #0 {all -> 0x00dc, blocks: (B:23:0x005a, B:28:0x0065, B:30:0x0077, B:35:0x008f, B:41:0x00a1, B:43:0x00b5, B:45:0x00c4, B:46:0x00cc, B:49:0x00d4, B:50:0x00db), top: B:54:0x005a }] */
    @Override // p007c.p190n.p438f.p443k.p444b.Encoder4
    /* JADX INFO: renamed from: a */
    public void mo12358a(EncoderContext encoderContext) {
        boolean z;
        int i;
        String strM12370b;
        StringBuilder sb = new StringBuilder();
        while (true) {
            z = true;
            if (!encoderContext.m12374d()) {
                break;
            }
            char cM12372b = encoderContext.m12372b();
            if (cM12372b >= ' ' && cM12372b <= '?') {
                sb.append(cM12372b);
            } else {
                if (cM12372b < '@' || cM12372b > '^') {
                    C4799a.m10970U(cM12372b);
                    throw null;
                }
                sb.append((char) (cM12372b - '@'));
            }
            encoderContext.f27704f++;
            if (sb.length() >= 4) {
                encoderContext.f27703e.append(m12370b(sb, 0));
                sb.delete(0, 4);
                if (C4799a.m10995j0(encoderContext.f27699a, encoderContext.f27704f, 4) != 4) {
                    encoderContext.f27705g = 0;
                    break;
                }
            }
        }
        sb.append((char) 31);
        try {
            int length = sb.length();
            if (length != 0) {
                if (length == 1) {
                    encoderContext.m12375e();
                    int iM12371a = encoderContext.f27706h.f27714c - encoderContext.m12371a();
                    int iM12373c = encoderContext.m12373c();
                    if (iM12373c > iM12371a) {
                        encoderContext.m12376f(encoderContext.m12371a() + 1);
                        iM12371a = encoderContext.f27706h.f27714c - encoderContext.m12371a();
                    }
                    if (iM12373c > iM12371a || iM12371a > 2) {
                        if (length <= 4) {
                            throw new IllegalStateException("Count must not exceed 4");
                        }
                        i = length - 1;
                        strM12370b = m12370b(sb, 0);
                        if ((!encoderContext.m12374d()) || i > 2) {
                            z = false;
                        }
                        if (i <= 2) {
                            encoderContext.m12376f(encoderContext.m12371a() + i);
                            if (encoderContext.f27706h.f27714c - encoderContext.m12371a() >= 3) {
                                encoderContext.m12376f(encoderContext.m12371a() + strM12370b.length());
                                z = false;
                            }
                        }
                        if (z) {
                            encoderContext.f27706h = null;
                            encoderContext.f27704f -= i;
                        } else {
                            encoderContext.f27703e.append(strM12370b);
                        }
                    }
                } else {
                    if (length <= 4) {
                        throw new IllegalStateException("Count must not exceed 4");
                    }
                    i = length - 1;
                    strM12370b = m12370b(sb, 0);
                    if (!encoderContext.m12374d()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (i <= 2) {
                        encoderContext.m12376f(encoderContext.m12371a() + i);
                        if (encoderContext.f27706h.f27714c - encoderContext.m12371a() >= 3) {
                            encoderContext.m12376f(encoderContext.m12371a() + strM12370b.length());
                            z = false;
                        }
                    }
                    if (z) {
                        encoderContext.f27706h = null;
                        encoderContext.f27704f -= i;
                    } else {
                        encoderContext.f27703e.append(strM12370b);
                    }
                }
            }
            encoderContext.f27705g = 0;
        } catch (Throwable th) {
            encoderContext.f27705g = 0;
            throw th;
        }
    }
}
