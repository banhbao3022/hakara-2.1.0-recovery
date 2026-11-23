package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tq2 {

    /* JADX INFO: renamed from: a */
    public final kq2 f19963a;

    /* JADX INFO: renamed from: b */
    public final int f19964b;

    /* JADX INFO: renamed from: c */
    public final int f19965c;

    public tq2(int i, int i2, int i3) {
        this.f19964b = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : i2;
        if (i3 <= 0) {
            this.f19965c = 1;
        } else {
            this.f19965c = i3;
        }
        this.f19963a = new rq2(i2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX INFO: renamed from: a */
    public final String m8447a(ArrayList<String> arrayList, ArrayList<jq2> arrayList2) {
        Collections.sort(arrayList2, new sq2(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            String[] strArrSplit = Normalizer.normalize(arrayList.get(arrayList2.get(i).f15710e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (String str : strArrSplit) {
                    if (str.indexOf("'") != -1) {
                        StringBuilder sb = new StringBuilder(str);
                        int i2 = 1;
                        boolean z = false;
                        while (true) {
                            int i3 = i2 + 2;
                            if (i3 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i2) == '\'') {
                                if (sb.charAt(i2 - 1) != ' ') {
                                    int i4 = i2 + 1;
                                    if ((sb.charAt(i4) == 's' || sb.charAt(i4) == 'S') && (i3 == sb.length() || sb.charAt(i3) == ' ')) {
                                        sb.insert(i2, ' ');
                                        i2 = i3;
                                    } else {
                                        sb.setCharAt(i2, ' ');
                                    }
                                } else {
                                    sb.setCharAt(i2, ' ');
                                }
                                z = true;
                            }
                            i2++;
                        }
                        String string = z ? sb.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    }
                    String[] strArrM5352c2 = C2622l.m5352c2(str, true);
                    if (strArrM5352c2.length >= this.f19965c) {
                        for (int i5 = 0; i5 < strArrM5352c2.length; i5++) {
                            String strConcat = "";
                            for (int i6 = 0; i6 < this.f19965c; i6++) {
                                int i7 = i5 + i6;
                                if (i7 >= strArrM5352c2.length) {
                                    break;
                                }
                                if (i6 > 0) {
                                    strConcat = String.valueOf(strConcat).concat(" ");
                                }
                                String strValueOf = String.valueOf(strConcat);
                                String strValueOf2 = String.valueOf(strArrM5352c2[i7]);
                                strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= this.f19964b) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.f19964b) {
                            break loop0;
                        }
                    }
                }
            }
        }
        mq2 mq2Var = new mq2();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                mq2Var.f16836b.write(this.f19963a.mo7536a((String) it.next()));
            } catch (IOException e) {
                C2622l.m5438t3("Error while writing hash to byteStream", e);
            }
        }
        return mq2Var.toString();
    }
}
