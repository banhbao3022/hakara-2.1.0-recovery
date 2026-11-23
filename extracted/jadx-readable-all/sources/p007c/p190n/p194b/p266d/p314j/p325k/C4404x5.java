package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.j.k.x5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4404x5 extends AbstractC4378v5 {

    /* JADX INFO: renamed from: c */
    public static final Class<?> f23622c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public C4404x5(C4365u5 c4365u5) {
        super(null);
    }

    /* JADX INFO: renamed from: d */
    public static <L> List<L> m10333d(Object obj, long j2, int i) {
        Object obj2;
        List<L> listMo9340b;
        List<L> list = (List) C4353t7.m10241t(obj, j2);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC4337s5) {
                listMo9340b = new C4351t5(i);
            } else {
                listMo9340b = ((list instanceof InterfaceC4366u6) && (list instanceof InterfaceC4197i5)) ? ((InterfaceC4197i5) list).mo9340b(i) : new ArrayList<>(i);
            }
            C4353t7.m10228g(obj, j2, listMo9340b);
            return listMo9340b;
        }
        if (f23622c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            C4353t7.m10228g(obj, j2, arrayList);
            obj2 = arrayList;
        } else {
            if (!(list instanceof C4283o7)) {
                if (!(list instanceof InterfaceC4366u6) || !(list instanceof InterfaceC4197i5)) {
                    return list;
                }
                InterfaceC4197i5 interfaceC4197i5 = (InterfaceC4197i5) list;
                if (interfaceC4197i5.zza()) {
                    return list;
                }
                InterfaceC4197i5 interfaceC4197i5Mo9340b = interfaceC4197i5.mo9340b(list.size() + i);
                C4353t7.m10228g(obj, j2, interfaceC4197i5Mo9340b);
                return interfaceC4197i5Mo9340b;
            }
            C4351t5 c4351t5 = new C4351t5(list.size() + i);
            c4351t5.addAll(c4351t5.size(), (C4283o7) list);
            C4353t7.m10228g(obj, j2, c4351t5);
            obj2 = c4351t5;
        }
        return (List<L>) obj2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4378v5
    /* JADX INFO: renamed from: a */
    public final <L> List<L> mo10285a(Object obj, long j2) {
        return m10333d(obj, j2, 10);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4378v5
    /* JADX INFO: renamed from: b */
    public final <E> void mo10286b(Object obj, Object obj2, long j2) {
        List list = (List) C4353t7.m10241t(obj2, j2);
        List listM10333d = m10333d(obj, j2, list.size());
        int size = listM10333d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM10333d.addAll(list);
        }
        if (size > 0) {
            list = listM10333d;
        }
        C4353t7.m10228g(obj, j2, list);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4378v5
    /* JADX INFO: renamed from: c */
    public final void mo10287c(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) C4353t7.m10241t(obj, j2);
        if (list instanceof InterfaceC4337s5) {
            objUnmodifiableList = ((InterfaceC4337s5) list).mo10120n();
        } else {
            if (f23622c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC4366u6) && (list instanceof InterfaceC4197i5)) {
                InterfaceC4197i5 interfaceC4197i5 = (InterfaceC4197i5) list;
                if (interfaceC4197i5.zza()) {
                    interfaceC4197i5.mo9833E();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        C4353t7.m10228g(obj, j2, objUnmodifiableList);
    }
}
