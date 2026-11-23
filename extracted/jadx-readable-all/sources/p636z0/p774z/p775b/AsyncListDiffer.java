package p636z0.p774z.p775b;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: z0.z.b.d, reason: use source file name */
/* JADX INFO: compiled from: AsyncListDiffer.java */
/* JADX INFO: loaded from: classes.dex */
public class AsyncListDiffer implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ List f39148f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List f39149g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f39150h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Runnable f39151i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AsyncListDiffer2 f39152j;

    /* JADX INFO: renamed from: z0.z.b.d$a */
    /* JADX INFO: compiled from: AsyncListDiffer.java */
    public class a extends DiffUtil.b {
        public a() {
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p636z0.p774z.p775b.DiffUtil.b
        /* JADX INFO: renamed from: a */
        public boolean mo16987a(int i, int i2) {
            Object obj = AsyncListDiffer.this.f39148f.get(i);
            Object obj2 = AsyncListDiffer.this.f39149g.get(i2);
            if (obj != null && obj2 != null) {
                return AsyncListDiffer.this.f39152j.f39159c.f39139b.mo13878a((T) obj, (T) obj2);
            }
            if (obj == null && obj2 == null) {
                return true;
            }
            throw new AssertionError();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p636z0.p774z.p775b.DiffUtil.b
        /* JADX INFO: renamed from: b */
        public boolean mo16988b(int i, int i2) {
            Object obj = AsyncListDiffer.this.f39148f.get(i);
            Object obj2 = AsyncListDiffer.this.f39149g.get(i2);
            if (obj == null || obj2 == null) {
                return obj == null && obj2 == null;
            }
            return AsyncListDiffer.this.f39152j.f39159c.f39139b.mo13879b((T) obj, (T) obj2);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.b
        /* JADX INFO: renamed from: c */
        public Object mo16989c(int i, int i2) {
            Object obj = AsyncListDiffer.this.f39148f.get(i);
            Object obj2 = AsyncListDiffer.this.f39149g.get(i2);
            if (obj == null || obj2 == null) {
                throw new AssertionError();
            }
            Objects.requireNonNull(AsyncListDiffer.this.f39152j.f39159c.f39139b);
            return null;
        }

        @Override // p636z0.p774z.p775b.DiffUtil.b
        /* JADX INFO: renamed from: d */
        public int mo16990d() {
            return AsyncListDiffer.this.f39149g.size();
        }

        @Override // p636z0.p774z.p775b.DiffUtil.b
        /* JADX INFO: renamed from: e */
        public int mo16991e() {
            return AsyncListDiffer.this.f39148f.size();
        }
    }

    /* JADX INFO: renamed from: z0.z.b.d$b */
    /* JADX INFO: compiled from: AsyncListDiffer.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DiffUtil.d f39154f;

        public b(DiffUtil.d dVar) {
            this.f39154f = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            AsyncListDiffer asyncListDiffer = AsyncListDiffer.this;
            AsyncListDiffer2 asyncListDiffer2 = asyncListDiffer.f39152j;
            if (asyncListDiffer2.f39164h == asyncListDiffer.f39150h) {
                List<T> list = asyncListDiffer.f39149g;
                DiffUtil.d dVar = this.f39154f;
                Runnable runnable = asyncListDiffer.f39151i;
                Collection collection = asyncListDiffer2.f39163g;
                asyncListDiffer2.f39162f = list;
                asyncListDiffer2.f39163g = Collections.unmodifiableList(list);
                ListUpdateCallback listUpdateCallback = asyncListDiffer2.f39158b;
                Objects.requireNonNull(dVar);
                BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
                int i2 = dVar.f39254e;
                ArrayDeque arrayDeque = new ArrayDeque();
                int i3 = dVar.f39254e;
                int i4 = dVar.f39255f;
                for (int size = dVar.f39250a.size() - 1; size >= 0; size--) {
                    DiffUtil.c cVar = dVar.f39250a.get(size);
                    int i5 = cVar.f39247a;
                    int i6 = cVar.f39249c;
                    int i7 = i5 + i6;
                    int i8 = cVar.f39248b + i6;
                    while (i3 > i7) {
                        i3--;
                        int i9 = dVar.f39251b[i3];
                        if ((i9 & 12) != 0) {
                            int i10 = i9 >> 4;
                            DiffUtil.f fVarM17039a = DiffUtil.d.m17039a(arrayDeque, i10, false);
                            if (fVarM17039a != null) {
                                i = i4;
                                int i11 = (i2 - fVarM17039a.f39258b) - 1;
                                batchingListUpdateCallback.mo16976a(i3, i11);
                                if ((i9 & 4) != 0) {
                                    batchingListUpdateCallback.mo16979d(i11, 1, dVar.f39253d.mo16989c(i3, i10));
                                }
                            } else {
                                i = i4;
                                arrayDeque.add(new DiffUtil.f(i3, (i2 - i3) - 1, true));
                            }
                        } else {
                            i = i4;
                            batchingListUpdateCallback.mo16978c(i3, 1);
                            i2--;
                        }
                        i4 = i;
                    }
                    while (i4 > i8) {
                        i4--;
                        int i12 = dVar.f39252c[i4];
                        if ((i12 & 12) != 0) {
                            int i13 = i12 >> 4;
                            DiffUtil.f fVarM17039a2 = DiffUtil.d.m17039a(arrayDeque, i13, true);
                            if (fVarM17039a2 == null) {
                                arrayDeque.add(new DiffUtil.f(i4, i2 - i3, false));
                            } else {
                                batchingListUpdateCallback.mo16976a((i2 - fVarM17039a2.f39258b) - 1, i3);
                                if ((i12 & 4) != 0) {
                                    batchingListUpdateCallback.mo16979d(i3, 1, dVar.f39253d.mo16989c(i13, i4));
                                }
                            }
                        } else {
                            batchingListUpdateCallback.mo16977b(i3, 1);
                            i2++;
                        }
                    }
                    int i14 = cVar.f39247a;
                    int i15 = cVar.f39248b;
                    for (int i16 = 0; i16 < cVar.f39249c; i16++) {
                        if ((dVar.f39251b[i14] & 15) == 2) {
                            batchingListUpdateCallback.mo16979d(i14, 1, dVar.f39253d.mo16989c(i14, i15));
                        }
                        i14++;
                        i15++;
                    }
                    i3 = cVar.f39247a;
                    i4 = cVar.f39248b;
                }
                batchingListUpdateCallback.m17000e();
                asyncListDiffer2.m16996a(collection, runnable);
            }
        }
    }

    public AsyncListDiffer(AsyncListDiffer2 asyncListDiffer2, List list, List list2, int i, Runnable runnable) {
        this.f39152j = asyncListDiffer2;
        this.f39148f = list;
        this.f39149g = list2;
        this.f39150h = i;
        this.f39151i = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x010a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        DiffUtil.g gVar;
        DiffUtil.h hVar;
        ArrayList arrayList2;
        DiffUtil.g gVar2;
        DiffUtil.c cVar;
        int i;
        DiffUtil.h hVar2;
        DiffUtil.h hVar3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int i9;
        a aVar = new a();
        int iMo16991e = aVar.mo16991e();
        int iMo16990d = aVar.mo16990d();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new DiffUtil.g(0, iMo16991e, 0, iMo16990d));
        int i10 = iMo16991e + iMo16990d;
        int i11 = 1;
        int i12 = (((i10 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i12];
        int i13 = i12 / 2;
        int[] iArr2 = new int[i12];
        ArrayList arrayList5 = new ArrayList();
        while (!arrayList4.isEmpty()) {
            DiffUtil.g gVar3 = (DiffUtil.g) arrayList4.remove(arrayList4.size() - i11);
            if (gVar3.m17041b() >= i11 && gVar3.m17040a() >= i11) {
                int iM17040a = ((gVar3.m17040a() + gVar3.m17041b()) + i11) / 2;
                int i14 = i11 + i13;
                iArr[i14] = gVar3.f39260a;
                iArr2[i14] = gVar3.f39261b;
                int i15 = 0;
                while (true) {
                    if (i15 >= iM17040a) {
                        arrayList5 = arrayList5;
                        arrayList = arrayList4;
                        gVar = gVar3;
                        hVar = null;
                        break;
                    }
                    boolean z2 = Math.abs(gVar3.m17041b() - gVar3.m17040a()) % 2 == i11;
                    int iM17041b = gVar3.m17041b() - gVar3.m17040a();
                    int i16 = -i15;
                    int i17 = i16;
                    while (true) {
                        if (i17 > i15) {
                            arrayList5 = arrayList5;
                            arrayList = arrayList4;
                            i = iM17040a;
                            hVar2 = null;
                            break;
                        }
                        if (i17 != i16) {
                            if (i17 != i15) {
                                i = iM17040a;
                                if (iArr[i17 + 1 + i13] > iArr[(i17 - 1) + i13]) {
                                }
                                arrayList = arrayList4;
                                i7 = ((i6 - gVar3.f39260a) + gVar3.f39262c) - i17;
                                if (i15 == 0 && i6 == i5) {
                                    i8 = i7 - 1;
                                } else {
                                    i8 = i7;
                                }
                                while (i6 < gVar3.f39261b && i7 < gVar3.f39263d && aVar.mo16988b(i6, i7)) {
                                    i6++;
                                    i7++;
                                }
                                iArr[i17 + i13] = i6;
                                if (z2) {
                                    i9 = iM17041b - i17;
                                    z = z2;
                                    if (i9 < i16 + 1 && i9 <= i15 - 1 && iArr2[i9 + i13] <= i6) {
                                        hVar2 = new DiffUtil.h();
                                        hVar2.f39264a = i5;
                                        hVar2.f39265b = i8;
                                        hVar2.f39266c = i6;
                                        hVar2.f39267d = i7;
                                        hVar2.f39268e = false;
                                        break;
                                    }
                                } else {
                                    z = z2;
                                }
                                i17 += 2;
                                arrayList4 = arrayList;
                                iM17040a = i;
                                arrayList5 = arrayList5;
                                z2 = z;
                            } else {
                                i = iM17040a;
                            }
                            i5 = iArr[(i17 - 1) + i13];
                            i6 = i5 + 1;
                            arrayList = arrayList4;
                            i7 = ((i6 - gVar3.f39260a) + gVar3.f39262c) - i17;
                            if (i15 == 0) {
                                i8 = i7;
                            } else {
                                i8 = i7;
                            }
                            while (i6 < gVar3.f39261b) {
                                i6++;
                                i7++;
                            }
                            iArr[i17 + i13] = i6;
                            if (z2) {
                                i9 = iM17041b - i17;
                                z = z2;
                                if (i9 < i16 + 1) {
                                    continue;
                                }
                            } else {
                                z = z2;
                            }
                            i17 += 2;
                            arrayList4 = arrayList;
                            iM17040a = i;
                            arrayList5 = arrayList5;
                            z2 = z;
                        } else {
                            i = iM17040a;
                        }
                        i5 = iArr[i17 + 1 + i13];
                        i6 = i5;
                        arrayList = arrayList4;
                        i7 = ((i6 - gVar3.f39260a) + gVar3.f39262c) - i17;
                        if (i15 == 0) {
                            i8 = i7;
                        } else {
                            i8 = i7;
                        }
                        while (i6 < gVar3.f39261b) {
                            i6++;
                            i7++;
                        }
                        iArr[i17 + i13] = i6;
                        if (z2) {
                            i9 = iM17041b - i17;
                            z = z2;
                            if (i9 < i16 + 1) {
                                continue;
                            }
                        } else {
                            z = z2;
                        }
                        i17 += 2;
                        arrayList4 = arrayList;
                        iM17040a = i;
                        arrayList5 = arrayList5;
                        z2 = z;
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        gVar = gVar3;
                        break;
                    }
                    boolean z3 = (gVar3.m17041b() - gVar3.m17040a()) % 2 == 0;
                    int iM17041b2 = gVar3.m17041b() - gVar3.m17040a();
                    int i18 = i16;
                    while (true) {
                        if (i18 > i15) {
                            gVar = gVar3;
                            hVar3 = null;
                            break;
                        }
                        if (i18 == i16 || (i18 != i15 && iArr2[i18 + 1 + i13] < iArr2[(i18 - 1) + i13])) {
                            i2 = iArr2[i18 + 1 + i13];
                            i3 = i2;
                        } else {
                            i2 = iArr2[(i18 - 1) + i13];
                            i3 = i2 - 1;
                        }
                        int i19 = gVar3.f39263d - ((gVar3.f39261b - i3) - i18);
                        int i20 = (i15 == 0 || i3 != i2) ? i19 : i19 + 1;
                        while (true) {
                            if (i3 > gVar3.f39260a && i19 > gVar3.f39262c) {
                                int i21 = i3 - 1;
                                gVar = gVar3;
                                int i22 = i19 - 1;
                                if (!aVar.mo16988b(i21, i22)) {
                                    break;
                                }
                                i3 = i21;
                                i19 = i22;
                                gVar3 = gVar;
                            } else {
                                gVar = gVar3;
                                break;
                            }
                        }
                        iArr2[i18 + i13] = i3;
                        if (z3 && (i4 = iM17041b2 - i18) >= i16 && i4 <= i15 && iArr[i4 + i13] >= i3) {
                            hVar3 = new DiffUtil.h();
                            hVar3.f39264a = i3;
                            hVar3.f39265b = i19;
                            hVar3.f39266c = i2;
                            hVar3.f39267d = i20;
                            hVar3.f39268e = true;
                            break;
                        }
                        i18 += 2;
                        gVar3 = gVar;
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i15++;
                    arrayList4 = arrayList;
                    iM17040a = i;
                    arrayList5 = arrayList5;
                    gVar3 = gVar;
                    i11 = 1;
                }
            } else {
                arrayList5 = arrayList5;
                arrayList = arrayList4;
                gVar = gVar3;
                hVar = null;
                break;
            }
            if (hVar != null) {
                if (hVar.m17042a() > 0) {
                    int i23 = hVar.f39267d;
                    int i24 = hVar.f39265b;
                    int i25 = i23 - i24;
                    int i26 = hVar.f39266c;
                    int i27 = hVar.f39264a;
                    int i28 = i26 - i27;
                    if (!(i25 != i28)) {
                        cVar = new DiffUtil.c(i27, i24, i28);
                    } else if (hVar.f39268e) {
                        cVar = new DiffUtil.c(i27, i24, hVar.m17042a());
                    } else {
                        cVar = i25 > i28 ? new DiffUtil.c(i27, i24 + 1, hVar.m17042a()) : new DiffUtil.c(i27 + 1, i24, hVar.m17042a());
                    }
                    arrayList3.add(cVar);
                }
                if (arrayList5.isEmpty()) {
                    gVar2 = new DiffUtil.g();
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = arrayList5;
                    gVar2 = (DiffUtil.g) arrayList2.remove(arrayList5.size() - 1);
                }
                gVar2.f39260a = gVar.f39260a;
                gVar2.f39262c = gVar.f39262c;
                gVar2.f39261b = hVar.f39264a;
                gVar2.f39263d = hVar.f39265b;
                arrayList4 = arrayList;
                arrayList4.add(gVar2);
                gVar.f39261b = gVar.f39261b;
                gVar.f39263d = gVar.f39263d;
                gVar.f39260a = hVar.f39266c;
                gVar.f39262c = hVar.f39267d;
                arrayList4.add(gVar);
            } else {
                arrayList4 = arrayList;
                arrayList2 = arrayList5;
                arrayList2.add(gVar);
            }
            arrayList5 = arrayList2;
            i11 = 1;
        }
        Collections.sort(arrayList3, DiffUtil.f39246a);
        this.f39152j.f39160d.execute(new b(new DiffUtil.d(aVar, arrayList3, iArr, iArr2, true)));
    }
}
