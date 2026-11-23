package p007c.p190n.p194b.p209b.p252x1.p259t;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.p256q.HorizontalTextInVerticalContextSpan;
import p007c.p190n.p194b.p209b.p252x1.p256q.RubySpan;
import p007c.p190n.p194b.p209b.p252x1.p256q.TextEmphasisSpan;

/* JADX INFO: renamed from: c.n.b.b.x1.t.d, reason: use source file name */
/* JADX INFO: compiled from: TtmlNode.java */
/* JADX INFO: loaded from: classes.dex */
public final class TtmlNode {

    /* JADX INFO: renamed from: a */
    public final String f10067a;

    /* JADX INFO: renamed from: b */
    public final String f10068b;

    /* JADX INFO: renamed from: c */
    public final boolean f10069c;

    /* JADX INFO: renamed from: d */
    public final long f10070d;

    /* JADX INFO: renamed from: e */
    public final long f10071e;

    /* JADX INFO: renamed from: f */
    public final TtmlStyle f10072f;

    /* JADX INFO: renamed from: g */
    public final String[] f10073g;

    /* JADX INFO: renamed from: h */
    public final String f10074h;

    /* JADX INFO: renamed from: i */
    public final String f10075i;

    /* JADX INFO: renamed from: j */
    public final TtmlNode f10076j;

    /* JADX INFO: renamed from: k */
    public final HashMap<String, Integer> f10077k;

    /* JADX INFO: renamed from: l */
    public final HashMap<String, Integer> f10078l;

    /* JADX INFO: renamed from: m */
    public List<TtmlNode> f10079m;

    public TtmlNode(String str, String str2, long j2, long j3, TtmlStyle ttmlStyle, String[] strArr, String str3, String str4, TtmlNode ttmlNode) {
        this.f10067a = str;
        this.f10068b = str2;
        this.f10075i = str4;
        this.f10072f = ttmlStyle;
        this.f10073g = strArr;
        this.f10069c = str2 != null;
        this.f10070d = j2;
        this.f10071e = j3;
        Objects.requireNonNull(str3);
        this.f10074h = str3;
        this.f10076j = ttmlNode;
        this.f10077k = new HashMap<>();
        this.f10078l = new HashMap<>();
    }

    /* JADX INFO: renamed from: b */
    public static TtmlNode m4463b(String str) {
        return new TtmlNode(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: f */
    public static SpannableStringBuilder m4464f(String str, Map<String, Cue.b> map) {
        if (!map.containsKey(str)) {
            Cue.b bVar = new Cue.b();
            bVar.f9803a = new SpannableStringBuilder();
            map.put(str, bVar);
        }
        CharSequence charSequence = map.get(str).f9803a;
        Objects.requireNonNull(charSequence);
        return (SpannableStringBuilder) charSequence;
    }

    /* JADX INFO: renamed from: a */
    public void m4465a(TtmlNode ttmlNode) {
        if (this.f10079m == null) {
            this.f10079m = new ArrayList();
        }
        this.f10079m.add(ttmlNode);
    }

    /* JADX INFO: renamed from: c */
    public TtmlNode m4466c(int i) {
        List<TtmlNode> list = this.f10079m;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: d */
    public int m4467d() {
        List<TtmlNode> list = this.f10079m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: e */
    public final void m4468e(TreeSet<Long> treeSet, boolean z) {
        boolean zEquals = "p".equals(this.f10067a);
        boolean zEquals2 = "div".equals(this.f10067a);
        if (z || zEquals || (zEquals2 && this.f10075i != null)) {
            long j2 = this.f10070d;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.f10071e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.f10079m == null) {
            return;
        }
        for (int i = 0; i < this.f10079m.size(); i++) {
            this.f10079m.get(i).m4468e(treeSet, z || zEquals);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m4469g(long j2) {
        long j3 = this.f10070d;
        return (j3 == -9223372036854775807L && this.f10071e == -9223372036854775807L) || (j3 <= j2 && this.f10071e == -9223372036854775807L) || ((j3 == -9223372036854775807L && j2 < this.f10071e) || (j3 <= j2 && j2 < this.f10071e));
    }

    /* JADX INFO: renamed from: h */
    public final void m4470h(long j2, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f10074h)) {
            str = this.f10074h;
        }
        if (m4469g(j2) && "div".equals(this.f10067a) && this.f10075i != null) {
            list.add(new Pair<>(str, this.f10075i));
            return;
        }
        for (int i = 0; i < m4467d(); i++) {
            m4466c(i).m4470h(j2, str, list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01da  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:126:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:127:0x020b  */
    /* JADX INFO: renamed from: i */
    public final void m4471i(long j2, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2, String str, Map<String, Cue.b> map3) {
        TtmlNode ttmlNode;
        boolean z;
        int i;
        int i2;
        if (m4469g(j2)) {
            String str2 = "".equals(this.f10074h) ? str : this.f10074h;
            Iterator<Map.Entry<String, Integer>> it = this.f10078l.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f10077k.containsKey(key) ? this.f10077k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    Cue.b bVar = map3.get(key);
                    Objects.requireNonNull(bVar);
                    TtmlRegion ttmlRegion = map2.get(str2);
                    Objects.requireNonNull(ttmlRegion);
                    int i3 = ttmlRegion.f10089j;
                    TtmlStyle ttmlStyleM2377D = C1095a.m2377D(this.f10072f, this.f10073g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.f9803a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        bVar.f9803a = spannableStringBuilder;
                    }
                    if (ttmlStyleM2377D != null) {
                        TtmlNode ttmlNode2 = this.f10076j;
                        if (ttmlStyleM2377D.m4474b() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(ttmlStyleM2377D.m4474b()), iIntValue, iIntValue2, 33);
                        }
                        if (ttmlStyleM2377D.f10095f == 1) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (ttmlStyleM2377D.f10096g == 1) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (ttmlStyleM2377D.f10092c) {
                            if (!ttmlStyleM2377D.f10092c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            C1095a.m2387c(spannableStringBuilder, new ForegroundColorSpan(ttmlStyleM2377D.f10091b), iIntValue, iIntValue2, 33);
                        }
                        if (ttmlStyleM2377D.f10094e) {
                            if (!ttmlStyleM2377D.f10094e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            C1095a.m2387c(spannableStringBuilder, new BackgroundColorSpan(ttmlStyleM2377D.f10093d), iIntValue, iIntValue2, 33);
                        }
                        if (ttmlStyleM2377D.f10090a != null) {
                            C1095a.m2387c(spannableStringBuilder, new TypefaceSpan(ttmlStyleM2377D.f10090a), iIntValue, iIntValue2, 33);
                        }
                        TextEmphasis textEmphasis = ttmlStyleM2377D.f10106q;
                        if (textEmphasis != null) {
                            int i4 = textEmphasis.f10048f;
                            if (i4 == -1) {
                                i4 = (i3 == 2 || i3 == 1) ? 3 : 1;
                                i2 = 1;
                            } else {
                                i2 = textEmphasis.f10049g;
                            }
                            int i5 = textEmphasis.f10050h;
                            if (i5 == -2) {
                                i5 = 1;
                            }
                            C1095a.m2387c(spannableStringBuilder, new TextEmphasisSpan(i4, i2, i5), iIntValue, iIntValue2, 33);
                        }
                        int i6 = ttmlStyleM2377D.f10102m;
                        if (i6 == 2) {
                            while (true) {
                                if (ttmlNode2 == null) {
                                    ttmlNode2 = null;
                                    break;
                                }
                                TtmlStyle ttmlStyleM2377D2 = C1095a.m2377D(ttmlNode2.f10072f, ttmlNode2.f10073g, map);
                                if (ttmlStyleM2377D2 != null && ttmlStyleM2377D2.f10102m == 1) {
                                    break;
                                } else {
                                    ttmlNode2 = ttmlNode2.f10076j;
                                }
                            }
                            if (ttmlNode2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(ttmlNode2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        ttmlNode = null;
                                        break;
                                    }
                                    TtmlNode ttmlNode3 = (TtmlNode) arrayDeque.pop();
                                    TtmlStyle ttmlStyleM2377D3 = C1095a.m2377D(ttmlNode3.f10072f, ttmlNode3.f10073g, map);
                                    if (ttmlStyleM2377D3 != null && ttmlStyleM2377D3.f10102m == 3) {
                                        ttmlNode = ttmlNode3;
                                        break;
                                    }
                                    for (int iM4467d = ttmlNode3.m4467d() - 1; iM4467d >= 0; iM4467d--) {
                                        arrayDeque.push(ttmlNode3.m4466c(iM4467d));
                                    }
                                }
                                if (ttmlNode != null) {
                                    if (ttmlNode.m4467d() == 1) {
                                        z = false;
                                        if (ttmlNode.m4466c(0).f10068b != null) {
                                            String str3 = ttmlNode.m4466c(0).f10068b;
                                            int i7 = Util6.f6307a;
                                            TtmlStyle ttmlStyle = ttmlNode2.f10072f;
                                            spannableStringBuilder.setSpan(new RubySpan(str3, ttmlStyle != null ? ttmlStyle.f10103n : -1), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        z = false;
                                    }
                                    Log.i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (ttmlStyleM2377D.f10105p == 1) {
                                z = true;
                            }
                            if (z) {
                                C1095a.m2387c(spannableStringBuilder, new HorizontalTextInVerticalContextSpan(), iIntValue, iIntValue2, 33);
                            }
                            i = ttmlStyleM2377D.f10099j;
                            if (i != 1) {
                                C1095a.m2387c(spannableStringBuilder, new AbsoluteSizeSpan((int) ttmlStyleM2377D.f10100k, true), iIntValue, iIntValue2, 33);
                            } else if (i != 2) {
                                C1095a.m2387c(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleM2377D.f10100k), iIntValue, iIntValue2, 33);
                            } else if (i == 3) {
                                C1095a.m2387c(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleM2377D.f10100k / 100.0f), iIntValue, iIntValue2, 33);
                            }
                            if (ttmlStyleM2377D.f10107r != Float.MAX_VALUE && "p".equals(this.f10067a)) {
                                bVar.f9818p = (ttmlStyleM2377D.f10107r * (-90.0f)) / 100.0f;
                            }
                            bVar.f9805c = ttmlStyleM2377D.f10104o;
                        } else if (i6 == 3 || i6 == 4) {
                            spannableStringBuilder.setSpan(new DeleteTextSpan(), iIntValue, iIntValue2, 33);
                        }
                        z = false;
                        if (ttmlStyleM2377D.f10105p == 1) {
                            z = true;
                        }
                        if (z) {
                            C1095a.m2387c(spannableStringBuilder, new HorizontalTextInVerticalContextSpan(), iIntValue, iIntValue2, 33);
                        }
                        i = ttmlStyleM2377D.f10099j;
                        if (i != 1) {
                            C1095a.m2387c(spannableStringBuilder, new AbsoluteSizeSpan((int) ttmlStyleM2377D.f10100k, true), iIntValue, iIntValue2, 33);
                        } else if (i != 2) {
                            C1095a.m2387c(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleM2377D.f10100k), iIntValue, iIntValue2, 33);
                        } else if (i == 3) {
                            C1095a.m2387c(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleM2377D.f10100k / 100.0f), iIntValue, iIntValue2, 33);
                        }
                        if (ttmlStyleM2377D.f10107r != Float.MAX_VALUE) {
                            bVar.f9818p = (ttmlStyleM2377D.f10107r * (-90.0f)) / 100.0f;
                        }
                        bVar.f9805c = ttmlStyleM2377D.f10104o;
                    }
                    it = it;
                }
                it = it;
                it = it;
            }
            for (int i8 = 0; i8 < m4467d(); i8++) {
                m4466c(i8).m4471i(j2, map, map2, str2, map3);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4472j(long j2, boolean z, String str, Map<String, Cue.b> map) {
        this.f10077k.clear();
        this.f10078l.clear();
        if ("metadata".equals(this.f10067a)) {
            return;
        }
        if (!"".equals(this.f10074h)) {
            str = this.f10074h;
        }
        if (this.f10069c && z) {
            SpannableStringBuilder spannableStringBuilderM4464f = m4464f(str, map);
            String str2 = this.f10068b;
            Objects.requireNonNull(str2);
            spannableStringBuilderM4464f.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.f10067a) && z) {
            m4464f(str, map).append('\n');
            return;
        }
        if (m4469g(j2)) {
            for (Map.Entry<String, Cue.b> entry : map.entrySet()) {
                HashMap<String, Integer> map2 = this.f10077k;
                String key = entry.getKey();
                CharSequence charSequence = entry.getValue().f9803a;
                Objects.requireNonNull(charSequence);
                map2.put(key, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(this.f10067a);
            for (int i = 0; i < m4467d(); i++) {
                m4466c(i).m4472j(j2, z || zEquals, str, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM4464f2 = m4464f(str, map);
                int length = spannableStringBuilderM4464f2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderM4464f2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderM4464f2.charAt(length) != '\n') {
                    spannableStringBuilderM4464f2.append('\n');
                }
            }
            for (Map.Entry<String, Cue.b> entry2 : map.entrySet()) {
                HashMap<String, Integer> map3 = this.f10078l;
                String key2 = entry2.getKey();
                CharSequence charSequence2 = entry2.getValue().f9803a;
                Objects.requireNonNull(charSequence2);
                map3.put(key2, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
