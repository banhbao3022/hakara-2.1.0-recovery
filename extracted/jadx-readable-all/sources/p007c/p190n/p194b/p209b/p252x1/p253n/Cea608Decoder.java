package p007c.p190n.p194b.p209b.p252x1.p253n;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;
import p007c.p190n.p194b.p209b.p252x1.SubtitleDecoderException;
import p007c.p190n.p194b.p209b.p252x1.SubtitleInputBuffer;
import p007c.p190n.p194b.p209b.p252x1.SubtitleOutputBuffer;

/* JADX INFO: renamed from: c.n.b.b.x1.n.c, reason: use source file name */
/* JADX INFO: compiled from: Cea608Decoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class Cea608Decoder extends CeaDecoder {

    /* JADX INFO: renamed from: g */
    public static final int[] f9841g = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: h */
    public static final int[] f9842h = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: i */
    public static final int[] f9843i = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: j */
    public static final int[] f9844j = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: k */
    public static final int[] f9845k = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: l */
    public static final int[] f9846l = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: m */
    public static final int[] f9847m = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: n */
    public static final boolean[] f9848n = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: A */
    public boolean f9849A;

    /* JADX INFO: renamed from: B */
    public byte f9850B;

    /* JADX INFO: renamed from: C */
    public byte f9851C;

    /* JADX INFO: renamed from: E */
    public boolean f9853E;

    /* JADX INFO: renamed from: F */
    public long f9854F;

    /* JADX INFO: renamed from: p */
    public final int f9856p;

    /* JADX INFO: renamed from: q */
    public final int f9857q;

    /* JADX INFO: renamed from: r */
    public final int f9858r;

    /* JADX INFO: renamed from: s */
    public final long f9859s;

    /* JADX INFO: renamed from: v */
    public List<Cue> f9862v;

    /* JADX INFO: renamed from: w */
    public List<Cue> f9863w;

    /* JADX INFO: renamed from: x */
    public int f9864x;

    /* JADX INFO: renamed from: y */
    public int f9865y;

    /* JADX INFO: renamed from: z */
    public boolean f9866z;

    /* JADX INFO: renamed from: o */
    public final ParsableByteArray f9855o = new ParsableByteArray();

    /* JADX INFO: renamed from: t */
    public final ArrayList<a> f9860t = new ArrayList<>();

    /* JADX INFO: renamed from: u */
    public a f9861u = new a(0, 4);

    /* JADX INFO: renamed from: D */
    public int f9852D = 0;

    /* JADX INFO: renamed from: c.n.b.b.x1.n.c$a */
    /* JADX INFO: compiled from: Cea608Decoder.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<C8512a> f9867a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List<SpannableString> f9868b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final StringBuilder f9869c = new StringBuilder();

        /* JADX INFO: renamed from: d */
        public int f9870d;

        /* JADX INFO: renamed from: e */
        public int f9871e;

        /* JADX INFO: renamed from: f */
        public int f9872f;

        /* JADX INFO: renamed from: g */
        public int f9873g;

        /* JADX INFO: renamed from: h */
        public int f9874h;

        /* JADX INFO: renamed from: c.n.b.b.x1.n.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Cea608Decoder.java */
        public static class C8512a {

            /* JADX INFO: renamed from: a */
            public final int f9875a;

            /* JADX INFO: renamed from: b */
            public final boolean f9876b;

            /* JADX INFO: renamed from: c */
            public int f9877c;

            public C8512a(int i, boolean z, int i2) {
                this.f9875a = i;
                this.f9876b = z;
                this.f9877c = i2;
            }
        }

        public a(int i, int i2) {
            m4420f(i);
            this.f9874h = i2;
        }

        /* JADX INFO: renamed from: a */
        public void m4415a(char c2) {
            if (this.f9869c.length() < 32) {
                this.f9869c.append(c2);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m4416b() {
            int length = this.f9869c.length();
            if (length > 0) {
                this.f9869c.delete(length - 1, length);
                for (int size = this.f9867a.size() - 1; size >= 0; size--) {
                    C8512a c8512a = this.f9867a.get(size);
                    int i = c8512a.f9877c;
                    if (i != length) {
                        return;
                    }
                    c8512a.f9877c = i - 1;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public Cue m4417c(int i) {
            float f;
            int i2 = this.f9871e + this.f9872f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f9868b.size(); i4++) {
                SpannableString spannableStringSubSequence = this.f9868b.get(i4);
                int i5 = Util6.f6307a;
                if (spannableStringSubSequence.length() > i3) {
                    spannableStringSubSequence = spannableStringSubSequence.subSequence(0, i3);
                }
                spannableStringBuilder.append(spannableStringSubSequence);
                spannableStringBuilder.append('\n');
            }
            SpannableString spannableStringM4418d = m4418d();
            int i6 = Util6.f6307a;
            int length = spannableStringM4418d.length();
            SpannableString spannableStringSubSequence2 = spannableStringM4418d;
            if (length > i3) {
                spannableStringSubSequence2 = spannableStringM4418d.subSequence(0, i3);
            }
            spannableStringBuilder.append((CharSequence) spannableStringSubSequence2);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i3 - spannableStringBuilder.length();
            int i7 = i2 - length2;
            if (i == Integer.MIN_VALUE) {
                i = (this.f9873g != 2 || (Math.abs(i7) >= 3 && length2 >= 0)) ? (this.f9873g != 2 || i7 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length2;
                }
                f = ((i2 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i8 = this.f9870d;
            if (i8 > 7) {
                i8 = (i8 - 15) - 2;
            } else if (this.f9873g == 1) {
                i8 -= this.f9874h - 1;
            }
            Cue.b bVar = new Cue.b();
            bVar.f9803a = spannableStringBuilder;
            bVar.f9805c = Layout.Alignment.ALIGN_NORMAL;
            bVar.f9806d = i8;
            bVar.f9807e = 1;
            bVar.f9809g = f;
            bVar.f9810h = i;
            return bVar.m4392a();
        }

        /* JADX INFO: renamed from: d */
        public final SpannableString m4418d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9869c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            boolean z = false;
            int i6 = -1;
            while (i < this.f9867a.size()) {
                C8512a c8512a = this.f9867a.get(i);
                boolean z2 = c8512a.f9876b;
                int i7 = c8512a.f9875a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = Cea608Decoder.f9843i[i7];
                    }
                    z = z3;
                }
                int i8 = c8512a.f9877c;
                i++;
                if (i8 != (i < this.f9867a.size() ? this.f9867a.get(i).f9877c : length)) {
                    if (i2 != -1 && !z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i8, 33);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i3, i8, 33);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        if (i5 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, i8, 33);
                        }
                        i4 = i8;
                        i5 = i6;
                    }
                }
            }
            if (i2 != -1 && i2 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
            }
            if (i3 != -1 && i3 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, length, 33);
            }
            if (i4 != length && i5 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX INFO: renamed from: e */
        public boolean m4419e() {
            return this.f9867a.isEmpty() && this.f9868b.isEmpty() && this.f9869c.length() == 0;
        }

        /* JADX INFO: renamed from: f */
        public void m4420f(int i) {
            this.f9873g = i;
            this.f9867a.clear();
            this.f9868b.clear();
            this.f9869c.setLength(0);
            this.f9870d = 15;
            this.f9871e = 0;
            this.f9872f = 0;
        }
    }

    public Cea608Decoder(String str, int i, long j2) {
        this.f9859s = j2 > 0 ? j2 * 1000 : -9223372036854775807L;
        this.f9856p = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f9858r = 0;
            this.f9857q = 0;
        } else if (i == 2) {
            this.f9858r = 1;
            this.f9857q = 0;
        } else if (i == 3) {
            this.f9858r = 0;
            this.f9857q = 1;
        } else if (i != 4) {
            Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f9858r = 0;
            this.f9857q = 0;
        } else {
            this.f9858r = 1;
            this.f9857q = 1;
        }
        m4413l(0);
        m4412k();
        this.f9853E = true;
        this.f9854F = -9223372036854775807L;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.p253n.CeaDecoder
    /* JADX INFO: renamed from: e */
    public Subtitle mo4407e() {
        List<Cue> list = this.f9862v;
        this.f9863w = list;
        Objects.requireNonNull(list);
        return new CeaSubtitle(list);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3 A[FALL_THROUGH] */
    @Override // p007c.p190n.p194b.p209b.p252x1.p253n.CeaDecoder
    /* JADX INFO: renamed from: f */
    public void mo4408f(SubtitleInputBuffer subtitleInputBuffer) {
        boolean z;
        boolean z2;
        ByteBuffer byteBuffer = subtitleInputBuffer.f7287h;
        Objects.requireNonNull(byteBuffer);
        this.f9855o.m3192B(byteBuffer.array(), byteBuffer.limit());
        boolean z3 = false;
        while (true) {
            int iM3196a = this.f9855o.m3196a();
            int i = this.f9856p;
            if (iM3196a < i) {
                if (z3) {
                    int i2 = this.f9864x;
                    if (i2 == 1 || i2 == 3) {
                        this.f9862v = m4411j();
                        this.f9854F = this.f9931e;
                        return;
                    }
                    return;
                }
                return;
            }
            byte bM3214s = i == 2 ? (byte) -4 : (byte) this.f9855o.m3214s();
            int iM3214s = this.f9855o.m3214s();
            int iM3214s2 = this.f9855o.m3214s();
            if ((bM3214s & 2) == 0 && (bM3214s & 1) == this.f9857q) {
                byte b = (byte) (iM3214s & 127);
                byte b2 = (byte) (iM3214s2 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.f9866z;
                    if ((bM3214s & 4) == 4) {
                        boolean[] zArr = f9848n;
                        if (zArr[iM3214s] && zArr[iM3214s2]) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    this.f9866z = z;
                    if (z) {
                        if (!((b & 240) == 16)) {
                            this.f9849A = false;
                        } else if (this.f9849A && this.f9850B == b && this.f9851C == b2) {
                            this.f9849A = false;
                            z2 = true;
                        } else {
                            this.f9849A = true;
                            this.f9850B = b;
                            this.f9851C = b2;
                        }
                        z2 = false;
                    } else {
                        this.f9849A = false;
                        z2 = false;
                    }
                    if (!z2) {
                        if (z) {
                            if (1 <= b && b <= 15) {
                                this.f9853E = false;
                            } else if ((b & 247) == 20) {
                                if (b2 != 32 && b2 != 47) {
                                    switch (b2) {
                                        default:
                                            switch (b2) {
                                                case 42:
                                                case 43:
                                                    this.f9853E = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f9853E = true;
                                            break;
                                    }
                                } else {
                                    this.f9853E = true;
                                }
                            }
                            if (this.f9853E) {
                                int i3 = b & 224;
                                if (i3 == 0) {
                                    this.f9852D = (b >> 3) & 1;
                                }
                                if (this.f9852D == this.f9858r) {
                                    if (i3 == 0) {
                                        int i4 = b & 247;
                                        if (i4 == 17 && (b2 & 240) == 48) {
                                            this.f9861u.m4415a((char) f9845k[b2 & 15]);
                                        } else {
                                            int i5 = b & 246;
                                            if (i5 == 18 && (b2 & 224) == 32) {
                                                this.f9861u.m4416b();
                                                this.f9861u.m4415a((char) ((b & 1) == 0 ? f9846l[b2 & 31] : f9847m[b2 & 31]));
                                            } else if (i4 == 17 && (b2 & 240) == 32) {
                                                this.f9861u.m4415a(' ');
                                                boolean z5 = (b2 & 1) == 1;
                                                a aVar = this.f9861u;
                                                aVar.f9867a.add(new a.C8512a((b2 >> 1) & 7, z5, aVar.f9869c.length()));
                                            } else if ((b & 240) == 16 && (b2 & 192) == 64) {
                                                int i6 = f9841g[b & 7];
                                                if ((b2 & 32) != 0) {
                                                    i6++;
                                                }
                                                a aVar2 = this.f9861u;
                                                if (i6 != aVar2.f9870d) {
                                                    if (this.f9864x != 1 && !aVar2.m4419e()) {
                                                        a aVar3 = new a(this.f9864x, this.f9865y);
                                                        this.f9861u = aVar3;
                                                        this.f9860t.add(aVar3);
                                                    }
                                                    this.f9861u.f9870d = i6;
                                                }
                                                boolean z6 = (b2 & 16) == 16;
                                                boolean z7 = (b2 & 1) == 1;
                                                int i7 = (b2 >> 1) & 7;
                                                a aVar4 = this.f9861u;
                                                aVar4.f9867a.add(new a.C8512a(z6 ? 8 : i7, z7, aVar4.f9869c.length()));
                                                if (z6) {
                                                    this.f9861u.f9871e = f9842h[i7];
                                                }
                                            } else if (i4 == 23 && b2 >= 33 && b2 <= 35) {
                                                this.f9861u.f9872f = b2 - 32;
                                            } else if (i5 == 20 && (b2 & 240) == 32) {
                                                if (b2 == 32) {
                                                    m4413l(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            m4413l(1);
                                                            m4414m(2);
                                                            break;
                                                        case 38:
                                                            m4413l(1);
                                                            m4414m(3);
                                                            break;
                                                        case 39:
                                                            m4413l(1);
                                                            m4414m(4);
                                                            break;
                                                        default:
                                                            int i8 = this.f9864x;
                                                            if (i8 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.f9862v = Collections.emptyList();
                                                                            int i9 = this.f9864x;
                                                                            if (i9 == 1 || i9 == 3) {
                                                                                m4412k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i8 == 1 && !this.f9861u.m4419e()) {
                                                                                a aVar5 = this.f9861u;
                                                                                aVar5.f9868b.add(aVar5.m4418d());
                                                                                aVar5.f9869c.setLength(0);
                                                                                aVar5.f9867a.clear();
                                                                                int iMin = Math.min(aVar5.f9874h, aVar5.f9870d);
                                                                                while (aVar5.f9868b.size() >= iMin) {
                                                                                    aVar5.f9868b.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            m4412k();
                                                                            break;
                                                                        case 47:
                                                                            this.f9862v = m4411j();
                                                                            m4412k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f9861u.m4416b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    m4413l(3);
                                                }
                                            }
                                        }
                                    } else {
                                        a aVar6 = this.f9861u;
                                        int[] iArr = f9844j;
                                        aVar6.m4415a((char) iArr[(b & 127) - 32]);
                                        if ((b2 & 224) != 0) {
                                            this.f9861u.m4415a((char) iArr[(b2 & 127) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            m4412k();
                            z3 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.p253n.CeaDecoder, p007c.p190n.p194b.p209b.p217p1.Decoder
    public void flush() {
        super.flush();
        this.f9862v = null;
        this.f9863w = null;
        m4413l(0);
        m4414m(4);
        m4412k();
        this.f9866z = false;
        this.f9849A = false;
        this.f9850B = (byte) 0;
        this.f9851C = (byte) 0;
        this.f9852D = 0;
        this.f9853E = true;
        this.f9854F = -9223372036854775807L;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.p253n.CeaDecoder, p007c.p190n.p194b.p209b.p217p1.Decoder
    /* JADX INFO: renamed from: g */
    public SubtitleOutputBuffer mo3630b() throws SubtitleDecoderException {
        SubtitleOutputBuffer subtitleOutputBufferPollFirst;
        SubtitleOutputBuffer subtitleOutputBufferMo3630b = super.mo3630b();
        if (subtitleOutputBufferMo3630b != null) {
            return subtitleOutputBufferMo3630b;
        }
        long j2 = this.f9859s;
        boolean z = false;
        if (j2 != -9223372036854775807L) {
            long j3 = this.f9854F;
            if (j3 != -9223372036854775807L && this.f9931e - j3 >= j2) {
                z = true;
            }
        }
        if (!z || (subtitleOutputBufferPollFirst = this.f9928b.pollFirst()) == null) {
            return null;
        }
        List<Cue> listEmptyList = Collections.emptyList();
        this.f9862v = listEmptyList;
        this.f9854F = -9223372036854775807L;
        this.f9863w = listEmptyList;
        Objects.requireNonNull(listEmptyList);
        subtitleOutputBufferPollFirst.m4400z(this.f9931e, new CeaSubtitle(listEmptyList), Long.MAX_VALUE);
        return subtitleOutputBufferPollFirst;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.p253n.CeaDecoder
    /* JADX INFO: renamed from: h */
    public boolean mo4410h() {
        return this.f9862v != this.f9863w;
    }

    /* JADX INFO: renamed from: j */
    public final List<Cue> m4411j() {
        int size = this.f9860t.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            Cue cueM4417c = this.f9860t.get(i).m4417c(Integer.MIN_VALUE);
            arrayList.add(cueM4417c);
            if (cueM4417c != null) {
                iMin = Math.min(iMin, cueM4417c.f9794i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            Cue cueM4417c2 = (Cue) arrayList.get(i2);
            if (cueM4417c2 != null) {
                if (cueM4417c2.f9794i != iMin) {
                    cueM4417c2 = this.f9860t.get(i2).m4417c(iMin);
                    Objects.requireNonNull(cueM4417c2);
                }
                arrayList2.add(cueM4417c2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: k */
    public final void m4412k() {
        this.f9861u.m4420f(this.f9864x);
        this.f9860t.clear();
        this.f9860t.add(this.f9861u);
    }

    /* JADX INFO: renamed from: l */
    public final void m4413l(int i) {
        int i2 = this.f9864x;
        if (i2 == i) {
            return;
        }
        this.f9864x = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.f9860t.size(); i3++) {
                this.f9860t.get(i3).f9873g = i;
            }
            return;
        }
        m4412k();
        if (i2 == 3 || i == 1 || i == 0) {
            this.f9862v = Collections.emptyList();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4414m(int i) {
        this.f9865y = i;
        this.f9861u.f9874h = i;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.p253n.CeaDecoder, p007c.p190n.p194b.p209b.p217p1.Decoder
    public void release() {
    }
}
