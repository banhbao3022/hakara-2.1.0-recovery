package p524h1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p483s.AbstractList;
import p477d1.p483s._Arrays;
import p477d1.p484t.Comparisons;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: h1.q, reason: use source file name */
/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Options2 extends AbstractList<ByteString3> implements RandomAccess {

    /* JADX INFO: renamed from: g */
    public static final a f30730g = new a(null);

    /* JADX INFO: renamed from: h */
    public final ByteString3[] f30731h;

    /* JADX INFO: renamed from: i */
    public final int[] f30732i;

    /* JADX INFO: renamed from: h1.q$a */
    /* JADX INFO: compiled from: Options.kt */
    public static final class a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m13781a(long j2, Buffer3 buffer3, int i, List<? extends ByteString3> list, int i2, int i3, List<Integer> list2) throws IOException {
            int i4;
            int i5;
            int i6;
            int i7 = i;
            if (!(i2 < i3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i8 = i2; i8 < i3; i8++) {
                if (!(list.get(i8).mo13765j() >= i7)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString3 byteString3 = list.get(i2);
            ByteString3 byteString4 = list.get(i3 - 1);
            if (i7 == byteString3.mo13765j()) {
                int iIntValue = list2.get(i2).intValue();
                int i9 = i2 + 1;
                ByteString3 byteString5 = list.get(i9);
                i4 = i9;
                i5 = iIntValue;
                byteString3 = byteString5;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (byteString3.mo13768q(i7) == byteString4.mo13768q(i7)) {
                int iMin = Math.min(byteString3.mo13765j(), byteString4.mo13765j());
                int i10 = 0;
                for (int i11 = i7; i11 < iMin && byteString3.mo13768q(i11) == byteString4.mo13768q(i11); i11++) {
                    i10++;
                }
                long jM13782b = m13782b(buffer3) + j2 + ((long) 2) + ((long) i10) + 1;
                buffer3.m13724M0(-i10);
                buffer3.m13724M0(i5);
                int i12 = i7 + i10;
                while (i7 < i12) {
                    buffer3.m13724M0(byteString3.mo13768q(i7) & 255);
                    i7++;
                }
                if (i4 + 1 == i3) {
                    if (!(i12 == list.get(i4).mo13765j())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    buffer3.m13724M0(list2.get(i4).intValue());
                    return;
                } else {
                    Buffer3 buffer4 = new Buffer3();
                    buffer3.m13724M0(((int) (m13782b(buffer4) + jM13782b)) * (-1));
                    m13781a(jM13782b, buffer4, i12, list, i4, i3, list2);
                    buffer3.mo13734V(buffer4);
                    return;
                }
            }
            int i13 = 1;
            for (int i14 = i4 + 1; i14 < i3; i14++) {
                if (list.get(i14 - 1).mo13768q(i7) != list.get(i14).mo13768q(i7)) {
                    i13++;
                }
            }
            long jM13782b2 = m13782b(buffer3) + j2 + ((long) 2) + ((long) (i13 * 2));
            buffer3.m13724M0(i13);
            buffer3.m13724M0(i5);
            for (int i15 = i4; i15 < i3; i15++) {
                byte bMo13768q = list.get(i15).mo13768q(i7);
                if (i15 == i4 || bMo13768q != list.get(i15 - 1).mo13768q(i7)) {
                    buffer3.m13724M0(bMo13768q & 255);
                }
            }
            Buffer3 buffer5 = new Buffer3();
            while (i4 < i3) {
                byte bMo13768q2 = list.get(i4).mo13768q(i7);
                int i16 = i4 + 1;
                int i17 = i16;
                while (true) {
                    if (i17 >= i3) {
                        i6 = i3;
                        break;
                    } else {
                        if (bMo13768q2 != list.get(i17).mo13768q(i7)) {
                            i6 = i17;
                            break;
                        }
                        i17++;
                    }
                }
                if (i16 == i6 && i7 + 1 == list.get(i4).mo13765j()) {
                    buffer3.m13724M0(list2.get(i4).intValue());
                } else {
                    buffer3.m13724M0(((int) (m13782b(buffer5) + jM13782b2)) * (-1));
                    m13781a(jM13782b2, buffer5, i7 + 1, list, i4, i6, list2);
                }
                buffer5 = buffer5;
                i4 = i6;
            }
            buffer3.mo13734V(buffer5);
        }

        /* JADX INFO: renamed from: b */
        public final long m13782b(Buffer3 buffer3) {
            return buffer3.f30708g / ((long) 4);
        }

        /* JADX INFO: renamed from: c */
        public final Options2 m13783c(ByteString3... byteString3Arr) throws IOException {
            int i;
            Intrinsics2.m13090f(byteString3Arr, "byteStrings");
            int i2 = 0;
            if (byteString3Arr.length == 0) {
                return new Options2(new ByteString3[0], new int[]{0, -1}, null);
            }
            List<? extends ByteString3> listM13035i = _Arrays.m13035i(byteString3Arr);
            Intrinsics2.m13089e(listM13035i, "$this$sort");
            ArrayList arrayList = (ArrayList) listM13035i;
            if (arrayList.size() > 1) {
                Collections.sort(listM13035i);
            }
            ArrayList arrayList2 = new ArrayList(byteString3Arr.length);
            for (ByteString3 byteString3 : byteString3Arr) {
                arrayList2.add(-1);
            }
            Object[] array = arrayList2.toArray(new Integer[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Integer[] numArr = (Integer[]) array;
            Integer[] numArr2 = (Integer[]) Arrays.copyOf(numArr, numArr.length);
            Intrinsics2.m13089e(numArr2, "elements");
            ArrayList arrayList3 = numArr2.length == 0 ? new ArrayList() : new ArrayList(new p477d1.p483s.Collections(numArr2, true));
            int length = byteString3Arr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                ByteString3 byteString4 = byteString3Arr[i3];
                int i5 = i4 + 1;
                int size = arrayList.size();
                Intrinsics2.m13089e(listM13035i, "$this$binarySearch");
                int size2 = arrayList.size();
                if (size < 0) {
                    throw new IllegalArgumentException(outline.m1593o("fromIndex (", 0, ") is greater than toIndex (", size, ")."));
                }
                if (size > size2) {
                    throw new IndexOutOfBoundsException(outline.m1593o("toIndex (", size, ") is greater than size (", size2, ")."));
                }
                int i6 = size - 1;
                int i7 = 0;
                while (true) {
                    if (i7 > i6) {
                        i = -(i7 + 1);
                        break;
                    }
                    i = (i7 + i6) >>> 1;
                    int iM13054a = Comparisons.m13054a((Comparable) arrayList.get(i), byteString4);
                    if (iM13054a >= 0) {
                        if (iM13054a <= 0) {
                            break;
                        }
                        i6 = i - 1;
                    } else {
                        i7 = i + 1;
                    }
                }
                arrayList3.set(i, Integer.valueOf(i4));
                i3++;
                i4 = i5;
            }
            if (!(((ByteString3) arrayList.get(0)).mo13765j() > 0)) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i8 = 0;
            while (i8 < arrayList.size()) {
                ByteString3 byteString5 = (ByteString3) arrayList.get(i8);
                int i9 = i8 + 1;
                int i10 = i9;
                while (i10 < arrayList.size()) {
                    ByteString3 byteString6 = (ByteString3) arrayList.get(i10);
                    Objects.requireNonNull(byteString6);
                    Intrinsics2.m13090f(byteString5, "prefix");
                    if (!byteString6.mo13769s(0, byteString5, 0, byteString5.mo13765j())) {
                        break;
                    }
                    if (!(byteString6.mo13765j() != byteString5.mo13765j())) {
                        throw new IllegalArgumentException(("duplicate option: " + byteString6).toString());
                    }
                    if (arrayList3.get(i10).intValue() > arrayList3.get(i8).intValue()) {
                        arrayList.remove(i10);
                        arrayList3.remove(i10);
                    } else {
                        i10++;
                    }
                }
                i8 = i9;
            }
            Buffer3 buffer3 = new Buffer3();
            m13781a(0L, buffer3, 0, listM13035i, 0, arrayList.size(), arrayList3);
            int[] iArr = new int[(int) m13782b(buffer3)];
            while (!buffer3.mo13759y()) {
                iArr[i2] = buffer3.readInt();
                i2++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteString3Arr, byteString3Arr.length);
            Intrinsics2.m13086b(objArrCopyOf, "java.util.Arrays.copyOf(this, size)");
            return new Options2((ByteString3[]) objArrCopyOf, iArr, null);
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Options2(ByteString3[] byteString3Arr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f30731h = byteString3Arr;
        this.f30732i = iArr;
    }

    @Override // p477d1.p483s.AbstractCollection
    /* JADX INFO: renamed from: c */
    public int mo13023c() {
        return this.f30731h.length;
    }

    @Override // p477d1.p483s.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString3) {
            return super.contains((ByteString3) obj);
        }
        return false;
    }

    @Override // p477d1.p483s.AbstractList, java.util.List
    public Object get(int i) {
        return this.f30731h[i];
    }

    @Override // p477d1.p483s.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString3) {
            return super.indexOf((ByteString3) obj);
        }
        return -1;
    }

    @Override // p477d1.p483s.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString3) {
            return super.lastIndexOf((ByteString3) obj);
        }
        return -1;
    }
}
