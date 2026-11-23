package p636z0.p774z.p775b;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p636z0.p725k.p738k.Pools2;
import p636z0.p725k.p738k.Pools3;

/* JADX INFO: renamed from: z0.z.b.a, reason: use source file name */
/* JADX INFO: compiled from: AdapterHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class AdapterHelper implements OpReorderer.a {

    /* JADX INFO: renamed from: d */
    public final a f39128d;

    /* JADX INFO: renamed from: a */
    public Pools2<b> f39125a = new Pools3(30);

    /* JADX INFO: renamed from: b */
    public final ArrayList<b> f39126b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<b> f39127c = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public int f39130f = 0;

    /* JADX INFO: renamed from: e */
    public final OpReorderer f39129e = new OpReorderer(this);

    /* JADX INFO: renamed from: z0.z.b.a$a */
    /* JADX INFO: compiled from: AdapterHelper.java */
    public interface a {
    }

    /* JADX INFO: renamed from: z0.z.b.a$b */
    /* JADX INFO: compiled from: AdapterHelper.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public int f39131a;

        /* JADX INFO: renamed from: b */
        public int f39132b;

        /* JADX INFO: renamed from: c */
        public Object f39133c;

        /* JADX INFO: renamed from: d */
        public int f39134d;

        public b(int i, int i2, int i3, Object obj) {
            this.f39131a = i;
            this.f39132b = i2;
            this.f39134d = i3;
            this.f39133c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f39131a;
            if (i != bVar.f39131a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f39134d - this.f39132b) == 1 && this.f39134d == bVar.f39132b && this.f39132b == bVar.f39134d) {
                return true;
            }
            if (this.f39134d != bVar.f39134d || this.f39132b != bVar.f39132b) {
                return false;
            }
            Object obj2 = this.f39133c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f39133c)) {
                    return false;
                }
            } else if (bVar.f39133c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f39131a * 31) + this.f39132b) * 31) + this.f39134d;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f39131a;
            if (i == 1) {
                str = "add";
            } else if (i == 2) {
                str = "rm";
            } else if (i != 4) {
                str = i != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.f39132b);
            sb.append("c:");
            sb.append(this.f39134d);
            sb.append(",p:");
            sb.append(this.f39133c);
            sb.append("]");
            return sb.toString();
        }
    }

    public AdapterHelper(a aVar) {
        this.f39128d = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16960a(int i) {
        int size = this.f39127c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f39127c.get(i2);
            int i3 = bVar.f39131a;
            if (i3 == 8) {
                if (m16965f(bVar.f39134d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f39132b;
                int i5 = bVar.f39134d + i4;
                while (i4 < i5) {
                    if (m16965f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m16961b() {
        int size = this.f39127c.size();
        for (int i = 0; i < size; i++) {
            ((RecyclerView3) this.f39128d).m16980a(this.f39127c.get(i));
        }
        m16971l(this.f39127c);
        this.f39130f = 0;
    }

    /* JADX INFO: renamed from: c */
    public void m16962c() {
        m16961b();
        int size = this.f39126b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f39126b.get(i);
            int i2 = bVar.f39131a;
            if (i2 == 1) {
                ((RecyclerView3) this.f39128d).m16980a(bVar);
                ((RecyclerView3) this.f39128d).m16983d(bVar.f39132b, bVar.f39134d);
            } else if (i2 == 2) {
                ((RecyclerView3) this.f39128d).m16980a(bVar);
                a aVar = this.f39128d;
                int i3 = bVar.f39132b;
                int i4 = bVar.f39134d;
                RecyclerView3 recyclerView3 = (RecyclerView3) aVar;
                recyclerView3.f39137a.m589R(i3, i4, true);
                RecyclerView recyclerView = recyclerView3.f39137a;
                recyclerView.f986w0 = true;
                recyclerView.f980t0.f1096c += i4;
            } else if (i2 == 4) {
                ((RecyclerView3) this.f39128d).m16980a(bVar);
                ((RecyclerView3) this.f39128d).m16982c(bVar.f39132b, bVar.f39134d, bVar.f39133c);
            } else if (i2 == 8) {
                ((RecyclerView3) this.f39128d).m16980a(bVar);
                ((RecyclerView3) this.f39128d).m16984e(bVar.f39132b, bVar.f39134d);
            }
        }
        m16971l(this.f39126b);
        this.f39130f = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m16963d(b bVar) {
        int i;
        int i2 = bVar.f39131a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM16972m = m16972m(bVar.f39132b, i2);
        int i3 = bVar.f39132b;
        int i4 = bVar.f39131a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f39134d; i6++) {
            int iM16972m2 = m16972m((i * i6) + bVar.f39132b, bVar.f39131a);
            int i7 = bVar.f39131a;
            if (i7 == 2 ? iM16972m2 == iM16972m : i7 == 4 && iM16972m2 == iM16972m + 1) {
                i5++;
            } else {
                b bVarM16967h = m16967h(i7, iM16972m, i5, bVar.f39133c);
                m16964e(bVarM16967h, i3);
                m16970k(bVarM16967h);
                if (bVar.f39131a == 4) {
                    i3 += i5;
                }
                iM16972m = iM16972m2;
                i5 = 1;
            }
        }
        Object obj = bVar.f39133c;
        m16970k(bVar);
        if (i5 > 0) {
            b bVarM16967h2 = m16967h(bVar.f39131a, iM16972m, i5, obj);
            m16964e(bVarM16967h2, i3);
            m16970k(bVarM16967h2);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m16964e(b bVar, int i) {
        ((RecyclerView3) this.f39128d).m16980a(bVar);
        int i2 = bVar.f39131a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            ((RecyclerView3) this.f39128d).m16982c(i, bVar.f39134d, bVar.f39133c);
            return;
        }
        a aVar = this.f39128d;
        int i3 = bVar.f39134d;
        RecyclerView3 recyclerView3 = (RecyclerView3) aVar;
        recyclerView3.f39137a.m589R(i, i3, true);
        RecyclerView recyclerView = recyclerView3.f39137a;
        recyclerView.f986w0 = true;
        recyclerView.f980t0.f1096c += i3;
    }

    /* JADX INFO: renamed from: f */
    public int m16965f(int i, int i2) {
        int size = this.f39127c.size();
        while (i2 < size) {
            b bVar = this.f39127c.get(i2);
            int i3 = bVar.f39131a;
            if (i3 == 8) {
                int i4 = bVar.f39132b;
                if (i4 == i) {
                    i = bVar.f39134d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f39134d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f39132b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f39134d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f39134d;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: g */
    public boolean m16966g() {
        return this.f39126b.size() > 0;
    }

    /* JADX INFO: renamed from: h */
    public b m16967h(int i, int i2, int i3, Object obj) {
        b bVarMo2057a = this.f39125a.mo2057a();
        if (bVarMo2057a == null) {
            return new b(i, i2, i3, obj);
        }
        bVarMo2057a.f39131a = i;
        bVarMo2057a.f39132b = i2;
        bVarMo2057a.f39134d = i3;
        bVarMo2057a.f39133c = obj;
        return bVarMo2057a;
    }

    /* JADX INFO: renamed from: i */
    public final void m16968i(b bVar) {
        this.f39127c.add(bVar);
        int i = bVar.f39131a;
        if (i == 1) {
            ((RecyclerView3) this.f39128d).m16983d(bVar.f39132b, bVar.f39134d);
            return;
        }
        if (i == 2) {
            RecyclerView3 recyclerView3 = (RecyclerView3) this.f39128d;
            recyclerView3.f39137a.m589R(bVar.f39132b, bVar.f39134d, false);
            recyclerView3.f39137a.f986w0 = true;
            return;
        }
        if (i == 4) {
            ((RecyclerView3) this.f39128d).m16982c(bVar.f39132b, bVar.f39134d, bVar.f39133c);
        } else if (i == 8) {
            ((RecyclerView3) this.f39128d).m16984e(bVar.f39132b, bVar.f39134d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:180:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX INFO: renamed from: j */
    public void m16969j() {
        boolean z;
        byte b2;
        b bVarM16967h;
        int i;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        OpReorderer opReorderer = this.f39129e;
        ArrayList<b> arrayList = this.f39126b;
        Objects.requireNonNull(opReorderer);
        while (true) {
            int size = arrayList.size() - 1;
            boolean z5 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).f39131a == 8) {
                    if (z5) {
                        break;
                    }
                } else {
                    z5 = true;
                }
                size--;
            }
            b bVarM16967h2 = null;
            if (size == -1) {
                break;
            }
            int i4 = size + 1;
            b bVar = arrayList.get(size);
            b bVar2 = arrayList.get(i4);
            int i5 = bVar2.f39131a;
            if (i5 == 1) {
                int i6 = bVar.f39134d;
                int i7 = bVar2.f39132b;
                int i8 = i6 < i7 ? -1 : 0;
                int i9 = bVar.f39132b;
                if (i9 < i7) {
                    i8++;
                }
                if (i7 <= i9) {
                    bVar.f39132b = i9 + bVar2.f39134d;
                }
                int i10 = bVar2.f39132b;
                if (i10 <= i6) {
                    bVar.f39134d = i6 + bVar2.f39134d;
                }
                bVar2.f39132b = i10 + i8;
                arrayList.set(size, bVar2);
                arrayList.set(i4, bVar);
            } else if (i5 == 2) {
                int i11 = bVar.f39132b;
                int i12 = bVar.f39134d;
                if (i11 < i12) {
                    if (bVar2.f39132b == i11 && bVar2.f39134d == i12 - i11) {
                        z4 = false;
                        z3 = z4;
                        z2 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (bVar2.f39132b == i12 + 1 && bVar2.f39134d == i11 - i12) {
                    z4 = true;
                    z3 = z4;
                    z2 = true;
                } else {
                    z2 = false;
                    z3 = true;
                }
                int i13 = bVar2.f39132b;
                if (i12 < i13) {
                    bVar2.f39132b = i13 - 1;
                } else {
                    int i14 = bVar2.f39134d;
                    if (i12 < i13 + i14) {
                        bVar2.f39134d = i14 - 1;
                        bVar.f39131a = 2;
                        bVar.f39134d = 1;
                        if (bVar2.f39134d == 0) {
                            arrayList.remove(i4);
                            ((AdapterHelper) opReorderer.f39342a).m16970k(bVar2);
                        }
                    }
                }
                int i15 = bVar.f39132b;
                int i16 = bVar2.f39132b;
                if (i15 <= i16) {
                    bVar2.f39132b = i16 + 1;
                } else {
                    int i17 = i16 + bVar2.f39134d;
                    if (i15 < i17) {
                        bVarM16967h2 = ((AdapterHelper) opReorderer.f39342a).m16967h(2, i15 + 1, i17 - i15, null);
                        bVar2.f39134d = bVar.f39132b - bVar2.f39132b;
                    }
                }
                if (z2) {
                    arrayList.set(size, bVar2);
                    arrayList.remove(i4);
                    ((AdapterHelper) opReorderer.f39342a).m16970k(bVar);
                } else {
                    if (z3) {
                        if (bVarM16967h2 != null) {
                            int i18 = bVar.f39132b;
                            if (i18 > bVarM16967h2.f39132b) {
                                bVar.f39132b = i18 - bVarM16967h2.f39134d;
                            }
                            int i19 = bVar.f39134d;
                            if (i19 > bVarM16967h2.f39132b) {
                                bVar.f39134d = i19 - bVarM16967h2.f39134d;
                            }
                        }
                        int i20 = bVar.f39132b;
                        if (i20 > bVar2.f39132b) {
                            bVar.f39132b = i20 - bVar2.f39134d;
                        }
                        int i21 = bVar.f39134d;
                        if (i21 > bVar2.f39132b) {
                            bVar.f39134d = i21 - bVar2.f39134d;
                        }
                    } else {
                        if (bVarM16967h2 != null) {
                            int i22 = bVar.f39132b;
                            if (i22 >= bVarM16967h2.f39132b) {
                                bVar.f39132b = i22 - bVarM16967h2.f39134d;
                            }
                            int i23 = bVar.f39134d;
                            if (i23 >= bVarM16967h2.f39132b) {
                                bVar.f39134d = i23 - bVarM16967h2.f39134d;
                            }
                        }
                        int i24 = bVar.f39132b;
                        if (i24 >= bVar2.f39132b) {
                            bVar.f39132b = i24 - bVar2.f39134d;
                        }
                        int i25 = bVar.f39134d;
                        if (i25 >= bVar2.f39132b) {
                            bVar.f39134d = i25 - bVar2.f39134d;
                        }
                    }
                    arrayList.set(size, bVar2);
                    if (bVar.f39132b != bVar.f39134d) {
                        arrayList.set(i4, bVar);
                    } else {
                        arrayList.remove(i4);
                    }
                    if (bVarM16967h2 != null) {
                        arrayList.add(size, bVarM16967h2);
                    }
                }
            } else if (i5 == 4) {
                int i26 = bVar.f39134d;
                int i27 = bVar2.f39132b;
                if (i26 < i27) {
                    bVar2.f39132b = i27 - 1;
                } else {
                    int i28 = bVar2.f39134d;
                    if (i26 < i27 + i28) {
                        bVar2.f39134d = i28 - 1;
                        bVarM16967h = ((AdapterHelper) opReorderer.f39342a).m16967h(4, bVar.f39132b, 1, bVar2.f39133c);
                    }
                    i = bVar.f39132b;
                    i2 = bVar2.f39132b;
                    if (i <= i2) {
                        bVar2.f39132b = i2 + 1;
                    } else {
                        i3 = i2 + bVar2.f39134d;
                        if (i < i3) {
                            int i29 = i3 - i;
                            bVarM16967h2 = ((AdapterHelper) opReorderer.f39342a).m16967h(4, i + 1, i29, bVar2.f39133c);
                            bVar2.f39134d -= i29;
                        }
                    }
                    arrayList.set(i4, bVar);
                    if (bVar2.f39134d > 0) {
                        arrayList.set(size, bVar2);
                    } else {
                        arrayList.remove(size);
                        ((AdapterHelper) opReorderer.f39342a).m16970k(bVar2);
                    }
                    if (bVarM16967h != null) {
                        arrayList.add(size, bVarM16967h);
                    }
                    if (bVarM16967h2 != null) {
                        arrayList.add(size, bVarM16967h2);
                    }
                }
                bVarM16967h = null;
                i = bVar.f39132b;
                i2 = bVar2.f39132b;
                if (i <= i2) {
                    bVar2.f39132b = i2 + 1;
                } else {
                    i3 = i2 + bVar2.f39134d;
                    if (i < i3) {
                        int i210 = i3 - i;
                        bVarM16967h2 = ((AdapterHelper) opReorderer.f39342a).m16967h(4, i + 1, i210, bVar2.f39133c);
                        bVar2.f39134d -= i210;
                    }
                }
                arrayList.set(i4, bVar);
                if (bVar2.f39134d > 0) {
                    arrayList.set(size, bVar2);
                } else {
                    arrayList.remove(size);
                    ((AdapterHelper) opReorderer.f39342a).m16970k(bVar2);
                }
                if (bVarM16967h != null) {
                    arrayList.add(size, bVarM16967h);
                }
                if (bVarM16967h2 != null) {
                    arrayList.add(size, bVarM16967h2);
                }
            }
        }
        int size2 = this.f39126b.size();
        for (int i30 = 0; i30 < size2; i30++) {
            b bVarM16967h3 = this.f39126b.get(i30);
            int i31 = bVarM16967h3.f39131a;
            if (i31 == 1) {
                m16968i(bVarM16967h3);
            } else if (i31 == 2) {
                int i32 = bVarM16967h3.f39132b;
                int i33 = bVarM16967h3.f39134d + i32;
                int i34 = i32;
                int i35 = 0;
                byte b3 = -1;
                while (i34 < i33) {
                    if (((RecyclerView3) this.f39128d).m16981b(i34) != null || m16960a(i34)) {
                        if (b3 == 0) {
                            m16963d(m16967h(2, i32, i35, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b2 = 1;
                    } else {
                        if (b3 == 1) {
                            m16968i(m16967h(2, i32, i35, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b2 = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    b3 = b2;
                }
                if (i35 != bVarM16967h3.f39134d) {
                    m16970k(bVarM16967h3);
                    bVarM16967h3 = m16967h(2, i32, i35, null);
                }
                if (b3 == 0) {
                    m16963d(bVarM16967h3);
                } else {
                    m16968i(bVarM16967h3);
                }
            } else if (i31 == 4) {
                int i36 = bVarM16967h3.f39132b;
                int i37 = bVarM16967h3.f39134d + i36;
                int i38 = i36;
                int i39 = 0;
                byte b4 = -1;
                while (i36 < i37) {
                    if (((RecyclerView3) this.f39128d).m16981b(i36) != null || m16960a(i36)) {
                        if (b4 == 0) {
                            m16963d(m16967h(4, i38, i39, bVarM16967h3.f39133c));
                            i38 = i36;
                            i39 = 0;
                        }
                        b4 = 1;
                    } else {
                        if (b4 == 1) {
                            m16968i(m16967h(4, i38, i39, bVarM16967h3.f39133c));
                            i38 = i36;
                            i39 = 0;
                        }
                        b4 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != bVarM16967h3.f39134d) {
                    Object obj = bVarM16967h3.f39133c;
                    m16970k(bVarM16967h3);
                    bVarM16967h3 = m16967h(4, i38, i39, obj);
                }
                if (b4 == 0) {
                    m16963d(bVarM16967h3);
                } else {
                    m16968i(bVarM16967h3);
                }
            } else if (i31 == 8) {
                m16968i(bVarM16967h3);
            }
        }
        this.f39126b.clear();
    }

    /* JADX INFO: renamed from: k */
    public void m16970k(b bVar) {
        bVar.f39133c = null;
        this.f39125a.mo2058b(bVar);
    }

    /* JADX INFO: renamed from: l */
    public void m16971l(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m16970k(list.get(i));
        }
        list.clear();
    }

    /* JADX INFO: renamed from: m */
    public final int m16972m(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f39127c.size() - 1; size >= 0; size--) {
            b bVar = this.f39127c.get(size);
            int i5 = bVar.f39131a;
            if (i5 == 8) {
                int i6 = bVar.f39132b;
                int i7 = bVar.f39134d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f39132b = i6 + 1;
                            bVar.f39134d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f39132b = i6 - 1;
                            bVar.f39134d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.f39134d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.f39134d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f39132b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f39132b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.f39132b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.f39134d;
                    } else if (i5 == 2) {
                        i += bVar.f39134d;
                    }
                } else if (i2 == 1) {
                    bVar.f39132b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.f39132b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f39127c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f39127c.get(size2);
            if (bVar2.f39131a == 8) {
                int i9 = bVar2.f39134d;
                if (i9 == bVar2.f39132b || i9 < 0) {
                    this.f39127c.remove(size2);
                    m16970k(bVar2);
                }
            } else if (bVar2.f39134d <= 0) {
                this.f39127c.remove(size2);
                m16970k(bVar2);
            }
        }
        return i;
    }
}
