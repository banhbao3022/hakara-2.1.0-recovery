package p007c.p190n.p385d.p391l.p392e.p409t;

import java.util.HashMap;

/* JADX INFO: renamed from: c.n.d.l.e.t.c, reason: use source file name */
/* JADX INFO: compiled from: RemoveRepeatsStrategy.java */
/* JADX INFO: loaded from: classes.dex */
public class RemoveRepeatsStrategy implements StackTraceTrimmingStrategy {

    /* JADX INFO: renamed from: a */
    public final int f27006a;

    public RemoveRepeatsStrategy() {
        this(1);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    @Override // p007c.p190n.p385d.p391l.p392e.p409t.StackTraceTrimmingStrategy
    /* JADX INFO: renamed from: a */
    public StackTraceElement[] mo12043a(StackTraceElement[] stackTraceElementArr) {
        int i;
        boolean z;
        int i2 = this.f27006a;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num != null) {
                int iIntValue = num.intValue();
                int i6 = i3 - iIntValue;
                if (i3 + i6 <= stackTraceElementArr.length) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i6) {
                            z = true;
                            break;
                        }
                        if (!stackTraceElementArr[iIntValue + i7].equals(stackTraceElementArr[i3 + i7])) {
                            z = false;
                            break;
                        }
                        i7++;
                    }
                } else {
                    z = false;
                    break;
                }
                if (z) {
                    int iIntValue2 = i3 - num.intValue();
                    if (i5 < i2) {
                        System.arraycopy(stackTraceElementArr, i3, stackTraceElementArr2, i4, iIntValue2);
                        i4 += iIntValue2;
                        i5++;
                    }
                    i = (iIntValue2 - 1) + i3;
                } else {
                    stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                    i4++;
                    i = i3;
                    i5 = 1;
                }
            } else {
                stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                i4++;
                i = i3;
                i5 = 1;
            }
            map.put(stackTraceElement, Integer.valueOf(i3));
            i3 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i4);
        return i4 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    public RemoveRepeatsStrategy(int i) {
        this.f27006a = i;
    }
}
