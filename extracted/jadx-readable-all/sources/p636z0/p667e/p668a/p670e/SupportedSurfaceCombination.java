package p636z0.p667e.p668a.p670e;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Rational;
import android.util.Size;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.C7462a;
import p636z0.p667e.p668a.p670e.p671w1.CameraAccessExceptionCompat;
import p636z0.p667e.p668a.p670e.p671w1.CameraCharacteristicsCompat;
import p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat;
import p636z0.p667e.p668a.p670e.p671w1.p673p.DeviceQuirks;
import p636z0.p667e.p668a.p670e.p671w1.p673p.ExcludedSupportedSizesQuirk;
import p636z0.p667e.p668a.p670e.p671w1.p674q.ExcludedSupportedSizesContainer;
import p636z0.p667e.p676b.CameraUnavailableException;
import p636z0.p667e.p676b.Logger8;
import p636z0.p667e.p676b.p677v1.AutoValue_SurfaceConfig;
import p636z0.p667e.p676b.p677v1.AutoValue_SurfaceSizeDefinition;
import p636z0.p667e.p676b.p677v1.ImageOutputConfig2;
import p636z0.p667e.p676b.p677v1.SurfaceCombination;
import p636z0.p667e.p676b.p677v1.SurfaceConfig;
import p636z0.p667e.p676b.p677v1.SurfaceSizeDefinition;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.a.e.m1, reason: use source file name */
/* JADX INFO: compiled from: SupportedSurfaceCombination.java */
/* JADX INFO: loaded from: classes.dex */
public final class SupportedSurfaceCombination {

    /* JADX INFO: renamed from: a */
    public static final Size f35547a = new Size(1920, 1080);

    /* JADX INFO: renamed from: b */
    public static final Size f35548b = new Size(640, 480);

    /* JADX INFO: renamed from: c */
    public static final Size f35549c = new Size(0, 0);

    /* JADX INFO: renamed from: d */
    public static final Size f35550d = new Size(3840, 2160);

    /* JADX INFO: renamed from: e */
    public static final Size f35551e = new Size(1920, 1080);

    /* JADX INFO: renamed from: f */
    public static final Size f35552f = new Size(1280, 720);

    /* JADX INFO: renamed from: g */
    public static final Size f35553g = new Size(720, 480);

    /* JADX INFO: renamed from: h */
    public static final Rational f35554h = new Rational(4, 3);

    /* JADX INFO: renamed from: i */
    public static final Rational f35555i = new Rational(3, 4);

    /* JADX INFO: renamed from: j */
    public static final Rational f35556j = new Rational(16, 9);

    /* JADX INFO: renamed from: k */
    public static final Rational f35557k = new Rational(9, 16);

    /* JADX INFO: renamed from: l */
    public final List<SurfaceCombination> f35558l;

    /* JADX INFO: renamed from: m */
    public final Map<Integer, Size> f35559m;

    /* JADX INFO: renamed from: n */
    public final String f35560n;

    /* JADX INFO: renamed from: o */
    public final CamcorderProfileHelper f35561o;

    /* JADX INFO: renamed from: p */
    public final CameraCharacteristicsCompat f35562p;

    /* JADX INFO: renamed from: q */
    public final ExcludedSupportedSizesContainer f35563q;

    /* JADX INFO: renamed from: r */
    public final int f35564r;

    /* JADX INFO: renamed from: s */
    public final boolean f35565s;

    /* JADX INFO: renamed from: t */
    public final Map<Integer, List<Size>> f35566t;

    /* JADX INFO: renamed from: u */
    public boolean f35567u;

    /* JADX INFO: renamed from: v */
    public boolean f35568v;

    /* JADX INFO: renamed from: w */
    public SurfaceSizeDefinition f35569w;

    /* JADX INFO: renamed from: x */
    public Map<Integer, Size[]> f35570x;

    /* JADX INFO: renamed from: z0.e.a.e.m1$a */
    /* JADX INFO: compiled from: SupportedSurfaceCombination.java */
    public static final class a implements Comparator<Rational> {

        /* JADX INFO: renamed from: f */
        public Rational f35571f;

        public a(Rational rational) {
            this.f35571f = rational;
        }

        @Override // java.util.Comparator
        public int compare(Rational rational, Rational rational2) {
            Rational rational3 = rational;
            Rational rational4 = rational2;
            if (rational3.equals(rational4)) {
                return 0;
            }
            return (int) Math.signum(Float.valueOf(Math.abs(rational3.floatValue() - this.f35571f.floatValue())).floatValue() - Float.valueOf(Math.abs(rational4.floatValue() - this.f35571f.floatValue())).floatValue());
        }
    }

    public SupportedSurfaceCombination(Context context, String str, CameraManagerCompat cameraManagerCompat, CamcorderProfileHelper camcorderProfileHelper) throws CameraUnavailableException {
        ArrayList arrayList = new ArrayList();
        this.f35558l = arrayList;
        this.f35559m = new HashMap();
        this.f35566t = new HashMap();
        this.f35567u = false;
        this.f35568v = false;
        this.f35570x = new HashMap();
        Objects.requireNonNull(str);
        this.f35560n = str;
        Objects.requireNonNull(camcorderProfileHelper);
        this.f35561o = camcorderProfileHelper;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f35563q = new ExcludedSupportedSizesContainer(str);
        try {
            CameraCharacteristicsCompat cameraCharacteristicsCompatM15214b = cameraManagerCompat.m15214b(str);
            this.f35562p = cameraCharacteristicsCompatM15214b;
            Integer num = (Integer) cameraCharacteristicsCompatM15214b.m15209a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            int iIntValue = num != null ? num.intValue() : 2;
            this.f35564r = iIntValue;
            Size size = (Size) cameraCharacteristicsCompatM15214b.m15209a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
            this.f35565s = size == null || size.getWidth() >= size.getHeight();
            SurfaceConfig.b bVar = SurfaceConfig.b.RAW;
            SurfaceConfig.a aVar = SurfaceConfig.a.ANALYSIS;
            SurfaceConfig.b bVar2 = SurfaceConfig.b.JPEG;
            SurfaceConfig.a aVar2 = SurfaceConfig.a.PREVIEW;
            SurfaceConfig.b bVar3 = SurfaceConfig.b.YUV;
            SurfaceConfig.a aVar3 = SurfaceConfig.a.MAXIMUM;
            SurfaceConfig.b bVar4 = SurfaceConfig.b.PRIV;
            ArrayList arrayList2 = new ArrayList();
            SurfaceCombination surfaceCombination = new SurfaceCombination();
            SurfaceCombination surfaceCombinationM1580c = outline.m1580c(surfaceCombination.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar3), arrayList2, surfaceCombination);
            SurfaceCombination surfaceCombinationM1580c2 = outline.m1580c(surfaceCombinationM1580c.f36179a, new AutoValue_SurfaceConfig(bVar2, aVar3), arrayList2, surfaceCombinationM1580c);
            SurfaceCombination surfaceCombinationM1580c3 = outline.m1580c(surfaceCombinationM1580c2.f36179a, new AutoValue_SurfaceConfig(bVar3, aVar3), arrayList2, surfaceCombinationM1580c2);
            SurfaceCombination surfaceCombinationM1580c4 = outline.m1580c(surfaceCombinationM1580c3.f36179a, outline.m1581c0(surfaceCombinationM1580c3.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar2, aVar3), arrayList2, surfaceCombinationM1580c3);
            SurfaceCombination surfaceCombinationM1580c5 = outline.m1580c(surfaceCombinationM1580c4.f36179a, outline.m1581c0(surfaceCombinationM1580c4.f36179a, new AutoValue_SurfaceConfig(bVar3, aVar2), bVar2, aVar3), arrayList2, surfaceCombinationM1580c4);
            SurfaceCombination surfaceCombinationM1580c6 = outline.m1580c(surfaceCombinationM1580c5.f36179a, outline.m1581c0(surfaceCombinationM1580c5.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar4, aVar2), arrayList2, surfaceCombinationM1580c5);
            SurfaceCombination surfaceCombinationM1580c7 = outline.m1580c(surfaceCombinationM1580c6.f36179a, outline.m1581c0(surfaceCombinationM1580c6.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar3, aVar2), arrayList2, surfaceCombinationM1580c6);
            surfaceCombinationM1580c7.f36179a.add(outline.m1581c0(surfaceCombinationM1580c7.f36179a, outline.m1581c0(surfaceCombinationM1580c7.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar3, aVar2), bVar2, aVar3));
            arrayList2.add(surfaceCombinationM1580c7);
            arrayList.addAll(arrayList2);
            if (iIntValue == 0 || iIntValue == 1 || iIntValue == 3) {
                ArrayList arrayList3 = new ArrayList();
                SurfaceCombination surfaceCombination2 = new SurfaceCombination();
                surfaceCombination2.f36179a.add(new AutoValue_SurfaceConfig(bVar4, aVar2));
                SurfaceConfig.a aVar4 = SurfaceConfig.a.RECORD;
                SurfaceCombination surfaceCombinationM1580c8 = outline.m1580c(surfaceCombination2.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar4), arrayList3, surfaceCombination2);
                SurfaceCombination surfaceCombinationM1580c9 = outline.m1580c(surfaceCombinationM1580c8.f36179a, outline.m1581c0(surfaceCombinationM1580c8.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar3, aVar4), arrayList3, surfaceCombinationM1580c8);
                SurfaceCombination surfaceCombinationM1580c10 = outline.m1580c(surfaceCombinationM1580c9.f36179a, outline.m1581c0(surfaceCombinationM1580c9.f36179a, new AutoValue_SurfaceConfig(bVar3, aVar2), bVar3, aVar4), arrayList3, surfaceCombinationM1580c9);
                SurfaceCombination surfaceCombinationM1580c11 = outline.m1580c(surfaceCombinationM1580c10.f36179a, outline.m1581c0(surfaceCombinationM1580c10.f36179a, outline.m1581c0(surfaceCombinationM1580c10.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar4, aVar4), bVar2, aVar4), arrayList3, surfaceCombinationM1580c10);
                SurfaceCombination surfaceCombinationM1580c12 = outline.m1580c(surfaceCombinationM1580c11.f36179a, outline.m1581c0(surfaceCombinationM1580c11.f36179a, outline.m1581c0(surfaceCombinationM1580c11.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar3, aVar4), bVar2, aVar4), arrayList3, surfaceCombinationM1580c11);
                surfaceCombinationM1580c12.f36179a.add(outline.m1581c0(surfaceCombinationM1580c12.f36179a, outline.m1581c0(surfaceCombinationM1580c12.f36179a, new AutoValue_SurfaceConfig(bVar3, aVar2), bVar3, aVar2), bVar2, aVar3));
                arrayList3.add(surfaceCombinationM1580c12);
                arrayList.addAll(arrayList3);
            }
            if (iIntValue == 1 || iIntValue == 3) {
                ArrayList arrayList4 = new ArrayList();
                SurfaceCombination surfaceCombination3 = new SurfaceCombination();
                SurfaceCombination surfaceCombinationM1580c13 = outline.m1580c(surfaceCombination3.f36179a, outline.m1581c0(surfaceCombination3.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar4, aVar3), arrayList4, surfaceCombination3);
                SurfaceCombination surfaceCombinationM1580c14 = outline.m1580c(surfaceCombinationM1580c13.f36179a, outline.m1581c0(surfaceCombinationM1580c13.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar3, aVar3), arrayList4, surfaceCombinationM1580c13);
                SurfaceCombination surfaceCombinationM1580c15 = outline.m1580c(surfaceCombinationM1580c14.f36179a, outline.m1581c0(surfaceCombinationM1580c14.f36179a, new AutoValue_SurfaceConfig(bVar3, aVar2), bVar3, aVar3), arrayList4, surfaceCombinationM1580c14);
                SurfaceCombination surfaceCombinationM1580c16 = outline.m1580c(surfaceCombinationM1580c15.f36179a, outline.m1581c0(surfaceCombinationM1580c15.f36179a, outline.m1581c0(surfaceCombinationM1580c15.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar4, aVar2), bVar2, aVar3), arrayList4, surfaceCombinationM1580c15);
                SurfaceCombination surfaceCombinationM1580c17 = outline.m1580c(surfaceCombinationM1580c16.f36179a, outline.m1581c0(surfaceCombinationM1580c16.f36179a, outline.m1581c0(surfaceCombinationM1580c16.f36179a, new AutoValue_SurfaceConfig(bVar3, aVar), bVar4, aVar2), bVar3, aVar3), arrayList4, surfaceCombinationM1580c16);
                surfaceCombinationM1580c17.f36179a.add(outline.m1581c0(surfaceCombinationM1580c17.f36179a, outline.m1581c0(surfaceCombinationM1580c17.f36179a, new AutoValue_SurfaceConfig(bVar3, aVar), bVar3, aVar2), bVar3, aVar3));
                arrayList4.add(surfaceCombinationM1580c17);
                arrayList.addAll(arrayList4);
            }
            int[] iArr = (int[]) cameraCharacteristicsCompatM15214b.m15209a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 3) {
                        this.f35567u = true;
                    } else if (i == 6) {
                        this.f35568v = true;
                    }
                }
            }
            if (this.f35567u) {
                List<SurfaceCombination> list = this.f35558l;
                ArrayList arrayList5 = new ArrayList();
                SurfaceCombination surfaceCombination4 = new SurfaceCombination();
                SurfaceCombination surfaceCombinationM1580c18 = outline.m1580c(surfaceCombination4.f36179a, new AutoValue_SurfaceConfig(bVar, aVar3), arrayList5, surfaceCombination4);
                SurfaceCombination surfaceCombinationM1580c19 = outline.m1580c(surfaceCombinationM1580c18.f36179a, outline.m1581c0(surfaceCombinationM1580c18.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar, aVar3), arrayList5, surfaceCombinationM1580c18);
                SurfaceCombination surfaceCombinationM1580c20 = outline.m1580c(surfaceCombinationM1580c19.f36179a, outline.m1581c0(surfaceCombinationM1580c19.f36179a, new AutoValue_SurfaceConfig(bVar3, aVar2), bVar, aVar3), arrayList5, surfaceCombinationM1580c19);
                SurfaceCombination surfaceCombinationM1580c21 = outline.m1580c(surfaceCombinationM1580c20.f36179a, outline.m1581c0(surfaceCombinationM1580c20.f36179a, outline.m1581c0(surfaceCombinationM1580c20.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar4, aVar2), bVar, aVar3), arrayList5, surfaceCombinationM1580c20);
                SurfaceCombination surfaceCombinationM1580c22 = outline.m1580c(surfaceCombinationM1580c21.f36179a, outline.m1581c0(surfaceCombinationM1580c21.f36179a, outline.m1581c0(surfaceCombinationM1580c21.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar3, aVar2), bVar, aVar3), arrayList5, surfaceCombinationM1580c21);
                SurfaceCombination surfaceCombinationM1580c23 = outline.m1580c(surfaceCombinationM1580c22.f36179a, outline.m1581c0(surfaceCombinationM1580c22.f36179a, outline.m1581c0(surfaceCombinationM1580c22.f36179a, new AutoValue_SurfaceConfig(bVar3, aVar2), bVar3, aVar2), bVar, aVar3), arrayList5, surfaceCombinationM1580c22);
                SurfaceCombination surfaceCombinationM1580c24 = outline.m1580c(surfaceCombinationM1580c23.f36179a, outline.m1581c0(surfaceCombinationM1580c23.f36179a, outline.m1581c0(surfaceCombinationM1580c23.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar2, aVar3), bVar, aVar3), arrayList5, surfaceCombinationM1580c23);
                surfaceCombinationM1580c24.f36179a.add(outline.m1581c0(surfaceCombinationM1580c24.f36179a, outline.m1581c0(surfaceCombinationM1580c24.f36179a, new AutoValue_SurfaceConfig(bVar3, aVar2), bVar2, aVar3), bVar, aVar3));
                arrayList5.add(surfaceCombinationM1580c24);
                list.addAll(arrayList5);
            }
            if (this.f35568v && this.f35564r == 0) {
                List<SurfaceCombination> list2 = this.f35558l;
                ArrayList arrayList6 = new ArrayList();
                SurfaceCombination surfaceCombination5 = new SurfaceCombination();
                SurfaceCombination surfaceCombinationM1580c25 = outline.m1580c(surfaceCombination5.f36179a, outline.m1581c0(surfaceCombination5.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar4, aVar3), arrayList6, surfaceCombination5);
                SurfaceCombination surfaceCombinationM1580c26 = outline.m1580c(surfaceCombinationM1580c25.f36179a, outline.m1581c0(surfaceCombinationM1580c25.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar3, aVar3), arrayList6, surfaceCombinationM1580c25);
                surfaceCombinationM1580c26.f36179a.add(outline.m1581c0(surfaceCombinationM1580c26.f36179a, new AutoValue_SurfaceConfig(bVar3, aVar2), bVar3, aVar3));
                arrayList6.add(surfaceCombinationM1580c26);
                list2.addAll(arrayList6);
            }
            if (this.f35564r == 3) {
                List<SurfaceCombination> list3 = this.f35558l;
                ArrayList arrayList7 = new ArrayList();
                SurfaceCombination surfaceCombination6 = new SurfaceCombination();
                SurfaceCombination surfaceCombinationM1580c27 = outline.m1580c(surfaceCombination6.f36179a, outline.m1581c0(surfaceCombination6.f36179a, outline.m1581c0(surfaceCombination6.f36179a, outline.m1581c0(surfaceCombination6.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar4, aVar), bVar3, aVar3), bVar, aVar3), arrayList7, surfaceCombination6);
                surfaceCombinationM1580c27.f36179a.add(outline.m1581c0(surfaceCombinationM1580c27.f36179a, outline.m1581c0(surfaceCombinationM1580c27.f36179a, outline.m1581c0(surfaceCombinationM1580c27.f36179a, new AutoValue_SurfaceConfig(bVar4, aVar2), bVar4, aVar), bVar2, aVar3), bVar, aVar3));
                arrayList7.add(surfaceCombinationM1580c27);
                list3.addAll(arrayList7);
            }
            Size size2 = new Size(640, 480);
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            Size size3 = point.x > point.y ? new Size(point.x, point.y) : new Size(point.y, point.x);
            Size size4 = new Size(size3.getWidth(), size3.getHeight());
            Size size5 = (Size) Collections.min(Arrays.asList(size4, f35547a), new b());
            Size size6 = f35553g;
            try {
                int i2 = Integer.parseInt(this.f35560n);
                if (this.f35561o.mo15077a(i2, 8)) {
                    size6 = f35550d;
                } else if (this.f35561o.mo15077a(i2, 6)) {
                    size6 = f35551e;
                } else if (this.f35561o.mo15077a(i2, 5)) {
                    size6 = f35552f;
                } else {
                    this.f35561o.mo15077a(i2, 4);
                }
            } catch (NumberFormatException unused) {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f35562p.m15209a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
                }
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
                if (outputSizes == null) {
                    size6 = f35553g;
                } else {
                    Arrays.sort(outputSizes, new b(true));
                    for (Size size7 : outputSizes) {
                        int width = size7.getWidth();
                        Size size8 = f35551e;
                        if (width <= size8.getWidth() && size7.getHeight() <= size8.getHeight()) {
                            size6 = size7;
                        }
                    }
                    size6 = f35553g;
                }
            }
            this.f35569w = new AutoValue_SurfaceSizeDefinition(size2, size5, size6);
        } catch (CameraAccessExceptionCompat e) {
            throw C7462a.m14567d(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m15134e(Size size) {
        return size.getHeight() * size.getWidth();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m15135g(int i, int i2, Rational rational) {
        C8162a.m16060e(i2 % 16 == 0);
        double numerator = ((double) (rational.getNumerator() * i)) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }

    /* JADX INFO: renamed from: a */
    public boolean m15136a(List<SurfaceConfig> list) {
        boolean z;
        boolean z2 = false;
        for (SurfaceCombination surfaceCombination : this.f35558l) {
            Objects.requireNonNull(surfaceCombination);
            boolean z3 = true;
            if (list.isEmpty()) {
                z2 = true;
            } else if (list.size() > surfaceCombination.f36179a.size()) {
                z2 = false;
            } else {
                int size = surfaceCombination.f36179a.size();
                ArrayList arrayList = new ArrayList();
                SurfaceCombination.m15382a(arrayList, size, new int[size], 0);
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        z3 = false;
                        break;
                    }
                    int[] iArr = (int[]) it.next();
                    z = true;
                    for (int i = 0; i < surfaceCombination.f36179a.size(); i++) {
                        if (iArr[i] < list.size()) {
                            SurfaceConfig surfaceConfig = surfaceCombination.f36179a.get(i);
                            SurfaceConfig surfaceConfig2 = list.get(iArr[i]);
                            Objects.requireNonNull(surfaceConfig);
                            z &= surfaceConfig2.mo15386a().f36191l <= surfaceConfig.mo15386a().f36191l && surfaceConfig2.mo15387b() == surfaceConfig.mo15387b();
                            if (!z) {
                                break;
                            }
                        }
                    }
                } while (!z);
                z2 = z3;
            }
            if (z2) {
                break;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public final Size[] m15137b(Size[] sizeArr, int i) {
        ArrayList arrayList;
        List<Size> listEmptyList;
        List<Size> arrayList2;
        ArrayList arrayList3;
        List<Size> list = this.f35566t.get(Integer.valueOf(i));
        List<Size> list2 = list;
        if (list == null) {
            ExcludedSupportedSizesContainer excludedSupportedSizesContainer = this.f35563q;
            Objects.requireNonNull(excludedSupportedSizesContainer);
            if (((ExcludedSupportedSizesQuirk) DeviceQuirks.m15238a(ExcludedSupportedSizesQuirk.class)) == null) {
                arrayList2 = new ArrayList();
            } else {
                String str = excludedSupportedSizesContainer.f35826a;
                if (ExcludedSupportedSizesQuirk.m15239a()) {
                    arrayList3 = new ArrayList();
                    if (str.equals("0") && i == 256) {
                        arrayList3.add(new Size(4160, 3120));
                        arrayList3.add(new Size(4000, 3000));
                        listEmptyList = arrayList3;
                    }
                } else if (ExcludedSupportedSizesQuirk.m15240b()) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && i == 256) {
                        arrayList.add(new Size(4160, 3120));
                        arrayList.add(new Size(4000, 3000));
                        listEmptyList = arrayList;
                    }
                } else {
                    Logger8.m15276e("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.", null);
                    listEmptyList = Collections.emptyList();
                }
                listEmptyList = arrayList;
                listEmptyList = arrayList;
                listEmptyList = arrayList3;
                listEmptyList = arrayList3;
                arrayList2 = listEmptyList;
            }
            this.f35566t.put(Integer.valueOf(i), arrayList2);
            list2 = arrayList2;
        }
        ArrayList arrayList4 = new ArrayList(Arrays.asList(sizeArr));
        arrayList4.removeAll(list2);
        return (Size[]) arrayList4.toArray(new Size[0]);
    }

    /* JADX INFO: renamed from: c */
    public final Size m15138c(int i) {
        Size size = this.f35559m.get(Integer.valueOf(i));
        if (size != null) {
            return size;
        }
        Size size2 = (Size) Collections.max(Arrays.asList(m15139d(i)), new b());
        this.f35559m.put(Integer.valueOf(i), size2);
        return size2;
    }

    /* JADX INFO: renamed from: d */
    public final Size[] m15139d(int i) {
        Size[] sizeArr = this.f35570x.get(Integer.valueOf(i));
        if (sizeArr != null) {
            return sizeArr;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f35562p.m15209a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
        }
        Size[] outputSizes = (Build.VERSION.SDK_INT >= 23 || i != 34) ? streamConfigurationMap.getOutputSizes(i) : streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (outputSizes == null) {
            throw new IllegalArgumentException(outline.m1590l("Can not get supported output size for the format: ", i));
        }
        Size[] sizeArrM15137b = m15137b(outputSizes, i);
        Arrays.sort(sizeArrM15137b, new b(true));
        this.f35570x.put(Integer.valueOf(i), sizeArrM15137b);
        return sizeArrM15137b;
    }

    /* JADX INFO: renamed from: f */
    public final Size m15140f(ImageOutputConfig2 imageOutputConfig2) {
        int iMo15348w = imageOutputConfig2.mo15348w(0);
        Size sizeMo15345n = imageOutputConfig2.mo15345n(null);
        if (sizeMo15345n == null) {
            return sizeMo15345n;
        }
        Integer num = (Integer) this.f35562p.m15209a(CameraCharacteristics.SENSOR_ORIENTATION);
        C8162a.m16063h(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
        int iM14579p = C7462a.m14579p(iMo15348w);
        Integer num2 = (Integer) this.f35562p.m15209a(CameraCharacteristics.LENS_FACING);
        C8162a.m16063h(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
        int iM14572i = C7462a.m14572i(iM14579p, num.intValue(), 1 == num2.intValue());
        return iM14572i == 90 || iM14572i == 270 ? new Size(sizeMo15345n.getHeight(), sizeMo15345n.getWidth()) : sizeMo15345n;
    }

    /* JADX INFO: renamed from: h */
    public final void m15141h(List<Size> list, Size size) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Size size2 = list.get(i2);
            if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                break;
            }
            if (i >= 0) {
                arrayList.add(list.get(i));
            }
            i = i2;
        }
        list.removeAll(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public SurfaceConfig m15142i(int i, Size size) {
        SurfaceConfig.b bVar;
        SurfaceConfig.a aVar = SurfaceConfig.a.NOT_SUPPORT;
        if (i == 35) {
            bVar = SurfaceConfig.b.YUV;
        } else if (i == 256) {
            bVar = SurfaceConfig.b.JPEG;
        } else {
            bVar = i == 32 ? SurfaceConfig.b.RAW : SurfaceConfig.b.PRIV;
        }
        Size sizeM15138c = m15138c(i);
        if (size.getHeight() * size.getWidth() <= this.f35569w.mo15394a().getHeight() * this.f35569w.mo15394a().getWidth()) {
            aVar = SurfaceConfig.a.ANALYSIS;
        } else {
            if (size.getHeight() * size.getWidth() <= this.f35569w.mo15395b().getHeight() * this.f35569w.mo15395b().getWidth()) {
                aVar = SurfaceConfig.a.PREVIEW;
            } else {
                if (size.getHeight() * size.getWidth() <= this.f35569w.mo15396c().getHeight() * this.f35569w.mo15396c().getWidth()) {
                    aVar = SurfaceConfig.a.RECORD;
                } else {
                    if (size.getHeight() * size.getWidth() <= sizeM15138c.getHeight() * sizeM15138c.getWidth()) {
                        aVar = SurfaceConfig.a.MAXIMUM;
                    }
                }
            }
        }
        return new AutoValue_SurfaceConfig(bVar, aVar);
    }

    /* JADX INFO: renamed from: z0.e.a.e.m1$b */
    /* JADX INFO: compiled from: SupportedSurfaceCombination.java */
    public static final class b implements Comparator<Size> {

        /* JADX INFO: renamed from: f */
        public boolean f35572f;

        public b() {
            this.f35572f = false;
        }

        @Override // java.util.Comparator
        public int compare(Size size, Size size2) {
            Size size3 = size;
            Size size4 = size2;
            int iSignum = Long.signum((((long) size3.getWidth()) * ((long) size3.getHeight())) - (((long) size4.getWidth()) * ((long) size4.getHeight())));
            return this.f35572f ? iSignum * (-1) : iSignum;
        }

        public b(boolean z) {
            this.f35572f = false;
            this.f35572f = z;
        }
    }
}
