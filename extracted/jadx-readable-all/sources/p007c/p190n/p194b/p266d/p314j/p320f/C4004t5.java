package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.f.t5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4004t5 extends AbstractC3984r5 {

    /* JADX INFO: renamed from: c */
    public static final Class<?> f22878c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public C4004t5(C4013u5 c4013u5) {
        super(null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3984r5
    /* JADX INFO: renamed from: a */
    public final void mo9207a(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) C4015u7.m9252r(obj, j2);
        if (list instanceof InterfaceC3994s5) {
            objUnmodifiableList = ((InterfaceC3994s5) list).mo9181p();
        } else {
            if (f22878c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC4014u6) && (list instanceof InterfaceC3894i5)) {
                InterfaceC3894i5 interfaceC3894i5 = (InterfaceC3894i5) list;
                if (interfaceC3894i5.mo8927I()) {
                    interfaceC3894i5.mo8929w();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        C4015u7.m9238d(obj, j2, objUnmodifiableList);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3984r5
    /* JADX INFO: renamed from: b */
    public final <E> void mo9208b(Object obj, Object obj2, long j2) {
        List list;
        List list2;
        List listMo8958r;
        List list3 = (List) C4015u7.m9252r(obj2, j2);
        int size = list3.size();
        List list4 = (List) C4015u7.m9252r(obj, j2);
        if (list4.isEmpty()) {
            if (list4 instanceof InterfaceC3994s5) {
                listMo8958r = new C3964p5(size);
            } else {
                listMo8958r = ((list4 instanceof InterfaceC4014u6) && (list4 instanceof InterfaceC3894i5)) ? ((InterfaceC3894i5) list4).mo8958r(size) : new ArrayList(size);
            }
            C4015u7.m9238d(obj, j2, listMo8958r);
            list2 = listMo8958r;
        } else {
            if (f22878c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                C4015u7.m9238d(obj, j2, arrayList);
                list = arrayList;
            } else if (list4 instanceof C3956o7) {
                C3964p5 c3964p5 = new C3964p5(list4.size() + size);
                c3964p5.addAll(c3964p5.size(), (C3956o7) list4);
                C4015u7.m9238d(obj, j2, c3964p5);
                list = c3964p5;
            } else if ((list4 instanceof InterfaceC4014u6) && (list4 instanceof InterfaceC3894i5)) {
                InterfaceC3894i5 interfaceC3894i5 = (InterfaceC3894i5) list4;
                if (!interfaceC3894i5.mo8927I()) {
                    list2 = list4;
                    list2 = list4;
                    list2 = list4;
                    InterfaceC3894i5<E> interfaceC3894i5Mo8958r = interfaceC3894i5.mo8958r(list4.size() + size);
                    C4015u7.m9238d(obj, j2, interfaceC3894i5Mo8958r);
                    list2 = interfaceC3894i5Mo8958r;
                }
            }
            list2 = list;
        }
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        list2 = list4;
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        C4015u7.m9238d(obj, j2, list3);
    }
}
