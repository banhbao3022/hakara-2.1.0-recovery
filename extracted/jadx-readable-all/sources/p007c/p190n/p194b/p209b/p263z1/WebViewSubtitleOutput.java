package p007c.p190n.p194b.p209b.p263z1;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.p475ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.CaptionStyleCompat;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.p256q.HorizontalTextInVerticalContextSpan;
import p007c.p190n.p194b.p209b.p252x1.p256q.RubySpan;
import p007c.p190n.p194b.p209b.p252x1.p256q.TextEmphasisSpan;
import p007c.p190n.p378c.p379a.Charsets;
import p007c.p190n.p378c.p380b.RegularImmutableMap;

/* JADX INFO: renamed from: c.n.b.b.z1.j, reason: use source file name */
/* JADX INFO: compiled from: WebViewSubtitleOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.InterfaceC5885a {

    /* JADX INFO: renamed from: f */
    public final CanvasSubtitleOutput f10433f;

    /* JADX INFO: renamed from: g */
    public final WebView f10434g;

    /* JADX INFO: renamed from: h */
    public List<Cue> f10435h;

    /* JADX INFO: renamed from: i */
    public CaptionStyleCompat f10436i;

    /* JADX INFO: renamed from: j */
    public float f10437j;

    /* JADX INFO: renamed from: k */
    public int f10438k;

    /* JADX INFO: renamed from: l */
    public float f10439l;

    /* JADX INFO: renamed from: c.n.b.b.z1.j$a */
    /* JADX INFO: compiled from: WebViewSubtitleOutput.java */
    public class a extends WebView {
        public a(WebViewSubtitleOutput webViewSubtitleOutput, Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.z1.j$b */
    /* JADX INFO: compiled from: WebViewSubtitleOutput.java */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10440a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f10440a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10440a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10440a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: b */
    public static int m4593b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    @Override // com.google.android.exoplayer2.p475ui.SubtitleView.InterfaceC5885a
    /* JADX INFO: renamed from: a */
    public void mo4551a(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.f10436i = captionStyleCompat;
        this.f10437j = f;
        this.f10438k = i;
        this.f10439l = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Cue cue = list.get(i2);
            if (cue.f9789d != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.f10435h.isEmpty() || !arrayList2.isEmpty()) {
            this.f10435h = arrayList2;
            m4595d();
        }
        this.f10433f.mo4551a(arrayList, captionStyleCompat, f, i, f2);
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public final String m4594c(int i, float f) {
        float fM4585u = C2096e.m4585u(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fM4585u == -3.4028235E38f ? "unset" : Util6.m3126n("%.2fpx", Float.valueOf(fM4585u / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0444  */
    /* JADX WARN: Code duplicated, block: B:215:0x04be  */
    /* JADX WARN: Code duplicated, block: B:242:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:248:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:252:0x0615  */
    /* JADX WARN: Code duplicated, block: B:257:0x0621  */
    /* JADX WARN: Code duplicated, block: B:259:0x0635  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cb  */
    /* JADX INFO: renamed from: d */
    public final void m4595d() {
        String strM3126n;
        char c2;
        String strM3126n2;
        int iM4593b;
        String strM3126n3;
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        SpannedToHtmlConverter.b bVar;
        String str7;
        String str8;
        int i3;
        String strM3126n4;
        String str9;
        String string;
        float f;
        int i4;
        String strM3126n5;
        int i5;
        String str10;
        String str11;
        boolean z;
        WebViewSubtitleOutput webViewSubtitleOutput = this;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[4];
        char c3 = 0;
        objArr[0] = C1095a.m2381H(webViewSubtitleOutput.f10436i.f9780b);
        int i6 = 1;
        objArr[1] = webViewSubtitleOutput.m4594c(webViewSubtitleOutput.f10438k, webViewSubtitleOutput.f10437j);
        float f2 = 1.2f;
        objArr[2] = Float.valueOf(1.2f);
        CaptionStyleCompat captionStyleCompat = webViewSubtitleOutput.f10436i;
        int i7 = captionStyleCompat.f9783e;
        if (i7 == 1) {
            strM3126n = Util6.m3126n("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", C1095a.m2381H(captionStyleCompat.f9784f));
        } else if (i7 == 2) {
            strM3126n = Util6.m3126n("0.1em 0.12em 0.15em %s", C1095a.m2381H(captionStyleCompat.f9784f));
        } else if (i7 != 3) {
            strM3126n = i7 != 4 ? "unset" : Util6.m3126n("-0.05em -0.05em 0.15em %s", C1095a.m2381H(captionStyleCompat.f9784f));
        } else {
            strM3126n = Util6.m3126n("0.06em 0.08em 0.15em %s", C1095a.m2381H(captionStyleCompat.f9784f));
        }
        objArr[3] = strM3126n;
        sb.append(Util6.m3126n("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2fem;text-shadow:%s;'>", objArr));
        HashMap map = new HashMap();
        String str12 = "default_bg";
        String str13 = "background-color:%s;";
        map.put(C1095a.m2396l("default_bg"), Util6.m3126n("background-color:%s;", C1095a.m2381H(webViewSubtitleOutput.f10436i.f9781c)));
        int i8 = 0;
        while (i8 < webViewSubtitleOutput.f10435h.size()) {
            Cue cue = webViewSubtitleOutput.f10435h.get(i8);
            float f3 = cue.f9793h;
            float f4 = f3 != -3.4028235E38f ? f3 * 100.0f : 50.0f;
            int iM4593b2 = m4593b(cue.f9794i);
            float f5 = cue.f9790e;
            if (f5 == -3.4028235E38f) {
                c2 = 0;
                Object[] objArr2 = new Object[i6];
                objArr2[0] = Float.valueOf((1.0f - webViewSubtitleOutput.f10439l) * 100.0f);
                strM3126n2 = Util6.m3126n("%.2f%%", objArr2);
                c3 = 0;
                iM4593b = -100;
            } else if (cue.f9791f != i6) {
                Object[] objArr3 = new Object[i6];
                objArr3[c3] = Float.valueOf(f5 * 100.0f);
                strM3126n2 = Util6.m3126n("%.2f%%", objArr3);
                c2 = 0;
                iM4593b = cue.f9801p == i6 ? -m4593b(cue.f9792g) : m4593b(cue.f9792g);
            } else {
                if (f5 >= 0.0f) {
                    Object[] objArr4 = new Object[i6];
                    Float fValueOf = Float.valueOf(f5 * f2);
                    c2 = 0;
                    objArr4[0] = fValueOf;
                    strM3126n2 = Util6.m3126n("%.2fem", objArr4);
                    c3 = 0;
                } else {
                    Object[] objArr5 = new Object[i6];
                    Float fValueOf2 = Float.valueOf(((-f5) - 1.0f) * f2);
                    c2 = 0;
                    objArr5[0] = fValueOf2;
                    strM3126n2 = Util6.m3126n("%.2fem", objArr5);
                    c3 = 1;
                }
                iM4593b = 0;
            }
            float f6 = cue.f9795j;
            if (f6 != -3.4028235E38f) {
                Object[] objArr6 = new Object[i6];
                objArr6[c2] = Float.valueOf(f6 * 100.0f);
                strM3126n3 = Util6.m3126n("%.2f%%", objArr6);
            } else {
                strM3126n3 = "fit-content";
            }
            Layout.Alignment alignment = cue.f9788c;
            String str14 = "center";
            if (alignment == null) {
                i = 2;
            } else {
                int i9 = b.f10440a[alignment.ordinal()];
                if (i9 != i6) {
                    i = 2;
                    if (i9 == 2) {
                        str14 = "end";
                    }
                } else {
                    i = 2;
                    str14 = "start";
                }
            }
            int i10 = cue.f9801p;
            String str15 = i10 != 1 ? i10 != i ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
            String strM4594c = webViewSubtitleOutput.m4594c(cue.f9799n, cue.f9800o);
            String strM2381H = C1095a.m2381H(cue.f9797l ? cue.f9798m : webViewSubtitleOutput.f10436i.f9782d);
            int i11 = cue.f9801p;
            String str16 = "right";
            String str17 = "left";
            int i12 = i8;
            if (i11 == 1) {
                if (c3 != 0) {
                    str16 = "left";
                }
                i2 = 2;
                str17 = "top";
                str = str16;
            } else if (i11 != 2) {
                str = c3 != 0 ? "bottom" : "top";
                i2 = 2;
            } else {
                if (c3 == 0) {
                    str16 = "left";
                }
                i2 = 2;
                str17 = "top";
                str = str16;
            }
            if (i11 == i2 || i11 == 1) {
                str2 = "height";
            } else {
                str2 = "width";
                iM4593b2 = iM4593b;
                iM4593b = iM4593b2;
            }
            CharSequence charSequence = cue.f9787b;
            float f7 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern = SpannedToHtmlConverter.f10388a;
            String str18 = str12;
            String str19 = "";
            StringBuilder sb2 = sb;
            if (charSequence == null) {
                bVar = new SpannedToHtmlConverter.b("", RegularImmutableMap.f26222i, null);
            } else {
                if (charSequence instanceof Spanned) {
                    str19 = "";
                    Spanned spanned = (Spanned) charSequence;
                    HashSet hashSet = new HashSet();
                    int i13 = 0;
                    BackgroundColorSpan[] backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    int length = backgroundColorSpanArr.length;
                    while (i13 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i13].getBackgroundColor()));
                        i13++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    HashMap map2 = new HashMap();
                    for (Iterator it = hashSet.iterator(); it.hasNext(); it = it) {
                        int iIntValue = ((Integer) it.next()).intValue();
                        map2.put(C1095a.m2396l("bg_" + iIntValue), Util6.m3126n(str13, C1095a.m2381H(iIntValue)));
                    }
                    SparseArray sparseArray = new SparseArray();
                    Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                    int length2 = spans.length;
                    int i14 = 0;
                    while (i14 < length2) {
                        int i15 = length2;
                        Object obj = spans[i14];
                        Object[] objArr7 = spans;
                        boolean z2 = obj instanceof StrikethroughSpan;
                        if (z2) {
                            str8 = str15;
                            strM3126n4 = "<span style='text-decoration:line-through;'>";
                            str7 = strM4594c;
                        } else {
                            str7 = strM4594c;
                            if (obj instanceof ForegroundColorSpan) {
                                str8 = str15;
                                strM3126n4 = Util6.m3126n("<span style='color:%s;'>", C1095a.m2381H(((ForegroundColorSpan) obj).getForegroundColor()));
                            } else {
                                str8 = str15;
                                if (obj instanceof BackgroundColorSpan) {
                                    strM3126n4 = Util6.m3126n("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
                                } else if (obj instanceof HorizontalTextInVerticalContextSpan) {
                                    strM3126n4 = "<span style='text-combine-upright:all;'>";
                                } else if (obj instanceof AbsoluteSizeSpan) {
                                    AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
                                    strM3126n4 = Util6.m3126n("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f7));
                                } else if (obj instanceof RelativeSizeSpan) {
                                    strM3126n4 = Util6.m3126n("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
                                } else if (obj instanceof TypefaceSpan) {
                                    String family = ((TypefaceSpan) obj).getFamily();
                                    strM3126n4 = family != null ? Util6.m3126n("<span style='font-family:\"%s\";'>", family) : null;
                                } else if (obj instanceof StyleSpan) {
                                    int style = ((StyleSpan) obj).getStyle();
                                    if (style == 1) {
                                        strM3126n4 = "<b>";
                                    } else if (style == 2) {
                                        strM3126n4 = "<i>";
                                    } else if (style != 3) {
                                        strM3126n4 = null;
                                    } else {
                                        strM3126n4 = "<b><i>";
                                    }
                                } else if (obj instanceof RubySpan) {
                                    int i16 = ((RubySpan) obj).f10003b;
                                    if (i16 == -1) {
                                        strM3126n4 = "<ruby style='ruby-position:unset;'>";
                                    } else if (i16 == 1) {
                                        strM3126n4 = "<ruby style='ruby-position:over;'>";
                                    } else if (i16 != 2) {
                                        strM3126n4 = null;
                                    } else {
                                        strM3126n4 = "<ruby style='ruby-position:under;'>";
                                    }
                                } else if (obj instanceof UnderlineSpan) {
                                    strM3126n4 = "<u>";
                                } else if (obj instanceof TextEmphasisSpan) {
                                    TextEmphasisSpan textEmphasisSpan = (TextEmphasisSpan) obj;
                                    int i17 = textEmphasisSpan.f10004a;
                                    int i18 = textEmphasisSpan.f10005b;
                                    StringBuilder sb3 = new StringBuilder();
                                    if (i18 != 1) {
                                        i3 = 2;
                                        if (i18 == 2) {
                                            sb3.append("open ");
                                        }
                                    } else {
                                        i3 = 2;
                                        sb3.append("filled ");
                                    }
                                    if (i17 == 0) {
                                        sb3.append("none");
                                    } else if (i17 == 1) {
                                        sb3.append("circle");
                                    } else if (i17 == i3) {
                                        sb3.append("dot");
                                    } else if (i17 != 3) {
                                        sb3.append("unset");
                                    } else {
                                        sb3.append("sesame");
                                    }
                                    strM3126n4 = Util6.m3126n("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", sb3.toString(), textEmphasisSpan.f10006c != 2 ? "over right" : "under left");
                                } else {
                                    strM3126n4 = null;
                                }
                            }
                        }
                        String str20 = strM3126n4;
                        if (z2 || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof HorizontalTextInVerticalContextSpan) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof TextEmphasisSpan)) {
                            str9 = "</span>";
                        } else {
                            if (!(obj instanceof TypefaceSpan)) {
                                if (obj instanceof StyleSpan) {
                                    int style2 = ((StyleSpan) obj).getStyle();
                                    if (style2 == 1) {
                                        string = "</b>";
                                    } else if (style2 == 2) {
                                        string = "</i>";
                                    } else if (style2 == 3) {
                                        string = "</i></b>";
                                    }
                                } else if (obj instanceof RubySpan) {
                                    StringBuilder sbM1556G = outline.m1556G("<rt>");
                                    sbM1556G.append(SpannedToHtmlConverter.m4591a(((RubySpan) obj).f10002a));
                                    sbM1556G.append("</rt></ruby>");
                                    string = sbM1556G.toString();
                                } else if (obj instanceof UnderlineSpan) {
                                    string = "</u>";
                                }
                                str9 = string;
                            } else if (((TypefaceSpan) obj).getFamily() != null) {
                                str9 = "</span>";
                            }
                            string = null;
                            str9 = string;
                        }
                        int spanStart = spanned.getSpanStart(obj);
                        int spanEnd = spanned.getSpanEnd(obj);
                        if (str20 != null) {
                            Objects.requireNonNull(str9);
                            SpannedToHtmlConverter.c cVar = new SpannedToHtmlConverter.c(spanStart, spanEnd, str20, str9, null);
                            SpannedToHtmlConverter.d dVar = (SpannedToHtmlConverter.d) sparseArray.get(spanStart);
                            if (dVar == null) {
                                dVar = new SpannedToHtmlConverter.d();
                                sparseArray.put(spanStart, dVar);
                            }
                            dVar.f10395a.add(cVar);
                            SpannedToHtmlConverter.d dVar2 = (SpannedToHtmlConverter.d) sparseArray.get(spanEnd);
                            if (dVar2 == null) {
                                dVar2 = new SpannedToHtmlConverter.d();
                                sparseArray.put(spanEnd, dVar2);
                            }
                            dVar2.f10396b.add(cVar);
                        }
                        i14++;
                        length2 = i15;
                        spans = objArr7;
                        strM4594c = str7;
                        str15 = str8;
                        f7 = f7;
                        str14 = str14;
                        strM3126n3 = strM3126n3;
                    }
                    str3 = str15;
                    str4 = strM3126n3;
                    str5 = strM4594c;
                    str6 = str14;
                    StringBuilder sb4 = new StringBuilder(spanned.length());
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < sparseArray.size()) {
                        int iKeyAt = sparseArray.keyAt(i19);
                        sb4.append(SpannedToHtmlConverter.m4591a(spanned.subSequence(i20, iKeyAt)));
                        SpannedToHtmlConverter.d dVar3 = (SpannedToHtmlConverter.d) sparseArray.get(iKeyAt);
                        Collections.sort(dVar3.f10396b, new Comparator() { // from class: c.n.b.b.z1.b
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                SpannedToHtmlConverter.c cVar2 = (SpannedToHtmlConverter.c) obj2;
                                SpannedToHtmlConverter.c cVar3 = (SpannedToHtmlConverter.c) obj3;
                                int iCompare = Integer.compare(cVar3.f10391a, cVar2.f10391a);
                                if (iCompare != 0) {
                                    return iCompare;
                                }
                                int iCompareTo = cVar3.f10393c.compareTo(cVar2.f10393c);
                                return iCompareTo != 0 ? iCompareTo : cVar3.f10394d.compareTo(cVar2.f10394d);
                            }
                        });
                        Iterator<SpannedToHtmlConverter.c> it2 = dVar3.f10396b.iterator();
                        while (it2.hasNext()) {
                            sb4.append(it2.next().f10394d);
                        }
                        Collections.sort(dVar3.f10395a, new Comparator() { // from class: c.n.b.b.z1.a
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                SpannedToHtmlConverter.c cVar2 = (SpannedToHtmlConverter.c) obj2;
                                SpannedToHtmlConverter.c cVar3 = (SpannedToHtmlConverter.c) obj3;
                                int iCompare = Integer.compare(cVar3.f10392b, cVar2.f10392b);
                                if (iCompare != 0) {
                                    return iCompare;
                                }
                                int iCompareTo = cVar2.f10393c.compareTo(cVar3.f10393c);
                                return iCompareTo != 0 ? iCompareTo : cVar2.f10394d.compareTo(cVar3.f10394d);
                            }
                        });
                        Iterator<SpannedToHtmlConverter.c> it3 = dVar3.f10395a.iterator();
                        while (it3.hasNext()) {
                            sb4.append(it3.next().f10393c);
                        }
                        i19++;
                        i20 = iKeyAt;
                    }
                    sb4.append(SpannedToHtmlConverter.m4591a(spanned.subSequence(i20, spanned.length())));
                    bVar = new SpannedToHtmlConverter.b(sb4.toString(), map2, null);
                } else {
                    bVar = new SpannedToHtmlConverter.b(SpannedToHtmlConverter.m4591a(charSequence), RegularImmutableMap.f26222i, null);
                }
                for (String str21 : map.keySet()) {
                    str11 = (String) map.put(str21, (String) map.get(str21));
                    if (str11 != null || str11.equals(map.get(str21))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C2096e.m4570f(z);
                }
                Object[] objArr8 = new Object[13];
                objArr8[0] = str17;
                objArr8[1] = Float.valueOf(f4);
                objArr8[2] = str;
                objArr8[3] = strM3126n2;
                objArr8[4] = str2;
                objArr8[5] = str4;
                objArr8[6] = str6;
                objArr8[7] = str3;
                objArr8[8] = str5;
                objArr8[9] = strM2381H;
                objArr8[10] = Integer.valueOf(iM4593b);
                objArr8[11] = Integer.valueOf(iM4593b2);
                f = cue.f9802q;
                if (f != 0.0f) {
                    i5 = cue.f9801p;
                    i4 = 1;
                    if (i5 != 2 || i5 == 1) {
                        str10 = "skewY";
                    } else {
                        str10 = "skewX";
                    }
                    strM3126n5 = Util6.m3126n("%s(%.2fdeg)", str10, Float.valueOf(f));
                } else {
                    i4 = 1;
                    strM3126n5 = str19;
                }
                objArr8[12] = strM3126n5;
                String strM3126n6 = Util6.m3126n("<div style='position:absolute;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr8);
                sb = sb2;
                sb.append(strM3126n6);
                Object[] objArr9 = new Object[i4];
                objArr9[0] = str18;
                sb.append(Util6.m3126n("<span class='%s'>", objArr9));
                sb.append(bVar.f10389a);
                sb.append("</span>");
                sb.append("</div>");
                i8 = i12 + 1;
                f2 = 1.2f;
                c3 = 0;
                i6 = 1;
                webViewSubtitleOutput = this;
                str12 = str18;
                str13 = str13;
            }
            str3 = str15;
            str4 = strM3126n3;
            str5 = strM4594c;
            str6 = str14;
            while (r1.hasNext()) {
                str11 = (String) map.put(str21, (String) map.get(str21));
                if (str11 != null) {
                    z = true;
                } else {
                    z = true;
                }
                C2096e.m4570f(z);
            }
            Object[] objArr10 = new Object[13];
            objArr10[0] = str17;
            objArr10[1] = Float.valueOf(f4);
            objArr10[2] = str;
            objArr10[3] = strM3126n2;
            objArr10[4] = str2;
            objArr10[5] = str4;
            objArr10[6] = str6;
            objArr10[7] = str3;
            objArr10[8] = str5;
            objArr10[9] = strM2381H;
            objArr10[10] = Integer.valueOf(iM4593b);
            objArr10[11] = Integer.valueOf(iM4593b2);
            f = cue.f9802q;
            if (f != 0.0f) {
                i5 = cue.f9801p;
                i4 = 1;
                if (i5 != 2) {
                    str10 = "skewY";
                } else {
                    str10 = "skewY";
                }
                strM3126n5 = Util6.m3126n("%s(%.2fdeg)", str10, Float.valueOf(f));
            } else {
                i4 = 1;
                strM3126n5 = str19;
            }
            objArr10[12] = strM3126n5;
            String strM3126n7 = Util6.m3126n("<div style='position:absolute;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr10);
            sb = sb2;
            sb.append(strM3126n7);
            Object[] objArr11 = new Object[i4];
            objArr11[0] = str18;
            sb.append(Util6.m3126n("<span class='%s'>", objArr11));
            sb.append(bVar.f10389a);
            sb.append("</span>");
            sb.append("</div>");
            i8 = i12 + 1;
            f2 = 1.2f;
            c3 = 0;
            i6 = 1;
            webViewSubtitleOutput = this;
            str12 = str18;
            str13 = str13;
        }
        sb.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<html><head><style>");
        for (String str22 : map.keySet()) {
            sb5.append(str22);
            sb5.append("{");
            sb5.append((String) map.get(str22));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb.insert(0, sb5.toString());
        this.f10434g.loadData(Base64.encodeToString(sb.toString().getBytes(Charsets.f26131c), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.f10435h.isEmpty()) {
            return;
        }
        m4595d();
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10435h = Collections.emptyList();
        this.f10436i = CaptionStyleCompat.f9779a;
        this.f10437j = 0.0533f;
        this.f10438k = 0;
        this.f10439l = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f10433f = canvasSubtitleOutput;
        a aVar = new a(this, context, attributeSet);
        this.f10434g = aVar;
        aVar.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(aVar);
    }
}
