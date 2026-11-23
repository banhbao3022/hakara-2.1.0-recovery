package p477d1.p481d0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import p477d1.Tuples;
import p477d1.p478a0.Ranges;
import p477d1.p478a0._Ranges;
import p477d1.p480c0.Sequence;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.p496v.KMarkers;

/* JADX INFO: renamed from: d1.d0.d, reason: use source file name */
/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Strings implements Sequence<Ranges> {

    /* JADX INFO: renamed from: a */
    public final CharSequence f29456a;

    /* JADX INFO: renamed from: b */
    public final int f29457b;

    /* JADX INFO: renamed from: c */
    public final int f29458c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6168p<CharSequence, Integer, Tuples<Integer, Integer>> f29459d;

    /* JADX INFO: renamed from: d1.d0.d$a */
    /* JADX INFO: compiled from: Strings.kt */
    public static final class a implements Iterator<Ranges>, KMarkers {

        /* JADX INFO: renamed from: f */
        public int f29460f = -1;

        /* JADX INFO: renamed from: g */
        public int f29461g;

        /* JADX INFO: renamed from: h */
        public int f29462h;

        /* JADX INFO: renamed from: i */
        public Ranges f29463i;

        /* JADX INFO: renamed from: j */
        public int f29464j;

        public a() {
            int iM12967b = _Ranges.m12967b(Strings.this.f29457b, 0, Strings.this.f29456a.length());
            this.f29461g = iM12967b;
            this.f29462h = iM12967b;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0023  */
        /* JADX WARN: Code duplicated, block: B:12:0x0037  */
        /* JADX WARN: Code duplicated, block: B:14:0x004b  */
        /* JADX WARN: Code duplicated, block: B:15:0x005f  */
        /* JADX WARN: Code duplicated, block: B:17:0x007c  */
        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        /* JADX INFO: renamed from: a */
        public final void m12981a() {
            Tuples<Integer, Integer> tuplesMo5l;
            int i = this.f29462h;
            if (i < 0) {
                this.f29460f = 0;
                this.f29463i = null;
                return;
            }
            Strings strings = Strings.this;
            int i2 = strings.f29458c;
            if (i2 > 0) {
                int i3 = this.f29464j + 1;
                this.f29464j = i3;
                if (i3 >= i2) {
                    this.f29463i = new Ranges(this.f29461g, Strings5.m13007q(Strings.this.f29456a));
                    this.f29462h = -1;
                } else if (i > strings.f29456a.length()) {
                    this.f29463i = new Ranges(this.f29461g, Strings5.m13007q(Strings.this.f29456a));
                    this.f29462h = -1;
                } else {
                    Strings strings2 = Strings.this;
                    tuplesMo5l = strings2.f29459d.mo5l(strings2.f29456a, Integer.valueOf(this.f29462h));
                    if (tuplesMo5l == null) {
                        this.f29463i = new Ranges(this.f29461g, Strings5.m13007q(Strings.this.f29456a));
                        this.f29462h = -1;
                    } else {
                        int iIntValue = tuplesMo5l.f29491f.intValue();
                        int iIntValue2 = tuplesMo5l.f29492g.intValue();
                        this.f29463i = _Ranges.m12970e(this.f29461g, iIntValue);
                        int i4 = iIntValue + iIntValue2;
                        this.f29461g = i4;
                        this.f29462h = i4 + (iIntValue2 == 0 ? 1 : 0);
                    }
                }
            } else if (i > strings.f29456a.length()) {
                this.f29463i = new Ranges(this.f29461g, Strings5.m13007q(Strings.this.f29456a));
                this.f29462h = -1;
            } else {
                Strings strings3 = Strings.this;
                tuplesMo5l = strings3.f29459d.mo5l(strings3.f29456a, Integer.valueOf(this.f29462h));
                if (tuplesMo5l == null) {
                    this.f29463i = new Ranges(this.f29461g, Strings5.m13007q(Strings.this.f29456a));
                    this.f29462h = -1;
                } else {
                    int iIntValue3 = tuplesMo5l.f29491f.intValue();
                    int iIntValue4 = tuplesMo5l.f29492g.intValue();
                    this.f29463i = _Ranges.m12970e(this.f29461g, iIntValue3);
                    int i5 = iIntValue3 + iIntValue4;
                    this.f29461g = i5;
                    this.f29462h = i5 + (iIntValue4 == 0 ? 1 : 0);
                }
            }
            this.f29460f = 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f29460f == -1) {
                m12981a();
            }
            return this.f29460f == 1;
        }

        @Override // java.util.Iterator
        public Ranges next() {
            if (this.f29460f == -1) {
                m12981a();
            }
            if (this.f29460f == 0) {
                throw new NoSuchElementException();
            }
            Ranges ranges = this.f29463i;
            Objects.requireNonNull(ranges, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f29463i = null;
            this.f29460f = -1;
            return ranges;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Strings(CharSequence charSequence, int i, int i2, InterfaceC6168p<? super CharSequence, ? super Integer, Tuples<Integer, Integer>> interfaceC6168p) {
        Intrinsics2.m13089e(charSequence, "input");
        Intrinsics2.m13089e(interfaceC6168p, "getNextMatch");
        this.f29456a = charSequence;
        this.f29457b = i;
        this.f29458c = i2;
        this.f29459d = interfaceC6168p;
    }

    @Override // p477d1.p480c0.Sequence
    public Iterator<Ranges> iterator() {
        return new a();
    }
}
