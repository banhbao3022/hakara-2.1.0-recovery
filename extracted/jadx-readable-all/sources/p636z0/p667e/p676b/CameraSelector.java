package p636z0.p667e.p676b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p636z0.p667e.p676b.p677v1.CameraInternal2;
import p636z0.p667e.p676b.p677v1.LensFacingCameraFilter;

/* JADX INFO: renamed from: z0.e.b.s0, reason: use source file name */
/* JADX INFO: compiled from: CameraSelector.java */
/* JADX INFO: loaded from: classes.dex */
public final class CameraSelector {

    /* JADX INFO: renamed from: a */
    public static final CameraSelector f36009a;

    /* JADX INFO: renamed from: b */
    public static final CameraSelector f36010b;

    /* JADX INFO: renamed from: c */
    public LinkedHashSet<CameraFilter> f36011c;

    /* JADX INFO: renamed from: z0.e.b.s0$a */
    /* JADX INFO: compiled from: CameraSelector.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final LinkedHashSet<CameraFilter> f36012a = new LinkedHashSet<>();

        /* JADX INFO: renamed from: a */
        public CameraSelector m15298a() {
            return new CameraSelector(this.f36012a);
        }

        /* JADX INFO: renamed from: b */
        public a m15299b(int i) {
            this.f36012a.add(new LensFacingCameraFilter(i));
            return this;
        }
    }

    static {
        a aVar = new a();
        aVar.m15299b(0);
        f36009a = aVar.m15298a();
        a aVar2 = new a();
        aVar2.m15299b(1);
        f36010b = aVar2.m15298a();
    }

    public CameraSelector(LinkedHashSet<CameraFilter> linkedHashSet) {
        this.f36011c = linkedHashSet;
    }

    /* JADX INFO: renamed from: a */
    public LinkedHashSet<CameraInternal2> m15295a(LinkedHashSet<CameraInternal2> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<CameraInternal2> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo15163f());
        }
        List<CameraInfo> listM15296b = m15296b(arrayList);
        LinkedHashSet<CameraInternal2> linkedHashSet2 = new LinkedHashSet<>();
        for (CameraInternal2 cameraInternal2 : linkedHashSet) {
            if (listM15296b.contains(cameraInternal2.mo15163f())) {
                linkedHashSet2.add(cameraInternal2);
            }
        }
        return linkedHashSet2;
    }

    /* JADX INFO: renamed from: b */
    public List<CameraInfo> m15296b(List<CameraInfo> list) {
        ArrayList arrayList = new ArrayList(list);
        List<CameraInfo> arrayList2 = new ArrayList<>(list);
        Iterator<CameraFilter> it = this.f36011c.iterator();
        while (it.hasNext()) {
            arrayList2 = it.next().mo15294a(Collections.unmodifiableList(arrayList2));
            if (arrayList2.isEmpty()) {
                throw new IllegalArgumentException("No available camera can be found.");
            }
            if (!arrayList.containsAll(arrayList2)) {
                throw new IllegalArgumentException("The output isn't contained in the input.");
            }
            arrayList.retainAll(arrayList2);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: c */
    public Integer m15297c() {
        Integer num = null;
        for (CameraFilter cameraFilter : this.f36011c) {
            if (cameraFilter instanceof LensFacingCameraFilter) {
                Integer numValueOf = Integer.valueOf(((LensFacingCameraFilter) cameraFilter).f36308a);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }
}
