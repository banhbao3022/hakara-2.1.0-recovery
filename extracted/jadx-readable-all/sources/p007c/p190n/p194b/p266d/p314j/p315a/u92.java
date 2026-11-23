package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class u92 implements j92 {

    /* JADX INFO: renamed from: a */
    public final l92 f20251a;

    /* JADX INFO: renamed from: b */
    public final String f20252b;

    /* JADX INFO: renamed from: c */
    public final Object[] f20253c;

    /* JADX INFO: renamed from: d */
    public final int f20254d;

    public u92(l92 l92Var, String str, Object[] objArr) {
        char cCharAt;
        this.f20251a = l92Var;
        this.f20252b = str;
        this.f20253c = objArr;
        int i = 1;
        try {
            cCharAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            String str2 = new String(charArray);
            try {
                try {
                    cCharAt = str2.charAt(0);
                    str = str2;
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str2.length()];
                    str2.getChars(0, str2.length(), cArr, 0);
                    String str3 = new String(cArr);
                    try {
                        cCharAt = str3.charAt(0);
                        str = str3;
                    } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
                        e = e;
                        str2 = str3;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            } catch (StringIndexOutOfBoundsException e3) {
                e = e3;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str2, Integer.valueOf(charArray.length)), e);
            }
        }
        if (cCharAt < 55296) {
            this.f20254d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        while (true) {
            int i4 = i + 1;
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 55296) {
                this.f20254d = (cCharAt2 << i3) | i2;
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i = i4;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j92
    /* JADX INFO: renamed from: a */
    public final l92 mo7320a() {
        return this.f20251a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j92
    /* JADX INFO: renamed from: b */
    public final int mo7321b() {
        return (this.f20254d & 1) == 1 ? 1 : 2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.j92
    public final boolean zza() {
        return (this.f20254d & 2) == 2;
    }
}
