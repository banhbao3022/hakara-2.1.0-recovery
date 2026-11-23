package p007c.p190n.p194b.p209b.p252x1.p253n;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;
import p007c.p190n.p194b.p209b.p252x1.SubtitleInputBuffer;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.x1.n.d, reason: use source file name */
/* JADX INFO: compiled from: Cea708Decoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class Cea708Decoder extends CeaDecoder {

    /* JADX INFO: renamed from: g */
    public final ParsableByteArray f9878g = new ParsableByteArray();

    /* JADX INFO: renamed from: h */
    public final ParsableBitArray f9879h = new ParsableBitArray();

    /* JADX INFO: renamed from: i */
    public int f9880i = -1;

    /* JADX INFO: renamed from: j */
    public final int f9881j;

    /* JADX INFO: renamed from: k */
    public final b[] f9882k;

    /* JADX INFO: renamed from: l */
    public b f9883l;

    /* JADX INFO: renamed from: m */
    public List<Cue> f9884m;

    /* JADX INFO: renamed from: n */
    public List<Cue> f9885n;

    /* JADX INFO: renamed from: o */
    public c f9886o;

    /* JADX INFO: renamed from: p */
    public int f9887p;

    /* JADX INFO: renamed from: c.n.b.b.x1.n.d$a */
    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Cue f9888a;

        /* JADX INFO: renamed from: b */
        public final int f9889b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            Cue.b bVar = new Cue.b();
            bVar.f9803a = charSequence;
            bVar.f9805c = alignment;
            bVar.f9806d = f;
            bVar.f9807e = i;
            bVar.f9808f = i2;
            bVar.f9809g = f2;
            bVar.f9810h = i3;
            bVar.f9813k = f3;
            if (z) {
                bVar.f9816n = i4;
                bVar.f9815m = true;
            }
            this.f9888a = bVar.m4392a();
            this.f9889b = i5;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.n.d$b */
    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final int f9890a = m4424d(2, 2, 2, 0);

        /* JADX INFO: renamed from: b */
        public static final int f9891b;

        /* JADX INFO: renamed from: c */
        public static final int f9892c;

        /* JADX INFO: renamed from: d */
        public static final int[] f9893d;

        /* JADX INFO: renamed from: e */
        public static final int[] f9894e;

        /* JADX INFO: renamed from: f */
        public static final int[] f9895f;

        /* JADX INFO: renamed from: g */
        public static final boolean[] f9896g;

        /* JADX INFO: renamed from: h */
        public static final int[] f9897h;

        /* JADX INFO: renamed from: i */
        public static final int[] f9898i;

        /* JADX INFO: renamed from: j */
        public static final int[] f9899j;

        /* JADX INFO: renamed from: k */
        public static final int[] f9900k;

        /* JADX INFO: renamed from: A */
        public int f9901A;

        /* JADX INFO: renamed from: B */
        public int f9902B;

        /* JADX INFO: renamed from: C */
        public int f9903C;

        /* JADX INFO: renamed from: D */
        public int f9904D;

        /* JADX INFO: renamed from: E */
        public int f9905E;

        /* JADX INFO: renamed from: F */
        public int f9906F;

        /* JADX INFO: renamed from: G */
        public int f9907G;

        /* JADX INFO: renamed from: l */
        public final List<SpannableString> f9908l = new ArrayList();

        /* JADX INFO: renamed from: m */
        public final SpannableStringBuilder f9909m = new SpannableStringBuilder();

        /* JADX INFO: renamed from: n */
        public boolean f9910n;

        /* JADX INFO: renamed from: o */
        public boolean f9911o;

        /* JADX INFO: renamed from: p */
        public int f9912p;

        /* JADX INFO: renamed from: q */
        public boolean f9913q;

        /* JADX INFO: renamed from: r */
        public int f9914r;

        /* JADX INFO: renamed from: s */
        public int f9915s;

        /* JADX INFO: renamed from: t */
        public int f9916t;

        /* JADX INFO: renamed from: u */
        public int f9917u;

        /* JADX INFO: renamed from: v */
        public boolean f9918v;

        /* JADX INFO: renamed from: w */
        public int f9919w;

        /* JADX INFO: renamed from: x */
        public int f9920x;

        /* JADX INFO: renamed from: y */
        public int f9921y;

        /* JADX INFO: renamed from: z */
        public int f9922z;

        static {
            int iM4424d = m4424d(0, 0, 0, 0);
            f9891b = iM4424d;
            int iM4424d2 = m4424d(0, 0, 0, 3);
            f9892c = iM4424d2;
            f9893d = new int[]{0, 0, 0, 0, 0, 2, 0};
            f9894e = new int[]{0, 0, 0, 0, 0, 0, 2};
            f9895f = new int[]{3, 3, 3, 3, 3, 3, 1};
            f9896g = new boolean[]{false, false, false, true, true, true, false};
            f9897h = new int[]{iM4424d, iM4424d2, iM4424d, iM4424d, iM4424d2, iM4424d, iM4424d};
            f9898i = new int[]{0, 1, 2, 3, 4, 3, 4};
            f9899j = new int[]{0, 0, 0, 0, 0, 3, 3};
            f9900k = new int[]{iM4424d, iM4424d, iM4424d, iM4424d, iM4424d, iM4424d2, iM4424d2};
        }

        public b() {
            m4429f();
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0021  */
        /* JADX INFO: renamed from: d */
        public static int m4424d(int i, int i2, int i3, int i4) {
            int i5;
            C2096e.m4569e(i, 0, 4);
            C2096e.m4569e(i2, 0, 4);
            C2096e.m4569e(i3, 0, 4);
            C2096e.m4569e(i4, 0, 4);
            if (i4 == 0 || i4 == 1) {
                i5 = 255;
            } else if (i4 == 2) {
                i5 = 127;
            } else if (i4 != 3) {
                i5 = 255;
            } else {
                i5 = 0;
            }
            return Color.argb(i5, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        }

        /* JADX INFO: renamed from: a */
        public void m4425a(char c2) {
            if (c2 != '\n') {
                this.f9909m.append(c2);
                return;
            }
            this.f9908l.add(m4426b());
            this.f9909m.clear();
            if (this.f9901A != -1) {
                this.f9901A = 0;
            }
            if (this.f9902B != -1) {
                this.f9902B = 0;
            }
            if (this.f9903C != -1) {
                this.f9903C = 0;
            }
            if (this.f9905E != -1) {
                this.f9905E = 0;
            }
            while (true) {
                if ((!this.f9918v || this.f9908l.size() < this.f9917u) && this.f9908l.size() < 15) {
                    return;
                } else {
                    this.f9908l.remove(0);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public SpannableString m4426b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9909m);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f9901A != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f9901A, length, 33);
                }
                if (this.f9902B != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f9902B, length, 33);
                }
                if (this.f9903C != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f9904D), this.f9903C, length, 33);
                }
                if (this.f9905E != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f9906F), this.f9905E, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX INFO: renamed from: c */
        public void m4427c() {
            this.f9908l.clear();
            this.f9909m.clear();
            this.f9901A = -1;
            this.f9902B = -1;
            this.f9903C = -1;
            this.f9905E = -1;
            this.f9907G = 0;
        }

        /* JADX INFO: renamed from: e */
        public boolean m4428e() {
            return !this.f9910n || (this.f9908l.isEmpty() && this.f9909m.length() == 0);
        }

        /* JADX INFO: renamed from: f */
        public void m4429f() {
            m4427c();
            this.f9910n = false;
            this.f9911o = false;
            this.f9912p = 4;
            this.f9913q = false;
            this.f9914r = 0;
            this.f9915s = 0;
            this.f9916t = 0;
            this.f9917u = 15;
            this.f9918v = true;
            this.f9919w = 0;
            this.f9920x = 0;
            this.f9921y = 0;
            int i = f9891b;
            this.f9922z = i;
            this.f9904D = f9890a;
            this.f9906F = i;
        }

        /* JADX INFO: renamed from: g */
        public void m4430g(boolean z, boolean z2) {
            if (this.f9901A != -1) {
                if (!z) {
                    this.f9909m.setSpan(new StyleSpan(2), this.f9901A, this.f9909m.length(), 33);
                    this.f9901A = -1;
                }
            } else if (z) {
                this.f9901A = this.f9909m.length();
            }
            if (this.f9902B == -1) {
                if (z2) {
                    this.f9902B = this.f9909m.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.f9909m.setSpan(new UnderlineSpan(), this.f9902B, this.f9909m.length(), 33);
                this.f9902B = -1;
            }
        }

        /* JADX INFO: renamed from: h */
        public void m4431h(int i, int i2) {
            if (this.f9903C != -1 && this.f9904D != i) {
                this.f9909m.setSpan(new ForegroundColorSpan(this.f9904D), this.f9903C, this.f9909m.length(), 33);
            }
            if (i != f9890a) {
                this.f9903C = this.f9909m.length();
                this.f9904D = i;
            }
            if (this.f9905E != -1 && this.f9906F != i2) {
                this.f9909m.setSpan(new BackgroundColorSpan(this.f9906F), this.f9905E, this.f9909m.length(), 33);
            }
            if (i2 != f9891b) {
                this.f9905E = this.f9909m.length();
                this.f9906F = i2;
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.x1.n.d$c */
    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f9923a;

        /* JADX INFO: renamed from: b */
        public final int f9924b;

        /* JADX INFO: renamed from: c */
        public final byte[] f9925c;

        /* JADX INFO: renamed from: d */
        public int f9926d = 0;

        public c(int i, int i2) {
            this.f9923a = i;
            this.f9924b = i2;
            this.f9925c = new byte[(i2 * 2) - 1];
        }
    }

    public Cea708Decoder(int i, List<byte[]> list) {
        this.f9881j = i == -1 ? 1 : i;
        if (list != null && (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1)) {
        }
        this.f9882k = new b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f9882k[i2] = new b();
        }
        this.f9883l = this.f9882k[0];
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.p253n.CeaDecoder
    /* JADX INFO: renamed from: e */
    public Subtitle mo4407e() {
        List<Cue> list = this.f9884m;
        this.f9885n = list;
        Objects.requireNonNull(list);
        return new CeaSubtitle(list);
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.p253n.CeaDecoder
    /* JADX INFO: renamed from: f */
    public void mo4408f(SubtitleInputBuffer subtitleInputBuffer) {
        ByteBuffer byteBuffer = subtitleInputBuffer.f7287h;
        Objects.requireNonNull(byteBuffer);
        this.f9878g.m3192B(byteBuffer.array(), byteBuffer.limit());
        while (this.f9878g.m3196a() >= 3) {
            int iM3214s = this.f9878g.m3214s() & 7;
            int i = iM3214s & 3;
            boolean z = (iM3214s & 4) == 4;
            byte bM3214s = (byte) this.f9878g.m3214s();
            byte bM3214s2 = (byte) this.f9878g.m3214s();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m4421j();
                        int i2 = (bM3214s & 192) >> 6;
                        int i3 = this.f9880i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m4423l();
                            Log.w("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f9880i + " current=" + i2);
                        }
                        this.f9880i = i2;
                        int i4 = bM3214s & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        c cVar = new c(i2, i4);
                        this.f9886o = cVar;
                        byte[] bArr = cVar.f9925c;
                        int i5 = cVar.f9926d;
                        cVar.f9926d = i5 + 1;
                        bArr[i5] = bM3214s2;
                    } else {
                        C2096e.m4566b(i == 2);
                        c cVar2 = this.f9886o;
                        if (cVar2 == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f9925c;
                            int i6 = cVar2.f9926d;
                            int i7 = i6 + 1;
                            cVar2.f9926d = i7;
                            bArr2[i6] = bM3214s;
                            cVar2.f9926d = i7 + 1;
                            bArr2[i7] = bM3214s2;
                        }
                    }
                    c cVar3 = this.f9886o;
                    if (cVar3.f9926d == (cVar3.f9924b * 2) - 1) {
                        m4421j();
                    }
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.p253n.CeaDecoder, p007c.p190n.p194b.p209b.p217p1.Decoder
    public void flush() {
        super.flush();
        this.f9884m = null;
        this.f9885n = null;
        this.f9887p = 0;
        this.f9883l = this.f9882k[0];
        m4423l();
        this.f9886o = null;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.p253n.CeaDecoder
    /* JADX INFO: renamed from: h */
    public boolean mo4410h() {
        return this.f9884m != this.f9885n;
    }

    /* JADX INFO: renamed from: j */
    public final void m4421j() {
        c cVar = this.f9886o;
        if (cVar == null) {
            return;
        }
        if (cVar.f9926d != (cVar.f9924b * 2) - 1) {
            StringBuilder sbM1556G = outline.m1556G("DtvCcPacket ended prematurely; size is ");
            sbM1556G.append((this.f9886o.f9924b * 2) - 1);
            sbM1556G.append(", but current index is ");
            sbM1556G.append(this.f9886o.f9926d);
            sbM1556G.append(" (sequence number ");
            sbM1556G.append(this.f9886o.f9923a);
            sbM1556G.append(");");
            Log.d("Cea708Decoder", sbM1556G.toString());
        }
        ParsableBitArray parsableBitArray = this.f9879h;
        c cVar2 = this.f9886o;
        parsableBitArray.m3186j(cVar2.f9925c, cVar2.f9926d);
        int i = 3;
        int iM3183g = this.f9879h.m3183g(3);
        int iM3183g2 = this.f9879h.m3183g(5);
        int i2 = 7;
        int i3 = 6;
        if (iM3183g == 7) {
            this.f9879h.m3189m(2);
            iM3183g = this.f9879h.m3183g(6);
            if (iM3183g < 7) {
                outline.m1565P("Invalid extended service number: ", iM3183g, "Cea708Decoder");
            }
        }
        if (iM3183g2 == 0) {
            if (iM3183g != 0) {
                Log.w("Cea708Decoder", "serviceNumber is non-zero (" + iM3183g + ") when blockSize is 0");
            }
        } else if (iM3183g == this.f9881j) {
            boolean z = false;
            while (this.f9879h.m3178b() > 0) {
                int iM3183g3 = this.f9879h.m3183g(8);
                if (iM3183g3 == 16) {
                    int iM3183g4 = this.f9879h.m3183g(8);
                    if (iM3183g4 > 31) {
                        if (iM3183g4 <= 127) {
                            if (iM3183g4 == 32) {
                                this.f9883l.m4425a(' ');
                            } else if (iM3183g4 == 33) {
                                this.f9883l.m4425a((char) 160);
                            } else if (iM3183g4 == 37) {
                                this.f9883l.m4425a((char) 8230);
                            } else if (iM3183g4 == 42) {
                                this.f9883l.m4425a((char) 352);
                            } else if (iM3183g4 == 44) {
                                this.f9883l.m4425a((char) 338);
                            } else if (iM3183g4 == 63) {
                                this.f9883l.m4425a((char) 376);
                            } else if (iM3183g4 == 57) {
                                this.f9883l.m4425a((char) 8482);
                            } else if (iM3183g4 == 58) {
                                this.f9883l.m4425a((char) 353);
                            } else if (iM3183g4 == 60) {
                                this.f9883l.m4425a((char) 339);
                            } else if (iM3183g4 != 61) {
                                switch (iM3183g4) {
                                    case 48:
                                        this.f9883l.m4425a((char) 9608);
                                        break;
                                    case 49:
                                        this.f9883l.m4425a((char) 8216);
                                        break;
                                    case 50:
                                        this.f9883l.m4425a((char) 8217);
                                        break;
                                    case 51:
                                        this.f9883l.m4425a((char) 8220);
                                        break;
                                    case 52:
                                        this.f9883l.m4425a((char) 8221);
                                        break;
                                    case 53:
                                        this.f9883l.m4425a((char) 8226);
                                        break;
                                    default:
                                        switch (iM3183g4) {
                                            case 118:
                                                this.f9883l.m4425a((char) 8539);
                                                break;
                                            case 119:
                                                this.f9883l.m4425a((char) 8540);
                                                break;
                                            case 120:
                                                this.f9883l.m4425a((char) 8541);
                                                break;
                                            case 121:
                                                this.f9883l.m4425a((char) 8542);
                                                break;
                                            case 122:
                                                this.f9883l.m4425a((char) 9474);
                                                break;
                                            case 123:
                                                this.f9883l.m4425a((char) 9488);
                                                break;
                                            case 124:
                                                this.f9883l.m4425a((char) 9492);
                                                break;
                                            case 125:
                                                this.f9883l.m4425a((char) 9472);
                                                break;
                                            case 126:
                                                this.f9883l.m4425a((char) 9496);
                                                break;
                                            case 127:
                                                this.f9883l.m4425a((char) 9484);
                                                break;
                                            default:
                                                outline.m1565P("Invalid G2 character: ", iM3183g4, "Cea708Decoder");
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                this.f9883l.m4425a((char) 8480);
                            }
                        } else if (iM3183g4 <= 159) {
                            if (iM3183g4 <= 135) {
                                this.f9879h.m3189m(32);
                            } else if (iM3183g4 <= 143) {
                                this.f9879h.m3189m(40);
                            } else if (iM3183g4 <= 159) {
                                this.f9879h.m3189m(2);
                                this.f9879h.m3189m(this.f9879h.m3183g(6) * 8);
                            }
                        } else if (iM3183g4 > 255) {
                            outline.m1565P("Invalid extended command: ", iM3183g4, "Cea708Decoder");
                        } else if (iM3183g4 == 160) {
                            this.f9883l.m4425a((char) 13252);
                        } else {
                            outline.m1565P("Invalid G3 character: ", iM3183g4, "Cea708Decoder");
                            this.f9883l.m4425a('_');
                        }
                        z = true;
                    } else if (iM3183g4 > 7) {
                        if (iM3183g4 <= 15) {
                            this.f9879h.m3189m(8);
                        } else if (iM3183g4 <= 23) {
                            this.f9879h.m3189m(16);
                        } else if (iM3183g4 <= 31) {
                            this.f9879h.m3189m(24);
                        }
                    }
                } else if (iM3183g3 > 31) {
                    if (iM3183g3 <= 127) {
                        if (iM3183g3 == 127) {
                            this.f9883l.m4425a((char) 9835);
                        } else {
                            this.f9883l.m4425a((char) (iM3183g3 & 255));
                        }
                    } else if (iM3183g3 <= 159) {
                        switch (iM3183g3) {
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                                int i4 = iM3183g3 - 128;
                                if (this.f9887p != i4) {
                                    this.f9887p = i4;
                                    this.f9883l = this.f9882k[i4];
                                }
                                break;
                            case 136:
                                for (int i5 = 1; i5 <= 8; i5++) {
                                    if (this.f9879h.m3182f()) {
                                        this.f9882k[8 - i5].m4427c();
                                    }
                                }
                                break;
                            case 137:
                                for (int i6 = 1; i6 <= 8; i6++) {
                                    if (this.f9879h.m3182f()) {
                                        this.f9882k[8 - i6].f9911o = true;
                                    }
                                }
                                break;
                            case 138:
                                for (int i7 = 1; i7 <= 8; i7++) {
                                    if (this.f9879h.m3182f()) {
                                        this.f9882k[8 - i7].f9911o = false;
                                    }
                                }
                                break;
                            case 139:
                                for (int i8 = 1; i8 <= 8; i8++) {
                                    if (this.f9879h.m3182f()) {
                                        b bVar = this.f9882k[8 - i8];
                                        bVar.f9911o = !bVar.f9911o;
                                    }
                                }
                                break;
                            case 140:
                                for (int i9 = 1; i9 <= 8; i9++) {
                                    if (this.f9879h.m3182f()) {
                                        this.f9882k[8 - i9].m4429f();
                                    }
                                }
                                break;
                            case 141:
                                this.f9879h.m3189m(8);
                                break;
                            case 142:
                                break;
                            case 143:
                                m4423l();
                                break;
                            case 144:
                                if (this.f9883l.f9910n) {
                                    this.f9879h.m3183g(4);
                                    this.f9879h.m3183g(2);
                                    this.f9879h.m3183g(2);
                                    boolean zM3182f = this.f9879h.m3182f();
                                    boolean zM3182f2 = this.f9879h.m3182f();
                                    this.f9879h.m3183g(3);
                                    this.f9879h.m3183g(3);
                                    this.f9883l.m4430g(zM3182f, zM3182f2);
                                } else {
                                    this.f9879h.m3189m(16);
                                }
                                break;
                            case 145:
                                if (this.f9883l.f9910n) {
                                    int iM4424d = b.m4424d(this.f9879h.m3183g(2), this.f9879h.m3183g(2), this.f9879h.m3183g(2), this.f9879h.m3183g(2));
                                    int iM4424d2 = b.m4424d(this.f9879h.m3183g(2), this.f9879h.m3183g(2), this.f9879h.m3183g(2), this.f9879h.m3183g(2));
                                    this.f9879h.m3189m(2);
                                    b.m4424d(this.f9879h.m3183g(2), this.f9879h.m3183g(2), this.f9879h.m3183g(2), 0);
                                    this.f9883l.m4431h(iM4424d, iM4424d2);
                                } else {
                                    this.f9879h.m3189m(24);
                                }
                                break;
                            case 146:
                                if (this.f9883l.f9910n) {
                                    this.f9879h.m3189m(4);
                                    int iM3183g5 = this.f9879h.m3183g(4);
                                    this.f9879h.m3189m(2);
                                    this.f9879h.m3183g(6);
                                    b bVar2 = this.f9883l;
                                    if (bVar2.f9907G != iM3183g5) {
                                        bVar2.m4425a('\n');
                                    }
                                    bVar2.f9907G = iM3183g5;
                                } else {
                                    this.f9879h.m3189m(16);
                                }
                                break;
                            case 147:
                            case 148:
                            case 149:
                            case 150:
                            default:
                                Log.w("Cea708Decoder", outline.m1590l("Invalid C1 command: ", iM3183g3));
                                break;
                            case 151:
                                if (this.f9883l.f9910n) {
                                    int iM4424d3 = b.m4424d(this.f9879h.m3183g(2), this.f9879h.m3183g(2), this.f9879h.m3183g(2), this.f9879h.m3183g(2));
                                    this.f9879h.m3183g(2);
                                    b.m4424d(this.f9879h.m3183g(2), this.f9879h.m3183g(2), this.f9879h.m3183g(2), 0);
                                    this.f9879h.m3182f();
                                    this.f9879h.m3182f();
                                    this.f9879h.m3183g(2);
                                    this.f9879h.m3183g(2);
                                    int iM3183g6 = this.f9879h.m3183g(2);
                                    this.f9879h.m3189m(8);
                                    b bVar3 = this.f9883l;
                                    bVar3.f9922z = iM4424d3;
                                    bVar3.f9919w = iM3183g6;
                                } else {
                                    this.f9879h.m3189m(32);
                                }
                                break;
                            case 152:
                            case 153:
                            case 154:
                            case 155:
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                                int i10 = iM3183g3 - 152;
                                b bVar4 = this.f9882k[i10];
                                this.f9879h.m3189m(2);
                                boolean zM3182f3 = this.f9879h.m3182f();
                                boolean zM3182f4 = this.f9879h.m3182f();
                                this.f9879h.m3182f();
                                int iM3183g7 = this.f9879h.m3183g(i);
                                boolean zM3182f5 = this.f9879h.m3182f();
                                int iM3183g8 = this.f9879h.m3183g(i2);
                                int iM3183g9 = this.f9879h.m3183g(8);
                                int iM3183g10 = this.f9879h.m3183g(4);
                                int iM3183g11 = this.f9879h.m3183g(4);
                                this.f9879h.m3189m(2);
                                this.f9879h.m3183g(i3);
                                this.f9879h.m3189m(2);
                                int iM3183g12 = this.f9879h.m3183g(i);
                                int iM3183g13 = this.f9879h.m3183g(i);
                                bVar4.f9910n = true;
                                bVar4.f9911o = zM3182f3;
                                bVar4.f9918v = zM3182f4;
                                bVar4.f9912p = iM3183g7;
                                bVar4.f9913q = zM3182f5;
                                bVar4.f9914r = iM3183g8;
                                bVar4.f9915s = iM3183g9;
                                bVar4.f9916t = iM3183g10;
                                int i11 = iM3183g11 + 1;
                                if (bVar4.f9917u != i11) {
                                    bVar4.f9917u = i11;
                                    while (true) {
                                        if ((zM3182f4 && bVar4.f9908l.size() >= bVar4.f9917u) || bVar4.f9908l.size() >= 15) {
                                            bVar4.f9908l.remove(0);
                                        }
                                    }
                                }
                                if (iM3183g12 != 0 && bVar4.f9920x != iM3183g12) {
                                    bVar4.f9920x = iM3183g12;
                                    int i12 = iM3183g12 - 1;
                                    int i13 = b.f9897h[i12];
                                    boolean z2 = b.f9896g[i12];
                                    int i14 = b.f9894e[i12];
                                    int i15 = b.f9895f[i12];
                                    int i16 = b.f9893d[i12];
                                    bVar4.f9922z = i13;
                                    bVar4.f9919w = i16;
                                }
                                if (iM3183g13 != 0 && bVar4.f9921y != iM3183g13) {
                                    bVar4.f9921y = iM3183g13;
                                    int i17 = iM3183g13 - 1;
                                    int i18 = b.f9899j[i17];
                                    int i19 = b.f9898i[i17];
                                    bVar4.m4430g(false, false);
                                    bVar4.m4431h(b.f9890a, b.f9900k[i17]);
                                }
                                if (this.f9887p != i10) {
                                    this.f9887p = i10;
                                    this.f9883l = this.f9882k[i10];
                                }
                                break;
                        }
                    } else if (iM3183g3 <= 255) {
                        this.f9883l.m4425a((char) (iM3183g3 & 255));
                    } else {
                        outline.m1565P("Invalid base command: ", iM3183g3, "Cea708Decoder");
                    }
                    z = true;
                } else if (iM3183g3 != 0) {
                    if (iM3183g3 == i) {
                        this.f9884m = m4422k();
                    } else if (iM3183g3 != 8) {
                        switch (iM3183g3) {
                            case 12:
                                m4423l();
                                break;
                            case 13:
                                this.f9883l.m4425a('\n');
                                break;
                            case 14:
                                break;
                            default:
                                if (iM3183g3 >= 17 && iM3183g3 <= 23) {
                                    outline.m1565P("Currently unsupported COMMAND_EXT1 Command: ", iM3183g3, "Cea708Decoder");
                                    this.f9879h.m3189m(8);
                                } else if (iM3183g3 < 24 || iM3183g3 > 31) {
                                    outline.m1565P("Invalid C0 command: ", iM3183g3, "Cea708Decoder");
                                } else {
                                    outline.m1565P("Currently unsupported COMMAND_P16 Command: ", iM3183g3, "Cea708Decoder");
                                    this.f9879h.m3189m(16);
                                }
                                break;
                        }
                    } else {
                        b bVar5 = this.f9883l;
                        int length = bVar5.f9909m.length();
                        if (length > 0) {
                            bVar5.f9909m.delete(length - 1, length);
                        }
                    }
                }
                i = 3;
                i2 = 7;
                i3 = 6;
            }
            if (z) {
                this.f9884m = m4422k();
            }
        }
        this.f9886o = null;
    }

    /* JADX INFO: renamed from: k */
    public final List<Cue> m4422k() {
        Layout.Alignment alignment;
        float f;
        float f2;
        a aVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f9882k[i].m4428e()) {
                b[] bVarArr = this.f9882k;
                if (bVarArr[i].f9911o) {
                    b bVar = bVarArr[i];
                    if (bVar.m4428e()) {
                        aVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < bVar.f9908l.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) bVar.f9908l.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) bVar.m4426b());
                        int i3 = bVar.f9919w;
                        if (i3 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i3 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i3 != 2) {
                            if (i3 != 3) {
                                StringBuilder sbM1556G = outline.m1556G("Unexpected justification value: ");
                                sbM1556G.append(bVar.f9919w);
                                throw new IllegalArgumentException(sbM1556G.toString());
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        if (bVar.f9913q) {
                            f = bVar.f9915s / 99.0f;
                            f2 = bVar.f9914r / 99.0f;
                        } else {
                            f = bVar.f9915s / 209.0f;
                            f2 = bVar.f9914r / 74.0f;
                        }
                        float f3 = (f * 0.9f) + 0.05f;
                        float f4 = (f2 * 0.9f) + 0.05f;
                        int i4 = bVar.f9916t;
                        int i5 = i4 / 3;
                        int i6 = i4 % 3;
                        aVar = new a(spannableStringBuilder, alignment2, f4, 0, i5 == 0 ? 0 : i5 == 1 ? 1 : 2, f3, i6 == 0 ? 0 : i6 == 1 ? 1 : 2, -3.4028235E38f, bVar.f9922z != b.f9891b, bVar.f9922z, bVar.f9912p);
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: c.n.b.b.x1.n.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((Cea708Decoder.a) obj2).f9889b, ((Cea708Decoder.a) obj).f9889b);
            }
        });
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            arrayList2.add(((a) arrayList.get(i7)).f9888a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* JADX INFO: renamed from: l */
    public final void m4423l() {
        for (int i = 0; i < 8; i++) {
            this.f9882k[i].m4429f();
        }
    }
}
