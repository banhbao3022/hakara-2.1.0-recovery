package p477d1.p483s;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p477d1.p481d0.Appendable;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.s.s, reason: use source file name */
/* JADX INFO: compiled from: _Collections.kt */
/* JADX INFO: loaded from: classes.dex */
public class _Collections extends _CollectionsJvm {
    /* JADX INFO: renamed from: i */
    public static final <T> T m13044i(List<? extends T> list) {
        Intrinsics2.m13089e(list, "$this$first");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: j */
    public static final <T, A extends Appendable> A m13045j(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6164l<? super T, ? extends CharSequence> interfaceC6164l) {
        Intrinsics2.m13089e(iterable, "$this$joinTo");
        Intrinsics2.m13089e(a, "buffer");
        Intrinsics2.m13089e(charSequence, "separator");
        Intrinsics2.m13089e(charSequence2, "prefix");
        Intrinsics2.m13089e(charSequence3, "postfix");
        Intrinsics2.m13089e(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            Appendable.m12984a(a, t, interfaceC6164l);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* JADX INFO: renamed from: k */
    public static String m13046k(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC6164l interfaceC6164l, int i2) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = charSequence;
        CharSequence charSequence6 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence7 = (i2 & 4) != 0 ? "" : charSequence3;
        int i3 = (i2 & 8) != 0 ? -1 : i;
        CharSequence charSequence8 = (i2 & 16) != 0 ? "..." : null;
        InterfaceC6164l interfaceC6164l2 = (i2 & 32) != 0 ? null : interfaceC6164l;
        Intrinsics2.m13089e(iterable, "$this$joinToString");
        Intrinsics2.m13089e(charSequence5, "separator");
        Intrinsics2.m13089e(charSequence6, "prefix");
        Intrinsics2.m13089e(charSequence7, "postfix");
        Intrinsics2.m13089e(charSequence8, "truncated");
        StringBuilder sb = new StringBuilder();
        m13045j(iterable, sb, charSequence5, charSequence6, charSequence7, i3, charSequence8, interfaceC6164l2);
        String string = sb.toString();
        Intrinsics2.m13088d(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    /* JADX INFO: renamed from: l */
    public static final <T> T m13047l(List<? extends T> list) {
        Intrinsics2.m13089e(list, "$this$last");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(Collections2.m13037b(list));
    }

    /* JADX INFO: renamed from: m */
    public static final <T, C extends Collection<? super T>> C m13048m(Iterable<? extends T> iterable, C c2) {
        Intrinsics2.m13089e(iterable, "$this$toCollection");
        Intrinsics2.m13089e(c2, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c2.add(it.next());
        }
        return c2;
    }

    /* JADX INFO: renamed from: n */
    public static final <T> List<T> m13049n(Iterable<? extends T> iterable) {
        List listM13050o;
        Intrinsics2.m13089e(iterable, "$this$toList");
        boolean z = iterable instanceof Collection;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return Collections4.f29519f;
            }
            if (size != 1) {
                return m13050o(collection);
            }
            return CollectionsJVM.m13036a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        Intrinsics2.m13089e(iterable, "$this$toMutableList");
        if (z) {
            listM13050o = m13050o((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            m13048m(iterable, arrayList);
            listM13050o = arrayList;
        }
        return Collections2.m13040e(listM13050o);
    }

    /* JADX INFO: renamed from: o */
    public static final <T> List<T> m13050o(Collection<? extends T> collection) {
        Intrinsics2.m13089e(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    /* JADX INFO: renamed from: p */
    public static final <T> Set<T> m13051p(Iterable<? extends T> iterable) {
        Intrinsics2.m13089e(iterable, "$this$toSet");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m13048m(iterable, linkedHashSet);
            Intrinsics2.m13089e(linkedHashSet, "$this$optimizeReadOnlySet");
            int size = linkedHashSet.size();
            if (size != 0) {
                return size != 1 ? linkedHashSet : SetsJVM.m13026a(linkedHashSet.iterator().next());
            }
            return Sets5.f29521f;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return Sets5.f29521f;
        }
        if (size2 == 1) {
            return SetsJVM.m13026a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(MapsJVM.m13052a(collection.size()));
        m13048m(iterable, linkedHashSet2);
        return linkedHashSet2;
    }
}
