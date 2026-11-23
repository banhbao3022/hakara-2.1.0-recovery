package p477d1.p483s;

import java.util.Arrays;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.s.g, reason: use source file name */
/* JADX INFO: compiled from: _ArraysJvm.kt */
/* JADX INFO: loaded from: classes.dex */
public class _ArraysJvm extends Arrays {
    /* JADX INFO: renamed from: a */
    public static final <T> List<T> m13027a(T[] tArr) {
        Intrinsics2.m13089e(tArr, "$this$asList");
        List<T> listAsList = Arrays.asList(tArr);
        Intrinsics2.m13088d(listAsList, "ArraysUtilJVM.asList(this)");
        return listAsList;
    }

    /* JADX INFO: renamed from: b */
    public static final byte[] m13028b(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        Intrinsics2.m13089e(bArr, "$this$copyInto");
        Intrinsics2.m13089e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ byte[] m13029c(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        m13028b(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    /* JADX INFO: renamed from: d */
    public static Object[] m13030d(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        Intrinsics2.m13089e(objArr, "$this$copyInto");
        Intrinsics2.m13089e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
        return objArr2;
    }

    /* JADX INFO: renamed from: e */
    public static final byte[] m13031e(byte[] bArr, int i, int i2) {
        Intrinsics2.m13089e(bArr, "$this$copyOfRangeImpl");
        int length = bArr.length;
        if (i2 > length) {
            throw new IndexOutOfBoundsException(outline.m1593o("toIndex (", i2, ") is greater than size (", length, ")."));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        Intrinsics2.m13088d(bArrCopyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return bArrCopyOfRange;
    }
}
