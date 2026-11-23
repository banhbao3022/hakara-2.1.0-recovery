package p007c.p190n.p194b.p209b.p252x1.p259t;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p252x1.Cue;
import p007c.p190n.p194b.p209b.p252x1.Subtitle;

/* JADX INFO: renamed from: c.n.b.b.x1.t.g, reason: use source file name */
/* JADX INFO: compiled from: TtmlSubtitle.java */
/* JADX INFO: loaded from: classes.dex */
public final class TtmlSubtitle implements Subtitle {

    /* JADX INFO: renamed from: f */
    public final TtmlNode f10108f;

    /* JADX INFO: renamed from: g */
    public final long[] f10109g;

    /* JADX INFO: renamed from: h */
    public final Map<String, TtmlStyle> f10110h;

    /* JADX INFO: renamed from: i */
    public final Map<String, TtmlRegion> f10111i;

    /* JADX INFO: renamed from: j */
    public final Map<String, String> f10112j;

    public TtmlSubtitle(TtmlNode ttmlNode, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2, Map<String, String> map3) {
        this.f10108f = ttmlNode;
        this.f10111i = map2;
        this.f10112j = map3;
        this.f10110h = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        Objects.requireNonNull(ttmlNode);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        ttmlNode.m4468e(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        this.f10109g = jArr;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: f */
    public int mo4395f(long j2) {
        int iM3114b = Util6.m3114b(this.f10109g, j2, false, false);
        if (iM3114b < this.f10109g.length) {
            return iM3114b;
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: h */
    public long mo4396h(int i) {
        return this.f10109g[i];
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: j */
    public List<Cue> mo4397j(long j2) {
        TtmlNode ttmlNode = this.f10108f;
        Map<String, TtmlStyle> map = this.f10110h;
        Map<String, TtmlRegion> map2 = this.f10111i;
        Map<String, String> map3 = this.f10112j;
        Objects.requireNonNull(ttmlNode);
        ArrayList<Pair> arrayList = new ArrayList();
        ttmlNode.m4470h(j2, ttmlNode.f10074h, arrayList);
        TreeMap treeMap = new TreeMap();
        ttmlNode.m4472j(j2, false, ttmlNode.f10074h, treeMap);
        ttmlNode.m4471i(j2, map, map2, ttmlNode.f10074h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                TtmlRegion ttmlRegion = map2.get(pair.first);
                Objects.requireNonNull(ttmlRegion);
                Cue.b bVar = new Cue.b();
                bVar.f9804b = bitmapDecodeByteArray;
                bVar.f9809g = ttmlRegion.f10081b;
                bVar.f9810h = 0;
                bVar.f9806d = ttmlRegion.f10082c;
                bVar.f9807e = 0;
                bVar.f9808f = ttmlRegion.f10084e;
                bVar.f9813k = ttmlRegion.f10085f;
                bVar.f9814l = ttmlRegion.f10086g;
                bVar.f9817o = ttmlRegion.f10089j;
                arrayList2.add(bVar.m4392a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            TtmlRegion ttmlRegion2 = map2.get(entry.getKey());
            Objects.requireNonNull(ttmlRegion2);
            Cue.b bVar2 = (Cue.b) entry.getValue();
            CharSequence charSequence = bVar2.f9803a;
            Objects.requireNonNull(charSequence);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (DeleteTextSpan deleteTextSpan : (DeleteTextSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), DeleteTextSpan.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(deleteTextSpan), spannableStringBuilder.getSpanEnd(deleteTextSpan), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = ttmlRegion2.f10082c;
            int i9 = ttmlRegion2.f10083d;
            bVar2.f9806d = f;
            bVar2.f9807e = i9;
            bVar2.f9808f = ttmlRegion2.f10084e;
            bVar2.f9809g = ttmlRegion2.f10081b;
            bVar2.f9813k = ttmlRegion2.f10085f;
            float f2 = ttmlRegion2.f10088i;
            int i10 = ttmlRegion2.f10087h;
            bVar2.f9812j = f2;
            bVar2.f9811i = i10;
            bVar2.f9817o = ttmlRegion2.f10089j;
            arrayList2.add(bVar2.m4392a());
        }
        return arrayList2;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: l */
    public int mo4398l() {
        return this.f10109g.length;
    }
}
