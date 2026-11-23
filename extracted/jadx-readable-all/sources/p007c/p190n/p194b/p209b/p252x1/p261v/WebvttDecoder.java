package p007c.p190n.p194b.p209b.p252x1.p261v;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ColorParser2;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;
import p007c.p190n.p194b.p209b.p252x1.SubtitleDecoderException;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.x1.v.i, reason: use source file name */
/* JADX INFO: compiled from: WebvttDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class WebvttDecoder extends SimpleSubtitleDecoder {

    /* JADX INFO: renamed from: n */
    public final ParsableByteArray f10172n;

    /* JADX INFO: renamed from: o */
    public final CssParser f10173o;

    public WebvttDecoder() {
        super("WebvttDecoder");
        this.f10172n = new ParsableByteArray();
        this.f10173o = new CssParser();
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0245  */
    /* JADX WARN: Code duplicated, block: B:129:0x0250  */
    /* JADX WARN: Code duplicated, block: B:131:0x0259  */
    /* JADX WARN: Code duplicated, block: B:132:0x0263  */
    /* JADX WARN: Code duplicated, block: B:134:0x026b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0273  */
    /* JADX WARN: Code duplicated, block: B:137:0x0277  */
    /* JADX WARN: Code duplicated, block: B:139:0x027f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0284  */
    /* JADX WARN: Code duplicated, block: B:142:0x028d  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:160:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:163:0x02db  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:188:0x0348  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // p007c.p190n.p194b.p209b.p252x1.SimpleSubtitleDecoder
    /* JADX INFO: renamed from: j */
    public Subtitle mo4394j(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        WebvttCueInfo webvttCueInfoM4485d;
        String strSubstring;
        String string;
        boolean z2;
        ParsableByteArray parsableByteArray = this.f10172n;
        parsableByteArray.f6392a = bArr;
        parsableByteArray.f6394c = i;
        int i2 = 0;
        parsableByteArray.f6393b = 0;
        ArrayList arrayList = new ArrayList();
        try {
            WebvttParserUtil.m4494d(this.f10172n);
            while (!TextUtils.isEmpty(this.f10172n.m3202g())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                ParsableByteArray parsableByteArray2 = this.f10172n;
                int i3 = -1;
                ?? r8 = 1;
                byte b = -1;
                int i4 = 0;
                while (b == -1) {
                    i4 = parsableByteArray2.f6393b;
                    String strM3202g = parsableByteArray2.m3202g();
                    if (strM3202g == null) {
                        b = 0;
                    } else if ("STYLE".equals(strM3202g)) {
                        b = 2;
                    } else {
                        b = strM3202g.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                parsableByteArray2.m3194D(i4);
                if (b == 0) {
                    return new WebvttSubtitle(arrayList2);
                }
                if (b == 1) {
                    while (!TextUtils.isEmpty(this.f10172n.m3202g())) {
                    }
                } else {
                    if (b == 2) {
                        if (!arrayList2.isEmpty()) {
                            throw new SubtitleDecoderException("A style block was found after the first cue.");
                        }
                        this.f10172n.m3202g();
                        CssParser cssParser = this.f10173o;
                        ParsableByteArray parsableByteArray3 = this.f10172n;
                        cssParser.f10126c.setLength(i2);
                        int i5 = parsableByteArray3.f6393b;
                        while (!TextUtils.isEmpty(parsableByteArray3.m3202g())) {
                        }
                        cssParser.f10125b.m3192B(parsableByteArray3.f6392a, parsableByteArray3.f6393b);
                        cssParser.f10125b.m3194D(i5);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            ParsableByteArray parsableByteArray4 = cssParser.f10125b;
                            StringBuilder sb = cssParser.f10126c;
                            CssParser.m4479c(parsableByteArray4);
                            if (parsableByteArray4.m3196a() >= 5 && "::cue".equals(parsableByteArray4.m3211p(5))) {
                                int i6 = parsableByteArray4.f6393b;
                                String strM4478b = CssParser.m4478b(parsableByteArray4, sb);
                                if (strM4478b == null) {
                                    strSubstring = null;
                                } else if ("{".equals(strM4478b)) {
                                    parsableByteArray4.m3194D(i6);
                                    strSubstring = "";
                                } else {
                                    if ("(".equals(strM4478b)) {
                                        int i7 = parsableByteArray4.f6393b;
                                        int i8 = parsableByteArray4.f6394c;
                                        boolean z3 = false;
                                        while (i7 < i8 && !z3) {
                                            int i9 = i7 + 1;
                                            boolean z4 = ((char) parsableByteArray4.f6392a[i7]) == ')';
                                            i7 = i9;
                                            z3 = z4;
                                        }
                                        strSubstring = parsableByteArray4.m3211p((i7 - 1) - parsableByteArray4.f6393b).trim();
                                    } else {
                                        strSubstring = null;
                                    }
                                    if (!")".equals(CssParser.m4478b(parsableByteArray4, sb))) {
                                        strSubstring = null;
                                    }
                                }
                            } else {
                                strSubstring = null;
                            }
                            if (strSubstring == null || !"{".equals(CssParser.m4478b(cssParser.f10125b, cssParser.f10126c))) {
                                break;
                            }
                            WebvttCssStyle webvttCssStyle = new WebvttCssStyle();
                            if (!"".equals(strSubstring)) {
                                int iIndexOf = strSubstring.indexOf(91);
                                if (iIndexOf != i3) {
                                    Matcher matcher = CssParser.f10124a.matcher(strSubstring.substring(iIndexOf));
                                    if (matcher.matches()) {
                                        String strGroup = matcher.group((int) r8);
                                        Objects.requireNonNull(strGroup);
                                        webvttCssStyle.f10132d = strGroup;
                                    }
                                    strSubstring = strSubstring.substring(i2, iIndexOf);
                                }
                                String[] strArrM3106O = Util6.m3106O(strSubstring, "\\.");
                                String str = strArrM3106O[i2];
                                int iIndexOf2 = str.indexOf(35);
                                if (iIndexOf2 != i3) {
                                    webvttCssStyle.f10130b = str.substring(i2, iIndexOf2);
                                    webvttCssStyle.f10129a = str.substring(iIndexOf2 + 1);
                                } else {
                                    webvttCssStyle.f10130b = str;
                                }
                                if (strArrM3106O.length > r8) {
                                    int length = strArrM3106O.length;
                                    C2096e.m4566b(r8);
                                    C2096e.m4566b(length <= strArrM3106O.length);
                                    webvttCssStyle.f10131c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrM3106O, (int) r8, length)));
                                }
                            }
                            boolean z5 = false;
                            String str2 = null;
                            while (!z5) {
                                ParsableByteArray parsableByteArray5 = cssParser.f10125b;
                                int i10 = parsableByteArray5.f6393b;
                                String strM4478b2 = CssParser.m4478b(parsableByteArray5, cssParser.f10126c);
                                boolean z6 = strM4478b2 == null || "}".equals(strM4478b2);
                                if (z6) {
                                    strM4478b2 = strM4478b2;
                                    cssParser = cssParser;
                                } else {
                                    cssParser.f10125b.m3194D(i10);
                                    ParsableByteArray parsableByteArray6 = cssParser.f10125b;
                                    StringBuilder sb2 = cssParser.f10126c;
                                    CssParser.m4479c(parsableByteArray6);
                                    String strM4477a = CssParser.m4477a(parsableByteArray6, sb2);
                                    if (!"".equals(strM4477a) && ":".equals(CssParser.m4478b(parsableByteArray6, sb2))) {
                                        CssParser.m4479c(parsableByteArray6);
                                        StringBuilder sb3 = new StringBuilder();
                                        boolean z7 = false;
                                        while (true) {
                                            if (z7) {
                                                strM4478b2 = strM4478b2;
                                                cssParser = cssParser;
                                                string = sb3.toString();
                                                break;
                                            }
                                            strM4478b2 = strM4478b2;
                                            int i11 = parsableByteArray6.f6393b;
                                            cssParser = cssParser;
                                            String strM4478b3 = CssParser.m4478b(parsableByteArray6, sb2);
                                            if (strM4478b3 == null) {
                                                string = null;
                                                break;
                                            }
                                            if ("}".equals(strM4478b3) || ";".equals(strM4478b3)) {
                                                parsableByteArray6.m3194D(i11);
                                                z7 = true;
                                            } else {
                                                sb3.append(strM4478b3);
                                            }
                                        }
                                        if (string != null && !"".equals(string)) {
                                            int i12 = parsableByteArray6.f6393b;
                                            String strM4478b4 = CssParser.m4478b(parsableByteArray6, sb2);
                                            if (";".equals(strM4478b4)) {
                                                if ("color".equals(strM4477a)) {
                                                    webvttCssStyle.f10134f = ColorParser2.m3139a(string, true);
                                                    webvttCssStyle.f10135g = true;
                                                } else if ("background-color".equals(strM4477a)) {
                                                    webvttCssStyle.f10136h = ColorParser2.m3139a(string, true);
                                                    webvttCssStyle.f10137i = true;
                                                } else if ("ruby-position".equals(strM4477a)) {
                                                    if ("over".equals(string)) {
                                                        webvttCssStyle.f10143o = 1;
                                                    } else if ("under".equals(string)) {
                                                        webvttCssStyle.f10143o = 2;
                                                    }
                                                } else if ("text-combine-upright".equals(strM4477a)) {
                                                    if ("all".equals(string)) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    webvttCssStyle.f10144p = z2;
                                                } else if ("text-decoration".equals(strM4477a)) {
                                                    if ("underline".equals(string)) {
                                                        webvttCssStyle.f10139k = 1;
                                                    }
                                                } else if ("font-family".equals(strM4477a)) {
                                                    webvttCssStyle.f10133e = Util6.m3111T(string);
                                                } else if ("font-weight".equals(strM4477a)) {
                                                    if ("bold".equals(string)) {
                                                        webvttCssStyle.f10140l = 1;
                                                    }
                                                } else if (!"font-style".equals(strM4477a)) {
                                                }
                                            } else if ("}".equals(strM4478b4)) {
                                                parsableByteArray6.m3194D(i12);
                                                if ("color".equals(strM4477a)) {
                                                    webvttCssStyle.f10134f = ColorParser2.m3139a(string, true);
                                                    webvttCssStyle.f10135g = true;
                                                } else if ("background-color".equals(strM4477a)) {
                                                    webvttCssStyle.f10136h = ColorParser2.m3139a(string, true);
                                                    webvttCssStyle.f10137i = true;
                                                } else if ("ruby-position".equals(strM4477a)) {
                                                    if ("over".equals(string)) {
                                                        webvttCssStyle.f10143o = 1;
                                                    } else if ("under".equals(string)) {
                                                        webvttCssStyle.f10143o = 2;
                                                    }
                                                } else if ("text-combine-upright".equals(strM4477a)) {
                                                    if ("all".equals(string) || string.startsWith("digits")) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    webvttCssStyle.f10144p = z2;
                                                } else if ("text-decoration".equals(strM4477a)) {
                                                    if ("underline".equals(string)) {
                                                        webvttCssStyle.f10139k = 1;
                                                    }
                                                } else if ("font-family".equals(strM4477a)) {
                                                    webvttCssStyle.f10133e = Util6.m3111T(string);
                                                } else if ("font-weight".equals(strM4477a)) {
                                                    if ("bold".equals(string)) {
                                                        webvttCssStyle.f10140l = 1;
                                                    }
                                                } else if (!"font-style".equals(strM4477a) && "italic".equals(string)) {
                                                    webvttCssStyle.f10141m = 1;
                                                }
                                            }
                                        }
                                    } else {
                                        strM4478b2 = strM4478b2;
                                        cssParser = cssParser;
                                    }
                                }
                                z5 = z6;
                                str2 = strM4478b2;
                                cssParser = cssParser;
                            }
                            CssParser cssParser2 = cssParser;
                            if ("}".equals(str2)) {
                                arrayList3.add(webvttCssStyle);
                            }
                            cssParser = cssParser2;
                            i2 = 0;
                            i3 = -1;
                            r8 = 1;
                        }
                        arrayList.addAll(arrayList3);
                    } else if (b == 3) {
                        ParsableByteArray parsableByteArray7 = this.f10172n;
                        Pattern pattern = WebvttCueParser.f10148a;
                        String strM3202g2 = parsableByteArray7.m3202g();
                        if (strM3202g2 == null) {
                            webvttCueInfoM4485d = null;
                        } else {
                            Pattern pattern2 = WebvttCueParser.f10148a;
                            Matcher matcher2 = pattern2.matcher(strM3202g2);
                            if (matcher2.matches()) {
                                webvttCueInfoM4485d = WebvttCueParser.m4485d(null, matcher2, parsableByteArray7, arrayList);
                            } else {
                                String strM3202g3 = parsableByteArray7.m3202g();
                                if (strM3202g3 == null) {
                                    webvttCueInfoM4485d = null;
                                } else {
                                    Matcher matcher3 = pattern2.matcher(strM3202g3);
                                    if (matcher3.matches()) {
                                        webvttCueInfoM4485d = WebvttCueParser.m4485d(strM3202g2.trim(), matcher3, parsableByteArray7, arrayList);
                                    } else {
                                        webvttCueInfoM4485d = null;
                                    }
                                }
                            }
                        }
                        if (webvttCueInfoM4485d != null) {
                            arrayList2.add(webvttCueInfoM4485d);
                        }
                    }
                    i2 = 0;
                }
            }
        } catch (ParserException e) {
            throw new SubtitleDecoderException(e);
        }
    }
}
