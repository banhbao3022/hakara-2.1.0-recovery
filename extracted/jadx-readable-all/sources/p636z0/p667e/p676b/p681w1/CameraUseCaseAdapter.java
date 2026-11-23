package p636z0.p667e.p676b.p681w1;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.C7462a;
import p636z0.p667e.p668a.p670e.Camera2DeviceSurfaceManager;
import p636z0.p667e.p668a.p670e.SupportedSurfaceCombination;
import p636z0.p667e.p668a.p670e.p671w1.CameraCharacteristicsCompat;
import p636z0.p667e.p668a.p670e.p671w1.p673p.AspectRatioLegacyApi21Quirk;
import p636z0.p667e.p668a.p670e.p671w1.p673p.DeviceQuirks;
import p636z0.p667e.p668a.p670e.p671w1.p673p.Nexus4AndroidLTargetAspectRatioQuirk;
import p636z0.p667e.p668a.p670e.p671w1.p673p.SamsungPreviewTargetAspectRatioQuirk;
import p636z0.p667e.p668a.p670e.p671w1.p674q.TargetAspectRatio;
import p636z0.p667e.p676b.Camera2;
import p636z0.p667e.p676b.Logger8;
import p636z0.p667e.p676b.UseCase;
import p636z0.p667e.p676b.p677v1.CameraConfig;
import p636z0.p667e.p676b.p677v1.CameraConfigs;
import p636z0.p667e.p676b.p677v1.CameraControlInternal;
import p636z0.p667e.p676b.p677v1.CameraDeviceSurfaceManager;
import p636z0.p667e.p676b.p677v1.CameraInfoInternal;
import p636z0.p667e.p676b.p677v1.CameraInternal2;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.ImageOutputConfig2;
import p636z0.p667e.p676b.p677v1.PreviewConfig;
import p636z0.p667e.p676b.p677v1.SurfaceConfig;
import p636z0.p667e.p676b.p677v1.UseCaseConfig2;
import p636z0.p667e.p676b.p677v1.UseCaseConfigFactory;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.b.w1.c, reason: use source file name */
/* JADX INFO: compiled from: CameraUseCaseAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class CameraUseCaseAdapter implements Camera2 {

    /* JADX INFO: renamed from: f */
    public CameraInternal2 f36335f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashSet<CameraInternal2> f36336g;

    /* JADX INFO: renamed from: h */
    public final CameraDeviceSurfaceManager f36337h;

    /* JADX INFO: renamed from: i */
    public final UseCaseConfigFactory f36338i;

    /* JADX INFO: renamed from: j */
    public final b f36339j;

    /* JADX INFO: renamed from: k */
    public final List<UseCase> f36340k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public CameraConfig f36341l = CameraConfigs.f36306a;

    /* JADX INFO: renamed from: m */
    public final Object f36342m = new Object();

    /* JADX INFO: renamed from: n */
    public boolean f36343n = true;

    /* JADX INFO: renamed from: o */
    public Config3 f36344o = null;

    /* JADX INFO: renamed from: z0.e.b.w1.c$a */
    /* JADX INFO: compiled from: CameraUseCaseAdapter.java */
    public static final class a extends Exception {
        public a() {
        }

        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: renamed from: z0.e.b.w1.c$b */
    /* JADX INFO: compiled from: CameraUseCaseAdapter.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final List<String> f36345a = new ArrayList();

        public b(LinkedHashSet<CameraInternal2> linkedHashSet) {
            Iterator<CameraInternal2> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f36345a.add(it.next().mo15166i().mo15183a());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f36345a.equals(((b) obj).f36345a);
            }
            return false;
        }

        public int hashCode() {
            return this.f36345a.hashCode() * 53;
        }
    }

    /* JADX INFO: renamed from: z0.e.b.w1.c$c */
    /* JADX INFO: compiled from: CameraUseCaseAdapter.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public UseCaseConfig2<?> f36346a;

        /* JADX INFO: renamed from: b */
        public UseCaseConfig2<?> f36347b;

        public c(UseCaseConfig2<?> useCaseConfig2, UseCaseConfig2<?> useCaseConfig3) {
            this.f36346a = useCaseConfig2;
            this.f36347b = useCaseConfig3;
        }
    }

    public CameraUseCaseAdapter(LinkedHashSet<CameraInternal2> linkedHashSet, CameraDeviceSurfaceManager cameraDeviceSurfaceManager, UseCaseConfigFactory useCaseConfigFactory) {
        this.f36335f = linkedHashSet.iterator().next();
        LinkedHashSet<CameraInternal2> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.f36336g = linkedHashSet2;
        this.f36339j = new b(linkedHashSet2);
        this.f36337h = cameraDeviceSurfaceManager;
        this.f36338i = useCaseConfigFactory;
    }

    /* JADX INFO: renamed from: a */
    public void m15447a(Collection<UseCase> collection) throws a {
        synchronized (this.f36342m) {
            ArrayList<UseCase> arrayList = new ArrayList();
            for (UseCase useCase : collection) {
                if (this.f36340k.contains(useCase)) {
                    Logger8.m15272a("CameraUseCaseAdapter", "Attempting to attach already attached UseCase", null);
                } else {
                    arrayList.add(useCase);
                }
            }
            UseCaseConfigFactory useCaseConfigFactory = ((CameraConfigs.a) this.f36341l).f36307r;
            UseCaseConfigFactory useCaseConfigFactory2 = this.f36338i;
            HashMap map = new HashMap();
            for (UseCase useCase2 : arrayList) {
                map.put(useCase2, new c(useCase2.mo15246c(false, useCaseConfigFactory), useCase2.mo15246c(true, useCaseConfigFactory2)));
            }
            try {
                Map<UseCase, Size> mapM15449c = m15449c(this.f36335f.mo15166i(), arrayList, this.f36340k, map);
                synchronized (this.f36342m) {
                }
                for (UseCase useCase3 : arrayList) {
                    c cVar = (c) map.get(useCase3);
                    useCase3.m15307j(this.f36335f, cVar.f36346a, cVar.f36347b);
                    Size size = (Size) ((HashMap) mapM15449c).get(useCase3);
                    Objects.requireNonNull(size);
                    useCase3.f36019g = useCase3.mo15250o(size);
                }
                this.f36340k.addAll(arrayList);
                if (this.f36343n) {
                    this.f36335f.mo15164g(arrayList);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((UseCase) it.next()).m15306i();
                }
            } catch (IllegalArgumentException e) {
                throw new a(e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15448b() {
        synchronized (this.f36342m) {
            if (!this.f36343n) {
                this.f36335f.mo15164g(this.f36340k);
                synchronized (this.f36342m) {
                    if (this.f36344o != null) {
                        this.f36335f.mo15162e().mo15118a(this.f36344o);
                    }
                }
                Iterator<UseCase> it = this.f36340k.iterator();
                while (it.hasNext()) {
                    it.next().m15306i();
                }
                this.f36343n = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0291 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0294  */
    /* JADX WARN: Code duplicated, block: B:105:0x029e  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:109:0x02be  */
    /* JADX WARN: Code duplicated, block: B:111:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:115:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:116:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:123:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:125:0x0302  */
    /* JADX WARN: Code duplicated, block: B:127:0x0306  */
    /* JADX WARN: Code duplicated, block: B:128:0x0309  */
    /* JADX WARN: Code duplicated, block: B:132:0x030f  */
    /* JADX WARN: Code duplicated, block: B:135:0x031f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0324  */
    /* JADX WARN: Code duplicated, block: B:139:0x032f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0352  */
    /* JADX WARN: Code duplicated, block: B:145:0x0366  */
    /* JADX WARN: Code duplicated, block: B:147:0x036e  */
    /* JADX WARN: Code duplicated, block: B:148:0x037a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0393  */
    /* JADX WARN: Code duplicated, block: B:151:0x0398  */
    /* JADX WARN: Code duplicated, block: B:153:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:155:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:170:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:172:0x0409  */
    /* JADX WARN: Code duplicated, block: B:177:0x0423  */
    /* JADX WARN: Code duplicated, block: B:181:0x044f  */
    /* JADX WARN: Code duplicated, block: B:184:0x045d A[LOOP:11: B:182:0x0457->B:184:0x045d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x0488  */
    /* JADX WARN: Code duplicated, block: B:191:0x049e  */
    /* JADX WARN: Code duplicated, block: B:260:0x04c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x043c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x040d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x04aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0498 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:72:0x020b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0215  */
    /* JADX WARN: Code duplicated, block: B:77:0x022d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0255  */
    /* JADX WARN: Code duplicated, block: B:90:0x026e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0279  */
    /* JADX WARN: Code duplicated, block: B:95:0x0287  */
    /* JADX WARN: Code duplicated, block: B:98:0x028c  */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x02a6, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final Map<UseCase, Size> m15449c(CameraInfoInternal cameraInfoInternal, List<UseCase> list, List<UseCase> list2, Map<UseCase, c> map) {
        List<Pair<Integer, Size[]>> list3;
        Size[] sizeArrM15139d;
        Size sizeM15140f;
        Size size;
        Iterator it;
        int iM15134e;
        Size size2;
        int length;
        HashMap map2;
        int i;
        char c2;
        Rational rational;
        Rational rational2;
        Rational rational3;
        ArrayList arrayList;
        HashMap map3;
        Iterator it2;
        ArrayList arrayList2;
        HashMap map4;
        HashMap map5;
        ArrayList arrayList3;
        Iterator it3;
        Iterator it4;
        Size size3;
        Iterator it5;
        ArrayList arrayList4;
        Rational rational4;
        Iterator it6;
        Iterator it7;
        HashMap map6;
        HashMap map7;
        ArrayList arrayList5;
        int width;
        int height;
        Rational rational5;
        ArrayList arrayList6;
        int i2;
        boolean zM15135g;
        ArrayList arrayList7;
        ArrayList arrayList8;
        List list4;
        Size sizeM15140f2;
        int iMo15347s;
        Size size4;
        ArrayList arrayList9 = new ArrayList();
        String strMo15183a = cameraInfoInternal.mo15183a();
        HashMap map8 = new HashMap();
        Iterator<UseCase> it8 = list2.iterator();
        while (true) {
            list3 = null;
            SurfaceConfig surfaceConfigM15142i = null;
            if (!it8.hasNext()) {
                break;
            }
            UseCase next = it8.next();
            CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.f36337h;
            int iM15302d = next.m15302d();
            Size size5 = next.f36019g;
            SupportedSurfaceCombination supportedSurfaceCombination = ((Camera2DeviceSurfaceManager) cameraDeviceSurfaceManager).f35681a.get(strMo15183a);
            if (supportedSurfaceCombination != null) {
                surfaceConfigM15142i = supportedSurfaceCombination.m15142i(iM15302d, size5);
            }
            arrayList9.add(surfaceConfigM15142i);
            map8.put(next, next.f36019g);
        }
        if (list.isEmpty()) {
            return map8;
        }
        HashMap map9 = new HashMap();
        for (UseCase useCase : list) {
            c cVar = map.get(useCase);
            map9.put(useCase.m15304g(cameraInfoInternal, cVar.f36346a, cVar.f36347b), useCase);
        }
        CameraDeviceSurfaceManager cameraDeviceSurfaceManager2 = this.f36337h;
        ArrayList<UseCaseConfig2> arrayList10 = new ArrayList(map9.keySet());
        Camera2DeviceSurfaceManager camera2DeviceSurfaceManager = (Camera2DeviceSurfaceManager) cameraDeviceSurfaceManager2;
        Objects.requireNonNull(camera2DeviceSurfaceManager);
        boolean z = true;
        C8162a.m16061f(!arrayList10.isEmpty(), "No new use cases to be bound.");
        ArrayList arrayList11 = new ArrayList(arrayList9);
        Iterator it9 = arrayList10.iterator();
        while (it9.hasNext()) {
            int iMo15108i = ((UseCaseConfig2) it9.next()).mo15108i();
            Size size6 = new Size(640, 480);
            SupportedSurfaceCombination supportedSurfaceCombination2 = camera2DeviceSurfaceManager.f35681a.get(strMo15183a);
            arrayList11.add(supportedSurfaceCombination2 != null ? supportedSurfaceCombination2.m15142i(iMo15108i, size6) : null);
        }
        SupportedSurfaceCombination supportedSurfaceCombination3 = camera2DeviceSurfaceManager.f35681a.get(strMo15183a);
        if (supportedSurfaceCombination3 == null) {
            throw new IllegalArgumentException(outline.m1599u("No such camera id in supported combination list: ", strMo15183a));
        }
        if (!supportedSurfaceCombination3.m15136a(arrayList11)) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + strMo15183a + ".  May be attempting to bind too many use cases. Existing surfaces: " + arrayList9 + " New configs: " + arrayList10);
        }
        HashMap map10 = new HashMap();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        Iterator it10 = arrayList10.iterator();
        while (it10.hasNext()) {
            int iMo15114r = ((UseCaseConfig2) it10.next()).mo15114r(0);
            if (!arrayList13.contains(Integer.valueOf(iMo15114r))) {
                arrayList13.add(Integer.valueOf(iMo15114r));
            }
        }
        Collections.sort(arrayList13);
        Collections.reverse(arrayList13);
        Iterator it11 = arrayList13.iterator();
        while (it11.hasNext()) {
            int iIntValue = ((Integer) it11.next()).intValue();
            for (UseCaseConfig2 useCaseConfig2 : arrayList10) {
                if (iIntValue == useCaseConfig2.mo15114r(0)) {
                    arrayList12.add(Integer.valueOf(arrayList10.indexOf(useCaseConfig2)));
                }
            }
        }
        ArrayList arrayList14 = new ArrayList();
        Iterator it12 = arrayList12.iterator();
        ArrayList arrayList15 = arrayList10;
        while (it12.hasNext()) {
            UseCaseConfig2 useCaseConfig3 = (UseCaseConfig2) arrayList15.get(((Integer) it12.next()).intValue());
            int iMo15108i2 = useCaseConfig3.mo15108i();
            ImageOutputConfig2 imageOutputConfig2 = (ImageOutputConfig2) useCaseConfig3;
            List<Pair<Integer, Size[]>> listMo15343g = imageOutputConfig2.mo15343g(list3);
            if (listMo15343g == null) {
                sizeArrM15139d = null;
                break;
            }
            Iterator<Pair<Integer, Size[]>> it13 = listMo15343g.iterator();
            while (true) {
                if (!it13.hasNext()) {
                    sizeArrM15139d = null;
                    break;
                }
                Pair<Integer, Size[]> next2 = it13.next();
                if (((Integer) next2.first).intValue() == iMo15108i2) {
                    sizeArrM15139d = (Size[]) next2.second;
                    break;
                }
            }
            if (sizeArrM15139d != null) {
                sizeArrM15139d = supportedSurfaceCombination3.m15137b(sizeArrM15139d, iMo15108i2);
                Arrays.sort(sizeArrM15139d, new SupportedSurfaceCombination.b(z));
            }
            if (sizeArrM15139d == null) {
                sizeArrM15139d = supportedSurfaceCombination3.m15139d(iMo15108i2);
            }
            ArrayList arrayList16 = new ArrayList();
            Size sizeMo15342f = imageOutputConfig2.mo15342f(null);
            Size size7 = (Size) Collections.max(Arrays.asList(supportedSurfaceCombination3.m15139d(iMo15108i2)), new SupportedSurfaceCombination.b());
            if (sizeMo15342f != null) {
                if (SupportedSurfaceCombination.m15134e(size7) < sizeMo15342f.getHeight() * sizeMo15342f.getWidth()) {
                }
                Arrays.sort(sizeArrM15139d, new SupportedSurfaceCombination.b(true));
                sizeM15140f = supportedSurfaceCombination3.m15140f(imageOutputConfig2);
                size = SupportedSurfaceCombination.f35548b;
                it = it12;
                iM15134e = SupportedSurfaceCombination.m15134e(size);
                if (SupportedSurfaceCombination.m15134e(sizeMo15342f) < iM15134e) {
                    size2 = SupportedSurfaceCombination.f35549c;
                } else if (sizeM15140f != null || sizeM15140f.getWidth() * sizeM15140f.getHeight() >= iM15134e) {
                    size2 = size;
                } else {
                    size2 = sizeM15140f;
                }
                length = sizeArrM15139d.length;
                map2 = map8;
                i = 0;
                while (i < length) {
                    int i3 = length;
                    size4 = sizeArrM15139d[i];
                    Size[] sizeArr = sizeArrM15139d;
                    Size size8 = sizeMo15342f;
                    if (SupportedSurfaceCombination.m15134e(size4) <= sizeMo15342f.getHeight() * sizeMo15342f.getWidth()) {
                        if (size4.getHeight() * size4.getWidth() < SupportedSurfaceCombination.m15134e(size2) && !arrayList16.contains(size4)) {
                            arrayList16.add(size4);
                        }
                    }
                    i++;
                    sizeArrM15139d = sizeArr;
                    sizeMo15342f = size8;
                    length = i3;
                }
                if (!arrayList16.isEmpty()) {
                    throw new IllegalArgumentException(outline.m1590l("Can not get supported output size under supported maximum for the format: ", iMo15108i2));
                }
                new TargetAspectRatio();
                CameraCharacteristicsCompat cameraCharacteristicsCompat = supportedSurfaceCombination3.f35562p;
                if (((SamsungPreviewTargetAspectRatioQuirk) DeviceQuirks.m15238a(SamsungPreviewTargetAspectRatioQuirk.class)) == null && (imageOutputConfig2 instanceof PreviewConfig)) {
                    c2 = 1;
                } else if (((Nexus4AndroidLTargetAspectRatioQuirk) DeviceQuirks.m15238a(Nexus4AndroidLTargetAspectRatioQuirk.class)) != null && ((AspectRatioLegacyApi21Quirk) C7462a.m14571h(cameraCharacteristicsCompat).m15353a(AspectRatioLegacyApi21Quirk.class)) == null) {
                    c2 = 3;
                } else {
                    c2 = 2;
                }
                if (c2 != 0) {
                    if (c2 != 1) {
                        if (c2 != 2) {
                            Size sizeM15138c = supportedSurfaceCombination3.m15138c(256);
                            rational2 = new Rational(sizeM15138c.getWidth(), sizeM15138c.getHeight());
                        } else if (c2 != 3) {
                            rational2 = null;
                        } else {
                            sizeM15140f2 = supportedSurfaceCombination3.m15140f(imageOutputConfig2);
                            if (imageOutputConfig2.mo15346q()) {
                                iMo15347s = imageOutputConfig2.mo15347s();
                                if (iMo15347s != 0) {
                                    if (iMo15347s != 1) {
                                        Logger8.m15273b("SupportedSurfaceCombination", "Undefined target aspect ratio: " + iMo15347s, null);
                                    } else if (supportedSurfaceCombination3.f35565s) {
                                        rational = SupportedSurfaceCombination.f35556j;
                                    } else {
                                        rational = SupportedSurfaceCombination.f35557k;
                                    }
                                } else if (supportedSurfaceCombination3.f35565s) {
                                    rational = SupportedSurfaceCombination.f35554h;
                                } else {
                                    rational = SupportedSurfaceCombination.f35555i;
                                }
                            } else if (sizeM15140f2 != null) {
                                rational2 = new Rational(sizeM15140f2.getWidth(), sizeM15140f2.getHeight());
                            }
                            rational2 = null;
                        }
                        rational3 = null;
                        if (sizeM15140f == null) {
                            sizeM15140f = imageOutputConfig2.mo15344m(null);
                        }
                        arrayList = new ArrayList();
                        new HashMap();
                        if (rational2 == null) {
                            arrayList.addAll(arrayList16);
                            if (sizeM15140f != null) {
                                supportedSurfaceCombination3.m15141h(arrayList, sizeM15140f);
                            }
                            map4 = map10;
                            map5 = map9;
                            arrayList3 = arrayList15;
                        } else {
                            map3 = new HashMap();
                            map3.put(SupportedSurfaceCombination.f35554h, new ArrayList());
                            map3.put(SupportedSurfaceCombination.f35556j, new ArrayList());
                            it2 = arrayList16.iterator();
                            arrayList2 = arrayList15;
                            while (it2.hasNext()) {
                                size3 = (Size) it2.next();
                                it5 = map3.keySet().iterator();
                                arrayList4 = arrayList2;
                                while (it5.hasNext()) {
                                    rational4 = (Rational) it5.next();
                                    if (rational4 == null) {
                                        map7 = map10;
                                        map6 = map9;
                                        arrayList5 = arrayList4;
                                        it6 = it2;
                                        it7 = it5;
                                    } else {
                                        it6 = it2;
                                        it7 = it5;
                                        map6 = map9;
                                        if (rational4.equals(new Rational(size3.getWidth(), size3.getHeight()))) {
                                            map7 = map10;
                                            arrayList7 = arrayList4;
                                        } else if (size3.getHeight() * size3.getWidth() >= SupportedSurfaceCombination.m15134e(SupportedSurfaceCombination.f35548b)) {
                                            width = size3.getWidth();
                                            height = size3.getHeight();
                                            map7 = map10;
                                            arrayList6 = arrayList4;
                                            rational5 = new Rational(rational4.getDenominator(), rational4.getNumerator());
                                            i2 = width % 16;
                                            if (i2 == 0 || height % 16 != 0) {
                                                if (i2 == 0) {
                                                    zM15135g = SupportedSurfaceCombination.m15135g(height, width, rational4);
                                                } else if (height % 16 == 0) {
                                                    zM15135g = SupportedSurfaceCombination.m15135g(width, height, rational5);
                                                }
                                                if (zM15135g) {
                                                    arrayList5 = arrayList6;
                                                    arrayList8 = arrayList6;
                                                    arrayList8 = arrayList6;
                                                    list4 = (List) map3.get(rational4);
                                                    if (!list4.contains(size3)) {
                                                        list4.add(size3);
                                                    }
                                                    rational3 = rational4;
                                                } else {
                                                    arrayList5 = arrayList6;
                                                    arrayList8 = arrayList6;
                                                    arrayList8 = arrayList6;
                                                }
                                                it2 = it6;
                                                it5 = it7;
                                                map10 = map7;
                                                map9 = map6;
                                                arrayList4 = arrayList8;
                                            } else {
                                                if (SupportedSurfaceCombination.m15135g(Math.max(0, height - 16), width, rational4) || SupportedSurfaceCombination.m15135g(Math.max(0, width - 16), height, rational5)) {
                                                }
                                                if (zM15135g) {
                                                    arrayList5 = arrayList6;
                                                    arrayList8 = arrayList6;
                                                    arrayList8 = arrayList6;
                                                    list4 = (List) map3.get(rational4);
                                                    if (!list4.contains(size3)) {
                                                        list4.add(size3);
                                                    }
                                                    rational3 = rational4;
                                                } else {
                                                    arrayList5 = arrayList6;
                                                    arrayList8 = arrayList6;
                                                    arrayList8 = arrayList6;
                                                }
                                                it2 = it6;
                                                it5 = it7;
                                                map10 = map7;
                                                map9 = map6;
                                                arrayList4 = arrayList8;
                                            }
                                        } else {
                                            map7 = map10;
                                            arrayList5 = arrayList4;
                                        }
                                        arrayList7 = arrayList6;
                                        arrayList5 = arrayList6;
                                        arrayList7 = arrayList6;
                                        arrayList7 = arrayList6;
                                        zM15135g = true;
                                        arrayList8 = arrayList7;
                                        if (zM15135g) {
                                            arrayList5 = arrayList6;
                                            arrayList8 = arrayList6;
                                            arrayList8 = arrayList6;
                                            list4 = (List) map3.get(rational4);
                                            if (!list4.contains(size3)) {
                                                list4.add(size3);
                                            }
                                            rational3 = rational4;
                                        } else {
                                            arrayList5 = arrayList6;
                                            arrayList8 = arrayList6;
                                            arrayList8 = arrayList6;
                                        }
                                        it2 = it6;
                                        it5 = it7;
                                        map10 = map7;
                                        map9 = map6;
                                        arrayList4 = arrayList8;
                                    }
                                    arrayList5 = arrayList6;
                                    arrayList7 = arrayList6;
                                    arrayList5 = arrayList6;
                                    arrayList7 = arrayList6;
                                    zM15135g = false;
                                    arrayList8 = arrayList5;
                                    if (zM15135g) {
                                        arrayList5 = arrayList6;
                                        arrayList8 = arrayList6;
                                        arrayList8 = arrayList6;
                                        list4 = (List) map3.get(rational4);
                                        if (!list4.contains(size3)) {
                                            list4.add(size3);
                                        }
                                        rational3 = rational4;
                                    } else {
                                        arrayList5 = arrayList6;
                                        arrayList8 = arrayList6;
                                        arrayList8 = arrayList6;
                                    }
                                    it2 = it6;
                                    it5 = it7;
                                    map10 = map7;
                                    map9 = map6;
                                    arrayList4 = arrayList8;
                                }
                                HashMap map11 = map10;
                                HashMap map12 = map9;
                                ArrayList arrayList17 = arrayList4;
                                Iterator it14 = it2;
                                if (rational3 == null) {
                                    map3.put(new Rational(size3.getWidth(), size3.getHeight()), new ArrayList(Collections.singleton(size3)));
                                }
                                rational3 = null;
                                it2 = it14;
                                map10 = map11;
                                map9 = map12;
                                arrayList2 = arrayList17;
                            }
                            map4 = map10;
                            map5 = map9;
                            arrayList3 = arrayList2;
                            if (sizeM15140f != null) {
                                it4 = map3.keySet().iterator();
                                while (it4.hasNext()) {
                                    supportedSurfaceCombination3.m15141h((List) map3.get((Rational) it4.next()), sizeM15140f);
                                }
                            }
                            ArrayList arrayList18 = new ArrayList(map3.keySet());
                            Collections.sort(arrayList18, new SupportedSurfaceCombination.a(rational2));
                            it3 = arrayList18.iterator();
                            while (it3.hasNext()) {
                                for (Size size9 : (List) map3.get((Rational) it3.next())) {
                                    if (!arrayList.contains(size9)) {
                                        arrayList.add(size9);
                                    }
                                }
                            }
                        }
                        arrayList14.add(arrayList);
                        list3 = null;
                        z = true;
                        it12 = it;
                        map10 = map4;
                        map9 = map5;
                        map8 = map2;
                        arrayList15 = arrayList3;
                    } else if (supportedSurfaceCombination3.f35565s) {
                        rational = SupportedSurfaceCombination.f35556j;
                    } else {
                        rational = SupportedSurfaceCombination.f35557k;
                    }
                } else if (supportedSurfaceCombination3.f35565s) {
                    rational = SupportedSurfaceCombination.f35554h;
                } else {
                    rational = SupportedSurfaceCombination.f35555i;
                }
                rational2 = rational;
                rational3 = null;
                if (sizeM15140f == null) {
                    sizeM15140f = imageOutputConfig2.mo15344m(null);
                }
                arrayList = new ArrayList();
                new HashMap();
                if (rational2 == null) {
                    arrayList.addAll(arrayList16);
                    if (sizeM15140f != null) {
                        supportedSurfaceCombination3.m15141h(arrayList, sizeM15140f);
                    }
                    map4 = map10;
                    map5 = map9;
                    arrayList3 = arrayList15;
                } else {
                    map3 = new HashMap();
                    map3.put(SupportedSurfaceCombination.f35554h, new ArrayList());
                    map3.put(SupportedSurfaceCombination.f35556j, new ArrayList());
                    it2 = arrayList16.iterator();
                    arrayList2 = arrayList15;
                    while (it2.hasNext()) {
                        size3 = (Size) it2.next();
                        it5 = map3.keySet().iterator();
                        arrayList4 = arrayList2;
                        while (it5.hasNext()) {
                            rational4 = (Rational) it5.next();
                            if (rational4 == null) {
                                map7 = map10;
                                map6 = map9;
                                arrayList5 = arrayList4;
                                it6 = it2;
                                it7 = it5;
                            } else {
                                it6 = it2;
                                it7 = it5;
                                map6 = map9;
                                if (rational4.equals(new Rational(size3.getWidth(), size3.getHeight()))) {
                                    map7 = map10;
                                    arrayList7 = arrayList4;
                                } else if (size3.getHeight() * size3.getWidth() >= SupportedSurfaceCombination.m15134e(SupportedSurfaceCombination.f35548b)) {
                                    width = size3.getWidth();
                                    height = size3.getHeight();
                                    map7 = map10;
                                    arrayList6 = arrayList4;
                                    rational5 = new Rational(rational4.getDenominator(), rational4.getNumerator());
                                    i2 = width % 16;
                                    if (i2 == 0) {
                                        if (i2 == 0) {
                                            zM15135g = SupportedSurfaceCombination.m15135g(height, width, rational4);
                                        } else if (height % 16 == 0) {
                                            zM15135g = SupportedSurfaceCombination.m15135g(width, height, rational5);
                                        }
                                    } else if (i2 == 0) {
                                        zM15135g = SupportedSurfaceCombination.m15135g(height, width, rational4);
                                    } else if (height % 16 == 0) {
                                        zM15135g = SupportedSurfaceCombination.m15135g(width, height, rational5);
                                    }
                                    if (zM15135g) {
                                        arrayList5 = arrayList6;
                                        arrayList8 = arrayList6;
                                        arrayList8 = arrayList6;
                                        list4 = (List) map3.get(rational4);
                                        if (!list4.contains(size3)) {
                                            list4.add(size3);
                                        }
                                        rational3 = rational4;
                                    } else {
                                        arrayList5 = arrayList6;
                                        arrayList8 = arrayList6;
                                        arrayList8 = arrayList6;
                                    }
                                    it2 = it6;
                                    it5 = it7;
                                    map10 = map7;
                                    map9 = map6;
                                    arrayList4 = arrayList8;
                                } else {
                                    map7 = map10;
                                    arrayList5 = arrayList4;
                                }
                                arrayList7 = arrayList6;
                                arrayList5 = arrayList6;
                                arrayList7 = arrayList6;
                                arrayList7 = arrayList6;
                                zM15135g = true;
                                arrayList8 = arrayList7;
                                if (zM15135g) {
                                    arrayList5 = arrayList6;
                                    arrayList8 = arrayList6;
                                    arrayList8 = arrayList6;
                                    list4 = (List) map3.get(rational4);
                                    if (!list4.contains(size3)) {
                                        list4.add(size3);
                                    }
                                    rational3 = rational4;
                                } else {
                                    arrayList5 = arrayList6;
                                    arrayList8 = arrayList6;
                                    arrayList8 = arrayList6;
                                }
                                it2 = it6;
                                it5 = it7;
                                map10 = map7;
                                map9 = map6;
                                arrayList4 = arrayList8;
                            }
                            arrayList5 = arrayList6;
                            arrayList7 = arrayList6;
                            arrayList5 = arrayList6;
                            arrayList7 = arrayList6;
                            zM15135g = false;
                            arrayList8 = arrayList5;
                            if (zM15135g) {
                                arrayList5 = arrayList6;
                                arrayList8 = arrayList6;
                                arrayList8 = arrayList6;
                                list4 = (List) map3.get(rational4);
                                if (!list4.contains(size3)) {
                                    list4.add(size3);
                                }
                                rational3 = rational4;
                            } else {
                                arrayList5 = arrayList6;
                                arrayList8 = arrayList6;
                                arrayList8 = arrayList6;
                            }
                            it2 = it6;
                            it5 = it7;
                            map10 = map7;
                            map9 = map6;
                            arrayList4 = arrayList8;
                        }
                        HashMap map13 = map10;
                        HashMap map14 = map9;
                        ArrayList arrayList19 = arrayList4;
                        Iterator it15 = it2;
                        if (rational3 == null) {
                            map3.put(new Rational(size3.getWidth(), size3.getHeight()), new ArrayList(Collections.singleton(size3)));
                        }
                        rational3 = null;
                        it2 = it15;
                        map10 = map13;
                        map9 = map14;
                        arrayList2 = arrayList19;
                    }
                    map4 = map10;
                    map5 = map9;
                    arrayList3 = arrayList2;
                    if (sizeM15140f != null) {
                        it4 = map3.keySet().iterator();
                        while (it4.hasNext()) {
                            supportedSurfaceCombination3.m15141h((List) map3.get((Rational) it4.next()), sizeM15140f);
                        }
                    }
                    ArrayList arrayList110 = new ArrayList(map3.keySet());
                    Collections.sort(arrayList110, new SupportedSurfaceCombination.a(rational2));
                    it3 = arrayList110.iterator();
                    while (it3.hasNext()) {
                        while (r2.hasNext()) {
                            if (!arrayList.contains(size9)) {
                                arrayList.add(size9);
                            }
                        }
                    }
                }
                arrayList14.add(arrayList);
                list3 = null;
                z = true;
                it12 = it;
                map10 = map4;
                map9 = map5;
                map8 = map2;
                arrayList15 = arrayList3;
            }
            sizeMo15342f = size7;
            Arrays.sort(sizeArrM15139d, new SupportedSurfaceCombination.b(true));
            sizeM15140f = supportedSurfaceCombination3.m15140f(imageOutputConfig2);
            size = SupportedSurfaceCombination.f35548b;
            it = it12;
            iM15134e = SupportedSurfaceCombination.m15134e(size);
            if (SupportedSurfaceCombination.m15134e(sizeMo15342f) < iM15134e) {
                size2 = SupportedSurfaceCombination.f35549c;
            } else if (sizeM15140f != null) {
                size2 = size;
            } else {
                size2 = size;
            }
            length = sizeArrM15139d.length;
            map2 = map8;
            i = 0;
            while (i < length) {
                int i4 = length;
                size4 = sizeArrM15139d[i];
                Size[] sizeArr2 = sizeArrM15139d;
                Size size10 = sizeMo15342f;
                if (SupportedSurfaceCombination.m15134e(size4) <= sizeMo15342f.getHeight() * sizeMo15342f.getWidth()) {
                    if (size4.getHeight() * size4.getWidth() < SupportedSurfaceCombination.m15134e(size2)) {
                    }
                }
                i++;
                sizeArrM15139d = sizeArr2;
                sizeMo15342f = size10;
                length = i4;
            }
            if (!arrayList16.isEmpty()) {
                throw new IllegalArgumentException(outline.m1590l("Can not get supported output size under supported maximum for the format: ", iMo15108i2));
            }
            new TargetAspectRatio();
            CameraCharacteristicsCompat cameraCharacteristicsCompat2 = supportedSurfaceCombination3.f35562p;
            if (((SamsungPreviewTargetAspectRatioQuirk) DeviceQuirks.m15238a(SamsungPreviewTargetAspectRatioQuirk.class)) == null) {
                if (((Nexus4AndroidLTargetAspectRatioQuirk) DeviceQuirks.m15238a(Nexus4AndroidLTargetAspectRatioQuirk.class)) != null) {
                    c2 = 2;
                } else {
                    c2 = 3;
                }
            } else if (((Nexus4AndroidLTargetAspectRatioQuirk) DeviceQuirks.m15238a(Nexus4AndroidLTargetAspectRatioQuirk.class)) != null) {
                c2 = 2;
            } else {
                c2 = 3;
            }
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 != 2) {
                        Size sizeM15138c2 = supportedSurfaceCombination3.m15138c(256);
                        rational2 = new Rational(sizeM15138c2.getWidth(), sizeM15138c2.getHeight());
                    } else if (c2 != 3) {
                        rational2 = null;
                    } else {
                        sizeM15140f2 = supportedSurfaceCombination3.m15140f(imageOutputConfig2);
                        if (imageOutputConfig2.mo15346q()) {
                            iMo15347s = imageOutputConfig2.mo15347s();
                            if (iMo15347s != 0) {
                                if (iMo15347s != 1) {
                                    Logger8.m15273b("SupportedSurfaceCombination", "Undefined target aspect ratio: " + iMo15347s, null);
                                } else if (supportedSurfaceCombination3.f35565s) {
                                    rational = SupportedSurfaceCombination.f35556j;
                                } else {
                                    rational = SupportedSurfaceCombination.f35557k;
                                }
                            } else if (supportedSurfaceCombination3.f35565s) {
                                rational = SupportedSurfaceCombination.f35554h;
                            } else {
                                rational = SupportedSurfaceCombination.f35555i;
                            }
                        } else if (sizeM15140f2 != null) {
                            rational2 = new Rational(sizeM15140f2.getWidth(), sizeM15140f2.getHeight());
                        }
                        rational2 = null;
                    }
                    rational3 = null;
                    if (sizeM15140f == null) {
                        sizeM15140f = imageOutputConfig2.mo15344m(null);
                    }
                    arrayList = new ArrayList();
                    new HashMap();
                    if (rational2 == null) {
                        arrayList.addAll(arrayList16);
                        if (sizeM15140f != null) {
                            supportedSurfaceCombination3.m15141h(arrayList, sizeM15140f);
                        }
                        map4 = map10;
                        map5 = map9;
                        arrayList3 = arrayList15;
                    } else {
                        map3 = new HashMap();
                        map3.put(SupportedSurfaceCombination.f35554h, new ArrayList());
                        map3.put(SupportedSurfaceCombination.f35556j, new ArrayList());
                        it2 = arrayList16.iterator();
                        arrayList2 = arrayList15;
                        while (it2.hasNext()) {
                            size3 = (Size) it2.next();
                            it5 = map3.keySet().iterator();
                            arrayList4 = arrayList2;
                            while (it5.hasNext()) {
                                rational4 = (Rational) it5.next();
                                if (rational4 == null) {
                                    map7 = map10;
                                    map6 = map9;
                                    arrayList5 = arrayList4;
                                    it6 = it2;
                                    it7 = it5;
                                } else {
                                    it6 = it2;
                                    it7 = it5;
                                    map6 = map9;
                                    if (rational4.equals(new Rational(size3.getWidth(), size3.getHeight()))) {
                                        map7 = map10;
                                        arrayList7 = arrayList4;
                                    } else if (size3.getHeight() * size3.getWidth() >= SupportedSurfaceCombination.m15134e(SupportedSurfaceCombination.f35548b)) {
                                        width = size3.getWidth();
                                        height = size3.getHeight();
                                        map7 = map10;
                                        arrayList6 = arrayList4;
                                        rational5 = new Rational(rational4.getDenominator(), rational4.getNumerator());
                                        i2 = width % 16;
                                        if (i2 == 0) {
                                            if (i2 == 0) {
                                                zM15135g = SupportedSurfaceCombination.m15135g(height, width, rational4);
                                            } else if (height % 16 == 0) {
                                                zM15135g = SupportedSurfaceCombination.m15135g(width, height, rational5);
                                            }
                                        } else if (i2 == 0) {
                                            zM15135g = SupportedSurfaceCombination.m15135g(height, width, rational4);
                                        } else if (height % 16 == 0) {
                                            zM15135g = SupportedSurfaceCombination.m15135g(width, height, rational5);
                                        }
                                        if (zM15135g) {
                                            arrayList5 = arrayList6;
                                            arrayList8 = arrayList6;
                                            arrayList8 = arrayList6;
                                            list4 = (List) map3.get(rational4);
                                            if (!list4.contains(size3)) {
                                                list4.add(size3);
                                            }
                                            rational3 = rational4;
                                        } else {
                                            arrayList5 = arrayList6;
                                            arrayList8 = arrayList6;
                                            arrayList8 = arrayList6;
                                        }
                                        it2 = it6;
                                        it5 = it7;
                                        map10 = map7;
                                        map9 = map6;
                                        arrayList4 = arrayList8;
                                    } else {
                                        map7 = map10;
                                        arrayList5 = arrayList4;
                                    }
                                    arrayList7 = arrayList6;
                                    arrayList5 = arrayList6;
                                    arrayList7 = arrayList6;
                                    arrayList7 = arrayList6;
                                    zM15135g = true;
                                    arrayList8 = arrayList7;
                                    if (zM15135g) {
                                        arrayList5 = arrayList6;
                                        arrayList8 = arrayList6;
                                        arrayList8 = arrayList6;
                                        list4 = (List) map3.get(rational4);
                                        if (!list4.contains(size3)) {
                                            list4.add(size3);
                                        }
                                        rational3 = rational4;
                                    } else {
                                        arrayList5 = arrayList6;
                                        arrayList8 = arrayList6;
                                        arrayList8 = arrayList6;
                                    }
                                    it2 = it6;
                                    it5 = it7;
                                    map10 = map7;
                                    map9 = map6;
                                    arrayList4 = arrayList8;
                                }
                                arrayList5 = arrayList6;
                                arrayList7 = arrayList6;
                                arrayList5 = arrayList6;
                                arrayList7 = arrayList6;
                                zM15135g = false;
                                arrayList8 = arrayList5;
                                if (zM15135g) {
                                    arrayList5 = arrayList6;
                                    arrayList8 = arrayList6;
                                    arrayList8 = arrayList6;
                                    list4 = (List) map3.get(rational4);
                                    if (!list4.contains(size3)) {
                                        list4.add(size3);
                                    }
                                    rational3 = rational4;
                                } else {
                                    arrayList5 = arrayList6;
                                    arrayList8 = arrayList6;
                                    arrayList8 = arrayList6;
                                }
                                it2 = it6;
                                it5 = it7;
                                map10 = map7;
                                map9 = map6;
                                arrayList4 = arrayList8;
                            }
                            HashMap map15 = map10;
                            HashMap map16 = map9;
                            ArrayList arrayList111 = arrayList4;
                            Iterator it16 = it2;
                            if (rational3 == null) {
                                map3.put(new Rational(size3.getWidth(), size3.getHeight()), new ArrayList(Collections.singleton(size3)));
                            }
                            rational3 = null;
                            it2 = it16;
                            map10 = map15;
                            map9 = map16;
                            arrayList2 = arrayList111;
                        }
                        map4 = map10;
                        map5 = map9;
                        arrayList3 = arrayList2;
                        if (sizeM15140f != null) {
                            it4 = map3.keySet().iterator();
                            while (it4.hasNext()) {
                                supportedSurfaceCombination3.m15141h((List) map3.get((Rational) it4.next()), sizeM15140f);
                            }
                        }
                        ArrayList arrayList112 = new ArrayList(map3.keySet());
                        Collections.sort(arrayList112, new SupportedSurfaceCombination.a(rational2));
                        it3 = arrayList112.iterator();
                        while (it3.hasNext()) {
                            while (r2.hasNext()) {
                                if (!arrayList.contains(size9)) {
                                    arrayList.add(size9);
                                }
                            }
                        }
                    }
                    arrayList14.add(arrayList);
                    list3 = null;
                    z = true;
                    it12 = it;
                    map10 = map4;
                    map9 = map5;
                    map8 = map2;
                    arrayList15 = arrayList3;
                } else if (supportedSurfaceCombination3.f35565s) {
                    rational = SupportedSurfaceCombination.f35556j;
                } else {
                    rational = SupportedSurfaceCombination.f35557k;
                }
            } else if (supportedSurfaceCombination3.f35565s) {
                rational = SupportedSurfaceCombination.f35554h;
            } else {
                rational = SupportedSurfaceCombination.f35555i;
            }
            rational2 = rational;
            rational3 = null;
            if (sizeM15140f == null) {
                sizeM15140f = imageOutputConfig2.mo15344m(null);
            }
            arrayList = new ArrayList();
            new HashMap();
            if (rational2 == null) {
                arrayList.addAll(arrayList16);
                if (sizeM15140f != null) {
                    supportedSurfaceCombination3.m15141h(arrayList, sizeM15140f);
                }
                map4 = map10;
                map5 = map9;
                arrayList3 = arrayList15;
            } else {
                map3 = new HashMap();
                map3.put(SupportedSurfaceCombination.f35554h, new ArrayList());
                map3.put(SupportedSurfaceCombination.f35556j, new ArrayList());
                it2 = arrayList16.iterator();
                arrayList2 = arrayList15;
                while (it2.hasNext()) {
                    size3 = (Size) it2.next();
                    it5 = map3.keySet().iterator();
                    arrayList4 = arrayList2;
                    while (it5.hasNext()) {
                        rational4 = (Rational) it5.next();
                        if (rational4 == null) {
                            map7 = map10;
                            map6 = map9;
                            arrayList5 = arrayList4;
                            it6 = it2;
                            it7 = it5;
                        } else {
                            it6 = it2;
                            it7 = it5;
                            map6 = map9;
                            if (rational4.equals(new Rational(size3.getWidth(), size3.getHeight()))) {
                                map7 = map10;
                                arrayList7 = arrayList4;
                            } else if (size3.getHeight() * size3.getWidth() >= SupportedSurfaceCombination.m15134e(SupportedSurfaceCombination.f35548b)) {
                                width = size3.getWidth();
                                height = size3.getHeight();
                                map7 = map10;
                                arrayList6 = arrayList4;
                                rational5 = new Rational(rational4.getDenominator(), rational4.getNumerator());
                                i2 = width % 16;
                                if (i2 == 0) {
                                    if (i2 == 0) {
                                        zM15135g = SupportedSurfaceCombination.m15135g(height, width, rational4);
                                    } else if (height % 16 == 0) {
                                        zM15135g = SupportedSurfaceCombination.m15135g(width, height, rational5);
                                    }
                                } else if (i2 == 0) {
                                    zM15135g = SupportedSurfaceCombination.m15135g(height, width, rational4);
                                } else if (height % 16 == 0) {
                                    zM15135g = SupportedSurfaceCombination.m15135g(width, height, rational5);
                                }
                                if (zM15135g) {
                                    arrayList5 = arrayList6;
                                    arrayList8 = arrayList6;
                                    arrayList8 = arrayList6;
                                    list4 = (List) map3.get(rational4);
                                    if (!list4.contains(size3)) {
                                        list4.add(size3);
                                    }
                                    rational3 = rational4;
                                } else {
                                    arrayList5 = arrayList6;
                                    arrayList8 = arrayList6;
                                    arrayList8 = arrayList6;
                                }
                                it2 = it6;
                                it5 = it7;
                                map10 = map7;
                                map9 = map6;
                                arrayList4 = arrayList8;
                            } else {
                                map7 = map10;
                                arrayList5 = arrayList4;
                            }
                            arrayList7 = arrayList6;
                            arrayList5 = arrayList6;
                            arrayList7 = arrayList6;
                            arrayList7 = arrayList6;
                            zM15135g = true;
                            arrayList8 = arrayList7;
                            if (zM15135g) {
                                arrayList5 = arrayList6;
                                arrayList8 = arrayList6;
                                arrayList8 = arrayList6;
                                list4 = (List) map3.get(rational4);
                                if (!list4.contains(size3)) {
                                    list4.add(size3);
                                }
                                rational3 = rational4;
                            } else {
                                arrayList5 = arrayList6;
                                arrayList8 = arrayList6;
                                arrayList8 = arrayList6;
                            }
                            it2 = it6;
                            it5 = it7;
                            map10 = map7;
                            map9 = map6;
                            arrayList4 = arrayList8;
                        }
                        arrayList5 = arrayList6;
                        arrayList7 = arrayList6;
                        arrayList5 = arrayList6;
                        arrayList7 = arrayList6;
                        zM15135g = false;
                        arrayList8 = arrayList5;
                        if (zM15135g) {
                            arrayList5 = arrayList6;
                            arrayList8 = arrayList6;
                            arrayList8 = arrayList6;
                            list4 = (List) map3.get(rational4);
                            if (!list4.contains(size3)) {
                                list4.add(size3);
                            }
                            rational3 = rational4;
                        } else {
                            arrayList5 = arrayList6;
                            arrayList8 = arrayList6;
                            arrayList8 = arrayList6;
                        }
                        it2 = it6;
                        it5 = it7;
                        map10 = map7;
                        map9 = map6;
                        arrayList4 = arrayList8;
                    }
                    HashMap map17 = map10;
                    HashMap map18 = map9;
                    ArrayList arrayList113 = arrayList4;
                    Iterator it17 = it2;
                    if (rational3 == null) {
                        map3.put(new Rational(size3.getWidth(), size3.getHeight()), new ArrayList(Collections.singleton(size3)));
                    }
                    rational3 = null;
                    it2 = it17;
                    map10 = map17;
                    map9 = map18;
                    arrayList2 = arrayList113;
                }
                map4 = map10;
                map5 = map9;
                arrayList3 = arrayList2;
                if (sizeM15140f != null) {
                    it4 = map3.keySet().iterator();
                    while (it4.hasNext()) {
                        supportedSurfaceCombination3.m15141h((List) map3.get((Rational) it4.next()), sizeM15140f);
                    }
                }
                ArrayList arrayList114 = new ArrayList(map3.keySet());
                Collections.sort(arrayList114, new SupportedSurfaceCombination.a(rational2));
                it3 = arrayList114.iterator();
                while (it3.hasNext()) {
                    while (r2.hasNext()) {
                        if (!arrayList.contains(size9)) {
                            arrayList.add(size9);
                        }
                    }
                }
            }
            arrayList14.add(arrayList);
            list3 = null;
            z = true;
            it12 = it;
            map10 = map4;
            map9 = map5;
            map8 = map2;
            arrayList15 = arrayList3;
        }
        HashMap map19 = map10;
        HashMap map20 = map8;
        HashMap map21 = map9;
        ArrayList arrayList20 = arrayList15;
        Iterator it18 = arrayList14.iterator();
        int size11 = 1;
        while (it18.hasNext()) {
            size11 *= ((List) it18.next()).size();
        }
        if (size11 == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList<List> arrayList21 = new ArrayList();
        for (int i5 = 0; i5 < size11; i5++) {
            arrayList21.add(new ArrayList());
        }
        int size12 = size11 / ((List) arrayList14.get(0)).size();
        int i6 = size11;
        for (int i7 = 0; i7 < arrayList14.size(); i7++) {
            List list5 = (List) arrayList14.get(i7);
            for (int i8 = 0; i8 < size11; i8++) {
                ((List) arrayList21.get(i8)).add((Size) list5.get((i8 % i6) / size12));
            }
            if (i7 < arrayList14.size() - 1) {
                i6 = size12;
                size12 /= ((List) arrayList14.get(i7 + 1)).size();
            }
        }
        for (List list6 : arrayList21) {
            ArrayList arrayList22 = new ArrayList(arrayList9);
            for (int i9 = 0; i9 < list6.size(); i9++) {
                arrayList22.add(supportedSurfaceCombination3.m15142i(((UseCaseConfig2) arrayList20.get(((Integer) arrayList12.get(i9)).intValue())).mo15108i(), (Size) list6.get(i9)));
            }
            ArrayList<UseCaseConfig2> arrayList23 = arrayList20;
            if (supportedSurfaceCombination3.m15136a(arrayList22)) {
                for (UseCaseConfig2 useCaseConfig4 : arrayList23) {
                    map19.put(useCaseConfig4, (Size) list6.get(arrayList12.indexOf(Integer.valueOf(arrayList23.indexOf(useCaseConfig4)))));
                }
                break;
            }
            arrayList20 = arrayList23;
        }
        for (Map.Entry entry : map21.entrySet()) {
            map20.put((UseCase) entry.getValue(), (Size) map19.get(entry.getKey()));
        }
        return map20;
    }

    /* JADX INFO: renamed from: d */
    public void m15450d() {
        synchronized (this.f36342m) {
            if (this.f36343n) {
                synchronized (this.f36342m) {
                    CameraControlInternal cameraControlInternalMo15162e = this.f36335f.mo15162e();
                    this.f36344o = cameraControlInternalMo15162e.mo15119b();
                    cameraControlInternalMo15162e.mo15120c();
                }
                this.f36335f.mo15165h(new ArrayList(this.f36340k));
                this.f36343n = false;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public List<UseCase> m15451j() {
        ArrayList arrayList;
        synchronized (this.f36342m) {
            arrayList = new ArrayList(this.f36340k);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public void m15452k(Collection<UseCase> collection) {
        synchronized (this.f36342m) {
            this.f36335f.mo15165h(collection);
            for (UseCase useCase : collection) {
                if (this.f36340k.contains(useCase)) {
                    useCase.m15308l(this.f36335f);
                } else {
                    Logger8.m15273b("CameraUseCaseAdapter", "Attempting to detach non-attached UseCase: " + useCase, null);
                }
            }
            this.f36340k.removeAll(collection);
        }
    }
}
