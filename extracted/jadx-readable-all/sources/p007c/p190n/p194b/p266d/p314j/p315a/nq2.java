package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nq2 {

    /* JADX INFO: renamed from: a */
    public final int f17246a;

    /* JADX INFO: renamed from: b */
    public final kq2 f17247b = new oq2();

    public nq2(int i) {
        this.f17246a = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m7930a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(arrayList.get(i).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        mq2 mq2Var = new mq2();
        PriorityQueue priorityQueue = new PriorityQueue(this.f17246a, new lq2());
        for (String str : strArrSplit) {
            String[] strArrM5352c2 = C2622l.m5352c2(str, false);
            if (strArrM5352c2.length != 0) {
                int i2 = this.f17246a;
                int length = strArrM5352c2.length;
                if (length < 6) {
                    cw0.m6238h(i2, cw0.m6245o(strArrM5352c2, 0, length), cw0.m6241k(strArrM5352c2, 0, length), length, priorityQueue);
                } else {
                    long jM6245o = cw0.m6245o(strArrM5352c2, 0, 6);
                    cw0.m6238h(i2, jM6245o, cw0.m6241k(strArrM5352c2, 0, 6), 6, priorityQueue);
                    long j2 = 16785407;
                    long jM6242l = cw0.m6242l(16785407L, 5);
                    long j3 = jM6245o;
                    int i3 = 1;
                    while (true) {
                        int length2 = strArrM5352c2.length;
                        if (i3 < length2 - 5) {
                            int i4 = i3;
                            long jM5375h0 = (((((long) C2622l.m5375h0(strArrM5352c2[i4 + 5])) + 2147483647L) % 1073807359) + (((((j3 + 1073807359) - ((((((long) C2622l.m5375h0(strArrM5352c2[i3 - 1])) + 2147483647L) % 1073807359) * jM6242l) % 1073807359)) % 1073807359) * j2) % 1073807359)) % 1073807359;
                            cw0.m6238h(i2, jM5375h0, cw0.m6241k(strArrM5352c2, i4, 6), length2, priorityQueue);
                            j2 = j2;
                            i3 = i4 + 1;
                            j3 = jM5375h0;
                        }
                    }
                }
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                mq2Var.f16836b.write(this.f17247b.mo7536a(((qq2) it.next()).f18413b));
            } catch (IOException e) {
                C2622l.m5438t3("Error while writing hash to byteStream", e);
            }
        }
        return mq2Var.toString();
    }
}
