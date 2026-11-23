package p477d1.p481d0;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p477d1.Tuples;
import p477d1.p478a0.Ranges;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: d1.d0.s, reason: use source file name */
/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Strings3 extends Lambda implements InterfaceC6168p<CharSequence, Integer, Tuples<? extends Integer, ? extends Integer>> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List f29475g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f29476h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Strings3(List list, boolean z) {
        super(2);
        this.f29475g = list;
        this.f29476h = z;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00e8 A[EDGE_INSN: B:55:0x00e8->B:56:0x00e9 BREAK  A[LOOP:0: B:26:0x0073->B:37:0x00a6]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public Tuples<? extends Integer, ? extends Integer> mo5l(CharSequence charSequence, Integer num) {
        Object next;
        Tuples tuples;
        String str;
        Object next2;
        String str2;
        CharSequence charSequence2 = charSequence;
        int iIntValue = num.intValue();
        Intrinsics2.m13089e(charSequence2, "$receiver");
        List list = this.f29475g;
        boolean z = this.f29476h;
        if (z || list.size() != 1) {
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            Ranges ranges = new Ranges(iIntValue, charSequence2.length());
            if (!(charSequence2 instanceof String)) {
                int i = ranges.f29431g;
                int i2 = ranges.f29432h;
                int i3 = ranges.f29433i;
                if (i3 < 0 ? i >= i2 : i <= i2) {
                    while (true) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            str = (String) next;
                        } while (!Strings5.m12998A(str, 0, charSequence2, i, str.length(), z));
                        String str3 = (String) next;
                        if (str3 == null) {
                            if (i == i2) {
                                tuples = null;
                                break;
                            }
                            i += i3;
                        } else {
                            tuples = new Tuples(Integer.valueOf(i), str3);
                            break;
                        }
                    }
                } else {
                    tuples = null;
                    break;
                }
            } else {
                int i4 = ranges.f29431g;
                int i5 = ranges.f29432h;
                int i6 = ranges.f29433i;
                if (i6 < 0 ? i4 >= i5 : i4 <= i5) {
                    while (true) {
                        Iterator it2 = list.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                            str2 = (String) next2;
                        } while (!StringsJVM.m12991h(str2, 0, (String) charSequence2, i4, str2.length(), z));
                        String str4 = (String) next2;
                        if (str4 == null) {
                            if (i4 == i5) {
                                tuples = null;
                                break;
                            }
                            i4 += i6;
                        } else {
                            tuples = new Tuples(Integer.valueOf(i4), str4);
                            break;
                        }
                    }
                } else {
                    tuples = null;
                    break;
                }
            }
        } else {
            Intrinsics2.m13089e(list, "$this$single");
            Intrinsics2.m13089e(list, "$this$single");
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size != 1) {
                throw new IllegalArgumentException("List has more than one element.");
            }
            String str5 = (String) list.get(0);
            int iM13012v = Strings5.m13012v(charSequence2, str5, iIntValue, false, 4);
            if (iM13012v < 0) {
                tuples = null;
                break;
            }
            tuples = new Tuples(Integer.valueOf(iM13012v), str5);
        }
        if (tuples != null) {
            return new Tuples<>(tuples.f29491f, Integer.valueOf(((String) tuples.f29492g).length()));
        }
        return null;
    }
}
