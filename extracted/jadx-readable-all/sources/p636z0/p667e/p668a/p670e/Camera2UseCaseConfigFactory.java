package p636z0.p667e.p668a.p670e;

import android.content.Context;
import android.graphics.Point;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import android.view.WindowManager;
import p636z0.p667e.p668a.p669d.Camera2ImplConfig;
import p636z0.p667e.p668a.p670e.p671w1.p673p.DeviceQuirks;
import p636z0.p667e.p668a.p670e.p671w1.p673p.PreviewPixelHDRnetQuirk;
import p636z0.p667e.p676b.p677v1.CaptureConfig;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.ImageOutputConfig2;
import p636z0.p667e.p676b.p677v1.MutableOptionsBundle;
import p636z0.p667e.p676b.p677v1.OptionsBundle;
import p636z0.p667e.p676b.p677v1.SessionConfig;
import p636z0.p667e.p676b.p677v1.UseCaseConfig2;
import p636z0.p667e.p676b.p677v1.UseCaseConfigFactory;

/* JADX INFO: renamed from: z0.e.a.e.v0, reason: use source file name */
/* JADX INFO: compiled from: Camera2UseCaseConfigFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class Camera2UseCaseConfigFactory implements UseCaseConfigFactory {

    /* JADX INFO: renamed from: a */
    public static final Size f35701a = new Size(1920, 1080);

    /* JADX INFO: renamed from: b */
    public final WindowManager f35702b;

    public Camera2UseCaseConfigFactory(Context context) {
        this.f35702b = (WindowManager) context.getSystemService("window");
    }

    @Override // p636z0.p667e.p676b.p677v1.UseCaseConfigFactory
    /* JADX INFO: renamed from: a */
    public Config3 mo15201a(UseCaseConfigFactory.a aVar) {
        MutableOptionsBundle mutableOptionsBundleM15434y = MutableOptionsBundle.m15434y();
        SessionConfig.b bVar = new SessionConfig.b();
        bVar.f36166b.f36151c = 1;
        UseCaseConfigFactory.a aVar2 = UseCaseConfigFactory.a.PREVIEW;
        if (aVar == aVar2 && ((PreviewPixelHDRnetQuirk) DeviceQuirks.m15238a(PreviewPixelHDRnetQuirk.class)) != null) {
            Camera2ImplConfig.a aVar3 = new Camera2ImplConfig.a();
            aVar3.m15073d(CaptureRequest.TONEMAP_MODE, 2);
            bVar.f36166b.m15365c(aVar3.m15072c());
        }
        Config3.a<SessionConfig> aVar4 = UseCaseConfig2.f36231h;
        SessionConfig sessionConfigM15377e = bVar.m15377e();
        Config3.c cVar = Config3.c.OPTIONAL;
        mutableOptionsBundleM15434y.m15436A(aVar4, cVar, sessionConfigM15377e);
        mutableOptionsBundleM15434y.m15436A(UseCaseConfig2.f36233j, cVar, Camera2SessionOptionUnpacker.f35691a);
        CaptureConfig.a aVar5 = new CaptureConfig.a();
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            aVar5.f36151c = 2;
        } else if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            aVar5.f36151c = 1;
        }
        mutableOptionsBundleM15434y.m15436A(UseCaseConfig2.f36232i, cVar, aVar5.m15366d());
        mutableOptionsBundleM15434y.m15436A(UseCaseConfig2.f36234k, cVar, aVar == UseCaseConfigFactory.a.IMAGE_CAPTURE ? ImageCaptureOptionUnpacker.f35514b : Camera2CaptureOptionUnpacker.f35676a);
        if (aVar == aVar2) {
            Config3.a<Size> aVar6 = ImageOutputConfig2.f36303f;
            Point point = new Point();
            this.f35702b.getDefaultDisplay().getRealSize(point);
            Size size = point.x > point.y ? new Size(point.x, point.y) : new Size(point.y, point.x);
            int height = size.getHeight() * size.getWidth();
            Size size2 = f35701a;
            if (height > size2.getHeight() * size2.getWidth()) {
                size = size2;
            }
            mutableOptionsBundleM15434y.m15436A(aVar6, cVar, size);
        }
        mutableOptionsBundleM15434y.m15436A(ImageOutputConfig2.f36300c, cVar, Integer.valueOf(this.f35702b.getDefaultDisplay().getRotation()));
        return OptionsBundle.m15339x(mutableOptionsBundleM15434y);
    }
}
