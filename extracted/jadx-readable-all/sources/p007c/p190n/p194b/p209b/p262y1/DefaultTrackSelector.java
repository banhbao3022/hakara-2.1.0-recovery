package p007c.p190n.p194b.p209b.p262y1;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p007c.p190n.p194b.p209b.ExoPlaybackException;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.RendererConfiguration;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p210a2.BandwidthMeter;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.TrackGroup;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ComparisonChain;
import p007c.p190n.p378c.p380b.ImmutableList2;
import p007c.p190n.p378c.p380b.NaturalOrdering;
import p007c.p190n.p378c.p380b.Ordering;
import p007c.p190n.p378c.p380b.RegularImmutableList;
import p007c.p190n.p378c.p380b.ReverseNaturalOrdering;

/* JADX INFO: renamed from: c.n.b.b.y1.f, reason: use source file name */
/* JADX INFO: compiled from: DefaultTrackSelector.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultTrackSelector extends MappingTrackSelector {

    /* JADX INFO: renamed from: d */
    public static final int[] f10232d = new int[0];

    /* JADX INFO: renamed from: e */
    public static final Ordering<Integer> f10233e = Ordering.m11609a(new Comparator() { // from class: c.n.b.b.y1.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int[] iArr = DefaultTrackSelector.f10232d;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });

    /* JADX INFO: renamed from: f */
    public static final Ordering<Integer> f10234f = Ordering.m11609a(new Comparator() { // from class: c.n.b.b.y1.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int[] iArr = DefaultTrackSelector.f10232d;
            return 0;
        }
    });

    /* JADX INFO: renamed from: g */
    public final ExoTrackSelection2.b f10235g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference<c> f10236h;

    /* JADX INFO: renamed from: c.n.b.b.y1.f$a */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: f */
        public final boolean f10237f;

        /* JADX INFO: renamed from: g */
        public final String f10238g;

        /* JADX INFO: renamed from: h */
        public final c f10239h;

        /* JADX INFO: renamed from: i */
        public final boolean f10240i;

        /* JADX INFO: renamed from: j */
        public final int f10241j;

        /* JADX INFO: renamed from: k */
        public final int f10242k;

        /* JADX INFO: renamed from: l */
        public final int f10243l;

        /* JADX INFO: renamed from: m */
        public final int f10244m;

        /* JADX INFO: renamed from: n */
        public final int f10245n;

        /* JADX INFO: renamed from: o */
        public final boolean f10246o;

        /* JADX INFO: renamed from: p */
        public final int f10247p;

        /* JADX INFO: renamed from: q */
        public final int f10248q;

        /* JADX INFO: renamed from: r */
        public final int f10249r;

        /* JADX INFO: renamed from: s */
        public final int f10250s;

        public a(Format format, c cVar, int i) {
            int i2;
            int iM4525d;
            String[] strArrM3106O;
            int iM4525d2;
            this.f10239h = cVar;
            this.f10238g = DefaultTrackSelector.m4529h(format.f6925h);
            this.f10240i = DefaultTrackSelector.m4527f(i, false);
            int i3 = 0;
            while (true) {
                i2 = Integer.MAX_VALUE;
                if (i3 >= cVar.f10351g.size()) {
                    i3 = Integer.MAX_VALUE;
                    iM4525d = 0;
                    break;
                } else {
                    iM4525d = DefaultTrackSelector.m4525d(format, cVar.f10351g.get(i3), false);
                    if (iM4525d > 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f10242k = i3;
            this.f10241j = iM4525d;
            this.f10243l = Integer.bitCount(format.f6927j & cVar.f10352h);
            this.f10246o = (format.f6926i & 1) != 0;
            int i4 = format.f6915D;
            this.f10247p = i4;
            this.f10248q = format.f6916E;
            int i5 = format.f6930m;
            this.f10249r = i5;
            this.f10237f = (i5 == -1 || i5 <= cVar.f10257D) && (i4 == -1 || i4 <= cVar.f10256C);
            int i6 = Util6.f6307a;
            Configuration configuration = Resources.getSystem().getConfiguration();
            int i7 = Util6.f6307a;
            if (i7 >= 24) {
                strArrM3106O = Util6.m3106O(configuration.getLocales().toLanguageTags(), ",");
            } else {
                String[] strArr = new String[1];
                Locale locale = configuration.locale;
                strArr[0] = i7 >= 21 ? locale.toLanguageTag() : locale.toString();
                strArrM3106O = strArr;
            }
            for (int i8 = 0; i8 < strArrM3106O.length; i8++) {
                strArrM3106O[i8] = Util6.m3099H(strArrM3106O[i8]);
            }
            int i9 = 0;
            while (true) {
                if (i9 >= strArrM3106O.length) {
                    i9 = Integer.MAX_VALUE;
                    iM4525d2 = 0;
                    break;
                } else {
                    iM4525d2 = DefaultTrackSelector.m4525d(format, strArrM3106O[i9], false);
                    if (iM4525d2 > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f10244m = i9;
            this.f10245n = iM4525d2;
            for (int i10 = 0; i10 < cVar.f10262I.size(); i10++) {
                String str = format.f6934q;
                if (str != null && str.equals(cVar.f10262I.get(i10))) {
                    i2 = i10;
                    break;
                }
            }
            this.f10250s = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            Object objMo11608b = (this.f10237f && this.f10240i) ? DefaultTrackSelector.f10233e : DefaultTrackSelector.f10233e.mo11608b();
            ComparisonChain comparisonChainMo11632c = ComparisonChain.f26236a.mo11632c(this.f10240i, aVar.f10240i);
            Integer numValueOf = Integer.valueOf(this.f10242k);
            Integer numValueOf2 = Integer.valueOf(aVar.f10242k);
            ReverseNaturalOrdering reverseNaturalOrdering = ReverseNaturalOrdering.f26247f;
            ComparisonChain comparisonChainMo11631b = comparisonChainMo11632c.mo11631b(numValueOf, numValueOf2, reverseNaturalOrdering).mo11630a(this.f10241j, aVar.f10241j).mo11630a(this.f10243l, aVar.f10243l).mo11632c(this.f10237f, aVar.f10237f).mo11631b(Integer.valueOf(this.f10250s), Integer.valueOf(aVar.f10250s), reverseNaturalOrdering).mo11631b(Integer.valueOf(this.f10249r), Integer.valueOf(aVar.f10249r), this.f10239h.f10263J ? DefaultTrackSelector.f10233e.mo11608b() : DefaultTrackSelector.f10234f).mo11632c(this.f10246o, aVar.f10246o).mo11631b(Integer.valueOf(this.f10244m), Integer.valueOf(aVar.f10244m), reverseNaturalOrdering).mo11630a(this.f10245n, aVar.f10245n).mo11631b(Integer.valueOf(this.f10247p), Integer.valueOf(aVar.f10247p), objMo11608b).mo11631b(Integer.valueOf(this.f10248q), Integer.valueOf(aVar.f10248q), objMo11608b);
            Integer numValueOf3 = Integer.valueOf(this.f10249r);
            Integer numValueOf4 = Integer.valueOf(aVar.f10249r);
            if (!Util6.m3113a(this.f10238g, aVar.f10238g)) {
                objMo11608b = DefaultTrackSelector.f10234f;
            }
            return comparisonChainMo11631b.mo11631b(numValueOf3, numValueOf4, objMo11608b).mo11634e();
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.y1.f$b */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: f */
        public final boolean f10251f;

        /* JADX INFO: renamed from: g */
        public final boolean f10252g;

        public b(Format format, int i) {
            this.f10251f = (format.f6926i & 1) != 0;
            this.f10252g = DefaultTrackSelector.m4527f(i, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return ComparisonChain.f26236a.mo11632c(this.f10252g, bVar.f10252g).mo11632c(this.f10251f, bVar.f10251f).mo11634e();
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.y1.f$e */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public final int f10312f;

        /* JADX INFO: renamed from: g */
        public final int[] f10313g;

        /* JADX INFO: renamed from: h */
        public final int f10314h;

        /* JADX INFO: renamed from: i */
        public final int f10315i;

        /* JADX INFO: renamed from: j */
        public final int f10316j;

        /* JADX INFO: renamed from: c.n.b.b.y1.f$e$a */
        /* JADX INFO: compiled from: DefaultTrackSelector.java */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(int i, int... iArr) {
            this(i, iArr, 2, 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f10312f == eVar.f10312f && Arrays.equals(this.f10313g, eVar.f10313g) && this.f10315i == eVar.f10315i && this.f10316j == eVar.f10316j;
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f10313g) + (this.f10312f * 31)) * 31) + this.f10315i) * 31) + this.f10316j;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f10312f);
            parcel.writeInt(this.f10313g.length);
            parcel.writeIntArray(this.f10313g);
            parcel.writeInt(this.f10315i);
            parcel.writeInt(this.f10316j);
        }

        public e(int i, int[] iArr, int i2, int i3) {
            this.f10312f = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f10313g = iArrCopyOf;
            this.f10314h = iArr.length;
            this.f10315i = i2;
            this.f10316j = i3;
            Arrays.sort(iArrCopyOf);
        }

        public e(Parcel parcel) {
            this.f10312f = parcel.readInt();
            int i = parcel.readByte();
            this.f10314h = i;
            int[] iArr = new int[i];
            this.f10313g = iArr;
            parcel.readIntArray(iArr);
            this.f10315i = parcel.readInt();
            this.f10316j = parcel.readInt();
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.y1.f$f */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class f implements Comparable<f> {

        /* JADX INFO: renamed from: f */
        public final boolean f10317f;

        /* JADX INFO: renamed from: g */
        public final boolean f10318g;

        /* JADX INFO: renamed from: h */
        public final boolean f10319h;

        /* JADX INFO: renamed from: i */
        public final boolean f10320i;

        /* JADX INFO: renamed from: j */
        public final int f10321j;

        /* JADX INFO: renamed from: k */
        public final int f10322k;

        /* JADX INFO: renamed from: l */
        public final int f10323l;

        /* JADX INFO: renamed from: m */
        public final int f10324m;

        /* JADX INFO: renamed from: n */
        public final boolean f10325n;

        public f(Format format, c cVar, int i, String str) {
            int iM4525d;
            boolean z = false;
            this.f10318g = DefaultTrackSelector.m4527f(i, false);
            int i2 = format.f6926i & (~cVar.f10356l);
            this.f10319h = (i2 & 1) != 0;
            this.f10320i = (i2 & 2) != 0;
            int i3 = Integer.MAX_VALUE;
            ImmutableList2<String> immutableList2M11637B = cVar.f10353i.isEmpty() ? ImmutableList2.m11637B("") : cVar.f10353i;
            int i4 = 0;
            while (true) {
                if (i4 >= immutableList2M11637B.size()) {
                    iM4525d = 0;
                    break;
                }
                iM4525d = DefaultTrackSelector.m4525d(format, immutableList2M11637B.get(i4), cVar.f10355k);
                if (iM4525d > 0) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            this.f10321j = i3;
            this.f10322k = iM4525d;
            int iBitCount = Integer.bitCount(format.f6927j & cVar.f10354j);
            this.f10323l = iBitCount;
            this.f10325n = (format.f6927j & 1088) != 0;
            int iM4525d2 = DefaultTrackSelector.m4525d(format, str, DefaultTrackSelector.m4529h(str) == null);
            this.f10324m = iM4525d2;
            if (iM4525d > 0 || ((cVar.f10353i.isEmpty() && iBitCount > 0) || this.f10319h || (this.f10320i && iM4525d2 > 0))) {
                z = true;
            }
            this.f10317f = z;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(f fVar) {
            ComparisonChain comparisonChainMo11632c = ComparisonChain.f26236a.mo11632c(this.f10318g, fVar.f10318g);
            Integer numValueOf = Integer.valueOf(this.f10321j);
            Integer numValueOf2 = Integer.valueOf(fVar.f10321j);
            Ordering ordering = NaturalOrdering.f26194f;
            ReverseNaturalOrdering reverseNaturalOrdering = ReverseNaturalOrdering.f26247f;
            ComparisonChain comparisonChainMo11632c2 = comparisonChainMo11632c.mo11631b(numValueOf, numValueOf2, reverseNaturalOrdering).mo11630a(this.f10322k, fVar.f10322k).mo11630a(this.f10323l, fVar.f10323l).mo11632c(this.f10319h, fVar.f10319h);
            Boolean boolValueOf = Boolean.valueOf(this.f10320i);
            Boolean boolValueOf2 = Boolean.valueOf(fVar.f10320i);
            if (this.f10322k != 0) {
                ordering = reverseNaturalOrdering;
            }
            ComparisonChain comparisonChainMo11630a = comparisonChainMo11632c2.mo11631b(boolValueOf, boolValueOf2, ordering).mo11630a(this.f10324m, fVar.f10324m);
            if (this.f10323l == 0) {
                comparisonChainMo11630a = comparisonChainMo11630a.mo11633d(this.f10325n, fVar.f10325n);
            }
            return comparisonChainMo11630a.mo11634e();
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.y1.f$g */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class g implements Comparable<g> {

        /* JADX INFO: renamed from: f */
        public final boolean f10326f;

        /* JADX INFO: renamed from: g */
        public final c f10327g;

        /* JADX INFO: renamed from: h */
        public final boolean f10328h;

        /* JADX INFO: renamed from: i */
        public final boolean f10329i;

        /* JADX INFO: renamed from: j */
        public final int f10330j;

        /* JADX INFO: renamed from: k */
        public final int f10331k;

        /* JADX INFO: renamed from: l */
        public final int f10332l;

        /* JADX WARN: Code duplicated, block: B:21:0x0033  */
        /* JADX WARN: Code duplicated, block: B:41:0x005e  */
        public g(Format format, c cVar, int i, boolean z) {
            boolean z2;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            this.f10327g = cVar;
            boolean z3 = true;
            int i9 = -1;
            if (!z || (((i6 = format.f6939v) != -1 && i6 > cVar.f10270n) || ((i7 = format.f6940w) != -1 && i7 > cVar.f10271o))) {
                z2 = false;
            } else {
                float f = format.f6941x;
                if ((f == -1.0f || f <= cVar.f10272p) && ((i8 = format.f6930m) == -1 || i8 <= cVar.f10273q)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            this.f10326f = z2;
            if (!z || (((i3 = format.f6939v) != -1 && i3 < cVar.f10274r) || ((i4 = format.f6940w) != -1 && i4 < cVar.f10275s))) {
                z3 = false;
            } else {
                float f2 = format.f6941x;
                if ((f2 != -1.0f && f2 < cVar.f10276t) || ((i5 = format.f6930m) != -1 && i5 < cVar.f10277u)) {
                    z3 = false;
                }
            }
            this.f10328h = z3;
            this.f10329i = DefaultTrackSelector.m4527f(i, false);
            this.f10330j = format.f6930m;
            int i10 = format.f6939v;
            if (i10 != -1 && (i2 = format.f6940w) != -1) {
                i9 = i10 * i2;
            }
            this.f10331k = i9;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < cVar.f10255B.size(); i12++) {
                String str = format.f6934q;
                if (str != null && str.equals(cVar.f10255B.get(i12))) {
                    i11 = i12;
                    break;
                }
            }
            this.f10332l = i11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            Object objMo11608b = (this.f10326f && this.f10329i) ? DefaultTrackSelector.f10233e : DefaultTrackSelector.f10233e.mo11608b();
            return ComparisonChain.f26236a.mo11632c(this.f10329i, gVar.f10329i).mo11632c(this.f10326f, gVar.f10326f).mo11632c(this.f10328h, gVar.f10328h).mo11631b(Integer.valueOf(this.f10332l), Integer.valueOf(gVar.f10332l), ReverseNaturalOrdering.f26247f).mo11631b(Integer.valueOf(this.f10330j), Integer.valueOf(gVar.f10330j), this.f10327g.f10263J ? DefaultTrackSelector.f10233e.mo11608b() : DefaultTrackSelector.f10234f).mo11631b(Integer.valueOf(this.f10331k), Integer.valueOf(gVar.f10331k), objMo11608b).mo11631b(Integer.valueOf(this.f10330j), Integer.valueOf(gVar.f10330j), objMo11608b).mo11634e();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultTrackSelector(Context context, ExoTrackSelection2.b bVar) {
        this(new d(context).m4535b(), bVar);
        c cVar = c.f10253m;
    }

    /* JADX INFO: renamed from: d */
    public static int m4525d(Format format, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(format.f6925h)) {
            return 4;
        }
        String strM4529h = m4529h(str);
        String strM4529h2 = m4529h(format.f6925h);
        if (strM4529h2 == null || strM4529h == null) {
            return (z && strM4529h2 == null) ? 1 : 0;
        }
        if (strM4529h2.startsWith(strM4529h) || strM4529h.startsWith(strM4529h2)) {
            return 3;
        }
        int i = Util6.f6307a;
        return strM4529h2.split("-", 2)[0].equals(strM4529h.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX INFO: renamed from: e */
    public static List<Integer> m4526e(TrackGroup trackGroup, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList = new ArrayList(trackGroup.f9064f);
        for (int i7 = 0; i7 < trackGroup.f9064f; i7++) {
            arrayList.add(Integer.valueOf(i7));
        }
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            int i8 = 0;
            int i9 = Integer.MAX_VALUE;
            while (true) {
                if (i8 >= trackGroup.f9064f) {
                    break;
                }
                Format format = trackGroup.f9065g[i8];
                int i10 = format.f6939v;
                if (i10 > 0 && (i4 = format.f6940w) > 0) {
                    if (!z) {
                        i5 = i;
                        i6 = i2;
                    } else if ((i10 > i4) != (i > i2)) {
                        i6 = i;
                        i5 = i2;
                    } else {
                        i5 = i;
                        i6 = i2;
                    }
                    int i11 = i10 * i6;
                    int i12 = i4 * i5;
                    Point point = i11 >= i12 ? new Point(i5, Util6.m3119g(i12, i10)) : new Point(Util6.m3119g(i11, i4), i6);
                    int i13 = format.f6939v;
                    int i14 = format.f6940w;
                    int i15 = i13 * i14;
                    if (i13 >= ((int) (point.x * 0.98f)) && i14 >= ((int) (point.y * 0.98f)) && i15 < i9) {
                        i9 = i15;
                    }
                }
                i8++;
            }
            if (i9 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Format format2 = trackGroup.f9065g[((Integer) arrayList.get(size)).intValue()];
                    int i16 = format2.f6939v;
                    int i17 = (i16 == -1 || (i3 = format2.f6940w) == -1) ? -1 : i16 * i3;
                    if (i17 == -1 || i17 > i9) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m4527f(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m4528g(Format format, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        if ((format.f6927j & 16384) != 0 || !m4527f(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !Util6.m3113a(format.f6934q, str)) {
            return false;
        }
        int i11 = format.f6939v;
        if (i11 != -1 && (i7 > i11 || i11 > i3)) {
            return false;
        }
        int i12 = format.f6940w;
        if (i12 != -1 && (i8 > i12 || i12 > i4)) {
            return false;
        }
        float f2 = format.f6941x;
        if (f2 != -1.0f && (i9 > f2 || f2 > i5)) {
            return false;
        }
        int i13 = format.f6930m;
        return i13 == -1 || (i10 <= i13 && i13 <= i6);
    }

    /* JADX INFO: renamed from: h */
    public static String m4529h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x0374  */
    /* JADX WARN: Code duplicated, block: B:299:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:334:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0171 A[LOOP:1: B:23:0x0045->B:66:0x0171, LOOP_END] */
    @Override // p007c.p190n.p194b.p209b.p262y1.MappingTrackSelector
    /* JADX INFO: renamed from: c */
    public final Pair<RendererConfiguration[], ExoTrackSelection2[]> mo4530c(MappingTrackSelector.a aVar, int[][][] iArr, int[] iArr2, MediaSource2.a aVar2, Timeline timeline) throws ExoPlaybackException {
        int i;
        boolean z;
        boolean z2;
        c cVar;
        Pair pairCreate;
        int[][] iArr3;
        TrackGroup trackGroup;
        String str;
        int[][] iArr4;
        int i2;
        int i3;
        c cVar2;
        String str2;
        ExoTrackSelection2.a aVar3;
        Pair pairCreate2;
        int i4;
        int[] iArr5;
        int i5;
        int i6;
        String str3;
        int i7;
        TrackGroup trackGroup2;
        MappingTrackSelector.a aVar4;
        c cVar3;
        int i8;
        ExoTrackSelection2.a[] aVarArr;
        int i9;
        boolean z3;
        c cVar4;
        TrackGroupArray trackGroupArray;
        int[][] iArr6;
        ExoTrackSelection2.a aVar5;
        List<Integer> list;
        ArrayList arrayList;
        String str4;
        int[] iArrM11011r0;
        ArrayList arrayList2;
        HashSet hashSet;
        int i10;
        MappingTrackSelector.a aVar6 = aVar;
        c cVar5 = this.f10236h.get();
        int i11 = aVar6.f10340a;
        ExoTrackSelection2.a[] aVarArr2 = new ExoTrackSelection2.a[i11];
        MappingTrackSelector.a aVar7 = aVar6;
        c cVar6 = cVar5;
        int i12 = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (i12 < i11) {
            if (2 == aVar7.f10342c[i12]) {
                if (z5) {
                    cVar3 = cVar5;
                    i8 = i11;
                    aVarArr = aVarArr2;
                    i9 = i12;
                    z3 = z4;
                } else {
                    TrackGroupArray trackGroupArray2 = aVar7.f10343d[i12];
                    int[][] iArr7 = iArr[i12];
                    int i13 = iArr2[i12];
                    if (cVar6.f10264K || cVar6.f10263J) {
                        cVar4 = cVar5;
                        i8 = i11;
                        aVarArr = aVarArr2;
                        i9 = i12;
                        z3 = z4;
                        trackGroupArray = trackGroupArray2;
                        iArr6 = iArr7;
                        aVar5 = null;
                        break;
                    }
                    int i14 = cVar6.f10280x ? 24 : 16;
                    boolean z6 = cVar6.f10279w && (i13 & i14) != 0;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= trackGroupArray2.f9068g) {
                            cVar4 = cVar5;
                            i8 = i11;
                            aVarArr = aVarArr2;
                            i9 = i12;
                            z3 = z4;
                            trackGroupArray = trackGroupArray2;
                            iArr6 = iArr7;
                            aVar5 = null;
                            break;
                        }
                        TrackGroup trackGroup3 = trackGroupArray2.f9069h[i15];
                        int[] iArr8 = iArr7[i15];
                        int i16 = cVar6.f10270n;
                        int i17 = cVar6.f10271o;
                        int i18 = cVar6.f10272p;
                        i8 = i11;
                        int i19 = cVar6.f10273q;
                        z3 = z4;
                        int i20 = cVar6.f10274r;
                        int i21 = cVar6.f10275s;
                        aVarArr = aVarArr2;
                        int i22 = cVar6.f10276t;
                        i9 = i12;
                        int i23 = cVar6.f10277u;
                        iArr6 = iArr7;
                        int i24 = cVar6.f10281y;
                        cVar4 = cVar5;
                        int i25 = cVar6.f10282z;
                        boolean z7 = cVar6.f10254A;
                        trackGroupArray = trackGroupArray2;
                        int i26 = i15;
                        if (trackGroup3.f9064f < 2) {
                            iArrM11011r0 = f10232d;
                        } else {
                            List<Integer> listM4526e = m4526e(trackGroup3, i24, i25, z7);
                            ArrayList arrayList3 = (ArrayList) listM4526e;
                            if (arrayList3.size() < 2) {
                                iArrM11011r0 = f10232d;
                            } else {
                                if (z6) {
                                    list = listM4526e;
                                    arrayList = arrayList3;
                                    str4 = null;
                                } else {
                                    HashSet hashSet2 = new HashSet();
                                    int i27 = 0;
                                    int i28 = 0;
                                    str4 = null;
                                    while (i28 < arrayList3.size()) {
                                        List<Integer> list2 = listM4526e;
                                        String str5 = trackGroup3.f9065g[((Integer) arrayList3.get(i28)).intValue()].f6934q;
                                        if (hashSet2.add(str5)) {
                                            hashSet = hashSet2;
                                            i10 = i28;
                                            int i29 = 0;
                                            int i30 = 0;
                                            while (i30 < arrayList3.size()) {
                                                int iIntValue = ((Integer) arrayList3.get(i30)).intValue();
                                                ArrayList arrayList4 = arrayList3;
                                                if (m4528g(trackGroup3.f9065g[iIntValue], str5, iArr8[iIntValue], i14, i16, i17, i18, i19, i20, i21, i22, i23)) {
                                                    i29++;
                                                }
                                                i30++;
                                                arrayList3 = arrayList4;
                                            }
                                            arrayList2 = arrayList3;
                                            if (i29 > i27) {
                                                str4 = str5;
                                                i27 = i29;
                                            }
                                        } else {
                                            arrayList2 = arrayList3;
                                            hashSet = hashSet2;
                                            i10 = i28;
                                        }
                                        i28 = i10 + 1;
                                        listM4526e = list2;
                                        hashSet2 = hashSet;
                                        arrayList3 = arrayList2;
                                    }
                                    list = listM4526e;
                                    arrayList = arrayList3;
                                }
                                int size = arrayList.size();
                                while (true) {
                                    size--;
                                    if (size < 0) {
                                        break;
                                    }
                                    ArrayList arrayList5 = arrayList;
                                    int iIntValue2 = ((Integer) arrayList5.get(size)).intValue();
                                    if (!m4528g(trackGroup3.f9065g[iIntValue2], str4, iArr8[iIntValue2], i14, i16, i17, i18, i19, i20, i21, i22, i23)) {
                                        arrayList5.remove(size);
                                    }
                                    arrayList = arrayList5;
                                }
                                iArrM11011r0 = arrayList.size() < 2 ? f10232d : C4799a.m11011r0(list);
                            }
                            if (iArrM11011r0.length > 0) {
                                aVar5 = new ExoTrackSelection2.a(trackGroup3, iArrM11011r0);
                                break;
                            }
                            i15 = i26 + 1;
                            i11 = i8;
                            z4 = z3;
                            aVarArr2 = aVarArr;
                            i12 = i9;
                            iArr7 = iArr6;
                            cVar5 = cVar4;
                            cVar6 = cVar5;
                            trackGroupArray2 = trackGroupArray;
                            z6 = z6;
                        }
                        z6 = z6;
                        if (iArrM11011r0.length > 0) {
                            aVar5 = new ExoTrackSelection2.a(trackGroup3, iArrM11011r0);
                            break;
                        }
                        i15 = i26 + 1;
                        i11 = i8;
                        z4 = z3;
                        aVarArr2 = aVarArr;
                        i12 = i9;
                        iArr7 = iArr6;
                        cVar5 = cVar4;
                        cVar6 = cVar5;
                        trackGroupArray2 = trackGroupArray;
                        z6 = z6;
                    }
                    if (aVar5 == null) {
                        TrackGroupArray trackGroupArray3 = trackGroupArray;
                        TrackGroup trackGroup4 = null;
                        g gVar = null;
                        int i31 = 0;
                        int i32 = -1;
                        while (i31 < trackGroupArray3.f9068g) {
                            TrackGroup trackGroup5 = trackGroupArray3.f9069h[i31];
                            c cVar7 = cVar4;
                            List<Integer> listM4526e2 = m4526e(trackGroup5, cVar7.f10281y, cVar7.f10282z, cVar7.f10254A);
                            int[] iArr9 = iArr6[i31];
                            for (int i33 = 0; i33 < trackGroup5.f9064f; i33++) {
                                Format format = trackGroup5.f9065g[i33];
                                if ((format.f6927j & 16384) == 0 && m4527f(iArr9[i33], cVar7.f10265L)) {
                                    g gVar2 = new g(format, cVar7, iArr9[i33], ((ArrayList) listM4526e2).contains(Integer.valueOf(i33)));
                                    if ((gVar2.f10326f || cVar7.f10278v) && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                                        trackGroup4 = trackGroup5;
                                        i32 = i33;
                                        gVar = gVar2;
                                    }
                                }
                            }
                            i31++;
                            cVar4 = cVar7;
                        }
                        cVar3 = cVar4;
                        aVar5 = trackGroup4 == null ? null : new ExoTrackSelection2.a(trackGroup4, i32);
                    } else {
                        cVar3 = cVar4;
                    }
                    aVarArr[i9] = aVar5;
                    z5 = aVarArr[i9] != null;
                    cVar6 = cVar3;
                }
                aVar4 = aVar;
                z4 = z3 | (aVar4.f10343d[i9].f9068g > 0);
                aVar7 = aVar4;
            } else {
                aVar4 = aVar6;
                cVar3 = cVar5;
                i8 = i11;
                aVarArr = aVarArr2;
                i9 = i12;
            }
            i12 = i9 + 1;
            aVar6 = aVar4;
            cVar5 = cVar3;
            i11 = i8;
            aVarArr2 = aVarArr;
        }
        c cVar8 = cVar5;
        ExoTrackSelection2.a[] aVarArr3 = aVarArr2;
        boolean z8 = z4;
        int i34 = i11;
        a aVar8 = null;
        int i35 = 0;
        int i36 = -1;
        String str6 = null;
        while (i35 < i34) {
            if (1 == aVar7.f10342c[i35]) {
                boolean z9 = cVar6.f10267N || !z8;
                TrackGroupArray trackGroupArray4 = aVar7.f10343d[i35];
                int[][] iArr10 = iArr[i35];
                int i37 = iArr2[i35];
                a aVar9 = null;
                int i38 = 0;
                int i39 = -1;
                int i40 = -1;
                while (i38 < trackGroupArray4.f9068g) {
                    TrackGroup trackGroup6 = trackGroupArray4.f9069h[i38];
                    int[] iArr11 = iArr10[i38];
                    int i41 = i39;
                    int i42 = i40;
                    int i43 = 0;
                    while (i43 < trackGroup6.f9064f) {
                        String str7 = str6;
                        if (m4527f(iArr11[i43], cVar6.f10265L)) {
                            trackGroup2 = trackGroup6;
                            a aVar10 = new a(trackGroup6.f9065g[i43], cVar6, iArr11[i43]);
                            if ((aVar10.f10237f || cVar6.f10258E) && (aVar9 == null || aVar10.compareTo(aVar9) > 0)) {
                                i41 = i38;
                                i42 = i43;
                                aVar9 = aVar10;
                            }
                        } else {
                            trackGroup2 = trackGroup6;
                        }
                        i43++;
                        str6 = str7;
                        trackGroup6 = trackGroup2;
                    }
                    i38++;
                    i39 = i41;
                    i40 = i42;
                }
                str2 = str6;
                if (i39 == -1) {
                    i2 = i35;
                    i3 = i34;
                    cVar2 = cVar8;
                    pairCreate2 = null;
                } else {
                    TrackGroup trackGroup7 = trackGroupArray4.f9069h[i39];
                    if (cVar6.f10264K || cVar6.f10263J || !z9) {
                        i2 = i35;
                        i3 = i34;
                        cVar2 = cVar8;
                    } else {
                        int[] iArr12 = iArr10[i39];
                        int i44 = cVar6.f10257D;
                        boolean z10 = cVar6.f10259F;
                        boolean z11 = cVar6.f10260G;
                        boolean z12 = cVar6.f10261H;
                        Format format2 = trackGroup7.f9065g[i40];
                        int[] iArr13 = new int[trackGroup7.f9064f];
                        i3 = i34;
                        cVar2 = cVar8;
                        int i45 = 0;
                        int i46 = 0;
                        while (i46 < trackGroup7.f9064f) {
                            if (i46 != i40) {
                                Format format3 = trackGroup7.f9065g[i46];
                                i4 = i35;
                                iArr5 = iArr12;
                                if (m4527f(iArr12[i46], false) && (i5 = format3.f6930m) != -1 && i5 <= i44 && (z12 || ((i7 = format3.f6915D) != -1 && i7 == format2.f6915D)) && ((z10 || ((str3 = format3.f6934q) != null && TextUtils.equals(str3, format2.f6934q))) && (z11 || ((i6 = format3.f6916E) != -1 && i6 == format2.f6916E)))) {
                                }
                                i46++;
                                i35 = i4;
                                iArr12 = iArr5;
                            } else {
                                i4 = i35;
                                iArr5 = iArr12;
                            }
                            iArr13[i45] = i46;
                            i45++;
                            i46++;
                            i35 = i4;
                            iArr12 = iArr5;
                        }
                        i2 = i35;
                        int[] iArrCopyOf = Arrays.copyOf(iArr13, i45);
                        aVar3 = iArrCopyOf.length > 1 ? new ExoTrackSelection2.a(trackGroup7, iArrCopyOf) : null;
                        if (aVar3 == null) {
                            aVar3 = new ExoTrackSelection2.a(trackGroup7, i40);
                        }
                        Objects.requireNonNull(aVar9);
                        pairCreate2 = Pair.create(aVar3, aVar9);
                    }
                    if (aVar3 == null) {
                        aVar3 = new ExoTrackSelection2.a(trackGroup7, i40);
                    }
                    Objects.requireNonNull(aVar9);
                    pairCreate2 = Pair.create(aVar3, aVar9);
                }
                if (pairCreate2 != null && (aVar8 == null || ((a) pairCreate2.second).compareTo(aVar8) > 0)) {
                    if (i36 != -1) {
                        aVarArr3[i36] = null;
                    }
                    ExoTrackSelection2.a aVar11 = (ExoTrackSelection2.a) pairCreate2.first;
                    aVarArr3[i2] = aVar11;
                    str6 = aVar11.f10333a.f9065g[aVar11.f10334b[0]].f6925h;
                    i36 = i2;
                    aVar8 = (a) pairCreate2.second;
                }
                i35 = i2 + 1;
                aVar7 = aVar;
                i34 = i3;
                cVar8 = cVar2;
                cVar6 = cVar8;
            } else {
                i2 = i35;
                i3 = i34;
                cVar2 = cVar8;
                str2 = str6;
            }
            str6 = str2;
            i35 = i2 + 1;
            aVar7 = aVar;
            i34 = i3;
            cVar8 = cVar2;
            cVar6 = cVar8;
        }
        c cVar9 = cVar8;
        String str8 = str6;
        int i47 = i34;
        f fVar = null;
        int i48 = 0;
        int i49 = -1;
        while (i48 < i47) {
            int i50 = aVar.f10342c[i48];
            if (i50 == 1 || i50 == 2) {
                cVar = cVar9;
            } else {
                if (i50 != 3) {
                    TrackGroupArray trackGroupArray5 = aVar.f10343d[i48];
                    int[][] iArr14 = iArr[i48];
                    TrackGroup trackGroup8 = null;
                    b bVar = null;
                    int i51 = 0;
                    for (int i52 = 0; i52 < trackGroupArray5.f9068g; i52++) {
                        TrackGroup trackGroup9 = trackGroupArray5.f9069h[i52];
                        int[] iArr15 = iArr14[i52];
                        int i53 = 0;
                        while (i53 < trackGroup9.f9064f) {
                            TrackGroupArray trackGroupArray6 = trackGroupArray5;
                            c cVar10 = cVar9;
                            if (m4527f(iArr15[i53], cVar10.f10265L)) {
                                iArr4 = iArr14;
                                b bVar2 = new b(trackGroup9.f9065g[i53], iArr15[i53]);
                                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                                    trackGroup8 = trackGroup9;
                                    i51 = i53;
                                    bVar = bVar2;
                                }
                            } else {
                                iArr4 = iArr14;
                            }
                            i53++;
                            trackGroupArray5 = trackGroupArray6;
                            cVar9 = cVar10;
                            iArr14 = iArr4;
                        }
                    }
                    cVar = cVar9;
                    aVarArr3[i48] = trackGroup8 == null ? null : new ExoTrackSelection2.a(trackGroup8, i51);
                } else {
                    cVar = cVar9;
                    TrackGroupArray trackGroupArray7 = aVar.f10343d[i48];
                    int[][] iArr16 = iArr[i48];
                    int i54 = 0;
                    TrackGroup trackGroup10 = null;
                    f fVar2 = null;
                    int i55 = -1;
                    while (i54 < trackGroupArray7.f9068g) {
                        TrackGroup trackGroup11 = trackGroupArray7.f9069h[i54];
                        int[] iArr17 = iArr16[i54];
                        int i56 = i55;
                        f fVar3 = fVar2;
                        TrackGroup trackGroup12 = trackGroup10;
                        int i57 = 0;
                        while (i57 < trackGroup11.f9064f) {
                            TrackGroupArray trackGroupArray8 = trackGroupArray7;
                            if (m4527f(iArr17[i57], cVar.f10265L)) {
                                iArr3 = iArr16;
                                trackGroup = trackGroup11;
                                str = str8;
                                f fVar4 = new f(trackGroup11.f9065g[i57], cVar, iArr17[i57], str);
                                if (fVar4.f10317f && (fVar3 == null || fVar4.compareTo(fVar3) > 0)) {
                                    i56 = i57;
                                    fVar3 = fVar4;
                                    trackGroup12 = trackGroup;
                                }
                            } else {
                                iArr3 = iArr16;
                                trackGroup = trackGroup11;
                                str = str8;
                            }
                            i57++;
                            trackGroupArray7 = trackGroupArray8;
                            str8 = str;
                            iArr16 = iArr3;
                            trackGroup11 = trackGroup;
                        }
                        i54++;
                        trackGroup10 = trackGroup12;
                        fVar2 = fVar3;
                        i55 = i56;
                    }
                    str8 = str8;
                    if (trackGroup10 == null) {
                        pairCreate = null;
                    } else {
                        ExoTrackSelection2.a aVar12 = new ExoTrackSelection2.a(trackGroup10, i55);
                        Objects.requireNonNull(fVar2);
                        pairCreate = Pair.create(aVar12, fVar2);
                    }
                    if (pairCreate != null && (fVar == null || ((f) pairCreate.second).compareTo(fVar) > 0)) {
                        if (i49 != -1) {
                            aVarArr3[i49] = null;
                        }
                        aVarArr3[i48] = (ExoTrackSelection2.a) pairCreate.first;
                        fVar = (f) pairCreate.second;
                        i49 = i48;
                    }
                }
                i48++;
                str8 = str8;
                cVar9 = cVar;
            }
            i48++;
            str8 = str8;
            cVar9 = cVar;
        }
        c cVar11 = cVar9;
        boolean z13 = false;
        for (int i58 = 0; i58 < i47; i58++) {
            if (cVar11.f10269P.get(i58)) {
                aVarArr3[i58] = null;
            } else {
                TrackGroupArray trackGroupArray9 = aVar.f10343d[i58];
                if (cVar11.m4533a(i58, trackGroupArray9)) {
                    Map<TrackGroupArray, e> map = cVar11.f10268O.get(i58);
                    e eVar = map != null ? map.get(trackGroupArray9) : null;
                    aVarArr3[i58] = eVar == null ? null : new ExoTrackSelection2.a(trackGroupArray9.f9069h[eVar.f10312f], eVar.f10313g, eVar.f10315i, Integer.valueOf(eVar.f10316j));
                }
            }
        }
        ExoTrackSelection2.b bVar3 = this.f10235g;
        BandwidthMeter bandwidthMeter = this.f10364b;
        Objects.requireNonNull(bandwidthMeter);
        ExoTrackSelection2[] exoTrackSelection2ArrMo4511a = bVar3.mo4511a(aVarArr3, bandwidthMeter, aVar2, timeline);
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[i47];
        for (int i59 = 0; i59 < i47; i59++) {
            rendererConfigurationArr[i59] = !cVar11.f10269P.get(i59) && (aVar.f10342c[i59] == 7 || exoTrackSelection2ArrMo4511a[i59] != null) ? RendererConfiguration.f6664a : null;
        }
        if (cVar11.f10266M) {
            int i60 = 0;
            int i61 = -1;
            int i62 = -1;
            while (true) {
                if (i60 >= aVar.f10340a) {
                    i = -1;
                    z = true;
                    break;
                }
                int i63 = aVar.f10342c[i60];
                ExoTrackSelection2 exoTrackSelection2 = exoTrackSelection2ArrMo4511a[i60];
                if (i63 == 1 || i63 == 2) {
                    if (exoTrackSelection2 != null) {
                        int[][] iArr18 = iArr[i60];
                        int iM4193a = aVar.f10343d[i60].m4193a(exoTrackSelection2.mo4512a());
                        int i64 = 0;
                        while (true) {
                            if (i64 >= exoTrackSelection2.length()) {
                                z2 = true;
                                break;
                            }
                            if ((iArr18[iM4193a][exoTrackSelection2.mo4517i(i64)] & 32) != 32) {
                                z2 = false;
                                break;
                            }
                            i64++;
                        }
                        if (z2) {
                            if (i63 == 1) {
                                i = -1;
                                if (i62 != -1) {
                                    z = false;
                                    break;
                                }
                                i62 = i60;
                            } else {
                                i = -1;
                                if (i61 != -1) {
                                    z = false;
                                    break;
                                }
                                i61 = i60;
                            }
                        }
                    }
                }
                i60++;
            }
            if (i62 != i && i61 != i) {
                z13 = true;
            }
            if (z & z13) {
                RendererConfiguration rendererConfiguration = new RendererConfiguration(true);
                rendererConfigurationArr[i62] = rendererConfiguration;
                rendererConfigurationArr[i61] = rendererConfiguration;
            }
        }
        return Pair.create(rendererConfigurationArr, exoTrackSelection2ArrMo4511a);
    }

    /* JADX INFO: renamed from: c.n.b.b.y1.f$d */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class d extends TrackSelectionParameters.b {

        /* JADX INFO: renamed from: A */
        public boolean f10283A;

        /* JADX INFO: renamed from: B */
        public ImmutableList2<String> f10284B;

        /* JADX INFO: renamed from: C */
        public boolean f10285C;

        /* JADX INFO: renamed from: D */
        public boolean f10286D;

        /* JADX INFO: renamed from: E */
        public boolean f10287E;

        /* JADX INFO: renamed from: F */
        public boolean f10288F;

        /* JADX INFO: renamed from: G */
        public boolean f10289G;

        /* JADX INFO: renamed from: H */
        public final SparseArray<Map<TrackGroupArray, e>> f10290H;

        /* JADX INFO: renamed from: I */
        public final SparseBooleanArray f10291I;

        /* JADX INFO: renamed from: g */
        public int f10292g;

        /* JADX INFO: renamed from: h */
        public int f10293h;

        /* JADX INFO: renamed from: i */
        public int f10294i;

        /* JADX INFO: renamed from: j */
        public int f10295j;

        /* JADX INFO: renamed from: k */
        public int f10296k;

        /* JADX INFO: renamed from: l */
        public int f10297l;

        /* JADX INFO: renamed from: m */
        public int f10298m;

        /* JADX INFO: renamed from: n */
        public int f10299n;

        /* JADX INFO: renamed from: o */
        public boolean f10300o;

        /* JADX INFO: renamed from: p */
        public boolean f10301p;

        /* JADX INFO: renamed from: q */
        public boolean f10302q;

        /* JADX INFO: renamed from: r */
        public int f10303r;

        /* JADX INFO: renamed from: s */
        public int f10304s;

        /* JADX INFO: renamed from: t */
        public boolean f10305t;

        /* JADX INFO: renamed from: u */
        public ImmutableList2<String> f10306u;

        /* JADX INFO: renamed from: v */
        public int f10307v;

        /* JADX INFO: renamed from: w */
        public int f10308w;

        /* JADX INFO: renamed from: x */
        public boolean f10309x;

        /* JADX INFO: renamed from: y */
        public boolean f10310y;

        /* JADX INFO: renamed from: z */
        public boolean f10311z;

        @Deprecated
        public d() {
            m4536c();
            this.f10290H = new SparseArray<>();
            this.f10291I = new SparseBooleanArray();
        }

        @Override // p007c.p190n.p194b.p209b.p262y1.TrackSelectionParameters.b
        /* JADX INFO: renamed from: a */
        public TrackSelectionParameters.b mo4534a(Context context) {
            super.mo4534a(context);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public c m4535b() {
            return new c(this.f10292g, this.f10293h, this.f10294i, this.f10295j, this.f10296k, this.f10297l, this.f10298m, this.f10299n, this.f10300o, this.f10301p, this.f10302q, this.f10303r, this.f10304s, this.f10305t, this.f10306u, this.f10357a, this.f10358b, this.f10307v, this.f10308w, this.f10309x, this.f10310y, this.f10311z, this.f10283A, this.f10284B, this.f10359c, this.f10360d, this.f10361e, this.f10362f, this.f10285C, this.f10286D, this.f10287E, this.f10288F, this.f10289G, this.f10290H, this.f10291I);
        }

        @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioMimeTypes"})
        /* JADX INFO: renamed from: c */
        public final void m4536c() {
            this.f10292g = Integer.MAX_VALUE;
            this.f10293h = Integer.MAX_VALUE;
            this.f10294i = Integer.MAX_VALUE;
            this.f10295j = Integer.MAX_VALUE;
            this.f10300o = true;
            this.f10301p = false;
            this.f10302q = true;
            this.f10303r = Integer.MAX_VALUE;
            this.f10304s = Integer.MAX_VALUE;
            this.f10305t = true;
            AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
            ImmutableList2 immutableList2 = RegularImmutableList.f26218h;
            this.f10306u = immutableList2;
            this.f10307v = Integer.MAX_VALUE;
            this.f10308w = Integer.MAX_VALUE;
            this.f10309x = true;
            this.f10310y = false;
            this.f10311z = false;
            this.f10283A = false;
            this.f10284B = immutableList2;
            this.f10285C = false;
            this.f10286D = false;
            this.f10287E = true;
            this.f10288F = false;
            this.f10289G = true;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:35:0x00da  */
        public d(Context context) {
            Point point;
            int i;
            String strM3092A;
            super(context);
            m4536c();
            this.f10290H = new SparseArray<>();
            this.f10291I = new SparseBooleanArray();
            int i2 = Util6.f6307a;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            int i3 = Util6.f6307a;
            if (i3 <= 29 && defaultDisplay.getDisplayId() == 0 && Util6.m3098G(context)) {
                if ("Sony".equals(Util6.f6309c) && Util6.f6310d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point = new Point(3840, 2160);
                } else {
                    if (i3 < 28) {
                        strM3092A = Util6.m3092A("sys.display-size");
                    } else {
                        strM3092A = Util6.m3092A("vendor.display-size");
                    }
                    if (!TextUtils.isEmpty(strM3092A)) {
                        try {
                            String[] strArrM3106O = Util6.m3106O(strM3092A.trim(), "x");
                            if (strArrM3106O.length == 2) {
                                int i4 = Integer.parseInt(strArrM3106O[0]);
                                int i5 = Integer.parseInt(strArrM3106O[1]);
                                if (i4 > 0 && i5 > 0) {
                                    point = new Point(i4, i5);
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                        Log.e("Util", "Invalid display size: " + strM3092A);
                        point = new Point();
                        i = Util6.f6307a;
                        if (i >= 23) {
                            Display.Mode mode = defaultDisplay.getMode();
                            point.x = mode.getPhysicalWidth();
                            point.y = mode.getPhysicalHeight();
                        } else if (i >= 17) {
                            defaultDisplay.getRealSize(point);
                        } else {
                            defaultDisplay.getSize(point);
                        }
                    } else {
                        point = new Point();
                        i = Util6.f6307a;
                        if (i >= 23) {
                            Display.Mode mode2 = defaultDisplay.getMode();
                            point.x = mode2.getPhysicalWidth();
                            point.y = mode2.getPhysicalHeight();
                        } else if (i >= 17) {
                            defaultDisplay.getRealSize(point);
                        } else {
                            defaultDisplay.getSize(point);
                        }
                    }
                }
            } else {
                point = new Point();
                i = Util6.f6307a;
                if (i >= 23) {
                    Display.Mode mode3 = defaultDisplay.getMode();
                    point.x = mode3.getPhysicalWidth();
                    point.y = mode3.getPhysicalHeight();
                } else if (i >= 17) {
                    defaultDisplay.getRealSize(point);
                } else {
                    defaultDisplay.getSize(point);
                }
            }
            int i6 = point.x;
            int i7 = point.y;
            this.f10303r = i6;
            this.f10304s = i7;
            this.f10305t = true;
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
        this(c.f10253m, new AdaptiveTrackSelection.b());
    }

    @Deprecated
    public DefaultTrackSelector(ExoTrackSelection2.b bVar) {
        this(c.f10253m, bVar);
    }

    public DefaultTrackSelector(Context context) {
        this(context, new AdaptiveTrackSelection.b());
    }

    public DefaultTrackSelector(c cVar, ExoTrackSelection2.b bVar) {
        this.f10235g = bVar;
        this.f10236h = new AtomicReference<>(cVar);
    }

    /* JADX INFO: renamed from: c.n.b.b.y1.f$c */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class c extends TrackSelectionParameters {

        /* JADX INFO: renamed from: A */
        public final boolean f10254A;

        /* JADX INFO: renamed from: B */
        public final ImmutableList2<String> f10255B;

        /* JADX INFO: renamed from: C */
        public final int f10256C;

        /* JADX INFO: renamed from: D */
        public final int f10257D;

        /* JADX INFO: renamed from: E */
        public final boolean f10258E;

        /* JADX INFO: renamed from: F */
        public final boolean f10259F;

        /* JADX INFO: renamed from: G */
        public final boolean f10260G;

        /* JADX INFO: renamed from: H */
        public final boolean f10261H;

        /* JADX INFO: renamed from: I */
        public final ImmutableList2<String> f10262I;

        /* JADX INFO: renamed from: J */
        public final boolean f10263J;

        /* JADX INFO: renamed from: K */
        public final boolean f10264K;

        /* JADX INFO: renamed from: L */
        public final boolean f10265L;

        /* JADX INFO: renamed from: M */
        public final boolean f10266M;

        /* JADX INFO: renamed from: N */
        public final boolean f10267N;

        /* JADX INFO: renamed from: O */
        public final SparseArray<Map<TrackGroupArray, e>> f10268O;

        /* JADX INFO: renamed from: P */
        public final SparseBooleanArray f10269P;

        /* JADX INFO: renamed from: n */
        public final int f10270n;

        /* JADX INFO: renamed from: o */
        public final int f10271o;

        /* JADX INFO: renamed from: p */
        public final int f10272p;

        /* JADX INFO: renamed from: q */
        public final int f10273q;

        /* JADX INFO: renamed from: r */
        public final int f10274r;

        /* JADX INFO: renamed from: s */
        public final int f10275s;

        /* JADX INFO: renamed from: t */
        public final int f10276t;

        /* JADX INFO: renamed from: u */
        public final int f10277u;

        /* JADX INFO: renamed from: v */
        public final boolean f10278v;

        /* JADX INFO: renamed from: w */
        public final boolean f10279w;

        /* JADX INFO: renamed from: x */
        public final boolean f10280x;

        /* JADX INFO: renamed from: y */
        public final int f10281y;

        /* JADX INFO: renamed from: z */
        public final int f10282z;

        /* JADX INFO: renamed from: m */
        public static final c f10253m = new d().m4535b();
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: c.n.b.b.y1.f$c$a */
        /* JADX INFO: compiled from: DefaultTrackSelector.java */
        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, int i9, int i10, boolean z4, ImmutableList2<String> immutableList2, ImmutableList2<String> immutableList3, int i11, int i12, int i13, boolean z5, boolean z6, boolean z7, boolean z8, ImmutableList2<String> immutableList4, ImmutableList2<String> immutableList5, int i14, boolean z9, int i15, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, SparseArray<Map<TrackGroupArray, e>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(immutableList3, i11, immutableList5, i14, z9, i15);
            this.f10270n = i;
            this.f10271o = i2;
            this.f10272p = i3;
            this.f10273q = i4;
            this.f10274r = i5;
            this.f10275s = i6;
            this.f10276t = i7;
            this.f10277u = i8;
            this.f10278v = z;
            this.f10279w = z2;
            this.f10280x = z3;
            this.f10281y = i9;
            this.f10282z = i10;
            this.f10254A = z4;
            this.f10255B = immutableList2;
            this.f10256C = i12;
            this.f10257D = i13;
            this.f10258E = z5;
            this.f10259F = z6;
            this.f10260G = z7;
            this.f10261H = z8;
            this.f10262I = immutableList4;
            this.f10263J = z10;
            this.f10264K = z11;
            this.f10265L = z12;
            this.f10266M = z13;
            this.f10267N = z14;
            this.f10268O = sparseArray;
            this.f10269P = sparseBooleanArray;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m4533a(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, e> map = this.f10268O.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        @Override // p007c.p190n.p194b.p209b.p262y1.TrackSelectionParameters, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // p007c.p190n.p194b.p209b.p262y1.TrackSelectionParameters
        public boolean equals(Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (super.equals(obj) && this.f10270n == cVar.f10270n && this.f10271o == cVar.f10271o && this.f10272p == cVar.f10272p && this.f10273q == cVar.f10273q && this.f10274r == cVar.f10274r && this.f10275s == cVar.f10275s && this.f10276t == cVar.f10276t && this.f10277u == cVar.f10277u && this.f10278v == cVar.f10278v && this.f10279w == cVar.f10279w && this.f10280x == cVar.f10280x && this.f10254A == cVar.f10254A && this.f10281y == cVar.f10281y && this.f10282z == cVar.f10282z && this.f10255B.equals(cVar.f10255B) && this.f10256C == cVar.f10256C && this.f10257D == cVar.f10257D && this.f10258E == cVar.f10258E && this.f10259F == cVar.f10259F && this.f10260G == cVar.f10260G && this.f10261H == cVar.f10261H && this.f10262I.equals(cVar.f10262I) && this.f10263J == cVar.f10263J && this.f10264K == cVar.f10264K && this.f10265L == cVar.f10265L && this.f10266M == cVar.f10266M && this.f10267N == cVar.f10267N) {
                SparseBooleanArray sparseBooleanArray = this.f10269P;
                SparseBooleanArray sparseBooleanArray2 = cVar.f10269P;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = true;
                            break;
                        }
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            z = false;
                            break;
                        }
                        i++;
                    }
                } else {
                    z = false;
                    break;
                }
                if (z) {
                    SparseArray<Map<TrackGroupArray, e>> sparseArray = this.f10268O;
                    SparseArray<Map<TrackGroupArray, e>> sparseArray2 = cVar.f10268O;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() != size2) {
                        z2 = false;
                    } else {
                        int i2 = 0;
                        while (true) {
                            if (i2 < size2) {
                                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (iIndexOfKey < 0) {
                                    break;
                                }
                                Map<TrackGroupArray, e> mapValueAt = sparseArray.valueAt(i2);
                                Map<TrackGroupArray, e> mapValueAt2 = sparseArray2.valueAt(iIndexOfKey);
                                if (mapValueAt2.size() == mapValueAt.size()) {
                                    Iterator<Map.Entry<TrackGroupArray, e>> it = mapValueAt.entrySet().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z3 = true;
                                            break;
                                        }
                                        Map.Entry<TrackGroupArray, e> next = it.next();
                                        TrackGroupArray key = next.getKey();
                                        if (!mapValueAt2.containsKey(key) || !Util6.m3113a(next.getValue(), mapValueAt2.get(key))) {
                                            z3 = false;
                                            break;
                                        }
                                    }
                                } else {
                                    z3 = false;
                                    break;
                                }
                                if (!z3) {
                                    break;
                                }
                                i2++;
                            } else {
                                z2 = true;
                            }
                        }
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // p007c.p190n.p194b.p209b.p262y1.TrackSelectionParameters
        public int hashCode() {
            return ((((((((((this.f10262I.hashCode() + ((((((((((((((this.f10255B.hashCode() + (((((((((((((((((((((((((((((super.hashCode() * 31) + this.f10270n) * 31) + this.f10271o) * 31) + this.f10272p) * 31) + this.f10273q) * 31) + this.f10274r) * 31) + this.f10275s) * 31) + this.f10276t) * 31) + this.f10277u) * 31) + (this.f10278v ? 1 : 0)) * 31) + (this.f10279w ? 1 : 0)) * 31) + (this.f10280x ? 1 : 0)) * 31) + (this.f10254A ? 1 : 0)) * 31) + this.f10281y) * 31) + this.f10282z) * 31)) * 31) + this.f10256C) * 31) + this.f10257D) * 31) + (this.f10258E ? 1 : 0)) * 31) + (this.f10259F ? 1 : 0)) * 31) + (this.f10260G ? 1 : 0)) * 31) + (this.f10261H ? 1 : 0)) * 31)) * 31) + (this.f10263J ? 1 : 0)) * 31) + (this.f10264K ? 1 : 0)) * 31) + (this.f10265L ? 1 : 0)) * 31) + (this.f10266M ? 1 : 0)) * 31) + (this.f10267N ? 1 : 0);
        }

        @Override // p007c.p190n.p194b.p209b.p262y1.TrackSelectionParameters, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10270n);
            parcel.writeInt(this.f10271o);
            parcel.writeInt(this.f10272p);
            parcel.writeInt(this.f10273q);
            parcel.writeInt(this.f10274r);
            parcel.writeInt(this.f10275s);
            parcel.writeInt(this.f10276t);
            parcel.writeInt(this.f10277u);
            boolean z = this.f10278v;
            int i2 = Util6.f6307a;
            parcel.writeInt(z ? 1 : 0);
            parcel.writeInt(this.f10279w ? 1 : 0);
            parcel.writeInt(this.f10280x ? 1 : 0);
            parcel.writeInt(this.f10281y);
            parcel.writeInt(this.f10282z);
            parcel.writeInt(this.f10254A ? 1 : 0);
            parcel.writeList(this.f10255B);
            parcel.writeInt(this.f10256C);
            parcel.writeInt(this.f10257D);
            parcel.writeInt(this.f10258E ? 1 : 0);
            parcel.writeInt(this.f10259F ? 1 : 0);
            parcel.writeInt(this.f10260G ? 1 : 0);
            parcel.writeInt(this.f10261H ? 1 : 0);
            parcel.writeList(this.f10262I);
            parcel.writeInt(this.f10263J ? 1 : 0);
            parcel.writeInt(this.f10264K ? 1 : 0);
            parcel.writeInt(this.f10265L ? 1 : 0);
            parcel.writeInt(this.f10266M ? 1 : 0);
            parcel.writeInt(this.f10267N ? 1 : 0);
            SparseArray<Map<TrackGroupArray, e>> sparseArray = this.f10268O;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = sparseArray.keyAt(i3);
                Map<TrackGroupArray, e> mapValueAt = sparseArray.valueAt(i3);
                int size2 = mapValueAt.size();
                parcel.writeInt(iKeyAt);
                parcel.writeInt(size2);
                for (Map.Entry<TrackGroupArray, e> entry : mapValueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.f10269P);
        }

        public c(Parcel parcel) {
            super(parcel);
            this.f10270n = parcel.readInt();
            this.f10271o = parcel.readInt();
            this.f10272p = parcel.readInt();
            this.f10273q = parcel.readInt();
            this.f10274r = parcel.readInt();
            this.f10275s = parcel.readInt();
            this.f10276t = parcel.readInt();
            this.f10277u = parcel.readInt();
            int i = Util6.f6307a;
            this.f10278v = parcel.readInt() != 0;
            this.f10279w = parcel.readInt() != 0;
            this.f10280x = parcel.readInt() != 0;
            this.f10281y = parcel.readInt();
            this.f10282z = parcel.readInt();
            this.f10254A = parcel.readInt() != 0;
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, null);
            this.f10255B = ImmutableList2.m11642x(arrayList);
            this.f10256C = parcel.readInt();
            this.f10257D = parcel.readInt();
            this.f10258E = parcel.readInt() != 0;
            this.f10259F = parcel.readInt() != 0;
            this.f10260G = parcel.readInt() != 0;
            this.f10261H = parcel.readInt() != 0;
            ArrayList arrayList2 = new ArrayList();
            parcel.readList(arrayList2, null);
            this.f10262I = ImmutableList2.m11642x(arrayList2);
            this.f10263J = parcel.readInt() != 0;
            this.f10264K = parcel.readInt() != 0;
            this.f10265L = parcel.readInt() != 0;
            this.f10266M = parcel.readInt() != 0;
            this.f10267N = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            SparseArray<Map<TrackGroupArray, e>> sparseArray = new SparseArray<>(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                HashMap map = new HashMap(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    TrackGroupArray trackGroupArray = (TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader());
                    Objects.requireNonNull(trackGroupArray);
                    map.put(trackGroupArray, (e) parcel.readParcelable(e.class.getClassLoader()));
                }
                sparseArray.put(i4, map);
            }
            this.f10268O = sparseArray;
            this.f10269P = parcel.readSparseBooleanArray();
        }
    }
}
