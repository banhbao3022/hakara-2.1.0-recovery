package p636z0.p725k.p737j;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: z0.k.j.a, reason: use source file name */
/* JADX INFO: compiled from: BidiFormatter.java */
/* JADX INFO: loaded from: classes.dex */
public final class BidiFormatter {

    /* JADX INFO: renamed from: a */
    public static final TextDirectionHeuristicCompat f37939a;

    /* JADX INFO: renamed from: b */
    public static final String f37940b;

    /* JADX INFO: renamed from: c */
    public static final String f37941c;

    /* JADX INFO: renamed from: d */
    public static final BidiFormatter f37942d;

    /* JADX INFO: renamed from: e */
    public static final BidiFormatter f37943e;

    /* JADX INFO: renamed from: f */
    public final boolean f37944f;

    /* JADX INFO: renamed from: g */
    public final int f37945g;

    /* JADX INFO: renamed from: h */
    public final TextDirectionHeuristicCompat f37946h;

    /* JADX INFO: renamed from: z0.k.j.a$b */
    /* JADX INFO: compiled from: BidiFormatter.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final byte[] f37950a = new byte[1792];

        /* JADX INFO: renamed from: b */
        public final CharSequence f37951b;

        /* JADX INFO: renamed from: c */
        public final int f37952c;

        /* JADX INFO: renamed from: d */
        public int f37953d;

        /* JADX INFO: renamed from: e */
        public char f37954e;

        static {
            for (int i = 0; i < 1792; i++) {
                f37950a[i] = Character.getDirectionality(i);
            }
        }

        public b(CharSequence charSequence, boolean z) {
            this.f37951b = charSequence;
            this.f37952c = charSequence.length();
        }

        /* JADX INFO: renamed from: a */
        public byte m16213a() {
            char cCharAt = this.f37951b.charAt(this.f37953d - 1);
            this.f37954e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f37951b, this.f37953d);
                this.f37953d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f37953d--;
            char c2 = this.f37954e;
            return c2 < 1792 ? f37950a[c2] : Character.getDirectionality(c2);
        }
    }

    static {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f37965c;
        f37939a = textDirectionHeuristicCompat;
        f37940b = Character.toString((char) 8206);
        f37941c = Character.toString((char) 8207);
        f37942d = new BidiFormatter(false, 2, textDirectionHeuristicCompat);
        f37943e = new BidiFormatter(true, 2, textDirectionHeuristicCompat);
    }

    public BidiFormatter(boolean z, int i, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.f37944f = z;
        this.f37945g = i;
        this.f37946h = textDirectionHeuristicCompat;
    }

    /* JADX INFO: renamed from: a */
    public static int m16207a(CharSequence charSequence) {
        byte directionality;
        b bVar = new b(charSequence, false);
        bVar.f37953d = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = bVar.f37953d;
            if (i4 < bVar.f37952c && i == 0) {
                char cCharAt = bVar.f37951b.charAt(i4);
                bVar.f37954e = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(bVar.f37951b, bVar.f37953d);
                    bVar.f37953d = Character.charCount(iCodePointAt) + bVar.f37953d;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    bVar.f37953d++;
                    char c2 = bVar.f37954e;
                    directionality = c2 < 1792 ? b.f37950a[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i == 0) {
            return 0;
        }
        if (i2 != 0) {
            return i2;
        }
        while (bVar.f37953d > 0) {
            switch (bVar.m16213a()) {
                case 14:
                case 15:
                    if (i == i3) {
                        return -1;
                    }
                    i3--;
                    break;
                case 16:
                case 17:
                    if (i == i3) {
                        return 1;
                    }
                    i3--;
                    break;
                case 18:
                    i3++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m16208b(CharSequence charSequence) {
        b bVar = new b(charSequence, false);
        bVar.f37953d = bVar.f37952c;
        int i = 0;
        int i2 = 0;
        while (bVar.f37953d > 0) {
            byte bM16213a = bVar.m16213a();
            if (bM16213a == 0) {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bM16213a == 1 || bM16213a == 2) {
                if (i == 0) {
                    return 1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bM16213a != 9) {
                switch (bM16213a) {
                    case 14:
                    case 15:
                        if (i2 == i) {
                            return -1;
                        }
                        i--;
                        break;
                    case 16:
                    case 17:
                        if (i2 == i) {
                            return 1;
                        }
                        i--;
                        break;
                    case 18:
                        i++;
                        break;
                    default:
                        if (i2 == 0) {
                            i2 = i;
                        }
                        break;
                }
            } else {
                continue;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static BidiFormatter m16209c() {
        a aVar = new a();
        int i = aVar.f37948b;
        if (i == 2 && aVar.f37949c == f37939a) {
            return aVar.f37947a ? f37943e : f37942d;
        }
        return new BidiFormatter(aVar.f37947a, i, aVar.f37949c);
    }

    /* JADX INFO: renamed from: d */
    public CharSequence m16210d(CharSequence charSequence) {
        return m16211e(charSequence, this.f37946h, true);
    }

    /* JADX INFO: renamed from: e */
    public CharSequence m16211e(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zM16217b = ((TextDirectionHeuristicsCompat.c) textDirectionHeuristicCompat).m16217b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = "";
        if (((this.f37945g & 2) != 0) && z) {
            boolean zM16217b2 = ((TextDirectionHeuristicsCompat.c) (zM16217b ? TextDirectionHeuristicsCompat.f37964b : TextDirectionHeuristicsCompat.f37963a)).m16217b(charSequence, 0, charSequence.length());
            if (this.f37944f || !(zM16217b2 || m16207a(charSequence) == 1)) {
                str = (!this.f37944f || (zM16217b2 && m16207a(charSequence) != -1)) ? "" : f37941c;
            } else {
                str = f37940b;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zM16217b != this.f37944f) {
            spannableStringBuilder.append(zM16217b ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean zM16217b3 = ((TextDirectionHeuristicsCompat.c) (zM16217b ? TextDirectionHeuristicsCompat.f37964b : TextDirectionHeuristicsCompat.f37963a)).m16217b(charSequence, 0, charSequence.length());
            if (!this.f37944f && (zM16217b3 || m16208b(charSequence) == 1)) {
                str2 = f37940b;
            } else if (this.f37944f && (!zM16217b3 || m16208b(charSequence) == -1)) {
                str2 = f37941c;
            }
            spannableStringBuilder.append((CharSequence) str2);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: z0.k.j.a$a */
    /* JADX INFO: compiled from: BidiFormatter.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f37947a;

        /* JADX INFO: renamed from: b */
        public int f37948b;

        /* JADX INFO: renamed from: c */
        public TextDirectionHeuristicCompat f37949c;

        public a() {
            Locale locale = Locale.getDefault();
            TextDirectionHeuristicCompat textDirectionHeuristicCompat = BidiFormatter.f37939a;
            Locale locale2 = TextUtilsCompat.f37970a;
            m16212a(TextUtils.getLayoutDirectionFromLocale(locale) == 1);
        }

        /* JADX INFO: renamed from: a */
        public final void m16212a(boolean z) {
            this.f37947a = z;
            this.f37949c = BidiFormatter.f37939a;
            this.f37948b = 2;
        }

        public a(boolean z) {
            this.f37947a = z;
            this.f37949c = BidiFormatter.f37939a;
            this.f37948b = 2;
        }

        public a(Locale locale) {
            TextDirectionHeuristicCompat textDirectionHeuristicCompat = BidiFormatter.f37939a;
            Locale locale2 = TextUtilsCompat.f37970a;
            m16212a(TextUtils.getLayoutDirectionFromLocale(locale) == 1);
        }
    }
}
