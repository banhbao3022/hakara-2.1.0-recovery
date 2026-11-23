package p636z0.p667e.p668a.p670e;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p636z0.p644b.C7462a;
import p636z0.p667e.p668a.p670e.p671w1.CameraAccessExceptionCompat;
import p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat;
import p636z0.p667e.p676b.CameraInfo;
import p636z0.p667e.p676b.CameraSelector;
import p636z0.p667e.p676b.CameraUnavailableException;
import p636z0.p667e.p676b.InitializationException;
import p636z0.p667e.p676b.p677v1.CameraFactory;
import p636z0.p667e.p676b.p677v1.CameraInfoInternal;
import p636z0.p667e.p676b.p677v1.CameraInternal2;
import p636z0.p667e.p676b.p677v1.CameraStateRegistry;
import p636z0.p667e.p676b.p677v1.CameraThreadConfig;

/* JADX INFO: renamed from: z0.e.a.e.n0, reason: use source file name */
/* JADX INFO: compiled from: Camera2CameraFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class Camera2CameraFactory implements CameraFactory {

    /* JADX INFO: renamed from: a */
    public final CameraThreadConfig f35574a;

    /* JADX INFO: renamed from: c */
    public final CameraManagerCompat f35576c;

    /* JADX INFO: renamed from: d */
    public final List<String> f35577d;

    /* JADX INFO: renamed from: e */
    public final Map<String, Camera2CameraInfoImpl> f35578e = new HashMap();

    /* JADX INFO: renamed from: b */
    public final CameraStateRegistry f35575b = new CameraStateRegistry(1);

    public Camera2CameraFactory(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector) throws InitializationException {
        this.f35574a = cameraThreadConfig;
        CameraManagerCompat cameraManagerCompatM15213a = CameraManagerCompat.m15213a(context, cameraThreadConfig.mo15352b());
        this.f35576c = cameraManagerCompatM15213a;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> listAsList = Arrays.asList(cameraManagerCompatM15213a.m15215c());
            if (cameraSelector == null) {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
            } else {
                String strM14568e = C7462a.m14568e(cameraManagerCompatM15213a, cameraSelector.m15297c(), listAsList);
                ArrayList arrayList2 = new ArrayList();
                for (String str : listAsList) {
                    if (!str.equals(strM14568e)) {
                        arrayList2.add(m15145c(str));
                    }
                }
                try {
                    Iterator<CameraInfo> it2 = cameraSelector.m15296b(arrayList2).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((CameraInfoInternal) it2.next()).mo15183a());
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f35577d = arrayList;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(C7462a.m14567d(e));
        } catch (CameraUnavailableException e2) {
            throw new InitializationException(e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public Set<String> m15143a() {
        return new LinkedHashSet(this.f35577d);
    }

    /* JADX INFO: renamed from: b */
    public CameraInternal2 m15144b(String str) throws CameraUnavailableException {
        if (this.f35577d.contains(str)) {
            return new Camera2CameraImpl(this.f35576c, str, m15145c(str), this.f35575b, this.f35574a.mo15351a(), this.f35574a.mo15352b());
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    /* JADX INFO: renamed from: c */
    public Camera2CameraInfoImpl m15145c(String str) throws CameraUnavailableException {
        try {
            Camera2CameraInfoImpl camera2CameraInfoImpl = this.f35578e.get(str);
            if (camera2CameraInfoImpl != null) {
                return camera2CameraInfoImpl;
            }
            Camera2CameraInfoImpl camera2CameraInfoImpl2 = new Camera2CameraInfoImpl(str, this.f35576c.m15214b(str));
            this.f35578e.put(str, camera2CameraInfoImpl2);
            return camera2CameraInfoImpl2;
        } catch (CameraAccessExceptionCompat e) {
            throw C7462a.m14567d(e);
        }
    }
}
